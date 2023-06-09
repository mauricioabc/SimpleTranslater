package com.translater.Translate;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author mauricio.rodrigues
 */
public class Main {

    public static void main(String[] args) throws IOException {
        
        String targetFile = "es_US";  // Locale do arquivo
        String sourceLanguage = "pt"; // Idioma de origem (inglês)
        String targetLanguage = "us"; // Idioma de destino (português)

        Parser parse = new Parser();
        
        //Verifica estrutura de pastas
        parse.verificaPastas();
        
        //Extrai dados de conexão com a API
        String apiKey = parse.getKey();
        System.out.println(apiKey);

        //Carrega dados do .properties inicial
        List atributos = parse.getAtributos(".\\input\\MessagesBundle_pt_BR.properties");
        
        //Faz as traduções e atualiza lista de atributos
        try {
            GoogleTranslate translator = new GoogleTranslate(apiKey);
            String text, translatedText;
            Properties atributo;
            for (int i = 0; i < atributos.size(); i++) {
                atributo = (Properties) atributos.get(i);
                text = atributo.getValue();
                //translatedText = "teste";
                translatedText = translator.translateText(text, sourceLanguage, targetLanguage);
                atributo.setValue(translatedText);
                atributos.set(i, atributo);
            }
            System.out.println(atributos.toString());
        } catch (Exception e) {
            System.err.println("Erro ao traduzir o texto: " + e.getMessage());
        }
        
        //Cria novo .properties com bases nos novos atributos
        parse.saveAtributos(targetFile, atributos);
        
    }
}

