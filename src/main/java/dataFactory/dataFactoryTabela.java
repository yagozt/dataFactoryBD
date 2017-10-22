/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataFactory;

import java.util.ArrayList;
import java.util.List;
import org.fluttercode.datafactory.impl.DataFactory;

/**
 *
 * @author yagoz
 */
public abstract class dataFactoryTabela {
    DataFactory df = new DataFactory();
    final int MAX = 50;
    String cabecalho;
    public String nome;
    
    public List<String> gerarDados(int quantidade){
        List<String> dados = new ArrayList<String>();
        int limite = 0;
        dados.add(cabecalho);
        for (int i = 0; i < quantidade; i++, limite++){
            String linha;
            linha = gerarLinha();
            if (i!=quantidade - 1 && limite < MAX)
                linha += ",";
            else {
                linha += ";";
                if (limite == MAX && i != quantidade - 1){
                    linha += "\n" + cabecalho;
                    limite = 0;
                }
            }
            dados.add(linha);
        }
       
        return dados;
    }
    
    public abstract String gerarLinha();
}
