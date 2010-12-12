package hello;

public class DictionaryEntry {
    private String word;
    private String translation;

    public DictionaryEntry() {
    }

    public DictionaryEntry(String word, String translation) {
        this.word = word;
        this.translation = translation;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getWordOrTranslation(boolean word) {
        return word ? this.word : translation;
    }
}