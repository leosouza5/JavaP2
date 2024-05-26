/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.persistencia.funcionario;

import br.unigran.model.Funcionario;
import br.unigran.persistencia.Dao;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class FuncionarioImpl implements FuncionarioDao{

    @Override
    public List listarByNome(String nome) {
        return Dao.getInstace().getEm().createNativeQuery("Select * from funcionario where nome like '% :? %'",Funcionario.class)
                .setParameter(1,nome).getResultList();
    }
    
}
