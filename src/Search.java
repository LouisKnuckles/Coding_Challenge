/**Search Class
 * Reduces input dictionary and reruns a new subDictionary that can be used to
 * narrow down searching for full word matches
 * Also used to find a 100% match with a word.
 *
 * Created by louie on 18/03/2017.
 */
import java.util.ArrayList;

public class Search {

    private String[] dictionary;

    public Search(String[] dictionary) {
        this.dictionary = dictionary;
    }

    /* checks string for complete match with a word */
    public Boolean forWord(String word) {
        word = word.toUpperCase();
        for (int i = 0; i < dictionary.length; i++) {
            if (word.equals(dictionary[i])) {
                return true;
            }
        }
        return false;
    }

    /**Returns a subset of words that have a matching char in the given position of the string */
    public String[] getWordsThatMatch(char input, int position) {
        ArrayList<String> matchedWords = new ArrayList<>();
        input = Character.toUpperCase(input);

        for (int i = 0; i < dictionary.length; i++) {
            try {
                if (dictionary[i].charAt(position) == input) {
                    matchedWords.add(dictionary[i]);
                }
            } catch (Exception e) {
                /*System.err.println(e.getMessage());*/
            }
        }
        if (matchedWords.size() < 1) {
            return null;
        } else {
            return matchedWords.toArray(new String[matchedWords.size()]);
        }
    }
}
