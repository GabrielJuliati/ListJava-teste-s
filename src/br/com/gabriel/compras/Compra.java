package br.com.gabriel.compras;

public class Compra implements Comparable<Compra>{
    private String nomeDoProduto;
    private float custo;

    public Compra(String nomeDoProduto, float custo) {
        this.nomeDoProduto = nomeDoProduto;
        this.custo = custo;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public float getCusto() {
        return custo;
    }

    @Override
    public String toString() {
        return "Compra: Produto = " + nomeDoProduto +
                ", custo = " + custo;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Float.compare(this.custo, outraCompra.custo);
    }
}