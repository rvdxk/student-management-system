package io.github.rvdxk.sms.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.format.annotation.DateTimeFormat;


import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private Long id;
    @NotEmpty(message = "Student first name should not be empty")
    private String firstName;
    @NotEmpty(message = "Student last name should not be empty")
    private String lastName;
    @NotEmpty(message = "Student email address should not be empty")
    @Email
    private String email;
    @NotEmpty(message = "Student class should not be empty")
    private String studentClass;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Student date of birth should not be empty")
    private Date dateOfBirth;
}
