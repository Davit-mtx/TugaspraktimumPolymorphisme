
package polymorphisme;


public class kucing extends Hewan{
    
    public kucing (String nama){
        super(nama);
    }
    
    @Override
    public void bunyi(){
        System.out.println("Kucing " +getnama()+ " meow ");
    }
}
