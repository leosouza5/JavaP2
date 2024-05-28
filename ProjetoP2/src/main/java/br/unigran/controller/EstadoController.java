/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.controller;

import br.unigran.dto.DTO;
import br.unigran.dto.EstadoDTO;
import br.unigran.model.Estado;
import br.unigran.persistencia.estado.EstadoDao;
import br.unigran.persistencia.estado.EstadoImpl;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class EstadoController implements Controller{
    EstadoDao dao = new EstadoImpl();
 
    @Override
    public String[] getTitulosColunas() {
        return new String[]{"id","Nome","Sigla"};
    }

    @Override
    public Object[] getDados(DTO o){
        EstadoDTO dto = (EstadoDTO) o;
        return new Object[]{dto.id, dto.nmEstado,dto.sigla};
    }

    @Override
    public List getListaDados() {
        List<Estado> dados = dao.listar(Estado.class);
        EstadoDTO estadoDTO = new EstadoDTO();
        return estadoDTO.getListaDados(dados);
    }

    @Override
    public void remover(DTO dto) {
        dao.remove(((EstadoDTO) dto).builder());
    }

    @Override
    public void salvar(DTO dto) throws Exception {
        EstadoDTO estadoDTO = (EstadoDTO) dto;
        if(estadoDTO.nmEstado.isEmpty()){
            throw new Exception("estadoinvalido");
        }
        
        if(estadoDTO.id == "01"){
            dao.salvar(dto.builder());
        }else{
            dao.atualiza(dto.builder());
        }
    }
    
}
