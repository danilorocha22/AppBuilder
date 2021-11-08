package app;

import java.time.LocalDate;

public class Produto {
    private long id;
    private String titulo; //*
    private String descricao; //*
    private String marca;
    private String modelo;
    private int estoque = 0; //(valor padrão zero)
    private double preco; //* (deve ser maior que zero)
    private LocalDate dataCadastro; //* (não pode ser menor que a data atual)
    private LocalDate dataUltimaAtualizacao; //* (não pode ser menor que a data atual)
    private String urlFoto;
    private String categoria; //*
    private Vendedor vendedor;  //*
    private double peso;
    private double altura;
    private double largura;
    private double profundidade;

    Produto(String titulo, String descricao, double preco, LocalDate dataCadastro, LocalDate dataUltimaAtualizacao, String categoria, Vendedor vendedor) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.preco = preco;
        this.dataCadastro = dataCadastro;
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        this.categoria = categoria;
        this.vendedor = vendedor;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        if (getMarca() != null)
            this.modelo = modelo;
        else
            throw new IllegalArgumentException("Não pode informar um modelo sem uma marca.");
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getEstoque() {
        return estoque;
    }

    public double getPreco() {
        return preco;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public LocalDate getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public String getCategoria() {
        return categoria;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", estoque=" + estoque +
                ", preco=" + preco +
                ", dataCadastro=" + dataCadastro +
                ", dataUltimaAtualizacao=" + dataUltimaAtualizacao +
                ", urlFoto='" + urlFoto + '\'' +
                ", categoria='" + categoria + '\'' +
                ", vendedor=" + vendedor +
                ", peso=" + peso +
                ", altura=" + altura +
                ", largura=" + largura +
                ", profundidade=" + profundidade +
                '}';
    }
}//classe
