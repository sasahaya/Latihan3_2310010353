
package latihan3;

// nama : syarifah
//npm : 2310010353
//kelas : 4D BJB

public class Rumus {
    int sisi;
    int panjang;
    int lebar;
    int hasil;
    
    public Rumus() {
        sisi = 0;
        panjang = 0;
        lebar = 0;
        hasil = 0;
    }
    
    public void hitungluaspersegi(){
        hasil = sisi * sisi;
    }
    
    public void hitungluaspersegipanjang(){
        hasil = panjang * lebar;
    }
    
    public int getHasil() {
        return hasil;
    }
}
