import java.util.NoSuchElementException;
/**
 * Write a description of class LinkedList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkedList
{
    // instance variables - replace the example below with your own
    private Node first;
    private Node last;
    
    class Node
    {
        // Old School
        //Any Object into and out of our LL
        //cast to type the object as we remove
        public Object data;
        public Node next;
        
    }
    
    /**
     * Constructor for objects of class LinkedList
     */
    public LinkedList()
    {
        // initialise instance variables
        first = null;
    }
    
    /**
     * Adds an element to the front of the LL
     * @param element the  element to add
     */
    public void addFirst(Object element)
    {
        Node newNode = new Node();
        newNode.data = element;//points to object
        newNode.next = first;
        first = newNode;    
        
        
    }
    
    /**
     * Returns the first element in the LL
     * @return the first element in the LL
     */
    
    public Object getFirst()
    {
        if (first == null){throw new NoSuchElementException();}
        return first.data;
    }
    
    /**
     * Removes the first element in the LL
     * @return the removed element
     */
    public Object removeFirst()
    {
        if (first == null){throw new NoSuchElementException();}
        
        Object element = first.data;
        first = first.next;
        return element;
       
    }
    
    public ListIterator listIterator()
    {
        return new LinkedListIterator();
        
    }
    
    
    
    
     class LinkedListIterator implements ListIterator
     {
         private Node position;
         private Node previous; //remove
         private boolean isAfterNext;
         
         public LinkedListIterator()
         {
             position = null;
             previous = null;
             isAfterNext = false;
             
             
         }
         
         public Object next()
         {
             if (!hasNext()) {throw new NoSuchElementException();}
             
             previous = position; // so I can remove item
             isAfterNext = true;
             
             if ( position == null)
             {
                 position = first; // address/ref to Objects
                 
             }
             else
             {
                 position = position.next;
                 
             }
             
             return position.data;
         }
         /**
         * Tests if there is an element after the interator position
         * @retrun true if there is an eleent after the iterator position
         */
         public boolean hasNext()
         {
             if (position == null)
             {
               return first != null;  
                 
             }
             else
             {
                 return position.next != null;
                }
             
         }
         
         
     }
    

    
}





