
package game_of_life;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author mike
 */
public class Game_of_Life {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       
         
       File infile = new File("C:/Temp/ask1_2017.txt");
        Scanner scnr = new Scanner(infile);

       int size = scnr.nextInt(); int i; int j; int k;
       int cells = scnr.nextInt();
       int rp=scnr.nextInt();
       boolean board[][] =new boolean[size][size];
        
        for ( i=0; i<size; i++)
            for (j=0; j<size; j++) 
                board[i][j]= false;
        
        for ( i=0; i<cells; i++)
         board[scnr.nextInt()][scnr.nextInt()]=true;
        
        k=simulation.live_cells(board, size, rp);
        
        System.out.println("original=" + cells + "   after " + rp + "time periods  " + k );
        
    }
    
}
