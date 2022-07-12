package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Getter @Setter
public class StudentDTO {
    @NotBlank
    @Pattern(regexp="([A-Z]|[0-9])[\\s|[0-9]|A-Z|a-z|ñ|ó|í|á|é|ú|Á|Ó|É|Í|Ú]*$", message = "O nome do aluno deve começar com letra maiúscula.")
    @Size(max = 50, message = "O comprimento do nome do aluno não pode exceder 50 caracteres.")
    String studentName;
    String message;
    Double averageScore;
    @NotEmpty
    List< @Valid SubjectDTO> subjects;
}
