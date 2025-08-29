package com.senac.games.service;

import com.senac.games.entity.Inscricao;
import com.senac.games.entity.Jogo;
import com.senac.games.repository.InscricaoRepository;
import com.senac.games.repository.JogoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscricaoService {
    private InscricaoRepository inscricaoRepository;

    public InscricaoService(InscricaoRepository inscricaoRepository) {
        this.inscricaoRepository = inscricaoRepository;
    }

    public List<Inscricao> listarInscricoes(){
        return this.inscricaoRepository.findAll();
    }
}
