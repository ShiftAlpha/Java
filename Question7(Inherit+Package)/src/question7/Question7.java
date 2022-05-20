
package question7;


public class Question7 {

    
    public static void main(String[] args) {
        
        Package pack1 = new Package(8, 'a');
        Package pack2 = new Package(14, 't');
        
        InsuredPackage Insuredpack1 = new InsuredPackage(6, 't');
        
        
        
        System.out.println(pack1.display());
        System.out.println(pack2.display());
           
        System.out.println(Insuredpack1.display());
        
        
        
    }
    
}
