package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Arquivo {

    // variables
    private String path;

    // constructor
    public Arquivo (String path){
        this.path = path;
    }

    // methods
    public void readFile(){

        try(BufferedReader reader = new BufferedReader(new FileReader(path))){

            String line;

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Could not locale file");
            throw new RuntimeException(e);
        }

    }

    public void fileExists(String file) {
        
        System.out.println("Diretório de busca atual: " + System.getProperty("user.dir"));
        
        File arq = new File("src/util/dados.txt");
    
        if(arq.exists()){
            System.out.println("Arquivo existe: " + arq.getAbsolutePath());
        }else{
            System.out.println("Arquivo não encontrado, verifique se o diretório buscado está correto.");
        }
    }

    public void writeFile(){

    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    // teste
    public static void main(String[] args) {

        Arquivo arq = new Arquivo("src/util/dados.txt");

        arq.readFile();
    }
}