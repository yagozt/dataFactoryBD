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
public class dataEmpresa extends dataFactoryTabela{

    public dataEmpresa(String nomeTabela){
        this.nome=nomeTabela;
        this.cabecalho = "insert into empresa(login,email,senha,tipo, sobre,dt_cadastro,nome,logradouro,endereco,cep,cnpj,  fk_bairro_id, dt_abertura) values";
    }
    @Override
    public String gerarLinha() {
        String linha = "(";

        linha += "'" + df.getRandomChars(3, 6) + "',"; //login
        linha += "'" + df.getEmailAddress() + "',"; //email
        linha += "'" + df.getRandomChars(5) + "',"; //senha
        linha += 2 + ","; // tipo
        linha += "'" + df.getRandomText(20, 25).replace("'", "") + "',"; //sobre
        linha += "'" + df.getDateBetween(df.getDate(2017, 1, 1), new Date()) + "',"; // cadastro
        linha += "'" + df.getBusinessName().replace("'", "") + "',"; //nome
        linha += "'" + df.getStreetSuffix().replace("'", "") + "',"; //logradouro
        linha += "'" + df.getAddress().replace("'", "") + "',"; // endereço
        linha += "'" + df.getNumberText(8) + "',"; //cep
        linha += "'" + df.getNumberText(8) +"0001"+ df.getNumberText(2) + "',"; //cnpj
        linha += "" + df.getNumberBetween(1, 71) + ","; //bairro
        linha += "'" + df.getDateBetween(df.getDate(2017, 1, 1), new Date()) + "'"; // abertura
        linha += ")";

        return linha;
    }
    
}
