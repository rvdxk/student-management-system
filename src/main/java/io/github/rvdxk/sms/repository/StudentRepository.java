package io.github.rvdxk.sms.repository;

import io.github.rvdxk.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
