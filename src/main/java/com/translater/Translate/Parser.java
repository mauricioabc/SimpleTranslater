package com.translater.Translate;

import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mauricio.rodrigues
 */
public class Parser {
    
    public String getKey() throws IOException {
        try {
            String filename = ".\\config\\apiConfig.json";
            Gson gson = new Gson();
            JsonObject data;
            try (FileReader reader = new FileReader(filename)) {
                data = gson.fromJson(reader, JsonObject.class);
            }
            return data.get("ApiKey").getAsString();
        } catch (Exception e) {
            System.out.println("Erro na busca do arquivo de config.");
            e.printStackTrace();
            return null;
        }
    }
    
    public List<Properties> getAtributos(String filename){
        Properties atributo;
        List <Properties> listaAtributos = new ArrayList();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty() && !line.startsWith("#")) {
                    String[] keyValue = line.split("=", 2);
                    atributo = new Properties(keyValue[0], keyValue[1]);
                    listaAtributos.add(atributo);
                }
            }
        return listaAtributos;
        } catch (IOException e) {
            System.out.println("Erro na leitura dos atributos.");
            e.printStackTrace();
            return null;
        }
    }
    
    public void saveAtributos(String targeLanguage,List<Properties> atributos){
        String filename = ".\\output\\MessagesBundle_" + targeLanguage + ".properties";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Properties atributo : atributos) {
                writer.write(atributo.getKey() + "=" + atributo.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro na gravação dos atributos.");
            e.printStackTrace();
        }
    }
    
    public void verificaPastas(){
        String[] folders = {"output", "input", "config"};
        for (String folder : folders) {
            File directory = new File("./" + folder);
            if (!directory.exists()) {
                directory.mkdirs();
                System.out.println("Created directory: " + directory.getAbsolutePath());
            }
        }
    }
    
}
    
