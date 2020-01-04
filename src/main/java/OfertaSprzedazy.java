import java.util.Comparator;

public class OfertaSprzedazy {

private String nazwaProduktu;
private Double cena;


    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public OfertaSprzedazy(String nazwaProduktu,Double cena)
    {
        this.nazwaProduktu = nazwaProduktu;
        this.cena = cena;
    }



}
