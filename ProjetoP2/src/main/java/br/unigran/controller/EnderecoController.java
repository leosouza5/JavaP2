/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.controller;

import br.unigran.dto.CidadeDTO;
import br.unigran.dto.DTO;
import br.unigran.dto.EnderecoDTO;
import br.unigran.model.Endereco;
import br.unigran.persistencia.endereco.EnderecoDao;
import br.unigran.persistencia.endereco.EnderecoImpl;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class EnderecoController implements Controller{
    EnderecoDao dao = new EnderecoImpl();
    @Override
    public String[] getTitulosColunas() {
        return new String[]{"id","logradouro","cep"};
    }

    @Override
    public Object[] getDados(DTO o) {
        EnderecoDTO dto = (EnderecoDTO) o;
        return new Object[]{dto.id,dto.logradouro,dto.cep};
    }

    @Override
    public List getListaDados() {
        List<Endereco> dados = dao.listar(Endereco.class);
        EnderecoDTO enderecoDTO = new EnderecoDTO();
        return enderecoDTO.getListaDados(dados);
    }

    @Override
    public void remover(DTO dto) {
        dao.remove(((EnderecoDTO) dto).builder());
    }

    @Override
    public void salvar(DTO dto) throws Exception {
        EnderecoDTO enderecoDTO = (EnderecoDTO) dto;
        if(enderecoDTO.logradouro.isEmpty()){
            throw new Exception("Logradouro invalido");
        }
        
        if(enderecoDTO.id == "01"){
            dao.salvar(dto.builder());
        }else{
            dao.atualiza(dto.builder());
        }
    }
    
}
