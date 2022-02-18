
package game_of_life;


public class simulation {
  
  public static int live_cells(boolean [][] cell_board, int n, int tp) {
    
    for(int z=1; z < tp; tp++) {
    
      boolean[][] next_state = new boolean[n][n];  //pinakas pou apothikeuei thn epomenh katastasi

      boolean[][] neigb_arr = new boolean[n+2][n+2]; 
      neigb_arr = extend(cell_board);               //ektetamenos pinakas 

      for(int i=1; i<=n; i++) {
        for(int j=1; j<=n; j++) {                  //diatrexw ta stoixeia tou ektetamenou         
          
          public int s;
          
          for(int k=i-1; k<=i+1; k++) {            //elegxw tous geitones 
            for(int l=j-1; l<=j+1; l++) {
              if(neigb_arr[k][l]==true) {
              neighbors_alive +=1;
              }
            }
          }
          
  
          if (neigb_arr[i][j]== true) {
            if((s==3)||(s==4)) {       
              next_state[i-1][j-1] = true;
            }
            else {
              next_state[i-1][j-1] = false;
            }
          }
          else {
            if(s==3) {
              next_state[i-1][j-1] = true;
            }
            else {
              next_state[i][j] = false;        //exw ftiaksei ton pinaka thw epomenhs katastasis 
            }
          }
        }
      }
    }

    public int living_cells=0;                         
    for(int i=0; i<n; i++) {             //diatrexw ta stoixeia tou pinaka epomenhs katastashs
      for(int j=0; j<n; j++) {
        if (next_state[j][j]==true) {
          living_cells +=1;
        }
      }
    }
    return living_cells;                  //upologismos twn zwntanwn meta apo tp epanalipseis
  }
    

  public static boolean[][] extend(boolean[][] b) {
    boolean [][] arr = new boolean [n+2][n+2];
    for(int i=0; i<n; i++) {
      for(j=0; j<n; j++) {
        arr[i+1][j+1] = b[i][j];
      }
    }                      //antigrafw ta kentrika stoixeia 
    arr[n][0] = arr[n][n];
    arr[0][0] = arr[n][n];
    arr[0][n] = arr[n][n]; //antigrafw to katw-dexia

    arr[n][n+1] = arr[n][1];
    arr[0][1] = arr[n][1];
    arr[0][n+1] = arr[n][1]; //antigrafw to katw-aristera

    arr[1][0] = arr[1][n];
    arr[n+1][n] = arr[1][n];
    arr[n+1][0] = arr[1][n]; //antigrafw to panw-dexia

    arr[1][n+1] = arr[1][1];
    arr[n+1][1] = arr[1][1];
    arr[n+1][n+1] = arr[1][1]; //antigrafw to panw-aristera

    for(int i=2; i<=n-1; i++) {
      arr[n+1][i] = arr[1][i];
    }                          //antigrafw ta stoixeia ths panw grammis

    for(int i=2; i<=n-1; i++) {
      arr[0][i] = arr[n][i];
    }                         //antigrafw ta stoixeia ths katw grammis

    for(int i=2; i<=n-1; i++) {
      arr[i][n+1] = arr[i][1];
    }                         //antigrafw ta stoixeia ths aristera stilis

    for(int i=2; i<=n-1; i++) {
      arr[i][0] = arr[i][n];
    }                         //antigrafw ta stoixeia ths dexia stilis
    return arr;

  }
}

