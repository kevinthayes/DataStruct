
/**
 * Write a description of interface ListIterator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface ListIterator
{
    /**
     *Moves the iterator past the next element
     * 
     * @return  the traversed element
     */
    Object next();
    /**
     * Tests if there is an element after the interator position
     * @retrun true if there is an eleent after the iterator position
     */
    
    boolean hasNext();
    
    /**
     * Adds an element before the iterator position
     * and moves the iterator past the inserted element
     * @param element the element to add
     */
    
    void add(Object element);
    
    /**
     * Removes the last traversed element. This method may
     * ony be called after a call to the next method.
     */
    
    void remove();
    
    
    
    
    
    
    
    
}
