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
public class dataExposicao extends dataFactoryTabela{
    private int tipo;
    
    public dataExposicao(String nome,int tipo){
        this.nome = nome;
        this.tipo = tipo;
        if (tipo==0)
            this.cabecalho = "insert into exposicao(tipo_exposicao, descricao, dt_inicio, hr_inicio, hr_final, logradouro, endereco, fk_empresa_id, fk_bairro_id) values";
        else
            this.cabecalho = "insert into exposicao_temp(tipo_exposicao, descricao, dt_inicio,dt_fim, hr_inicio, hr_final, logradouro, endereco, fk_empresa_id, fk_bairro_id) values";
    }

    public String[] getHour(){
        String[] horas = {"",""};
        int horaInicial = df.getNumberBetween(6, 16);
        int horaFinal = horaInicial + df.getNumberBetween(2, 8);
        horas[0] = horaInicial + ":00";
        horas[1] = horaFinal + ":00";
        return horas;
    }
    @Override
    public String gerarLinha() {
        String[] horas = getHour();
        Date inicio = df.getDateBetween(df.getDate(2017, 1, 1), new Date());
        Date fim = df.getDateBetween(inicio, new Date());
        String linha = "(";
        

        if (tipo==0)
            linha += 1 + ","; // tipo_exposicao
        else
            linha += 2 + ",";
        linha += "'" + df.getRandomChars(3, 6) + "',"; //descricao
        linha += "'" + inicio + "',"; //dt_inicio
        if (tipo!=0)
            linha += "'" + fim + "',"; //dt_inicio
        linha += "'" + horas[0] + "',"; //hr_inicio
        linha += "'" + horas[1] + "',"; //hr_final
        linha += "'" + df.getStreetSuffix() + "',"; //logradouro
        linha += "'" + df.getAddress() + "',"; // endereço
        linha += "'" + df.getNumberBetween(1,10) + "',"; // chave estrangeira empresa
        linha += "'" + df.getNumberBetween(1, 71) + "'"; // chave estrangeira bairro
        linha += ")";

        return linha;
    }
    
}


