package model;

public interface GeheimschriftStrategy {
    String codeer(String tekst);
    String decodeer(String tekst);
}
