package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter @Setter
public class SubjectDTO {
@NotBlank
@Pattern(regexp="([A-Z]|[0-9])[\\s|[0-9]|A-Z|a-z|ñ|ó|í|á|é|ú|Á|Ó|É|Í|Ú]*$", message = "O nome do aluno deve começar com letra maiúscula.")
@Size(max = 30, message = "O comprimento do nome não pode exceder 30 caracteres.")
    String name;
    Double score;
}
