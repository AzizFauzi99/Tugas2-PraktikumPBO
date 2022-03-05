package tugas_2;

/**
 *
 * @author Aziz Fatih Fauzi
 */
public class Balok extends Kotak implements MenghitungRuang{

    private double tinggi;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }  
    
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double luasPermukaan() {
        return 2*(getPanjang()*getLebar() + getPanjang()*tinggi + getLebar()*tinggi);
    }
    
    // overload
    public double luasPermukaan(double panjang, double lebar, double tinggi) {
        return 2*(panjang*lebar + panjang*tinggi + lebar*tinggi);
    }

    @Override
    public double volume() {
        return getPanjang()*getLebar()*tinggi;
    }
    
}
