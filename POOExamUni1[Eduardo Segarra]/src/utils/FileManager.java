package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.POOExamUnit1.model.Picture;

/**
 *
 * @author G406
 */
public class FileManager {
    
    public static void save(Picture newPicture, String fileName) {
        fileName = fileName + ".json";
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<Picture> pictures = new ArrayList<>();

        // Leer el archivo JSON existente
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            Type listType = new TypeToken<ArrayList<Picture>>() {
            }.getType();
            pictures = gson.fromJson(bufferedReader, listType);
        } catch (FileNotFoundException e) {
            System.out.println("File not found, creating a new one.");
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        // Agregar el nuevo objeto a la lista
        pictures.add(newPicture);

        // Guardar la lista actualizada de nuevo en el archivo JSON
        try (FileWriter fileWriter = new FileWriter(fileName); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            gson.toJson(pictures, bufferedWriter);
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
    
    
}
