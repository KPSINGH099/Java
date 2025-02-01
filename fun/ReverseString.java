package fun;
/*The time complexity of the current approach is indeed O(n²), 
where n is the length of the string. This is due to the fact 
that strings in Java are immutable, meaning each time you concatenate a 
character to a string using the += operator, a new string is created. 
This results in a performance overhead as the length of the string being 
built increases. */

public class ReverseString {
    public static void main(String[] args) {
        
        String st="abc";
        System.out.println("reversed version is  "+ReverseTheString(st) );
    }
    public static String ReverseTheString (String str) {
        String reversed="";

        for(int i=str.length()-1;i>=0;i--){
            reversed=reversed+str.charAt(i);
        }
     return reversed;   
    }
}
