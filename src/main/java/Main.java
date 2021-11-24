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
                "Eletrônico",
                new Vendedor(1234, "Danilo Rocha"))
                .build();

        produto.setId(1);
        produto.setEstoque(100);
        produto.setMarca("Lenovo");
        produto.setModelo("A-200");
        System.out.println(produto);
    }//main

}//classe
