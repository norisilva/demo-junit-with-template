package bo;

import domain.Produto;

public class ProdutoProcessor {

    private final ProdutoValidator validator;

    public ProdutoProcessor(ProdutoValidator validator) {
        this.validator = validator;
    }

    public void process(Produto product) {
        System.out.println("Iniciando processamento de produto");
        validator.validate(product);
        System.out.println("Produto validado com sucesso");
    }

}
