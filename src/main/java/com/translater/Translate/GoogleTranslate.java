package com.translater.Translate;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;
import com.google.cloud.translate.TranslateException;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author mauricio.rodrigues
 */

public class GoogleTranslate {
    private Translate translate;

    public GoogleTranslate(String apiKey) {
        TranslateOptions translateOptions = TranslateOptions.newBuilder()
            .setApiKey(apiKey)
            .build();
        this.translate = translateOptions.getService();
    }

    public String translateText(String text, String sourceLanguage, String targetLanguage) throws TranslateException {
        try {
            Translation translation = translate.translate(text, Translate.TranslateOption.sourceLanguage(sourceLanguage), Translate.TranslateOption.targetLanguage(targetLanguage));
            return translation.getTranslatedText();
        } catch (TranslateException e) {
            return null;
        }
    }
    
}

