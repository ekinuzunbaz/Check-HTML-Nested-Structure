# Check-HTML-Nested-Structure
This Java program checks the correct nesting of HTML elements within a given string. It utilizes a stack to keep track of opening and closing HTML tags and determines whether they are nested correctly.

## Explanation
* The program uses a stack to keep track of HTML tag names. 
* It iterates through the input string and processes opening and closing tags. If the nesting is correct, it returns "true"; otherwise, it identifies the first incorrectly nested element.
* Users can interact with the program by entering an HTML string, and it promptly provides feedback on the correctness of element nesting or highlights the first element that breaks the correct nesting sequence.

## Example Cases
1. **Correct Nesting:**
   ```html
   Input: <html><head><title>Sample Title</title></head><body><p>Hello, World!</p></body></html>
   Output: true

2. **False Nesting:**
   ```html
   Input: <div><p>This is <strong>not</div></strong> nested correctly</p>
   Output: div
