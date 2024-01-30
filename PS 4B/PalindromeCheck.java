public class PalindromeCheck{

    public static boolean palindrome(String str){
        str=str.toLowerCase();
        String str2 = "";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetter(ch)){
             str2+=ch;   
            }
        }
       
        for(int i=0;i<str2.length();i++){
            char front=str2.charAt(i);
            char back=str2.charAt(str2.length()-1-i);
            if(front!=back){
              return false;  
            }
        }
        
        return true;
    }

    public static void main(String[] args){
        String a="A man, a plan, a canal: Panama.";
        System.out.println(palindrome(a));
    }
}