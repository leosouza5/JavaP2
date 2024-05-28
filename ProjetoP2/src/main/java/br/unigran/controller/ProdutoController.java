/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.controller;

import br.unigran.dto.DTO;
import br.unigran.dto.ProdutoDTO;
import br.unigran.model.Produto;
import br.unigran.persistencia.produto.ProdutoDao;
import br.unigran.persistencia.produto.ProdutoImpl;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class ProdutoController implements Controller{
    ProdutoDao dao = new ProdutoImpl();

    @Override
    public String[] getTitulosColunas() {
        return new String[]{"id","Marca","Categoria","Preco Custo","Preco Venda","Data Validade","Estoque"};
    }

    @Override
    public Object[] getDados(DTO o) {
        ProdutoDTO dto = (ProdutoDTO) o;
        return new Object[]{dto.id, dto.marcaProduto,dto.cateoriaProduto,dto.precoCustoProduto,dto.precoVendaProduto,dto.dataValidadeProduto,dto.qtdEstoqueProduto};
    }

    @Override
    public List getListaDados() {
        List<Produto> dados = dao.listar(Produto.class);
        ProdutoDTO produtoDTO = new ProdutoDTO();
        return produtoDTO.getListaDados(dados);
    }

    @Override
    public void remover(DTO dto) {
        dao.remove(((ProdutoDTO) dto).builder());
    }

    @Override
    public void salvar(DTO dto) throws Exception {
        ProdutoDTO produtodto = (ProdutoDTO) dto;
        if(produtodto.precoVendaProduto == null){
            throw new Exception("Preco Venda invalido");
        }
        
        if(produtodto.id == "01"){
            dao.salvar(dto.builder());
        }else{
            dao.atualiza(dto.builder());
        }
    }
    
}
