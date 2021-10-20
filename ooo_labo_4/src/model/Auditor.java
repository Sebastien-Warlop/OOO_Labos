package model;

public class Auditor implements Observer{//auditor is een observer ("implements observer")
    private Subject bank;
    private String naam;//naam van de auditor zelf?

    public Auditor(String naam, Subject bank){
        this.setNaam(naam);
        this.bank = bank;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public void update() {

    }
}
