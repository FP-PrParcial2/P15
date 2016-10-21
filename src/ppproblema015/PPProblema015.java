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
      int rows = 11;
        int cols = 11;
        int[][] arr = new int[rows][cols];
        Random r = new Random();
        for(int i = 0; i < rows - 1; i++){
            int row = 0;
            int col = 0;
            for(int j = 0; j < cols - 1; j++){
                arr[i][j] = r.nextInt(10);
                arr[j][i] = r.nextInt(10);
                row += arr[i][j];
                col += arr[j][i];
            }
            arr[i][cols - 1] = row;
            arr[cols - 1][i] = col;
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        
        
        
    }
    
} 
        
    
  
       




