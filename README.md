# Skip-List
Implementation of Skip Lists

:::DOCUMENTATON:::


Class SkipList implements Skiplist data structure.
SkipList implements Comparable interface that compares two objects of same type. The decision is based on return value of the method compareTo(obj)

Following are the variables used in the class:

static final int POSSIBLE_LEVELS = 33; 

To create and operate on a node in the skiplist, Entry class is created: static class Entry<E> 
Following are its elements and methods:
E element;
Element stores value of element in the node of type E
Entry[] next;
next is an array that stores set of next pointers from each level in the node.
Entry prev;
prev is stores pointer to previous node.
int[] span;
Span stores number of nodes in between two nodes.
int level;
level indicates the current level.

public Entry(E x, int lev) 
Constructor that initializes Entry variables taking input number in x and number of levels in lev.

public E getElement() 
returns element of a node.

SkipList variables
private Entry head, tail; dummy nodes
private int size, maxLevel; //current highest level in the skiplist
private Entry[ ] last; // Array of last visited node 

private Random random; //object of java.util.Random to generate random integers


public SkipList() 
Constructor to initilaize Skiplist variables

public void find(T x)
Method to find element in a skiplist. It starts searching from the max level. It stores last visited element, uses last[].

public boolean contains(T x) 
Method used to check if skiplist contains an element.


public boolean add(T x) 
Add x to list. If x already exists, reject it. Returns true if new node is added to list

public int chooseLevel()
Method randomly allocates a level.

public T ceiling(T x) 
// Find smallest element that is greater or equal to x

public T first() 
// Return first element of list else return null uses SkipListIterator.

public T floor(T x) 
// Find largest element that is less than or equal to x

    
public T get(int n)
// Return element at index n of list.  First element is at index 0.
    
public T getLinear(int n) 
// O(n) algorithm for get(n)

public T getLog(int n)
Optional operation: Eligible for EC. not implemented

    
public Iterator<T> iterator() 
Iterate through the elements of list in sorted order

public T last() 
Return last element of list, uses SkipListIterator.

    
public T remove(T x) 
Remove x from list.  Removed element is returned. Return null if x not in list


public int size() 
Return the number of elements in the list

public void printList() 
Method to print the elements of skipist with every level. 


private class SkipListIterator<T> implements Iterator<T>

Class that implements iterator to iterate through the skiplist

Entry cursor;
cursor indicates Current node
Entry[] next;
Array of entry object to point to next node from all levels of a node

methods:
SkipListIterator()
Constructor of class

public boolean hasNext() 
Overrides Iterator hasNext function to return if the skiplist current node has a next node

public T next() 
Overrides Iterator next function to return current node 

public void remove() 
method throws exception when element is not present in list




public class SkipListDriver 
Driver class to implement Skiplist

public static void main(String[] args) throws FileNotFoundException 
Method to run the operations on the SkipList


*****Steps to compile and run*****


 Using an IDE
    a. create a simple java project in your favorite IDE(Eclipse, Netbeans, IntellijIDEA)
    b. copy the netid package folder inside the src folder
    c. build the project using the given functionality provided in your IDE
    d. execute the main method in SkipListDriver.java file









