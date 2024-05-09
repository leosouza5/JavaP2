
package br.unigran.app.projetop2.entidades;


import java.util.Date;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author laboratorio
 */
@Getter
@Setter
public class Produto {
    private Integer id;
    private String marca;
    private String cateoria;
    private Double precoCusto;
    private Double precoVenda;
    private String idFornecedor;
    private Date dataValidade;
    private Double qtdMinimo;
    private Double qtdEstoque;
}
