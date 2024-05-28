/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.controller;

import br.unigran.dto.DTO;
import br.unigran.dto.SaidaDTO;
import br.unigran.model.Saida;
import br.unigran.persistencia.saida.SaidaDao;
import br.unigran.persistencia.saida.SaidaImpl;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class SaidaController implements Controller{
    SaidaDao dao = new SaidaImpl();
    @Override
    public String[] getTitulosColunas() {
        return new String[]{"id","Data","Motivo","Nota Fiscal"};
    }

    @Override
    public Object[] getDados(DTO o) {
        SaidaDTO dto = (SaidaDTO) o;
        return new Object[]{dto.id,dto.dtSaida,dto.motivoSaida};
    }

    @Override
    public List getListaDados() {
        List<Saida> dados = dao.listar(Saida.class);
        SaidaDTO SaidaDTO = new SaidaDTO();
        return SaidaDTO.getListaDados(dados);
    }

    @Override
    public void remover(DTO dto) {
        dao.remove(((SaidaDTO) dto).builder());
    }

    @Override
    public void salvar(DTO dto) throws Exception {
        SaidaDTO o = (SaidaDTO) dto;
        if(o.motivoSaida.isEmpty()){
            throw new Exception("Motivo invalido");
        }
        
        if(o.id == "01"){
            dao.salvar(dto.builder());
        }else{
            dao.atualiza(dto.builder());
        }
        
    }
    
}
