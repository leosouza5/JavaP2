/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.persistencia.cidade;

import br.unigran.persistencia.estado.*;
import br.unigran.model.Estado;
import br.unigran.persistencia.funcionario.*;
import br.unigran.persistencia.InterfaceDao;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public interface CidadeDao extends InterfaceDao{
    public List listarByEstado(String uf);
}
