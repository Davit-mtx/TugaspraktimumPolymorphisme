
package polymorphisme;


public class anjing extends Hewan{
    public anjing (String nama){
        super(nama);
    }
    
    public void bunyi(){
        System.out.println("Anjing " +getnama()+ " hug hug ");
    }
    
}
