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

    public ProdutoBuilder(String titulo, String descricao, double preco, String dataCadastro, String dataUltimaAtualizacao,
                          String categoria, Vendedor vendedor) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.preco = preco;
        setDataCadastro(dataCadastro);
        setDataUltimaAtualizacao(dataUltimaAtualizacao);
        this.categoria = categoria;
        this.vendedor = vendedor;
    }

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

    public ProdutoBuilder setDataCadastro(String dataCadastro) {
        LocalDate dataFormatada = LocalDate.parse(dataCadastro, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.dataCadastro = dataFormatada;
        return this;
    }

    public ProdutoBuilder setDataUltimaAtualizacao(String dataAtualizacao) {
        LocalDate dataFormatada = LocalDate.parse(dataAtualizacao, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.dataUltimaAtualizacao = dataFormatada;
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