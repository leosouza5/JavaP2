/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.persistencia.produto;

import br.unigran.model.Produto;
import br.unigran.persistencia.Dao;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class ProdutoImpl implements ProdutoDao{

    @Override
    public List listarByCodigo(Integer id) {
        return Dao.getInstace().getEm().createNativeQuery("select * from produto where id = :?", Produto.class)
                .setParameter(1, id).getResultList();
    }

    @Override
    public List listarAbaixoQtdMin() {
        return Dao.getInstace().getEm().createNativeQuery("select * from produto where qtdEstoque < qtdMinimo", Produto.class)
                .getResultList();
    }
    
    
}
