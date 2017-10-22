
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.fluttercode.datafactory.impl.DataFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yagoz
 */
public class geraNome {

    private static String gerarLinhaNome() {
        DataFactory df = new DataFactory();
        String linha = "(";
        String[] sexo = {"M", "F"};

        linha += "'" + df.getRandomChars(3, 6) + "',"; //login
        linha += "'" + df.getEmailAddress() + "',"; //email
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
    
    public static List<String> gerarClientes(int quantidade){
        List<String> clientes = new ArrayList<String>();
        String cabecalho = "insert into cliente(login,email,senha,tipo,dt_cadastro,nome,logradouro,endereco,cep,data_nascimento,sexo,cpf,fk_bairro_id) values";
        clientes.add(cabecalho);
        for (int i = 0; i < quantidade; i++){
            String linha = gerarLinhaNome();
            if (i!=quantidade - 1)
                linha += ",";
            else
                linha += ";";
            clientes.add(linha);
        }
            
       
        return clientes;
    }
}
