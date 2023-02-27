package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String file;
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(this.file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.dictionary.put(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public boolean save() {
        try (PrintWriter fileWriter = new PrintWriter(this.file)) {
            for (String key : this.dictionary.keySet()) {
                fileWriter.println(key + ":" + this.dictionary.get(key));
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public void add(String words, String translation) {
        if (!this.dictionary.containsKey(words)) {
            HashMap<String, String> temp = new HashMap<>();
            temp.put(words, translation);
            this.dictionary.putAll(temp);
        }
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        } else if (this.dictionary.containsValue(word)) {
            for (String key : this.dictionary.keySet()) {
                if (this.dictionary.get(key).equals(word)) {
                    return key;
                }
            }
        }
        return null;
    }

    public void delete(String word) {
        this.dictionary.remove(word);
        this.dictionary.remove(translate(word));
    }
}
