package br.pucpr.prog4.oficina.models;
public class Carro {
    private String placa;
    private String tipo;
    
    public Carro() {}
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "Carro{" + "placa=" + placa + ", tipo=" + tipo + '}';
    }
}
