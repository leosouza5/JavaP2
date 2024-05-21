
package br.unigran.app.projetop2.entidades;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Endereco {
    private Integer id;
    private String logradouro;
    private String cep;
    private Cidade cidade;
}
