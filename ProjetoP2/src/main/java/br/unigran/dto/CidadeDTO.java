/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.dto;

import br.unigran.model.Cidade;
import br.unigran.model.Endereco;
import br.unigran.model.Estado;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class CidadeDTO extends DTO{
    public List<Endereco> enderecos;
    public String nome;
    public Estado estado;

    @Override
    public Object builder() {
        Cidade cidade = new Cidade();
        cidade.setEnderecos(enderecos);
        cidade.setEstado(estado);
        cidade.setId(id!=null?Long.valueOf(id):0l);
        cidade.setNome(nome);
        return cidade;
    }
    
    public List getListaDados(List<Cidade> dados) {
        List dadosDTO = new LinkedList();
        for (Cidade dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    private Object converte(Cidade n) {
        
        CidadeDTO dto = new CidadeDTO();
        dto.enderecos =n.getEnderecos();
        dto.id=n.getId().toString();
        dto.estado = n.getEstado();
        dto.nome = n.getNome();
        return dto;
    }
    
}
