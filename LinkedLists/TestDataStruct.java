//import??
/**
 * Write a description of class TestDataStruct here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestDataStruct
{
    // instance variables - replace the example below with your own
    private int x;

    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main(String[] args)
    {
        LinkedList s = new LinkedList();
        
        String word = "New";
        String word2;
        
        s.addFirst(word);
        s.addFirst(new String("Two"));
        
        
        
        
        //word2 = s.getFirst();//this returns an Object
        //OLD school!! must cast the Object 
        word2 = (String) s.getFirst();
        
        System.out.print(word2);
        
        
        
    }
}





