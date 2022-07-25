import app.Produto;
import app.ProdutoBuilder;
import app.Vendedor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        Produto produto = new ProdutoBuilder().build();

        produto.setId(1);
        produto.setMarca("Lenovo");
        produto.setModelo("A-200");
        //produto.setDataUltimaAtualizacao(formatarData("10/11/2021"));
        System.out.println(produto);
    }//main

    private static LocalDate formatarData(String data) {
        return LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }//metodo

}//classe
