package tugas_2;

/**
 *
 * @author Aziz Fatih Fauzi
 */
public class Kotak {
    private double panjang, lebar;

    public Kotak(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }
    
}
