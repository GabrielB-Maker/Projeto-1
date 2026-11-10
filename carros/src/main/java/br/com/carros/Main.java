package br.com.carros;

public class Main {
    public static void main(String[] args) {
        Carros carros = new Carros("Grand Siena");
        System.out.println("o nome do carro é: " + carros.getModelo());
        carros.setAno("2022");
        carros.setCor("cinza");
        carros.setPreco(65000);
        carros.setModelo("Grand Siena");
        carros.setMarca("FIAT");
        System.out.println("Da cor: " + carros.getCor());
        System.out.println("Possui o valor médio de: " + carros.getPreco());
        System.out.println("O Carro da marca" + carros.getMarca());
        System.out.println("Do ano:" + carros.getAno());
        System.out.println("Do Modelo: " + carros.getModelo());
    }
}
