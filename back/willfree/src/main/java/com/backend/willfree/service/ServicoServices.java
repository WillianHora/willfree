package com.backend.willfree.service;

import com.backend.willfree.entity.Servico;
import com.backend.willfree.repository.ServicoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoServices {
    @Autowired
    private ServicoRepositorio servicoRepositorio;

    public List<Servico> buscarTodos(){
        return servicoRepositorio.findAll();
    }

   
     public List<Servico> buscarServicosPagamentoPendente(){
        return servicoRepositorio.buscarServicosPagamentoPendente();
    }

    public List<Servico> buscarServicosCancelados(){
        return servicoRepositorio.buscarServicosCancelados();
    }



    public Servico inserir(Servico servico){
        String status;
        if (servico.getValorPago()==null || servico.getValorPago()==0 || servico.getDataPagamento()==null){
            servico.setStatus("Pendente");
        }else{
            servico.setStatus("Realizado");
        }
        return servicoRepositorio.saveAndFlush(servico);

    }

    public Servico alterar(Servico servico){
        if (servico.getValorPago()!= null && servico.getValorPago()>0 && servico.getDataPagamento()!=null){
            servico.setStatus("Realizado");
        }
        return servicoRepositorio.saveAndFlush(servico);
    }

    public void excluir(Long id){
        Servico servico = servicoRepositorio.findById(id).get();
        servicoRepositorio.delete(servico);
    }
}
