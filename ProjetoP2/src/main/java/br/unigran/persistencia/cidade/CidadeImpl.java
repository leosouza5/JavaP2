/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.persistencia.cidade;

import br.unigran.model.Cidade;
import br.unigran.persistencia.Dao;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class CidadeImpl implements CidadeDao {

    @Override
    public List listarByEstado(String uf) {
        return Dao.getInstace().getEm().createQuery("Select l from cidade l where l.estado = :uf", Cidade.class)
                .setParameter("uf",uf)
                .getResultList();
    }

    

}
