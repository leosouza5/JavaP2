/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.persistencia.estado;

import br.unigran.model.Estado;
import br.unigran.persistencia.funcionario.*;
import br.unigran.model.Funcionario;
import br.unigran.persistencia.Dao;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class EstadoImpl implements EstadoDao {

    @Override
    public Estado listarBySigla(String sigla) {
        return Dao.getInstace().getEm().createQuery("Select l from estado l where l.sigla = :sigla", Estado.class)
                .setParameter("sigla",sigla)
                .setParameter("nome",sigla)
                .getSingleResult();
    }

  

}
