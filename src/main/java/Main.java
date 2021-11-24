import app.Produto;
import app.ProdutoBuilder;
import app.Vendedor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        Produto produto = new ProdutoBuilder(
                "Notebook",
                "8gb, core i9",
                4000,
                LocalDate.now(),
                LocalDate.now(),
                "Eletrônico",
                new Vendedor(1234, "Danilo Rocha"))
                .build();

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
