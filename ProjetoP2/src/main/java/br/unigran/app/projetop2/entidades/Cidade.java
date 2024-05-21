
package br.unigran.app.projetop2.entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cidade {
    private Integer id;
    private String nome;
    private Estado estado;
}
