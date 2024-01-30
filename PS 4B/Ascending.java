
public class Ascending{
    
    public static boolean isAscendingNumber(int n){
        String numStr=Integer.toString(n);
        for(int i=0;i<numStr.length()-1;i++){
            if(numStr.charAt(i)>=numStr.charAt(i+1)){
                return false;
            }
        }
        return true;
    }

    
    public static int countStrictlyAscending(int low,int high){
        int count=0;
        for(int i=low;i<=high; i++){
            if(isAscendingNumber(i)){
               count++;
               System.out.println(i);
            }
        }
        return count;
    }
    
    public static void main(String[] args){
       countStrictlyAscending(100, 300);
    }
}

