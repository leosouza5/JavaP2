/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.persistencia.funcionario;

import br.unigran.persistencia.InterfaceDao;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public interface FuncionarioDao extends InterfaceDao{
    public List listarByNome(String nome);
}
