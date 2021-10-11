package model;

public class SpiegelingGeheimschriftStrategy implements GeheimschriftStrategy {
    @Override
    public String codeer(String tekst) {
        String result = "";

        for(char character : tekst.toCharArray()) {
            result = character + result;
        }

        return result;
    }

    @Override
    public String decodeer(String tekst) {
        String result = "";

        for(char character : tekst.toCharArray()) {
            result = character + result;
        }

        return result;
    }
}
