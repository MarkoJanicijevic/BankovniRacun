package DomaciPonedeljak;

public class BankovniRacun {
    private int jedinstveni_broj;
    private String ime_vlasnika;
    private double trenutno_stanje;

    public BankovniRacun (int jedinstveni_broj, String ime_vlasnika, double trenutno_stanje) {
        this.jedinstveni_broj = jedinstveni_broj;
        this.ime_vlasnika = ime_vlasnika;
        this.trenutno_stanje = trenutno_stanje;
    }

    public double getTrenutno_stanje() {
        return trenutno_stanje;
    }

    public int getJedinstveni_broj() {
        return jedinstveni_broj;
    }

    public String getIme_vlasnika() {
        return ime_vlasnika;
    }

    public void setIme_vlasnika(String ime_vlasnika) {
        this.ime_vlasnika = ime_vlasnika;
    }

    public void setJedinstveni_broj(int jedinstveni_broj) {
        this.jedinstveni_broj = jedinstveni_broj;
    }

    public void setTrenutno_stanje(double trenutno_stanje) {
        this.trenutno_stanje = trenutno_stanje;
    }

    public void Uplata (int x) {

        if(x < 0) {
            System.out.println("Uplata mora biti pozitivan broj.");
        } else {
            setTrenutno_stanje(getTrenutno_stanje() + x);
            System.out.println("Uplata je uspesna. Trenutno stanje je: " + getTrenutno_stanje());
        }
    }
    public void Isplata (int x) {

        if(x > getTrenutno_stanje()) {
            System.out.println("Nemate dovoljno novca na racunu. Trenutno stanje je: " + getTrenutno_stanje());
        } else {
            setTrenutno_stanje(getTrenutno_stanje() - x);
            System.out.println("Isplata je uspesna. Trenutno stanje je: " + getTrenutno_stanje());
        }

    }

    public String toString () {
        return "Broj racuna: " + getJedinstveni_broj() + ", Ime vlasnika racuna: " + getIme_vlasnika() + ", Trenutno stanje je: " + getTrenutno_stanje();
    }
}
