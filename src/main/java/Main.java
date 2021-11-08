import app.Produto;
import app.ProdutoBuilder;
import app.Vendedor;

public class Main {

    public static void main(String[] args) {
        Produto produto = new ProdutoBuilder(
                "Notebook",
                "8gb, core i9",
                4000,
                "01/01/2022",
                "10/01/2022",
                "Eletrônicos",
                new Vendedor(1234, "Danilo Rocha"))
                .setMarca("Lenovo")
                .setModelo("A-200")
                .build();

        System.out.println(produto);
    }//main

}//classe
