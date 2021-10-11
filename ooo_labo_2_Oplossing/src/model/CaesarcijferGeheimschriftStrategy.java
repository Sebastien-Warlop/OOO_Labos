package model;

public class CaesarcijferGeheimschriftStrategy implements GeheimschriftStrategy {
    @Override
    public String codeer(String tekst) {
        String result = "";
        for (char character : tekst.toLowerCase().toCharArray()) {
            if (character != ' ') {
                if (Character.isLetter(character)) {
                    int originalAlphabetPosition = character - 'a';
                    int newAlphabetPosition = (originalAlphabetPosition + 23) % 26;
                    char newCharacter = (char) ('a' + newAlphabetPosition);
                    result = result + newCharacter;
                }
            } else {
                    result += character;
            }
        }
        return result;
    }

    @Override
    public String decodeer(String tekst) {
        String result = "";
        for (char character : tekst.toLowerCase().toCharArray()) {
            if (character != ' ') {
                if(Character.isLetter(character)) {
                    int originalAlphabetPosition = character - 'a';
                    int newAlphabetPosition = (originalAlphabetPosition + 26 - 23 % 26) % 26;
                    char newCharacter = (char) ('a' + newAlphabetPosition);
                    result = result + newCharacter;
                }
            } else {
                result += character;
            }
        }
        return result;
    }
}
