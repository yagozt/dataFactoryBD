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
public class dataComentario extends dataFactoryTabela{
    
    public dataComentario(String nomeTabela){
        cabecalho = "insert into comentario (descricao,data_cadastro,fk_origem_id,id_destino,tipo_destino_comentario) values";
        nome = nomeTabela;
    }

    @Override
    public String gerarLinha() {
        String linha = "(";

        linha += "'" + df.getRandomText(10, 15) + "',"; //descricao
        linha += "'" + df.getDateBetween(df.getDate(2017, 1, 1), new Date()) + "',"; // data_cadastro
        linha += df.getNumberBetween(1,10000) + ","; // tipo_destino
        linha += "'" + df.getNumberBetween(1,10000) + "',"; //id destino
        linha += "'" + df.getNumberBetween(1,2) + "'"; // chave estrangeira origem
       

        linha += ")";

        return linha;
    }
    
}
