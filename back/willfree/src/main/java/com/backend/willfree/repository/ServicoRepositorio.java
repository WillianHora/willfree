package com.backend.willfree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.backend.willfree.entity.Servico;

import java.util.List;

@Repository
public interface ServicoRepositorio extends  JpaRepository <Servico,Long>{
    @Query("select s from Servico s where s.valorPago <> null and s.valorPago > 0")
    List<Servico> buscarServicosPagamentoPendente();

    
    @Query("select s from Servico s where s.status = 'cancelado'")
    List<Servico> buscarServicosCancelados();

    
}
