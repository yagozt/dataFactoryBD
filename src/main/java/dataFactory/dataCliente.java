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
public class dataCliente extends dataFactoryTabela{
    
    public dataCliente(String nomeTabela){
        cabecalho = "insert into cliente(login,email,senha,tipo,dt_cadastro,nome,logradouro,endereco,cep,data_nascimento,sexo,cpf,fk_bairro_id) values";
        nome = nomeTabela;
    }

    @Override
    public String gerarLinha() {
        String linha = "(";
        String[] sexo = {"M", "F"};

        linha += "'" + df.getRandomChars(3, 6) + "',"; //login
        linha += "'" + df.getEmailAddress().replace("'", "") + "',"; //email
        linha += "'" + df.getRandomChars(5) + "',"; //senha
        linha += 1 + ","; // tipo
        linha += "'" + df.getDateBetween(df.getDate(2017, 1, 1), new Date()) + "',"; // cadastro
        linha += "'" + df.getName() + "',"; //nome
        linha += "'" + df.getStreetSuffix() + "',"; //logradouro
        linha += "'" + df.getAddress() + "',"; // endereço
        linha += "'" + df.getNumberText(8) + "',"; //cep
        linha += "'" + df.getDateBetween(df.getDate(1950, 1, 1), df.getDate(2002, 1, 1)) + "',"; //nascimento
        linha += "'" + df.getItem(sexo) + "',"; //sexo
        linha += "'" + df.getNumberText(11) + "',"; //cpf
        linha += "" + df.getNumberBetween(1, 71); //bairro
        linha += ")";

        return linha;
    }
    
}
