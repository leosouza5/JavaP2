/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.persistencia.login;

import br.unigran.model.Login;
import br.unigran.persistencia.InterfaceDao;

/**
 *
 * @author Leonardo
 */
public interface LoginDao extends InterfaceDao{
    public Login verificaLogin(String nome, String senha);
}
