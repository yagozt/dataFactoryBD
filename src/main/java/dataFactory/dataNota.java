/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataFactory;

/**
 *
 * @author yagoz
 */
public class dataNota extends dataFactoryTabela{
    
    public void notaPeca(){
        this.nome = "peca";
        this.cabecalho = "insert into nota_peca (nota,fk_cliente_id,fk_peca_id) values";
    }
    
    public void notaExposicao(){
        this.nome = "peca";
        this.cabecalho = "insert into nota_peca (nota,fk_cliente_id,fk_exposicao_id) values";
    }

    @Override
    public String gerarLinha() {
        String linha = "(";
        
        linha += df.getNumberBetween(1, 5) + ",";
        linha += df.getNumberBetween(1, 10000) + ",";
        linha += df.getNumberBetween(1, 10000);
        
        linha+= ")";
        return linha;
    }
    
}
