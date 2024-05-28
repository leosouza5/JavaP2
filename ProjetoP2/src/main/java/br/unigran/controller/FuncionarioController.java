/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.controller;

import br.unigran.dto.DTO;
import br.unigran.dto.FuncionarioDTO;
import br.unigran.model.Funcionario;
import br.unigran.persistencia.funcionario.FuncionarioDao;
import br.unigran.persistencia.funcionario.FuncionarioImpl;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class FuncionarioController implements Controller{
    
    FuncionarioDao dao = new FuncionarioImpl();

    @Override
    public String[] getTitulosColunas() {
        return new String[]{"id","Nome","CPF","telefone","email","Salario"};
    }

    @Override
    public Object[] getDados(DTO o) {
        FuncionarioDTO dto = (FuncionarioDTO) o;
        return new Object[]{dto.id, dto.nomeFuncionario,dto.cpfFuncionario,dto.telefoneFuncionario,dto};
    }

    @Override
    public List getListaDados() {
        List<Funcionario> dados = dao.listar(Funcionario.class);
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
        return funcionarioDTO.getListaDados(dados);
    }

    @Override
    public void remover(DTO dto) {
        dao.remove(((FuncionarioDTO) dto).builder());
    }

    @Override
    public void salvar(DTO dto) throws Exception {
        
        FuncionarioDTO funcionariodto = (FuncionarioDTO) dto;
        if(funcionariodto.nomeFuncionario == null){
            throw new Exception("Nome invalido");
        }
        
        if(funcionariodto.id == "01"){
            dao.salvar(dto.builder());
        }else{
            dao.atualiza(dto.builder());
        }
        
        
    }
    
}
