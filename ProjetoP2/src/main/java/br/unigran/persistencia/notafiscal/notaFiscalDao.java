/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unigran.persistencia.notafiscal;

import br.unigran.persistencia.InterfaceDao;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public interface notaFiscalDao extends InterfaceDao{
    public List listarByNome(String nome);
}
