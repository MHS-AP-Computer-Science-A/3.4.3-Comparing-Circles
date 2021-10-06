public class Circle
{
    //Instance Variables
    int radius;
    String color;
    int x;
    int y;
    
    //Methods
    public Circle(int theRadius, String theColor, int xPosition, int yPosition)
    {
        radius = theRadius;
        color = theColor;
        x = xPosition;
        y = yPosition;
    }
    
    public int getRadius()
    {
        return radius;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public String getColor()
    {
        return color;
    }
    
    // Implement a toString method and an equals method here!
    public String toString()
    {
        // Change this!
        return false;
    }
    
    public boolean equals(Circle other)
    {
        // Change this!
        return false;
    }
}

