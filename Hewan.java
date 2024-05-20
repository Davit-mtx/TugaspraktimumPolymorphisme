
package polymorphisme;


public class Hewan {
    private String nama;
    
    public Hewan(String nama){
        this.nama = nama;
    }
    
    public String getnama(){
        return nama;
    }
    
    public void setnama(String nama){
        this.nama = nama;
    }
    
    public void bunyi(){
        System.out.println("Hewan ini berbunyi : ");
    }
}
