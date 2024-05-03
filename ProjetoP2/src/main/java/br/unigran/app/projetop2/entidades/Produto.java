/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.app.projetop2.entidades;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author laboratorio
 */
@Getter
@Setter
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
