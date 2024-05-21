
package br.unigran.app.projetop2.entidades;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Entrada {
    private Integer id;
    private Date dtEntrada;
    private String secao;
    private Login usuario;
    private Endereco endereco;
    private NotaFiscal notaFiscal;
}
