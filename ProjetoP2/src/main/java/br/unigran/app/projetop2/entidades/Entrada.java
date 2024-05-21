
package br.unigran.app.projetop2.entidades;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Entrada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtEntrada;
    @Column(name = "dtEntrada")
    private String secao;
    
    private Login usuario;
    @ManyToOne
    private Endereco endereco;
    private NotaFiscal notaFiscal;
}
