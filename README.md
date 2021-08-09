# Book-Cypher
A book cypher is an encoding technique (encryption). This project focuses on receiving passages of text and encrypting that passage of text using arrays and linked lists. This program also decrypts data as well. 
This program uses a standard character set known as ASCII characters. It has 128 characters in the set, numbered from 0-127. We create an array CodeBook of size 128 (0-127) where each elemnent of the array is a pointer to a Header node. The header node keeps track of how many nodes are in the list. 
We generate 2000 random characters in the range 0-127, where each is an ASCII character. For each character generated, we sequentially number this character and enter it into the linked list corresponding to the character in the CodeBook.
