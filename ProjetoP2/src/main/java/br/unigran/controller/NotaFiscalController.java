/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.controller;

import br.unigran.dto.DTO;
import br.unigran.dto.NotaFiscalDTO;
import br.unigran.model.NotaFiscal;
import br.unigran.persistencia.notafiscal.notaFiscalDao;
import br.unigran.persistencia.notafiscal.notaFiscalImpl;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class NotaFiscalController implements Controller{
    
    notaFiscalDao dao = new notaFiscalImpl();  

    @Override
    public String[] getTitulosColunas() {
        return new String[]{"id","cnpj","nome","Endereco","Entrada","Saida"};
    }

    @Override
    public Object[] getDados(DTO o) {
        NotaFiscalDTO dto = (NotaFiscalDTO) o;
        return new Object[]{dto.id,dto.cnpj,dto.nome,dto.endereco,dto.entrada,dto.entrada};
    }

    @Override
    public List getListaDados() {
        List<NotaFiscal> dados = dao.listar(NotaFiscal.class);
        NotaFiscalDTO notaFiscalDTO = new NotaFiscalDTO();
        return notaFiscalDTO.getListaDados(dados);
    }

    @Override
    public void remover(DTO dto) {
        dao.remove(((NotaFiscalDTO) dto).builder());
    }

    @Override
    public void salvar(DTO dto) throws Exception {
        NotaFiscalDTO notaFiscalDTO = (NotaFiscalDTO) dto;
        if(notaFiscalDTO.nome.isEmpty()){
            throw new Exception("nome invalido");
        }
        
        if(notaFiscalDTO.id == "01"){
            dao.salvar(dto.builder());
        }else{
            dao.atualiza(dto.builder());
        }
    }
    
}
