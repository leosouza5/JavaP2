/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.persistencia.saida;

import br.unigran.persistencia.InterfaceDao;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public interface SaidaDao extends InterfaceDao{
    public List listarByData(Date data);
}
