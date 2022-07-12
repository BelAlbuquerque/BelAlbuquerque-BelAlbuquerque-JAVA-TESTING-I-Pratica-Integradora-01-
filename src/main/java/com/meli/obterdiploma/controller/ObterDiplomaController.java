package com.meli.obterdiploma.controller;

import com.meli.obterdiploma.model.StudentDTO;
import com.meli.obterdiploma.service.IObterDiplomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ObterDiplomaController {

    @Autowired
    IObterDiplomaService service;

    /**
     *
     * @param studentDTO
     * @return
     */
    @PostMapping("/analyzeScores")
    public StudentDTO analyzeScores(@RequestBody  @Valid StudentDTO studentDTO) {
        return service.analyzeScores(studentDTO);
    }
}
