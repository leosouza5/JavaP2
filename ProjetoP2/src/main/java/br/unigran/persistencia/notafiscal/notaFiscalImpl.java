/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.persistencia.notafiscal;

import br.unigran.model.NotaFiscal;
import br.unigran.persistencia.Dao;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class notaFiscalImpl implements notaFiscalDao{

    @Override
    public List listarByNome(String nome) {
        return Dao.getInstace().getEm().createNativeQuery("Select * from notafiscal where nome like ?",NotaFiscal.class)
                .setParameter(1,"%" + nome + "%")
                .getResultList();
    }
    
}
