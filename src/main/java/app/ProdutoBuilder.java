package app;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoBuilder {
    private String titulo;
    private String descricao;
    private double preco;
    private LocalDate dataCadastro;
    private LocalDate dataUltimaAtualizacao;
    private String categoria;
    private Vendedor vendedor;

    public ProdutoBuilder setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public ProdutoBuilder setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public ProdutoBuilder setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            throw new IllegalArgumentException("Preço não pode ser menor ou igual a zero.");
        }
        return this;
    }

    public ProdutoBuilder setDataCadastro(String dataCadastro) {
        LocalDate dataFormatada = LocalDate.parse(dataCadastro, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate dataAtual = LocalDate.now();
        if (dataFormatada.compareTo(dataAtual) > -1) {
            this.dataCadastro = dataFormatada;
        } else {
            throw new DateTimeException("Informe uma data igual ou superior que a data atual.");
        }
        return this;
    }

    public ProdutoBuilder setDataUltimaAtualizacao(String dataAtualizacao) {
        LocalDate dataFormatada = LocalDate.parse(dataAtualizacao, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate dataAtual = LocalDate.now();
        if (dataFormatada.compareTo(dataAtual) > -1) {
            this.dataUltimaAtualizacao = dataFormatada;
        } else {
            throw new DateTimeException("Informe uma data igual ou superior que a data atual.");
        }
        return this;
    }

    public ProdutoBuilder setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public ProdutoBuilder setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
        return this;
    }

    public Produto build() {
        return new Produto(titulo, descricao, preco, dataCadastro, dataUltimaAtualizacao, categoria, vendedor);
    }

}//classe