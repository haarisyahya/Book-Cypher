package Assign2;


/** @author Haaris Yahya
  * @version 1.0 (01/14/2021)         */              

import BasicIO.*;                // for IO classes
import static BasicIO.Formats.*; // for field formats
import static java.lang.Math.*;  // for math constants and functions

// Final variables in the methods to initialize strings for the files names to be saved.
public class Main {
  private static final String FILE_NAME = "Message.txt";
  private static final String ENCRYPTED_FILE_NAME = "Encrypted.txt";
  private static final String DECRYPTED_FILE_NAME = "Decrypted.txt";
  
 
  static CodeBook codeBook = new CodeBook();
  /*This method uses the ASCIIDataFile and ASCIIOutputFile to select a text file and output the encrypted text file into 
  the assign2 folder */
  static void encrypt() {
    
    ASCIIDataFile input = new ASCIIDataFile();
    ASCIIOutputFile output = new ASCIIOutputFile();
    
    while( !input.isEOF())  {
      char c = input.readC();
      int code = (int) c;
      output.writeInt(codeBook.emit(code));
      
    }
    
    input.close();
    output.close();
    System.out.println("Reading input file " + FILE_NAME + " successful!");
    System.out.println("Encrypted file written to " + ENCRYPTED_FILE_NAME);
  }
  
  
  // This method uses the ASCIIDataFile and ASCIIOutputFile to select a text file and output the decrypted text file into 
  // the assign2 folder.
  static void decrypt() {
    ASCIIDataFile input = new ASCIIDataFile();
    ASCIIOutputFile output = new ASCIIOutputFile();
    
    while( !input.isEOF() ) {  
      int next = input.readInt();
      output.writeC((char)codeBook.find(next));
    }
    
    input.close();
    output.close();
    System.out.println("Decrypted file written to " + DECRYPTED_FILE_NAME);
    
  }
  
  //Prints all the methods and generates 2000 integers for the linked lists, prints the codeBook in the console and the encrypt and decrypt methods. 
  public static void main(String[] args) {
    codeBook.generate(2000);
    codeBook.print();
    System.out.println(); 
    encrypt();
    decrypt();
  }
 
}
