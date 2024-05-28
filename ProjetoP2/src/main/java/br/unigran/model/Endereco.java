
package br.unigran.model;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Endereco implements Serializable{
    

    @OneToMany(mappedBy = "endereco")
    private List<Entrada> entradas;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "logradouro",length = 244)
    private String logradouro;
    @Column(name = "cep",length = 55)
    private String cep;
    @ManyToOne
    private Cidade cidade;
}
