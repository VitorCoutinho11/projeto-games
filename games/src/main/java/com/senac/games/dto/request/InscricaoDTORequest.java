package com.senac.games.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.senac.games.entity.Participante;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class InscricaoDTORequest {

    private LocalDateTime data;

    private int status;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="participante_id", nullable=false)
    private Participante participante;

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }
}
