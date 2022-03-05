package tugas_2;

/**
 *
 * @author Aziz Fatih Fauzi
 */
public class Tabung extends Bulat implements MenghitungRuang{

    private double tinggi;

    public Tabung(double tinggi, double jari) {
        super(jari);
        this.tinggi = tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double luasPermukaan() {
        return 2*3.14*getJari()*(getJari()+tinggi);
    }
    
    // overload
    public double luasPermukaan(double tinggi, double jari) {
        return 2*3.14*jari*(jari+tinggi);
    }
    
    @Override
    public double volume() {
        return 3.14*getJari()*getJari()*tinggi;
    }
    
}
