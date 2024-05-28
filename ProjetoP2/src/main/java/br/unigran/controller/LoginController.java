/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.controller;

import br.unigran.dto.DTO;
import br.unigran.dto.LoginDTO;
import br.unigran.model.Login;
import br.unigran.persistencia.login.LoginDao;
import br.unigran.persistencia.login.LoginImpl;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class LoginController implements Controller{
    LoginDao dao = new LoginImpl();

    @Override
    public String[] getTitulosColunas() {
        return new String[]{"id","nome","Funcionario"};
    }

    @Override
    public Object[] getDados(DTO o) {
        LoginDTO dto = (LoginDTO) o;
        return new Object[]{dto.id,dto.nome,dto.funcionario};
    }

    @Override
    public List getListaDados() {
        List<Login> dados = dao.listar(Login.class);
        LoginDTO loginDTO = new LoginDTO();
        return loginDTO.getListaDados(dados);
    }

    @Override
    public void remover(DTO dto) {
        dao.remove(((LoginDTO) dto).builder());
    }

    @Override
    public void salvar(DTO dto) throws Exception {
        LoginDTO logindto = (LoginDTO) dto;
        if(logindto.nome.isEmpty()){
            throw new Exception("Preco Venda invalido");
        }
        
        if(logindto.id == "01"){
            dao.salvar(dto.builder());
        }else{
            dao.atualiza(dto.builder());
        }
    }
    
}
