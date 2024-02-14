public class Employee1 implements java.io.Serializable 
{ 
private int id; 
private String name; 
public Employee1() 
    { 
    } 
public void setId(int id) 
    { 
        this.id = id; 
    } 
public int getId() 
    { 
        return id; 
    } 
public void setName(String name) 
    { 
        this.name = name; 
    } 
public String getName() 
    { 
        return name; 
    } 
}
 class Employee {
public static void main(String args[])
{
    Employee1 s = new Employee1(); 
    s.setId(01); 
    System.out.println(s.getId()); 
    s.setName("Chandler"); 
    System.out.println(s.getName()); 
}
}