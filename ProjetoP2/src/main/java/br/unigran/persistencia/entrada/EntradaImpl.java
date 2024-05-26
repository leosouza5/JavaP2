/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.persistencia.entrada;

import br.unigran.model.Entrada;
import br.unigran.persistencia.Dao;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class EntradaImpl implements EntradaDao{

    @Override
    public List listarByData(Date data) {
        return Dao.getInstace().getEm().createQuery("select e from entrada e where e.dtEntrada = :data", Entrada.class)
                .setParameter("data", data).getResultList();
    }
    
}
