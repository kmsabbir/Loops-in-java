package New.folder;

public class StarPattern8 {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
                if(i>=2 && j>=2 && i<6 && j<6){
                    System.out.print(" ");
                }else{
                
                System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
}
