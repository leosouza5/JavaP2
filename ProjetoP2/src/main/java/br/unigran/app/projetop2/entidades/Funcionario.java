/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.app.projetop2.entidades;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Funcionario{
    private Integer id;
    private String nomeCompleto;
    private String CPF;
    private Date datNascimento;
    private String sexo;
    private String telefone;
    private String email;
    private String dtAdmissao;
    private String cargo;
    private String funcao;
    private Float salario;
    private Login login;
}
