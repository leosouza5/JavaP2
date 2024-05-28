/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Funcionario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome",length = 55)
    private String nomeCompleto;
    @Column(name = "cpf",length = 11)
    private String CPF;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datNascimento;
    @Column(name = "sexo",length = 30)
    private String sexo;
    @Column(name = "telefone",length = 55)
    private String telefone;
    @Column(name = "email",length = 55)
    private String email;    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtAdmissao;
    @Column(name = "cargo",length = 55)
    private String cargo;
    @Column(name = "salario",length = 55)
    private Double salario;
    
    @OneToOne(mappedBy = "funcionario")
    private Login login;
}
