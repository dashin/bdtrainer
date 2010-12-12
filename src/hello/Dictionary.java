package hello;

import java.util.Vector;

public class Dictionary {
    private Vector dictionary;

    public Dictionary(Vector dictionary) {
        this.dictionary = dictionary;
    }

    public DictionaryEntry get(int i) {
        return (DictionaryEntry) dictionary.elementAt(i);
    }

    public int length() {
        return dictionary.size();
    }
}