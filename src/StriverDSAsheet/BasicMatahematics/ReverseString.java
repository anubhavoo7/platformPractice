package StriverDSAsheet.BasicMatahematics;

public class ReverseString {
    public static void main(String[] args){
        String s="Anubhav";
        String nStr="";
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            nStr=ch+nStr;
        }
        System.out.println(nStr);
    }
}
