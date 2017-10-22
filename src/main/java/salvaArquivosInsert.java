
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yagoz
 */
public class salvaArquivosInsert {
    private String caminho = "C:\\Users\\yagoz\\Documents\\IFES\\Banco de Dados\\Trabalho\\InsercaoDados\\";
    
    private String nomeArquivo;
    
    public salvaArquivosInsert(String nomeArquivo){
        this.nomeArquivo = nomeArquivo;
        this.caminho += this.nomeArquivo + ".sql";
    }
    
    public void salvarArquivoDados(List<String> dados) throws IOException{
        File outputFile = new File(caminho);
        FileWriter out = new FileWriter(outputFile);
        
        for (String linha : dados) {
            out.write(linha);
            out.write("\n");
        }
        
        out.close();
    }
    
}
