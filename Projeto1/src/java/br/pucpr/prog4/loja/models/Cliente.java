package br.pucpr.prog4.loja.models;
import java.util.Date;
public class Cliente {
    private Integer idCliente;
    private String nomeCliente;
    private String tipoCliente;
    private Date dataNascimento;
    private String sexo;
    private String comentarios;
    private Integer CPF;
    public Cliente() {}
    public Cliente(Integer idCliente, String nomeCliente, String tipoCliente, Date dataNascimento, String sexo, String comentarios, Integer CPF) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.tipoCliente= tipoCliente;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.comentarios = comentarios;
        this.CPF = CPF;
    }
    public Integer getIdCliente() {
        return idCliente;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public String getTipoCliente() {
        return tipoCliente;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public String getSexo() {
        return sexo;
    }
    public String getComentarios() {
        return comentarios;
    }
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public void setTipoPessoa(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    public Integer getCPF() {
        return CPF;
    }
    public void setCPF(Integer CPF) {
        this.CPF = CPF;
    }
    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", tipoCliente=" + tipoCliente + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", comentarios=" + comentarios + '}';
    }
}
