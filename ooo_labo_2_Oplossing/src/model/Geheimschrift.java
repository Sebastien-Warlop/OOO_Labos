package model;

public class Geheimschrift {
    private String tekst;
    private GeheimschriftStrategy geheimschriftStrategy;

    public Geheimschrift(String tekst, GeheimschriftStrategy geheimschriftStrategy) {
        setTekst(tekst);
        setGeheimschriftStrategy(geheimschriftStrategy);
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public void setGeheimschriftStrategy(GeheimschriftStrategy geheimschriftStrategy) {
        this.geheimschriftStrategy = geheimschriftStrategy;
    }

    public void codeer() {
        this.tekst = geheimschriftStrategy.codeer(tekst);
    }

    public void decodeer() {
        this.tekst = geheimschriftStrategy.decodeer(tekst);
    }
}

