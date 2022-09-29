import java.net.SocketImpl;
import java.util.*;

import javax.sound.midi.SysexMessage;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x%2==0){
            System.out.println("Number is Even");
        } else{
            System.out.println("Number is odd");
        }
    }
    
}
