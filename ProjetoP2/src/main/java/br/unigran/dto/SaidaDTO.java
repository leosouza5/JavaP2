/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.dto;

import br.unigran.model.Saida;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class SaidaDTO extends DTO{
    public Date dtSaida;
    public String motivoSaida;
    
    
    public Saida builder(){
        Saida saida = new Saida();
        saida.setDtSaida(dtSaida);
        saida.setMotivo(motivoSaida);
        return saida;
    }

    public List getListaDados(List<Saida> dados) {
        List dadosDTO = new LinkedList();
        for (Saida dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    private Object converte(Saida s) {
        
        SaidaDTO dto= new SaidaDTO();
        dto.dtSaida=s.getDtSaida();
        dto.id=s.getId().toString();
        dto.motivoSaida=s.getMotivo();
        return dto;
    }
}
