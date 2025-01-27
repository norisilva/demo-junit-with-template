package bo.template;

import com.github.javafaker.Faker;
import domain.Produto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoTemplate {

    private static final Faker faker = new Faker();
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static Produto createValidProduto() {
        return new Produto(
                faker.number().randomNumber(),
                faker.commerce().productName(),
                faker.lorem().sentence(),
                faker.number().randomDouble(2, 1, 1000),
                faker.number().numberBetween(1, 100),
                faker.commerce().department(),
                faker.company().name(),
                faker.number().digits(13),
                LocalDate.now().plusDays(faker.number().numberBetween(30, 365)).format(formatter),
                LocalDate.now().minusDays(faker.number().numberBetween(1, 365)).format(formatter),
                faker.bool().bool()
        );
    }

    public static Produto createInvalidCategoriaProduto() {
        Produto produto = createValidProduto();
        produto.setCategoria("");
        return produto;
    }

    public static Produto createInvalidPrecoProduto() {
        Produto produto = createValidProduto();
        produto.setPreco(0.0);
        return produto;
    }

    public static Produto createInvalidDescricaoProduto() {
        Produto produto = createValidProduto();
        produto.setDescricao("");
        return produto;
    }

    public static Produto createInvalidQuantidadeProduto() {
        Produto produto = createValidProduto();
        produto.setQuantidade(-1);
        return produto;
    }

    public static Produto createInvalidDataValidadeProduto() {
        Produto produto = createValidProduto();
        produto.setDataValidade(LocalDate.now().minusDays(1).format(formatter));
        return produto;
    }

    public static Produto createInvalidDataFabricacaoProduto() {
        Produto produto = createValidProduto();
        produto.setDataFabricacao(LocalDate.now().plusDays(1).format(formatter));
        return produto;
    }

    public static Produto createInvalidCodigoBarrasProduto() {
        Produto produto = createValidProduto();
        produto.setCodigoBarras("");
        return produto;
    }

    public static Produto createInvalidNomeProduto() {
        Produto produto = createValidProduto();
        produto.setNome("");
        return produto;
    }

    public static Produto createInvalidFabricanteProduto() {
        Produto produto = createValidProduto();
        produto.setFabricante("");
        return produto;
    }

    public static Produto createInvalidQuantidadeDisponivelProduto() {
        Produto produto = createValidProduto();
        produto.setQuantidade(0);
        produto.setDisponivel(true);
        return produto;
    }

    public static Produto createInvalidPrecoPositivoProduto() {
        Produto produto = createValidProduto();
        produto.setPreco(-100.0);
        return produto;
    }
}