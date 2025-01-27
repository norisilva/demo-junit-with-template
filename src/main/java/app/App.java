package app;

import bo.ProdutoProcessor;
import bo.ProdutoValidator;
import domain.Produto;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        ProdutoValidator validator = new ProdutoValidator();
        ProdutoProcessor processor = new ProdutoProcessor(validator);

        List<Produto> produtos = Arrays.asList(
                new Produto(1L, "Produto 1", "Descrição do Produto 1", 100.0, 20, "atacado", "Fabricante 1", "1234567890123", "2025-12-31", "2023-01-01", true),
                new Produto(2L, "Produto 2", "Descrição do Produto 2", 50.0, 5, "varejo", "Fabricante 2", "1234567890124", "2025-11-30", "2023-02-01", false),
                new Produto(3L, "Produto 3", "Descrição do Produto 3", 200.0, 0, "atacado", "Fabricante 3", "1234567890125", "2025-10-31", "2023-03-01", false),
                new Produto(4L, "Produto 4", "Descrição do Produto 4", 75.0, 15, "atacado", "Fabricante 4", "1234567890126", "2025-09-30", "2023-04-01", true),
                new Produto(5L, "Produto 5", "Descrição do Produto 5", 30.0, 10, "varejo", "Fabricante 5", "1234567890127", "2025-08-31", "2023-05-01", true)
        );

        produtos.
                forEach(produto -> {
            try {
                processor.process(produto);
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        });
    }
}