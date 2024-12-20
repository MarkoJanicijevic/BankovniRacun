package DomaciPonedeljak;

public class main {
    public static void main(String[] args) {
        BankovniRacun b = new BankovniRacun(12345, "Marko Janicijevic", 10000);
        b.Uplata(10000);
        b.Uplata(-10000);
        b.Isplata(1000);
        b.Isplata(20000);
        System.out.println(b);
    }
}
