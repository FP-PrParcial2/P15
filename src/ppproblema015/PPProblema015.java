/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppproblema015;
import java.util.Random;
/**
 *
 * @author karen
 */
public class PPProblema015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int x[][];
       x=new int [10][10];
       Random random;
       random= new Random();
       
        for(int i=0; i< x.length; i++){
            for(int j=0; j< x.length; j++)
                x[i][j]=random.nextInt(); 
            int j=1;
             
            System.out.println(x[i][j] + "");  
        }
        
    }
}
        
        
    
  
       




