package com.backend.willfree.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.willfree.entity.Servico;
import com.backend.willfree.service.ServicoServices;

import jakarta.websocket.server.PathParam;


@RestController
public class ServicoControle {
   
    @Autowired
    private ServicoServices servicoService;

    @GetMapping("/todos")
    public List<Servico> buscarTodos(){
        return servicoService.buscarTodos();
    }

    @GetMapping("/pagamentoPendente")
    public List<Servico> buscarServicosPagamentoPendente(){
        return servicoService.buscarServicosPagamentoPendente();
    }

    @GetMapping("/cancelados")
    public List<Servico> buscarServicosCancelados(){
        return servicoService.buscarServicosCancelados();
    }
    
    @PostMapping("/inserir")
    public Servico inserir(@RequestBody Servico servico){
        return servicoService.inserir(servico);
    }


    @PutMapping("/alterar")
    public Servico alterar(@RequestBody Servico servico){
        return servicoService.alterar(servico);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        servicoService.excluir(id);
        return ResponseEntity.ok().build();
        }
    
} 
