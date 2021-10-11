
package Arraylist;

import java.util.*;
 
class Employee{
    public int id;
    public String name;
    public String address;
    public float sal;
    public static int count = 0;
 
    //zero argument constructor. Gets called by default when an object is created for the Employee class
    public Employee(){}
 
    //Parameterized Constructor
    public Employee(int id, String name,String address,float sal)
    {
        super();
        this.id = id;
        this.name = name;
        this.address=address;
        this.sal= sal;
        
        count++;
    }
 
    public int getId() {
    return id;
    }
 
    public String getName() {
    return name;
    }
 
    public String getAddress() {
    return address;
    }

    public float getSalary() {
    return sal;
    }
}
 
public class DisplayArrayList {
public static void main(String[] args) throws Exception 
    {
     List<Employee> list = new ArrayList<Employee>();
 
     list.add(new Employee(1, "Ravi","Delhi",5000));
     list.add(new Employee(2, "Raj","Mumbai",7000));
     list.add(new Employee(3, "Rekha","Chennai",7000));
     list.add(new Employee(4, "Ram","Rajasthan",6000));
 
        for (Employee s : list) //Iterates as long as there are elements in the list. An object s is created of type Employee class.
        {
            System.out.print("ID, Name, Address And salary of the employee are : ");
            System.out.println(s.getId()+" "+s.getName()+" " +s.getAddress()+" " +s.getSalary());
        }
    }//End of main() method
}//end of DisplayArrayList class
