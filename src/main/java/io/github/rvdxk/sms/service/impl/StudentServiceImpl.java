package io.github.rvdxk.sms.service.impl;

import io.github.rvdxk.sms.dto.StudentDto;
import io.github.rvdxk.sms.entity.Student;
import io.github.rvdxk.sms.mapper.StudentMapper;
import io.github.rvdxk.sms.repository.StudentRepository;
import io.github.rvdxk.sms.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        List<StudentDto> studentsDto = students.stream()
                .map((student) -> StudentMapper.mapToStudentDto(student))
                .collect(Collectors.toList());
        return studentsDto;
    }

    @Override
    public void createStudent(StudentDto studentDto) {
        Student student = StudentMapper.maptoStudent(studentDto);
        studentRepository.save(student);
    }

    @Override
    public StudentDto getStudentById(Long studentId) {
        Student student = studentRepository.findById(studentId).get();
        StudentDto studentDto = StudentMapper.mapToStudentDto(student);
        return studentDto;
    }

    @Override
    public void updateStudent(StudentDto studentDto) {
        studentRepository.save(StudentMapper.maptoStudent(studentDto));
    }


}
