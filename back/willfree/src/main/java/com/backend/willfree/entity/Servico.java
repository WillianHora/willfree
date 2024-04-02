package com.backend.willfree.entity;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "servico")
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nomeProduto;
    @Temporal(TemporalType.DATE)
    private Date dataInicio=new Date();
    @Temporal(TemporalType.DATE)
    private Date dataTermino;
    private String descricao;
    private Double valor;
    private Double valorPago;
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;
    private String status;
    
    
    
    public Servico() {
    }
    
    public Servico(long id, String nomeProduto, Date dataInicio, Date dataTermino, String descricao, Double valor,
            Double valorPago, Date dataPagamento, String status) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.descricao = descricao;
        this.valor = valor;
        this.valorPago = valorPago;
        this.dataPagamento = dataPagamento;
        this.status = status;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public Date getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    public Date getDataTermino() {
        return dataTermino;
    }
    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Double getValorPago() {
        return valorPago;
    }
    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }
    public Date getDataPagamento() {
        return dataPagamento;
    }
    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
    
}