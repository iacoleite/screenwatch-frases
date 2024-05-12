package com.iaco.screenphrases.controller;

import com.iaco.screenphrases.dto.FraseDTO;
import com.iaco.screenphrases.services.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series/frases")
public class FraseController {

    @Autowired
    private FraseService servico;

    @GetMapping
    public FraseDTO obterFrase(){
        return servico.obterFrase();
    }
}
