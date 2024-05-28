/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.dto;

import br.unigran.model.Funcionario;
import br.unigran.model.Login;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class LoginDTO extends DTO{
    public String nome;
    public String senha;
    public Funcionario funcionario;

    @Override
    public Object builder() {
        Login login = new Login();
        login.setNome(nome);
        login.setSenha(senha);
        login.setFuncionario(funcionario);
        login.setId(id!=null?Long.valueOf(id):0l);
        return login;
    }
    
    public List getListaDados(List<Login> dados) {
        List dadosDTO = new LinkedList();
        for (Login dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    private Object converte(Login n) {
        
        LoginDTO dto = new LoginDTO();
        dto.nome =n.getNome();
        dto.id=n.getId().toString();
        dto.senha = n.getSenha();
        dto.funcionario = n.getFuncionario();
        return dto;
    }
}
