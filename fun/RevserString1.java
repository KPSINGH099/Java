package fun;
//O(n) aaproach
public class RevserString1 {
    
        // Function to reverse a string using StringBuilder
        public static String reverse(String str) {
            StringBuilder reversed = new StringBuilder();  // StringBuilder for efficient string manipulation
            
            // Loop through the string from the end to the beginning
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed.append(str.charAt(i));  // Append each character to the StringBuilder
            }
            
            return reversed.toString();  // Convert the StringBuilder to a string and return it
        }
    
        public static void main(String[] args) {
            String original = "hello";
            String reversed = reverse(original);
            
            System.out.println("Original String: " + original);  // Output: hello
            System.out.println("Reversed String: " + reversed);  // Output: olleh
        }
    
    
}
