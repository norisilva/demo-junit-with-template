package bo;

import domain.Produto;

import java.time.LocalDate;

public class ProdutoValidator {

    public void validate(Produto produto) {
        validateCategoria(produto);
        validatePreco(produto);
        validateDisponibilidade(produto);
        validateQuantidade(produto);
        validateDatas(produto);
        validateFabricante(produto);
        validateCodigoBarras(produto);
        validateNome(produto);
        validateDescricao(produto);
        validateCategoriaAtacado(produto);
        validateQuantidadeDisponivel(produto);
        validateDataFabricacao(produto);
        validateDataValidade(produto);
        validatePrecoPositivo(produto);
    }

    private void validateCategoria(Produto produto) {
        if (isNullOrEmpty(produto.getCategoria())) {
            throw new IllegalArgumentException("Categoria do produto não pode ser vazia");
        }
    }

    private void validatePreco(Produto produto) {
        if (produto.getPreco() == null || produto.getPreco() <= 0) {
            throw new IllegalArgumentException("Preço do produto deve ser maior que zero");
        }
    }

    private void validateDisponibilidade(Produto produto) {
        if (produto.getDisponivel() == null) {
            throw new IllegalArgumentException("Disponibilidade do produto não pode ser nula");
        }
    }

    private void validateQuantidade(Produto produto) {
        if (produto.getQuantidade() == null || produto.getQuantidade() < 0) {
            throw new IllegalArgumentException("Quantidade do produto não pode ser negativa");
        }
    }

    private void validateDatas(Produto produto) {
        if (produto.getDataFabricacao() == null || produto.getDataValidade() == null) {
            throw new IllegalArgumentException("Datas de fabricação e validade não podem ser nulas");
        }
    }

    private void validateFabricante(Produto produto) {
        if (isNullOrEmpty(produto.getFabricante())) {
            throw new IllegalArgumentException("Fabricante do produto não pode ser vazio");
        }
    }

    private void validateCodigoBarras(Produto produto) {
        if (isNullOrEmpty(produto.getCodigoBarras())) {
            throw new IllegalArgumentException("Código de barras do produto não pode ser vazio");
        }
    }

    private void validateNome(Produto produto) {
        if (isNullOrEmpty(produto.getNome())) {
            throw new IllegalArgumentException("Nome do produto não pode ser vazio");
        }
    }

    private void validateDescricao(Produto produto) {
        if (isNullOrEmpty(produto.getDescricao())) {
            throw new IllegalArgumentException("Descrição do produto não pode ser vazia");
        }
    }

    private void validateCategoriaAtacado(Produto produto) {
        if ("atacado".equalsIgnoreCase(produto.getCategoria()) && (produto.getQuantidade() == null || produto.getQuantidade() <= 10)) {
            throw new IllegalArgumentException("Produtos da categoria atacado devem ter quantidade maior que 10");
        }
    }

    private void validateQuantidadeDisponivel(Produto produto) {
        if (produto.getQuantidade() != null && produto.getQuantidade() == 0 && Boolean.TRUE.equals(produto.getDisponivel())) {
            throw new IllegalArgumentException("Produto com quantidade zero não pode estar disponível");
        }
    }

    private void validateDataFabricacao(Produto produto) {
        if (produto.getDataFabricacao() != null && LocalDate.parse(produto.getDataFabricacao()).isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Data de fabricação não pode ser maior que a data atual");
        }
    }

    private void validateDataValidade(Produto produto) {
        if (produto.getDataValidade() != null && LocalDate.parse(produto.getDataValidade()).isBefore(LocalDate.now().plusDays(30))) {
            throw new IllegalArgumentException("Data de validade deve ser maior que 30 dias a partir de hoje");
        }
    }

    private void validatePrecoPositivo(Produto produto) {
        if (produto.getPreco() != null && produto.getPreco() <= 0) {
            throw new IllegalArgumentException("Preço do produto deve ser positivo");
        }
    }

    private boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }
}