
package shaa;
import java.util.Scanner;

public class Programs extends School{
    
    public Programs(String name) {
        super(name);
    }
    void programName(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(name + "\nBachelor of Science in Information Technology");
        System.out.println(name + "TEP");
        System.out.println(name + "BSBA");
    }    
}
