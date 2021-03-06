package app;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoBuilder {
    private long id;
    private String titulo;
    private String descricao;
    private String marca;
    private String modelo;
    private int estoque;
    private double preco;
    private LocalDate dataCadastro;
    private LocalDate dataUltimaAtualizacao;
    private String urlFoto;
    private String categoria;
    private Vendedor vendedor;
    private double peso;
    private double altura;
    private double largura;
    private double profundidade;

    public ProdutoBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public ProdutoBuilder setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public ProdutoBuilder setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public ProdutoBuilder setEstoque(int estoque) {
        this.estoque = estoque;
        return this;
    }

    public ProdutoBuilder setPreco(double preco) {
        this.preco = preco;
        return this;
    }

    public ProdutoBuilder setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }

    public ProdutoBuilder setDataUltimaAtualizacao(LocalDate dataAtualizacao) {
        this.dataUltimaAtualizacao = dataAtualizacao;
        return this;
    }

    public ProdutoBuilder setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
        return this;
    }

    public ProdutoBuilder setPeso(double peso) {
        this.peso = peso;
        return this;
    }

    public ProdutoBuilder setAltura(double altura) {
        this.altura = altura;
        return this;
    }

    public ProdutoBuilder setLargura(double largura) {
        this.largura = largura;
        return this;
    }

    public ProdutoBuilder setProfundidade(double profundidade) {
        this.profundidade = profundidade;
        return this;
    }

    public Produto build() {
        return new Produto(titulo, descricao, preco, dataCadastro, dataUltimaAtualizacao,
                categoria, vendedor);
    }

}//classe