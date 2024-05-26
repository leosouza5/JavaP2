/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.persistencia.saida;

import br.unigran.model.Saida;
import br.unigran.persistencia.Dao;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class SaidaImpl implements SaidaDao{

    @Override
    public List listarByData(Date data) {
        return Dao.getInstace().getEm().createNativeQuery("select * from saida where dtSaida = :?", Saida.class)
                .setParameter(1, data).getResultList();
    }
    
}
