package br.com.carros;

public class Carros {
    //atributos
    String modelo ;
    String cor;
    String ano;
    String marca;
    double preco;

    //construtor
    public Carros(String modelo){
        this.modelo=modelo;
        this.cor=cor;
        this.preco=preco;
        this.ano=ano;
        this.marca=marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
// to string sobre-escrevendo o método "toString()"
    @Override
    public String toString() {
        return "Carros{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", ano='" + ano + '\'' +
                ", marca='" + marca + '\'' +
                ", preco=" + preco +
                '}';
    }
}





