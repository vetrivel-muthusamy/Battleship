import java.io.IOException;

class Converter {
    public static char[] convert(String[] words) throws IOException {
        // implement the method
        StringBuilder builder = new StringBuilder();
        for(String word: words) {
            builder.append(word);
        }
        return builder.toString().toCharArray();

    }
}