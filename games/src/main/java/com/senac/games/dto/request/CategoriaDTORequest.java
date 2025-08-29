package com.senac.games.dto.request;

import com.senac.games.entity.Jogo;
import jakarta.persistence.OneToMany;

import java.util.Set;

public class CategoriaDTORequest {

    private String nome;

    private int status;

    @OneToMany(mappedBy = "categoria")
    private Set<Jogo> jogos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Set<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(Set<Jogo> jogos) {
        this.jogos = jogos;
    }
}
