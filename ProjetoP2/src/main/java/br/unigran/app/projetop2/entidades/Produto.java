/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.app.projetop2.entidades;

<<<<<<< HEAD
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author laboratorio
 */
@Getter
@Setter
=======

>>>>>>> 891acb15c4e9b3585e66c782f8b8727738311b56
public class Produto {
    private Integer id;
    private String marca;
    private String cateoria;
    private Double precoCusto;
    private Double precoVenda;
    private Fornecedor idFornecedor;
    private Date dataValidade;
    private Double qtdMinimo;
    private Double qtdEstoque;
}
