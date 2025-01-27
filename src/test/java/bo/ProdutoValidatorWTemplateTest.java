package bo;

import bo.template.ProdutoTemplate;
import domain.Produto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProdutoValidatorWTemplateTest {

    private ProdutoValidator validator;

    @BeforeEach
    public void setUp() {
        validator = new ProdutoValidator();
    }

    @Test
    public void testValidateCategoriaSuccess() {
        Produto produto = ProdutoTemplate.createValidProduto();
        validator.validate(produto);
    }

    @Test
    public void testValidateCategoriaFailure() {
        Produto produto = ProdutoTemplate.createInvalidCategoriaProduto();
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidatePrecoSuccess() {
        Produto produto = ProdutoTemplate.createValidProduto();
        validator.validate(produto);
    }

    @Test
    public void testValidatePrecoFailure() {
        Produto produto = ProdutoTemplate.createInvalidPrecoProduto();
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateDescricaoSuccess() {
        Produto produto = ProdutoTemplate.createValidProduto();
        validator.validate(produto);
    }

    @Test
    public void testValidateDescricaoFailure() {
        Produto produto = ProdutoTemplate.createInvalidDescricaoProduto();
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateQuantidadeSuccess() {
        Produto produto = ProdutoTemplate.createValidProduto();
        validator.validate(produto);
    }

    @Test
    public void testValidateQuantidadeFailure() {
        Produto produto = ProdutoTemplate.createInvalidQuantidadeProduto();
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateDataValidadeSuccess() {
        Produto produto = ProdutoTemplate.createValidProduto();
        validator.validate(produto);
    }

    @Test
    public void testValidateDataValidadeFailure() {
        Produto produto = ProdutoTemplate.createInvalidDataValidadeProduto();
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateDataFabricacaoSuccess() {
        Produto produto = ProdutoTemplate.createValidProduto();
        validator.validate(produto);
    }

    @Test
    public void testValidateDataFabricacaoFailure() {
        Produto produto = ProdutoTemplate.createInvalidDataFabricacaoProduto();
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateCodigoBarrasSuccess() {
        Produto produto = ProdutoTemplate.createValidProduto();
        validator.validate(produto);
    }

    @Test
    public void testValidateCodigoBarrasFailure() {
        Produto produto = ProdutoTemplate.createInvalidCodigoBarrasProduto();
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateNomeSuccess() {
        Produto produto = ProdutoTemplate.createValidProduto();
        validator.validate(produto);
    }

    @Test
    public void testValidateNomeFailure() {
        Produto produto = ProdutoTemplate.createInvalidNomeProduto();
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateFabricanteSuccess() {
        Produto produto = ProdutoTemplate.createValidProduto();
        validator.validate(produto);
    }

    @Test
    public void testValidateFabricanteFailure() {
        Produto produto = ProdutoTemplate.createInvalidFabricanteProduto();
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateQuantidadeDisponivelSuccess() {
        Produto produto = ProdutoTemplate.createValidProduto();
        validator.validate(produto);
    }

    @Test
    public void testValidateQuantidadeDisponivelFailure() {
        Produto produto = ProdutoTemplate.createInvalidQuantidadeDisponivelProduto();
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidatePrecoPositivoSuccess() {
        Produto produto = ProdutoTemplate.createValidProduto();
        validator.validate(produto);
    }

    @Test
    public void testValidatePrecoPositivoFailure() {
        Produto produto = ProdutoTemplate.createInvalidPrecoPositivoProduto();
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }
}