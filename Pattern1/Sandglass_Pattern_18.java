public class Sandglass_Pattern_18 {
    public static void main(String[] args) {
        //reverse pyramid
        for (int i = 1; i<5; i++) {
            for(int space=1; space<i; space++){
                System.out.print(" ");
            }
            for(int j = 1; j<=5-i; j++){
                System.out.print("* ");
            }
            System.out.println();
            
        }
        //pyramid star
        for(int i = 1; i<5; i++){
            for(int space=3; space>=i; space--){ 
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
    
}


/*
 
* * * * 
 * * *
  * *
   *
   *
  * *
 * * *
* * * *
 
*/