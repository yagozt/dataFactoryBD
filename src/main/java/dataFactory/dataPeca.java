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
public class dataPeca extends dataFactoryTabela{
    public dataPeca(String nomeTabela){
        this.nome = nomeTabela;
        this.cabecalho = "insert into peca (nome,sobre,autor,dt_criacao,fk_exposicao_id) values";
    }

    @Override
    public String gerarLinha() {
        String linha = "(";

        linha += "'" + df.getName().replace("'", "") + "',"; //nome
        linha += "'" + df.getRandomText(20, 100).replace("'", "") + "',"; //sobre
        linha += "'" + df.getName().replace("'", "") + "',"; //autor
        linha += "'" + df.getDateBetween(df.getDate(2017, 1, 1), new Date()) + "',"; // cadastro
        linha += df.getNumberBetween(1, 10000); //fk_exposicao_id
        linha += ")";

        return linha;
    }
    
}
