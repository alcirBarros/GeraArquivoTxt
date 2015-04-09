package br.com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GerarArquivo {

    public static void main(String[] args) {
        try {
            File file = new CriarArquivo().criarArquivoBpa("arquivo.txt");
            FileWriter fileWriter = new FileWriter(file, false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("teste2");
            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
