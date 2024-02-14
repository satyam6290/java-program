public class perimeter {
    int length;
    int breadth;
                 perimeter(int length,int breadth)
    {this.length=length;
    this.breadth=breadth;
    }
    public void getperimeter()
    {
        int perimeter= 2*(length+breadth);
        System.out.println("area of rectangle: "+ perimeter);
    
    }
   public static void main(String[] args) {
    perimeter rectangle = new perimeter(10,20);
    rectangle.getperimeter();
    
   }


}

