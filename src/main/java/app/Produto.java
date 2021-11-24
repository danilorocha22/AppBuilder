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

        if (titulo == null || titulo.equals("")) throw new IllegalArgumentException("Titulo não pode ser nulo ou vazio");
        this.titulo = titulo;

        if(descricao == null || descricao.equals("")) throw new IllegalArgumentException("Descrição não pode ser nula ou vazia");
        this.descricao = descricao;

        if (preco <= 0) throw new IllegalArgumentException("Preço não pode ser menor ou igual a zero.");
        this.preco = preco;

        if (dataCadastro == null) throw new DateTimeException("Data de cadastro não pode ser nula.");
        setDataCadastro(dataCadastro);

        if(dataUltimaAtualizacao == null) throw new NullPointerException("Data da última atualiação não pode ser nula");
        setDataUltimaAtualizacao(dataUltimaAtualizacao);

        if(categoria == null || categoria.equals("")) throw new IllegalArgumentException("Categoria não pode ser nula ou vazia");
        this.categoria = categoria;

        if(vendedor == null || vendedor.equals("")) throw new IllegalArgumentException("Vendedor não pode ser nulo ou vazio");
        this.vendedor = vendedor;
    }//construtor objeto default

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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        if(dataCadastro.isBefore(LocalDate.now()))
            throw new IllegalArgumentException("Data de cadastro não pode ser anterior a data atual");
        this.dataCadastro = dataCadastro;
    }

    public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        if(dataUltimaAtualizacao.isBefore(LocalDate.now()))
            throw new IllegalArgumentException("Data de atualização não pode ser anterior a data atual");
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
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
