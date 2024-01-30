
public class TimesTables{
    
     public static void timesTable(int n){
        int mostDigit=getMostDigit(n*n);
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                printleadingSpace(mostDigit,i*j);
                System.out.print(i*j);
            }
            System.out.println();
        }
    }

    public static int getMostDigit(int n){
        return Integer.toString(n).length();
    }

    public static void printleadingSpace(int mostDigit,int n){
        String current=Integer.toString(n);
        int leadingSpace=mostDigit-current.length();
        
        for(int i=0;i<leadingSpace;i++){
            System.out.print("  ");
        }
    }
    
    public static void main(String[] args){
        timesTable(7);
    }
}
