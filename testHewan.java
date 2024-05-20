
package polymorphisme;


public class testHewan {


    public static void main(String[] args) {
        Hewan meow = new kucing("bagas");
        Hewan hug = new anjing("bagus");
        
        
        System.out.println("Demonstrasi Polymorphisme");
        meow.bunyi();
        hug.bunyi();
        
        Hewan[] daftarHewan = new Hewan[2];
        daftarHewan[0] = new kucing(" kucing garong");
        daftarHewan[1] = new anjing(" anjing liar");
        
        System.out.println("\npolymorphisme dalam array : \n");
        for (Hewan daftar : daftarHewan){
            daftar.bunyi();
        }
    }
    
}
