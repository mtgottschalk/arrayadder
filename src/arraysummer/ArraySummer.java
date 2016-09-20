/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysummer;
import java.util.*;

/**
 *
 * @author mtgottschalk
 */
public class ArraySummer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userin = new Scanner(System.in);
        System.out.println("Enter the length of the array you want sum: ");
        int len;
        len = userin.nextInt();
        int[] stuff; 
        stuff = new int[len];
        System.out.println("Enter the integers you wish to sum: ");
        int i = 0;
        for(i = 0; i<len; i++){
             stuff[i] = userin.nextInt();
        }
        int j =0;
        int sum = 0;
        for(j = 0; j<len;j++){
            sum += stuff[j];
            
        }
        System.out.println("The sum of this array is: " + sum);
    }
    
}
