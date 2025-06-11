
package latihan3;

public class RumusBeraksi {
   
    public static void main(String[] args) {
        
        Rumus fah = new Rumus();

        
        fah.sisi = 6;
        fah.panjang = 10;
        fah.lebar = 4;

        
        fah.hitungluaspersegi();
        System.out.println("Luas Persegi = " + fah.getHasil());

        
        fah.hitungluaspersegipanjang();
        System.out.println("Luas Persegi Panjang = " + fah.getHasil());
    }
}
