package br.pucpr.prog4.loja.models;
import java.util.Date;
public class Pessoa {
    private Integer idPessoa;
    private String nomePessoa;
    private String tipoPessoa;
    private Date dataNascimento;
    private String sexo;
    private String comentarios;
    private Integer CPF;
    public Pessoa() {}
    public Pessoa(Integer idPessoa, String nomePessoa, String tipoPessoa, Date dataNascimento, String sexo, String comentarios, Integer CPF) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.tipoPessoa= tipoPessoa;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.comentarios = comentarios;
        this.CPF = CPF;
    }
    public Integer getIdPessoa() {
        return idPessoa;
    }
    public String getNomePessoa() {
        return nomePessoa;
    }
    public String getTipoPessoa() {
        return tipoPessoa;
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
    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
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
        return "Pessoa(" + "idPessoa=" + idPessoa + ", nomePessoa=" + nomePessoa + ", tipoPessoa=" + tipoPessoa + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", comentarios=" + comentarios + '}';
    }

}
