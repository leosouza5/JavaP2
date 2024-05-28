/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.dto;

import br.unigran.model.Produto;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class ProdutoDTO extends DTO{
    public String marcaProduto;
    public String cateoriaProduto;
    public Double precoCustoProduto;
    public Double precoVendaProduto;
    public String fornecedorProduto;
    public Date dataValidadeProduto;
    public Double qtdMinimoProduto;
    public Double qtdEstoqueProduto;
    
    
    @Override
    public Produto builder(){
        Produto produto = new Produto();
        produto.setCateoria(cateoriaProduto);
        produto.setMarca(marcaProduto);
        produto.setPrecoCusto(precoCustoProduto);
        produto.setPrecoVenda(precoVendaProduto);
        produto.setFornecedor(fornecedorProduto);
        produto.setDataValidade(dataValidadeProduto);
        produto.setQtdMinimo(qtdMinimoProduto);
        produto.setQtdEstoque(qtdEstoqueProduto);
        produto.setId(id!=null?Long.valueOf(id):0l);
        return produto;
    }

    public List getListaDados(List<Produto> dados) {
        List dadosDTO = new LinkedList();
        for (Produto dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    private Object converte(Produto p) {
        
        ProdutoDTO dto = new ProdutoDTO();
        dto.marcaProduto=p.getMarca();
        dto.id=p.getId().toString();
        dto.cateoriaProduto=p.getCateoria();
        dto.precoCustoProduto = p.getPrecoCusto();
        dto.precoVendaProduto = p.getPrecoVenda();
        dto.fornecedorProduto = p.getFornecedor();
        dto.dataValidadeProduto = p.getDataValidade();
        dto.qtdMinimoProduto = p.getQtdMinimo();
        dto.qtdEstoqueProduto = p.getQtdEstoque();
        return dto;
    }
}
