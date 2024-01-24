import java.util.*; 
import java.io.*;

class Main {

  public static String HTMLElements(String str) {
    // code goes here  

    // Stack to hold HTML tag names
    Stack <String> elements = new Stack<String>();

    // Iterate over given string
    for( int i = 0; i < str.length(); i++) {
      
      // Opening tag
      if(str.charAt(i) == '<' && str.charAt(i+1) != '/') {
        
        String temp = "";

        i++; // Ignore opening tag, avoid pushing it into stack

        // Get the name of related tag
        while(str.charAt(i) != '>') {
          temp = temp + str.charAt(i);
          i++;
        }

        // Push the related tag name into stack
        elements.push(temp);
      }

      // Closing tag
      if(str.charAt(i) == '<' && str.charAt(i+1) == '/') {
        
        String temp = "";

        i+=2; // Ignore opening tag and /, avoid pushing them into stack

        // Get the name of related tag
        while(str.charAt(i) != '>') {
          temp = temp + str.charAt(i);
          i++;
        }

        // Check whether nested correctly
        if(elements.peek().equals(temp)) {
          elements.pop();
        }
        else if (elements.peek() != temp){
          break; // Not nested correctly, break the loop
        }
      }

    }


    // Nested correctly
    if(elements.size() == 0) {
      return "true";
    }

    // Get the first element that is not nested correctly
    String changeElement = elements.pop();

    return changeElement;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(HTMLElements(s.nextLine())); 
  }

}
