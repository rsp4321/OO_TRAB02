/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.nio.file.Paths;
import java.nio.file.Path;

/**
 *
 * @author rodrigo
 */
public class ListaCSV {

    private static final String NOME_ARQUIVO = "vazoes_C_46415000.csv";

    private static final Path DIR_ARQUIVO = Paths.get( // O objeto "Paths" constrói o objeto "Path" conforme as "partes" do diretório dadas

            System.getProperty("user.home") // a rotina System.getProperty() retorna algumas variáveis de ambiente definidas pela JVM no momento da execução. A veriável "user.home" retorna o diretório do usuário no sistema operacional
            ,
             "OO_TRAB02" // Essa "parte" indica que se trata da pasta "OO_Aula5"
            //"registro.txt");              
            ,
             NOME_ARQUIVO // Essa "parte" indica o arquivo
    );
    
    
    // TODO: dois construtores: 
    // * um especificando nada utilizando as constantes de diretório e nome de arquivo;
    // * um especificando apenas o nome do arquivo. No caso, ele utilizará a constante definida do diretório
    
    

}
