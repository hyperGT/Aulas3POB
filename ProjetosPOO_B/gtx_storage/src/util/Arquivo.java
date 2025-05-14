package util;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class Arquivo {

    public void existe(String filePath) {
        
        System.out.println("Diretório de busca atual: " + System.getProperty("user.dir"));
        
        File arq = new File("src/util/dados.txt");
    
        if(arq.exists()){
            System.out.println("Arquivo existe: " + arq.getAbsolutePath());
        }else{
            System.out.println("Arquivo não encontrado, verifique se o diretório buscado está correto.");
        }
    }    

    public static void main(String[] args) {

    }
}