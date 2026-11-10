package br.com.produtos;

public class Principal {
    //método principal
    static void main() {
        Produtos pastaDeDente = new Produtos(1, "Pasta de Dente", 10, 6.00);
        System.out.println("A Quantidade é: " + pastaDeDente.quantidade);
        pastaDeDente.setQuantidade(20);
        System.out.println("A Quantidade é: " + pastaDeDente.quantidade);
        System.out.println(pastaDeDente.toString());
    }

    }
