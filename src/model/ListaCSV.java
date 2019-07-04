/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Path;

/**
 *
 * @author rodrigo
 */
public class ListaCSV {

//    private static final String NOME_ARQUIVO = "vazoes_C_46415000.csv";
    private static final String NOME_ARQUIVO = "vazoes_C_46415000_sem-cabecalho.csv";

    private static final Path DIR_ARQUIVO = Paths.get( // O objeto "Paths" constrói o objeto "Path" conforme as "partes" do diretório dadas

            System.getProperty("user.home") // a rotina System.getProperty() retorna algumas variáveis de ambiente definidas pela JVM no momento da execução. A veriável "user.home" retorna o diretório do usuário no sistema operacional
            ,
             "OO_TRAB02" // Essa "parte" indica que se trata da pasta "OO_Aula5"
            //"registro.txt");              
            ,
             NOME_ARQUIVO // Essa "parte" indica o arquivo
    );
    
    private static final int QTD_COLUNAS =      // Constante para explicitar a quantidade de colunas num registro
            31 +                                // Quantidade de colunas de vazão em si
            16;                                 // Quantidade de demais colunas antes das de vazão

    // TODO: dois construtores: 
    // * um especificando nada utilizando as constantes de diretório e nome de arquivo;
    // * um especificando apenas o nome do arquivo. No caso, ele utilizará a constante definida do diretório
//    
//    
//    
    private void lerArquivoCSVsemCabecalho(Path dir_arquivo) {

        //Caminho do arquivo
//        String csvArquivo = "C:\\Users\\Arma X\\Documents\\NetBeansProjects\\OO_Chuva\\src\\arquivo.csv";
        // Não será necessário pois fiz uma constante abstraindo o diretório
        //
        //
        //Joga conteudo do arquivo na memoria ram
        BufferedReader conteudoCSV = null;

        //Objetos para pegar a linha
        String linha = "";
        String csvSeparador = ";";

        try {

//            conteudoCSV = new BufferedReader(new FileReader(csvArquivo));
            conteudoCSV = new BufferedReader(new FileReader(dir_arquivo.toString()));

            //Enquanto houver conteudo, leia todas as linhas
            while ((linha = conteudoCSV.readLine()) != null) {

                //Monta um vetor de palavras
                String[] palavra = linha.split(csvSeparador);

//                System.out.println("[");

//                for (int i = 0; i < 32; i++) {
                for (int i = 0; i < ListaCSV.QTD_COLUNAS; i++) {

                    System.out.println("Col " + i + ": " + palavra[i]);
                }
                
                
//                System.out.println("[Data = " + palavra[0]
//                        + " Col 1: " + palavra[1]
//                        + " Col 2: " + palavra[2]
//                        + " Col 3: " + palavra[3]
//                        + " Col 4: " + palavra[4]
//                        + " Col 5: " + palavra[5]
//                        + " Col 6: " + palavra[6]
//                        + " Col 7: " + palavra[7]
//                        + " Col 8: " + palavra[8]
//                        + " Col 9: " + palavra[9]
//                        + " Col 10: " + palavra[10]
//                        + " Col 11: " + palavra[11]
//                        + " Col 12: " + palavra[12]
//                        + " Col 13: " + palavra[13]
//                        + " Col 14: " + palavra[14]
//                        + " Col 15: " + palavra[15]
//                        + " Col 16: " + palavra[16]
//                        + " Col 17: " + palavra[17]
//                        + " Col 18: " + palavra[18]
//                        + " Col 19: " + palavra[19]
//                        + " Col 20: " + palavra[20]
//                        + " Col 21: " + palavra[21]
//                        + " Col 22: " + palavra[22]
//                        + " Col 23: " + palavra[23]
//                        + " Col 24: " + palavra[24]
//                        + " Col 25: " + palavra[25]
//                        + " Col 26: " + palavra[26]
//                        + " Col 27: " + palavra[27]
//                        + " Col 28: " + palavra[28]
//                        + " Col 29: " + palavra[29]
//                        + " Col 30: " + palavra[30]
//                        + " Col 31: " + palavra[31]
//                        + " Col 32: " + palavra[32]
//                        + " Col 33: " + palavra[33] + "]");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: \n" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice não encontrado: \n" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro de leitura: \n" + e.getMessage());
        } finally {
            if (conteudoCSV != null) {
                try {
                    conteudoCSV.close();
                } catch (IOException e) {
                    System.out.println("Erro ao fechar o arquivo: \n" + e.getMessage());
                }
            }
        }
    }
}
