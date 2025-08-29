package com.senac.games.controller;

import com.senac.games.entity.Patrocinador;
import com.senac.games.service.PatrocinadorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/patrocinador")
@Tag(name = "Patrocinador", description = "API para gerenciamento dos patrocinadores")
public class PatrocinadorController {

    private PatrocinadorService patrocinadorService;

    public PatrocinadorController(PatrocinadorService patrocinadorService) {
        this.patrocinadorService = patrocinadorService;
    }

    @GetMapping("/listar")
    @Operation(summary = "listar Patrocinadores", description = "endpoint para listar todos os patrocinadores")
    public ResponseEntity<List<Patrocinador>> listarPatrocinadores(){
        return ResponseEntity.ok(patrocinadorService.listarPatrocinadores());
    }

}
