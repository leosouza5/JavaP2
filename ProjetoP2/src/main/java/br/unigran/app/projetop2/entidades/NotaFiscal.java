
package br.unigran.app.projetop2.entidades;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class NotaFiscal implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "cnpj")
    private String cnpj;
    @Column(name = "nome")
    private String nome;
    
    private Endereco endereco;
    private Entrada entrada;
    @OneToOne(mappedBy = "notaFiscal")
    private Saida saida;
}
