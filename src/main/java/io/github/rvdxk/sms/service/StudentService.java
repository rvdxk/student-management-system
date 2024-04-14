package io.github.rvdxk.sms.service;

import io.github.rvdxk.sms.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();
}
