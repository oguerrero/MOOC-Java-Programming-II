import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DictionaryOfManyTranslations {
    private final Map<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<String, ArrayList<String>>();
    }

    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, new ArrayList<String>());
        this.dictionary.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        return this.dictionary.getOrDefault(word, new ArrayList<String>());
    }

    public void remove(String word) {
        this.dictionary.remove(word);
    }
}
