package tugas_2;

/**
 *
 * @author Aziz Fatih Fauzi
 */
public class PersegiPanjang extends Kotak implements MenghitungBidang{
    
    public PersegiPanjang(double panjang, double lebar) {
        super(panjang, lebar);
    }

    @Override
    public double luas() {
        return getPanjang()*getLebar();
    }
    
    // overload 
    public double luas(double panjang, double lebar){
        return panjang*lebar;
    }

    @Override
    public double keliling() {
        return 2*(getPanjang()+getLebar());
    }
    
}
