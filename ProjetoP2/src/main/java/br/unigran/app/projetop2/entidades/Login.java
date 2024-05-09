
package br.unigran.app.projetop2.entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Login {
    private Integer id;
    private String nome;
    private String Senha;
    private Funcionario funcionario;
}
