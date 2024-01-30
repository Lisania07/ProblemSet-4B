
public class Translator{

    public void parseSentence(String str){
        while(!str.isEmpty()){
           int spaceIdx=str.indexOf(" ");
            if(spaceIdx<0){
                System.out.print(convertToPL(str));
                System.out.println();
                str="";
            }else{
                String word = str.substring(0, spaceIdx);
                System.out.print(convertToPL(word)+" ");
                str=str.substring(spaceIdx+1);
            }
        }
    }

    public String convertToPL(String str){
        if(str.length()<2){
           return str; 
        }
        String first=str.substring(0,1);
        String rest=str.substring(1);
        return rest+first+"ay";
    }
    
    
    public static void main(String[] args){
        Translator myTranslator=new Translator();
        myTranslator.parseSentence("Bili Bob is a idk!");
        System.out.println();
    }
}
