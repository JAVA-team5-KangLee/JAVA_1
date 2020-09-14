
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle
{
    // instance variables - replace the example below with your own
    private int width;
    private int height;
    
    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(int width, int height)
    {
        // initialise instance variables
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object obj)
    {
        Rectangle r = (Rectangle)obj;
        if(this.width * this.height == r.width * r.height)
            return true;
        else
            return false;
    }
}
