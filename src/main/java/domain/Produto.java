package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    private Integer quantidade;
    private String categoria;
    private String fabricante;
    private String codigoBarras;
    private String dataValidade;
    private String dataFabricacao;
    private Boolean disponivel;
}

