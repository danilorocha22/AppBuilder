import app.Produto;
import app.ProdutoBuilder;
import app.Vendedor;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Produto produto = new ProdutoBuilder()
                .setTitulo("Notebook")
                .setDescricao("8gb, core i9")
                .setPreco(4000)
                .setDataCadastro("07/11/2021")
                .setDataUltimaAtualizacao("10/11/2021")
                .setCategoria("Eletrônicos")
                .setVendedor(new Vendedor(1234, "Danilo Rocha"))
                .build();
        System.out.println(produto);
    }//main

}//classe
