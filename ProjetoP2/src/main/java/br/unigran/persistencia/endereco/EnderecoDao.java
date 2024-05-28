/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.persistencia.endereco;

import br.unigran.model.Cidade;
import br.unigran.persistencia.InterfaceDao;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public interface EnderecoDao extends InterfaceDao{
    public List listarPorCidade(Cidade cidade);
}
