package Assign2;


/** COSC 1P03...
  *
  * @author Haaris Yahya
  * @version 1.0 (01/14/2021)         */              

// to store a node in a linked list. Each node is capable of holding an integer
public class Node {
 
 private int data; // the data in the linked lists
 private Node next; // link to the next node
 
 public Node(int data) {
  this.data = data;
  this.next = null;
 }
// The constructor that will allow the data to be stored and has the link to the next node
 public Node(int data, Node next) {
  this.data = data;
  this.next = next;
 }
 //These methods are just getters & setters that access and update the value of the private variables 
 public int getData() {
  return data;
 }
 
 public Node getNext() {
  return next;
 }
 
 public void setData(int data) {
  this.data = data;
 }
 
 public void setNext(Node next) {
  this.next = next;
 }
}
