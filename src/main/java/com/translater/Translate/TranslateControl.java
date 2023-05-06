package com.translater.Translate;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author mauricio.rodrigues
 */
public class TranslateControl {
    
    private Parser parse;
    
    public void processaTraducao(String filePath, String fileTargetName, String sourceLanguage, String targetLanguage) throws IOException{
        parse = new Parser();
        
        //Extrai dados de conexão com a API
        String apiKey = parse.getKey();

        //Carrega dados do .properties inicial
        List atributos = parse.getAtributos(filePath);
        
        //Faz as traduções e atualiza lista de atributos
        try {
            GoogleTranslate translator = new GoogleTranslate(apiKey);
            String text, translatedText;
            Properties atributo;
            for (int i = 0; i < atributos.size(); i++) {
                atributo = (Properties) atributos.get(i);
                text = atributo.getValue();
                translatedText = translator.translateText(text, sourceLanguage, targetLanguage);
                atributo.setValue(translatedText);
                atributos.set(i, atributo);
            }
            System.out.println(atributos.toString());
        } catch (Exception e) {
            System.err.println("Erro ao traduzir o texto: " + e.getMessage());
        }
        
        //Cria novo .properties com bases nos novos atributos
        parse.saveAtributos(fileTargetName, atributos);
    }
    
}
