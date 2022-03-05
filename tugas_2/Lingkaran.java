package tugas_2;

/**
 *
 * @author Aziz Fatih Fauzi
 */
public class Lingkaran extends Bulat implements MenghitungBidang {
  
    public Lingkaran(double jari) {
        super(jari);
    }

    @Override
    public double luas() {
        return 3.14*getJari()*getJari();
    }
    
    // overload
    public double luas(double jari) {
        return 3.14*jari*jari;
    }
    
    @Override
    public double keliling() {
        return 2*3.14*getJari();
    }
    
}
