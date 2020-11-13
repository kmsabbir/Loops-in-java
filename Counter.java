
package New.folder;

/**
 *
 * @author WIN
 */
public class Counter {
     public static void main(String[] args) {
       int counter =0;
         for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
                counter=counter+1;
                System.out.print(counter+" ");
                }
            System.out.println();
            }
           // System.out.println();
     }
}
