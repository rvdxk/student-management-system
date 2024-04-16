package io.github.rvdxk.sms.mapper;

import io.github.rvdxk.sms.dto.StudentDto;
import io.github.rvdxk.sms.entity.Student;

public class StudentMapper {

    public static StudentDto mapToStudentDto(Student student){
        StudentDto studentDto = new StudentDto(
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getEmail(),
                student.getStudentClass(),
                student.getDateOfBirth()
        );
        return studentDto;
    }

    public static Student maptoStudent(StudentDto studentDto){
        Student student = new Student(
                studentDto.getId(),
                studentDto.getFirstName(),
                studentDto.getLastName(),
                studentDto.getEmail(),
                studentDto.getStudentClass(),
                studentDto.getDateOfBirth()
        );
        return student;
    }

}
