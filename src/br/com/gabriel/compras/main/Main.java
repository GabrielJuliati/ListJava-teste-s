package br.com.gabriel.compras.main;

import br.com.gabriel.compras.modelos.Cartao;
import br.com.gabriel.compras.modelos.Compra;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o limite do seu cartão: ");
        float limite = scan.nextFloat();
        Cartao cartao = new Cartao(limite);

        byte opcao;
        do {
            System.out.println("Oque deseja fazer?");
            System.out.println("0 - Comprar");
            System.out.println("1 - Sair");
            opcao = scan.nextByte();

            if (opcao == 0){
                System.out.println("Digite o nome produto que deseja comprar:");
                String nomeDoProduto = scan.next();

                System.out.println("Digite o valor do produto:");
                float valor = scan.nextFloat();

                Compra compra = new Compra(nomeDoProduto, valor);
                boolean compreaRealizada = cartao.compra(compra);
                if (compreaRealizada){
                    System.out.println("Compra realizada com sucesso!");
                }else {
                    System.out.println("Saldo insuficiente!");
                    System.out.println("Saldo ainda disponível: " + cartao.getSaldo());
                }
            }else {
                System.out.println("*******************************");
                System.out.println("COMPRAS REALIZADAS\n");

                Collections.sort(cartao.getCompras());

                for (Compra c: cartao.getCompras()) {
                    System.out.println(c.getNomeDoProduto() + " - " + c.getCusto());
                }

                System.out.println("*******************************");
                System.out.println("\nSaldo restante: " + cartao.getSaldo());

            }
        }while (opcao != 1);
    }
}