package br.com.phdss.modelo.sped;

import java.io.FileWriter;

public interface Bloco {

    public void gerar(FileWriter fw) throws Exception;
}
