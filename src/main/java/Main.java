
import dataFactory.dataCliente;
import dataFactory.dataEmpresa;
import dataFactory.dataExposicao;
import java.io.IOException;
import java.util.Date;
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
public class Main {

    public static void main(String[] args) {
        DataFactory df = new DataFactory();
        System.out.println(df.getAddressLine2());
        try{
            dataCliente tabelaCliente = new dataCliente("cliente");
            dataEmpresa tabelaEmpresa = new dataEmpresa("empresa");
            dataExposicao tabelaExposicao = new dataExposicao("exposicao",0);
            dataExposicao tabelaExposicaoTemp = new dataExposicao("exposicao_temp",1);
        new salvaArquivosInsert(tabelaCliente.nome).salvarArquivoDados(tabelaCliente.gerarDados(100));
        new salvaArquivosInsert(tabelaEmpresa.nome).salvarArquivoDados(tabelaEmpresa.gerarDados(100));
        new salvaArquivosInsert(tabelaExposicao.nome).salvarArquivoDados(tabelaExposicao.gerarDados(100));
        new salvaArquivosInsert(tabelaExposicaoTemp.nome).salvarArquivoDados(tabelaExposicaoTemp.gerarDados(100));
        }
        catch (IOException e){
            
        }
    }
    
}
