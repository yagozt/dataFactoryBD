
import java.util.ArrayList;
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
public class geraTabelasRelacionais {
    public static List<String> gerarClienteEmpresa(int quantidade){
        DataFactory df = new DataFactory();
        
        List<String> clientesEmpresa = new ArrayList<String>();
        String cabecalho = "insert into cliente_empresa(fk_cliente_id,fk_empresa_id) values";
        clientesEmpresa.add(cabecalho);
        for (int i = 0; i < quantidade; i++){
            String linha = "(" + df.getNumberUpTo(10000) + "," + df.getNumberUpTo(10000) + ")";
            if (i!=quantidade - 1)
                linha += ",";
            else
                linha += ";";
            clientesEmpresa.add(linha);
        }
            
       
        return clientesEmpresa;
    }
    
    public static List<String> gerarClienteNotificacao(int quantidade){
        DataFactory df = new DataFactory();
        
        List<String> clientesEmpresa = new ArrayList<String>();
        String cabecalho = "insert into cliente_notificacao(fk_cliente_id,fk_notificacao_id) values";
        clientesEmpresa.add(cabecalho);
        for (int i = 0; i < quantidade; i++){
            String linha = "(" + df.getNumberUpTo(10000) + "," + df.getNumberUpTo(10000) + ")";
            if (i!=quantidade - 1)
                linha += ",";
            else
                linha += ";";
            clientesEmpresa.add(linha);
        }
            
       
        return clientesEmpresa;
    }
}
