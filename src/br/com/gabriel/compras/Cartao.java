package br.com.gabriel.compras;

import java.util.ArrayList;
import java.util.List;

public class Cartao {
    private float limite;
    private float saldo;
    private List<Compra> compras;

    public Cartao(float limite){
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean compra(Compra compra){
        if(this.saldo >= compra.getCusto()){
            this.saldo -= compra.getCusto();
            this.compras.add(compra);
            return true;
        }

        return false;
    }

    public float getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}