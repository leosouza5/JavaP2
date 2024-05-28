package br.unigran.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author laboratorio
 */
@Getter

@Setter
@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="marca", length=255)
    private String marca;
    @Column(name="categoria", length=255)
    private String cateoria;
    @Column(length = 10, precision = 2)
    private Double precoCusto;
    @Column(length = 10, precision = 2)
    private Double precoVenda;
    @Column(name="fornecedor", length=255)
    private String Fornecedor;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataValidade;
    @Column(length = 10, precision = 2)
    private Double qtdMinimo;
    @Column(length = 10, precision = 2)
    private Double qtdEstoque;
}
