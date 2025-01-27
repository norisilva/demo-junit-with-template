package bo;

import domain.Produto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static bo.constants.Constants.PRODUTO_1;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProdutoValidatorHardCodeDataTest {

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
                "Descrição",
                100.0,
                20,
                "atacado",
                "Fabricante",
                "1234567890123",
                "2025-12-31",
                "2023-01-01",
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidateCategoriaFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "Descrição",
                100.0,
                20,
                "",
                "Fabricante",
                "1234567890123",
                "2025-12-31",
                "2023-01-01",
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidatePrecoSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "Descrição",
                100.0,
                20,
                "atacado",
                "Fabricante",
                "1234567890123",
                "2025-12-31",
                "2023-01-01",
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidatePrecoFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "Descrição",
                0.0,
                20,
                "atacado",
                "Fabricante",
                "1234567890123",
                "2025-12-31",
                "2023-01-01",
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateDisponibilidadeSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "Descrição",
                100.0,
                20,
                "atacado",
                "Fabricante",
                "1234567890123",
                "2025-12-31",
                "2023-01-01",
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidateDisponibilidadeFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "Descrição",
                100.0,
                20,
                "atacado",
                "Fabricante",
                "1234567890123",
                "2025-12-31",
                "2023-01-01",
                null
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateQuantidadeSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "Descrição",
                100.0,
                20,
                "atacado",
                "Fabricante",
                "1234567890123",
                "2025-12-31",
                "2023-01-01",
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidateQuantidadeFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "Descrição",
                100.0,
                -1,
                "atacado",
                "Fabricante",
                "1234567890123",
                "2025-12-31",
                "2023-01-01",
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateDatasSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "Descrição",
                100.0,
                20,
                "atacado",
                "Fabricante",
                "1234567890123",
                "2025-12-31",
                "2023-01-01",
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidateDatasFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "Descrição",
                100.0,
                20,
                "atacado",
                "Fabricante",
                "1234567890123",
                null,
                "2023-01-01",
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateFabricanteSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "Descrição",
                100.0,
                20,
                "atacado",
                "Fabricante",
                "1234567890123",
                "2025-12-31",
                "2023-01-01",
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidateFabricanteFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "Descrição",
                100.0,
                20,
                "atacado",
                "",
                "1234567890123",
                "2025-12-31",
                "2023-01-01",
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateCodigoBarrasSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "Descrição",
                100.0,
                20,
                "atacado",
                "Fabricante",
                "1234567890123",
                "2025-12-31",
                "2023-01-01",
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidateCodigoBarrasFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "Descrição",
                100.0,
                20,
                "atacado",
                "Fabricante",
                "",
                "2025-12-31",
                "2023-01-01",
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateNomeSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "Descrição",
                100.0,
                20,
                "atacado",
                "Fabricante",
                "1234567890123",
                "2025-12-31",
                "2023-01-01",
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidateNomeFailure() {
        Produto produto = new Produto(
                1L,
                "",
                "Descrição",
                100.0,
                20,
                "atacado",
                "Fabricante",
                "1234567890123",
                "2025-12-31",
                "2023-01-01",
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateDescricaoSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "Descrição",
                100.0,
                20,
                "atacado",
                "Fabricante",
                "1234567890123",
                "2025-12-31",
                "2023-01-01",
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
                "atacado",
                "Fabricante",
                "1234567890123",
                "2025-12-31",
                "2023-01-01",
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateCategoriaAtacadoSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "Descrição",
                100.0,
                11,
                "atacado",
                "Fabricante",
                "1234567890123",
                "2025-12-31",
                "2023-01-01",
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidateCategoriaAtacadoFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "Descrição",
                100.0,
                10,
                "atacado",
                "Fabricante",
                "1234567890123",
                "2025-12-31",
                "2023-01-01",
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateQuantidadeDisponivelSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "Descrição",
                100.0,
                12,
                "atacado",
                "Fabricante",
                "1234567890123",
                "2025-12-31",
                "2023-01-01",
                false
        );
        validator.validate(produto);
    }

    @Test
    public void testValidateQuantidadeDisponivelFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "Descrição",
                100.0,
                0,
                "atacado",
                "Fabricante",
                "1234567890123",
                "2025-12-31",
                "2023-01-01",
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidateDataFabricacaoSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "Descrição",
                100.0,
                20,
                "atacado",
                "Fabricante",
                "1234567890123",
                "2025-12-31",
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
                "Descrição",
                100.0,
                20,
                "atacado",
                "Fabricante",
                "1234567890123",
                "2025-12-31",
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
                "Descrição",
                100.0,
                20,
                "atacado",
                "Fabricante",
                "1234567890123",
                LocalDate.now().plusDays(31).toString(),
                "2023-01-01",
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidateDataValidadeFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "Descrição",
                100.0,
                20,
                "atacado",
                "Fabricante",
                "1234567890123",
                LocalDate.now().plusDays(29).toString(),
                "2023-01-01",
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }

    @Test
    public void testValidatePrecoPositivoSuccess() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "Descrição",
                100.0,
                20,
                "atacado",
                "Fabricante",
                "1234567890123",
                "2025-12-31",
                "2023-01-01",
                true
        );
        validator.validate(produto);
    }

    @Test
    public void testValidatePrecoPositivoFailure() {
        Produto produto = new Produto(
                1L,
                PRODUTO_1,
                "Descrição",
                -100.0,
                20,
                "atacado",
                "Fabricante",
                "1234567890123",
                "2025-12-31",
                "2023-01-01",
                true
        );
        assertThrows(IllegalArgumentException.class, () -> validator.validate(produto));
    }
}