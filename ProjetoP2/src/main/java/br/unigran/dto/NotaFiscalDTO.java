/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.dto;

import br.unigran.model.Endereco;
import br.unigran.model.Entrada;
import br.unigran.model.NotaFiscal;
import br.unigran.model.Produto;
import br.unigran.model.Saida;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Leonardo
 */
public class NotaFiscalDTO extends DTO{
    public String cnpj;
    public String nome;
    public Endereco endereco;
    public Entrada entrada;
    public Saida saida;    @Override

    public NotaFiscal builder() {
        NotaFiscal nota = new NotaFiscal();
        nota.setCnpj(cnpj);
        nota.setEndereco(endereco);
        nota.setCnpj(cnpj);
        nota.setEntrada(entrada);
        nota.setSaida(saida);
        nota.setId(id!=null?Long.valueOf(id):0l);
        return nota;
    }
    
    public List getListaDados(List<NotaFiscal> dados) {
        List dadosDTO = new LinkedList();
        for (NotaFiscal dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    private Object converte(NotaFiscal n) {
        
        NotaFiscalDTO dto = new NotaFiscalDTO();
        dto.cnpj=n.getCnpj();
        dto.id=n.getId().toString();
        dto.nome=n.getNome();
        dto.endereco = n.getEndereco();
        dto.entrada = n.getEntrada();
        dto.saida = n.getSaida();
        return dto;
    }
    
}
