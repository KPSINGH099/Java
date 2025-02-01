import java.util.Scanner;

public class cScannerMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter first number: ");
        int number = scanner.nextInt();
        //print will prin in same line 
        System.out.print("Enter first number: ");
        System.out.print("Enter first number: ");
        //println prints in next line
        System.out.println("Enter first number: ");
        System.out.println(number);
       //not correct syntax in java

        //System.out.print("Enter first number: +number", number);

        //we need to concate in java
        System.out.println("Enter first number: +number" + number);
      
// to read double

 System.out.println("Enter double");
        double num = scanner.nextDouble();
//float and double differs in terms of precision and memory 
//float has lower precsion and memory presiciosn in terms how many decimal places u can use

//to read string
String word = scanner.next();
System.out.print("Enter " + word);
        System.out.println("Enter " + num);

    //nextLine(): Reads an entire line of text (including spaces) until a newline is encountered.


String line = scanner.nextLine();
System.out.println("Enter " + line);

///hasNext(): Checks if there is another token in the input.
/// //skip(String pattern): Skips the next input that matches the given regular expression pattern.


        scanner.close(); 
    }
}
