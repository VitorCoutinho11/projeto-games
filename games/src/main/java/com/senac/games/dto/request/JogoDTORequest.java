package com.senac.games.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.senac.games.entity.Categoria;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class JogoDTORequest {


    private String nome;

    private int status;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;

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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
