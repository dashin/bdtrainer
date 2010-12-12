package hello;

import java.io.InputStream;
import java.util.Vector;

public class ResourceDictionaryLoader implements DictionaryLoader {
    private final static String DELIMITER = "#";

    public Dictionary loadDictionary(Object id) {

        final InputStream is = getClass().getResourceAsStream("/" + (String) id);

        String rawDictionary = "Nothing#[none]#nothing";
        
        try {
            byte[] dict = new byte[is.available()];        
            is.read(dict);
            rawDictionary = new String(dict, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Vector dictionaryFile = new Vector();

        String line;
        int endOfLine = 0;
        while ((endOfLine = rawDictionary.indexOf("\n")) != -1) {
            line = rawDictionary.substring(0, endOfLine);
            rawDictionary = rawDictionary.substring(endOfLine + 1);
            
            DictionaryEntry dictionaryEntry = new DictionaryEntry();
            
            String word = line.substring(0, line.indexOf(DELIMITER));
            line = line.substring(line.indexOf(DELIMITER) + 1);
            dictionaryEntry.setWord(word);
            
            if (line.indexOf(DELIMITER) != 0) {
                String transcrib = line.substring(0, line.indexOf(DELIMITER));
                // set transcribtion
                line = line.substring(line.indexOf(DELIMITER) + 1);
            } else {
                // set stub transcribtion
                line = line.substring(1);
            }
            
            dictionaryEntry.setTranslation(line);
            dictionaryFile.addElement(dictionaryEntry);
        }
        
        return new Dictionary(dictionaryFile);
    }
}