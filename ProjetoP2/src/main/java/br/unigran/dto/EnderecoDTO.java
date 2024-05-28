/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.dto;

import br.unigran.model.Cidade;
import br.unigran.model.Endereco;
import br.unigran.model.Entrada;
import br.unigran.model.Estado;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class EnderecoDTO extends DTO{
    public List<Entrada> entradas;
    public String logradouro;
    public String cep;
    public Cidade cidade;

    @Override
    public Object builder() {
        Endereco endereco = new Endereco();
        endereco.setEntradas(entradas);
        endereco.setLogradouro(logradouro);
        endereco.setId(id!=null?Long.valueOf(id):0l);
        endereco.setCep(cep);
        endereco.setCidade(cidade);
        return endereco;
    }
    
    public List getListaDados(List<Endereco> dados) {
        List dadosDTO = new LinkedList();
        for (Endereco dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    private Object converte(Endereco n) {
        
        EnderecoDTO dto = new EnderecoDTO();
        dto.cep =n.getCep();
        dto.id=n.getId().toString();
        dto.cidade = n.getCidade();
        dto.logradouro = n.getLogradouro();
        dto.entradas = n.getEntradas();
        return dto;
    }
    
}
