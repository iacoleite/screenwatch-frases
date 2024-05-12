package com.iaco.screenphrases.services;

import com.iaco.screenphrases.dto.FraseDTO;
import com.iaco.screenphrases.models.Frase;
import com.iaco.screenphrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;

    public FraseDTO obterFrase() {
        return converteDados(repository.obterFrase());
    }

    private FraseDTO converteDados(Frase frase) {
        FraseDTO fraseConvertida;
        fraseConvertida = new FraseDTO(frase.getId(), frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
        return fraseConvertida;
    }

}
