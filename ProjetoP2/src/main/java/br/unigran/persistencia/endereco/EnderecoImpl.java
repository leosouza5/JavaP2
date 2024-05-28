/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.persistencia.endereco;

import br.unigran.model.Cidade;
import br.unigran.persistencia.estado.*;
import br.unigran.model.Estado;
import br.unigran.persistencia.funcionario.*;
import br.unigran.model.Funcionario;
import br.unigran.persistencia.Dao;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class EnderecoImpl implements EnderecoDao {

    @Override
    public List listarPorCidade(Cidade cidade) {
        return Dao.getInstace().getEm().createQuery("Select l from endereco l where l.cidade = :cidade", Cidade.class)
                .setParameter("cidade",cidade)
                .getResultList();
    }


  

}
