
// PYRAMID PATTERN
//PROGRAM:
class java{
    public static void main(String args[]) {
        int n = 6;
        for(int i=1;i<=n;++i){
            //System.out.println("*");
            for(int j =i; j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

//OUTPUT:
/*

     *
    ***
   *****
  *******
 *********
***********

   */
