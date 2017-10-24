/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataFactory;

import java.util.Date;

/**
 *
 * @author yagoz
 */
public class dataNotificacao extends dataFactoryTabela{
    
    public dataNotificacao(String nomeTabela){
        cabecalho = "insert into notificacao(descricao,data_cadastro,id_origem,tipo,tipo_origem) values";
        nome = nomeTabela;
    }
    
    @Override
    public String gerarLinha() {
        String linha = "(";

        linha += "'" + df.getRandomText(20, 25) + "',"; //descricao
        linha += "'" + df.getDateBetween(df.getDate(2017, 1, 1), new Date()) + "',"; //data
        linha += df.getNumberBetween(0, 10) + "," ;  // id_origem
        linha += df.getNumberBetween(1,3) + ","; // tipo
        linha += df.getNumberBetween(1,3);// tipo_origem 
        
        linha += ")";

        return linha;
    }
    
}
