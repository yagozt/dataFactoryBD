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
public class dataTabelasRelacionais extends dataFactoryTabela{
    
    public void tabelaClienteEmpresa (){
        this.nome = "cliente_empresa";
        this.cabecalho = "insert into cliente_empresa(fk_cliente_id,fk_empresa_id) values";
    }
    
    public void tabelaClienteNotificacao (){
        this.nome = "cliente_empresa";
        this.cabecalho = "insert into cliente_notificacao(fk_cliente_id,fk_notificacao_id) values";
    }

    @Override
    public String gerarLinha() {
        String linha = "(" + df.getNumberUpTo(10000) + "," + df.getNumberUpTo(10000) + ")";
        return linha;
    }
    
}
