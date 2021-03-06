package labs;
// JA: Where is the test class?
class Circle{
    
    //data members
    private double x,y,radius;
    
    //no argument constructor
    Circle(){
        x = 0;
        y = 0;
        radius = 1;
    }
    
    //constructor that takes center and radius
    Circle(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    //This method returns area of circle
    double getArea(){
        return Math.PI*radius*radius;
    }

    //This method returns perimeter of the circle
    double getPerimeter(){
        return 2*Math.PI*radius;
    }
    
    
    //This method checks if (x,y) lies in this circle
    boolean contains(double x, double y){
        return ((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y)<=radius*radius);
    }
    
    boolean contains(Circle circle){
        return this.contains(circle.x,circle.y);
    }
    
    boolean overlaps(Circle circle){
        return ((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y)<=(circle.radius+radius)*(circle.radius+radius));
    }
    
    @Override
    public String toString(){
        return "("+x+","+y+") : "+radius;
    }
}