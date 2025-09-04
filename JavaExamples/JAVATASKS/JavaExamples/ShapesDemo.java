package JavaExamples;
class Shape 
{
    void area()
    {
        System.out.println("Area method should be overridden in subclasses.");
    }
}

class Circle extends Shape 
{
    int radius;
    Circle(int r)
     {
        radius = r; 
    }
    @Override
    void area() 
    {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape 
{
    int length, width;
    Rectangle(int l, int w)
     {
        length = l;
        width = w;
    }
    @Override
    void area()
    {
        System.out.println("Rectangle Area: " + (length * width));
    }
}

class Square extends Shape 
{
    int side;
    Square(int s)
     {
        side = s;
    }
    @Override
    void area() 
    {
        System.out.println("Square Area: " + (side * side));
    }
}

public class ShapesDemo
 {
    public static void main(String[] args) 
    {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);
        Shape s = new Square(4);

        c.area();
        r.area();
        s.area();
    }
}


    

    

 




   
 

