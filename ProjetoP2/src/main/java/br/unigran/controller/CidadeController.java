/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.controller;

import br.unigran.dto.CidadeDTO;
import br.unigran.dto.DTO;
import br.unigran.model.Cidade;
import br.unigran.persistencia.cidade.CidadeDao;
import br.unigran.persistencia.cidade.CidadeImpl;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class CidadeController implements Controller{
     CidadeDao dao = new CidadeImpl();

    @Override
    public String[] getTitulosColunas() {
        return new String[]{"id","nome"};
    }

    @Override
    public Object[] getDados(DTO o) {
        CidadeDTO dto = (CidadeDTO) o;
        return new Object[]{dto.id,dto.nome};
    }

    @Override
    public List getListaDados() {
        List<Cidade> dados = dao.listar(Cidade.class);
        CidadeDTO cidadeDTO = new CidadeDTO();
        return cidadeDTO.getListaDados(dados);
    }

    @Override
    public void remover(DTO dto) {
        dao.remove(((CidadeDTO) dto).builder());
    }

    @Override
    public void salvar(DTO dto) throws Exception {
        CidadeDTO cidadeDTO = (CidadeDTO) dto;
        if(cidadeDTO.nome.isEmpty()){
            throw new Exception("nome invalido");
        }
        
        if(cidadeDTO.id == "01"){
            dao.salvar(dto.builder());
        }else{
            dao.atualiza(dto.builder());
        }
    }
    
}
