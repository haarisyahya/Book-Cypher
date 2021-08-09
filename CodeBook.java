package Assign2;


/** COSC 1P03...
  *
  * @author Haaris Yahya
  * @version 1.0 (01/14/2021)         */              

import BasicIO.*;                // for IO classes
import static BasicIO.Formats.*; // for field formats
import static java.lang.Math.*;  // for math constants and functions
import java.util.Random; // for randomly selecting an array

public class CodeBook {

 private static final int NUM_ASCII_CHARACTERS = 128;
 
 private Node nodePointers[];  //Initializing the node type array
 
 private static final Random RANDOM = new Random(); // using the random number generator to randomly select an array
 
 //This is the code to traverse through the array one index at a time
 public CodeBook() {
  nodePointers = new Node[NUM_ASCII_CHARACTERS];
  for( int i=0; i<NUM_ASCII_CHARACTERS; i++ ) {
   nodePointers[i] = new Node(0);
  }
 }
 //This is the method to randomly generate an array index and filling codeBook
 public void generate(int count) {
  for( int i=1; i<=count; i++ ) {
   int randomCharacter = RANDOM.nextInt(NUM_ASCII_CHARACTERS);
   add(randomCharacter, i);
  }
 }
  // this method adds nodes to the linked list at the tail. 
 public void add(int index, int aCode){
  Node head = nodePointers[index];
  Node current = head;
  while( current.getNext() != null )
   current = current.getNext();
  
  Node newNode = new Node(aCode);
  
  current.setNext(newNode);
  head.setData(head.getData() + 1);
 }
 // this method picks a random index and finds the size of the linked list in the  header node 
 public int emit(int index) {
  int size = nodePointers[index].getData();
  return emit(index, RANDOM.nextInt(size) + 1);
 }
 //This is the method that once the random index has been found, it inserts an integer in the linked list
 private int emit(int index, int count) {
  
  Node current = nodePointers[index];
  int currentCount = 0;
  
  while( currentCount<count && current != null ) {
   currentCount++;
   current = current.getNext();
  }
  
  if( current == null ) 
   return -1;
 
  return current.getData();
 }
 //  This method finds the specific integer in the array linked lists.
 public int find(int code) {
  for(int i=0; i<nodePointers.length; i++ ) {
   Node current = nodePointers[i].getNext();
   while( current != null ) {
    if(current.getData() == code) 
     return i;
    current = current.getNext();
   }
  }
  return -1;
 }
 /* This last method prints the codeBook output in the console in the form of a table with the indices of the array in the far left column
 followed by the elements of the linked lists in each row. */
 public void print() {
   
  for(int i=0; i<nodePointers.length; i++ ) {
   System.out.print(i + "\t");
   
   Node current = nodePointers[i].getNext();
   while( current != null ) {
    System.out.print(current.getData() + " ");
    current = current.getNext();
   }
  System.out.println();
  
  }

 }
}
