package bo;

import domain.Produto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static bo.constants.Constants.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProdutoValidatorWConstantsTest {

    private ProdutoValidator validator;

    @BeforeEach
    public void setUp() {
        validator = new ProdutoValidator();
    }

    @Test
    public void testValidateCategoriaSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                20,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                DATA_VALIDADE,
                DATA_FABRICACAO,
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidateCategoriaFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                20,
                "",
                FABRICANTE,
                CODIGO_BARRAS,
                DATA_VALIDADE,
                DATA_FABRICACAO,
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidatePrecoSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                20,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                DATA_VALIDADE,
                DATA_FABRICACAO,
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidatePrecoFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                0.0,
                20,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                DATA_VALIDADE,
                DATA_FABRICACAO,
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateDisponibilidadeSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                20,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                DATA_VALIDADE,
                DATA_FABRICACAO,
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidateDisponibilidadeFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                20,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                DATA_VALIDADE,
                DATA_FABRICACAO,
                null
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateQuantidadeSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                20,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                DATA_VALIDADE,
                DATA_FABRICACAO,
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidateQuantidadeFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                -1,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                DATA_VALIDADE,
                DATA_FABRICACAO,
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateDatasSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                20,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                DATA_VALIDADE,
                DATA_FABRICACAO,
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidateDatasFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                20,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                null,
                DATA_FABRICACAO,
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateFabricanteSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                20,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                DATA_VALIDADE,
                DATA_FABRICACAO,
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidateFabricanteFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                20,
                ATACADO,
                "",
                CODIGO_BARRAS,
                DATA_VALIDADE,
                DATA_FABRICACAO,
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateCodigoBarrasSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                20,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                DATA_VALIDADE,
                DATA_FABRICACAO,
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidateCodigoBarrasFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                20,
                ATACADO,
                FABRICANTE,
                "",
                DATA_VALIDADE,
                DATA_FABRICACAO,
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateNomeSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                20,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                DATA_VALIDADE,
                DATA_FABRICACAO,
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidateNomeFailure() {
        Produto produto = new Produto(
                1L,
                "",
                DESCRICAO,
                100.0,
                20,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                DATA_VALIDADE,
                DATA_FABRICACAO,
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateDescricaoSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                20,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                DATA_VALIDADE,
                DATA_FABRICACAO,
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidateDescricaoFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "",
                100.0,
                20,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                DATA_VALIDADE,
                DATA_FABRICACAO,
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateCategoriaAtacadoSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                11,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                DATA_VALIDADE,
                DATA_FABRICACAO,
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidateCategoriaAtacadoFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                10,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                DATA_VALIDADE,
                DATA_FABRICACAO,
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateQuantidadeDisponivelSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                12,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                DATA_VALIDADE,
                DATA_FABRICACAO,
                false
        );
        validator.validate(produto);
    }

    @Test
    public void testValidateQuantidadeDisponivelFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                0,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                DATA_VALIDADE,
                DATA_FABRICACAO,
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateDataFabricacaoSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                20,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                DATA_VALIDADE,
                LocalDate.now().toString(),
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidateDataFabricacaoFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                20,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                DATA_VALIDADE,
                LocalDate.now().plusDays(1).toString(),
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateDataValidadeSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                20,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                LocalDate.now().plusDays(31).toString(),
                DATA_FABRICACAO,
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidateDataValidadeFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                20,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                LocalDate.now().plusDays(29).toString(),
                DATA_FABRICACAO,
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidatePrecoPositivoSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                100.0,
                20,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                DATA_VALIDADE,
                DATA_FABRICACAO,
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidatePrecoPositivoFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                DESCRICAO,
                -100.0,
                20,
                ATACADO,
                FABRICANTE,
                CODIGO_BARRAS,
                DATA_VALIDADE,
                DATA_FABRICACAO,
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }
}