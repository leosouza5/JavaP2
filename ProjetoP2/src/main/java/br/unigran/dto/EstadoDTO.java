/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.dto;

import br.unigran.model.Cidade;
import br.unigran.model.Estado;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class EstadoDTO extends DTO{
    public List<Cidade> cidades;
    public String nmEstado;
    public String sigla;

    @Override
    public Object builder() {
        Estado estado = new Estado();
        estado.setCidades(cidades);
        estado.setNmEstado(nmEstado);
        estado.setSigla(sigla);
        estado.setId(id!=null?Long.valueOf(id):0l);
        return estado;
    }
    
    public List getListaDados(List<Estado> dados) {
        List dadosDTO = new LinkedList();
        for (Estado dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    private Object converte(Estado n) {
        
        EstadoDTO dto = new EstadoDTO();
        dto.nmEstado =n.getNmEstado();
        dto.id=n.getId().toString();
        dto.sigla = n.getSigla();
        return dto;
    }
}
