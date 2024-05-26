/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.persistencia.login;

import br.unigran.model.Login;
import br.unigran.persistencia.Dao;

/**
 *
 * @author Leonardo
 */
public class LoginImpl implements LoginDao{

    @Override
    public Login verificaLogin(String nome, String senha) {
        return Dao.getInstace().getEm().createQuery("Select l from login l where l.nome = :nome AND l.senha = :senha", Login.class)
                .setParameter("nome",nome)
                .setParameter("senha", senha)
                .getSingleResult();
    }
    
}
