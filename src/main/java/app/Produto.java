package app;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Produto {
    private long id;
    private String titulo; //*obrigatorio
    private String descricao; //*obrigatorio
    private String marca;
    private String modelo;
    private int estoque = 0; //(valor padrão zero)
    private double preco; //*obrigatorio (deve ser maior que zero)
    private LocalDate dataCadastro; //*obrigatorio (não pode ser menor que a data atual)
    private LocalDate dataUltimaAtualizacao; //*obrigatorio (não pode ser menor que a data atual)
    private String urlFoto;
    private String categoria; //*obrigatorio
    private Vendedor vendedor;  //*obrigatorio
    private double peso;
    private double altura;
    private double largura;
    private double profundidade;

    Produto(String titulo, String descricao, double preco, LocalDate dataCadastro, LocalDate dataUltimaAtualizacao,
            String categoria, Vendedor vendedor) {

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
        if (this.marca != null)
            this.modelo = modelo;
        else
            throw new IllegalArgumentException("Não pode informar um modelo sem antes informar a marca.");
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

    public void setPreco(double preco) {
        if (preco < 0)
            throw new IllegalArgumentException("Preço não pode ser menor ou igual a zero.");
        this.preco = preco;
    }

    public void setDataCadastro(String dataCadastro) {
        LocalDate dataFormatada = LocalDate.parse(dataCadastro, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate dataAtual = LocalDate.now();
        if (dataFormatada.compareTo(dataAtual) < -1)
            throw new DateTimeException("Informe uma data igual ou superior a data atual.");
        this.dataCadastro = dataFormatada;
    }

    public void setDataUltimaAtualizacao(String dataUltimaAtualizacao) {
        LocalDate dataFormatada = LocalDate.parse(dataUltimaAtualizacao, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate dataAtual = LocalDate.now();
        if (dataFormatada.compareTo(dataAtual) < -1)
            throw new DateTimeException("Informe uma data igual ou superior a data atual.");
        this.dataUltimaAtualizacao = dataFormatada;
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
        String produto = "Produto: \n";
        if (id != 0)
            produto += "id: "+ id +"; ";
        produto += "titulo: "+ titulo;
        produto += "; descrição: "+ descricao;
        if (marca != null)
            produto +="; marca: "+ marca;
        if (modelo != null)
            produto +="; modelo: "+ modelo;
        if (estoque != 0)
            produto += "; estoque: "+ estoque;
        produto += "; preço: "+ preco;
        produto += "; data de cadastrado: "+ dataCadastro;
        produto += "; data da última atualização: "+ dataUltimaAtualizacao;
        if (urlFoto != null)
            produto += "; foto: "+ urlFoto;
        produto += "; categoria: "+ categoria;
        produto += "; vendedor: "+ vendedor;
        if  (peso != 0)
            produto += "; peso: "+ peso;
        if (altura != 0)
            produto += "; altura: "+  altura;
        if (largura != 0)
            produto += "; largura: "+ largura;
        if (profundidade != 0)
            produto += "; profundidade: "+ profundidade;
        return produto;
    }

}//classe
