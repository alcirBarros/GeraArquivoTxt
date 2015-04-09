package br.com;

import java.io.File;

public class CriarArquivo {

    private String DIRETORIO_TEMP = "//tmp//";

    public File criarArquivoBpa(String xPath) throws RuntimeException {
        File bpaBaseDir = new File(DIRETORIO_TEMP);
        if (!bpaBaseDir.exists()) {
            boolean mkdir = bpaBaseDir.mkdir();
            if (!mkdir) {
                throw new RuntimeException("Impossível criar o diretório base.");
            }
        }
        File file = new File(DIRETORIO_TEMP, xPath);
        return file;
    }
}