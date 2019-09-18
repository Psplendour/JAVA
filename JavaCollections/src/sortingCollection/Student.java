package sortingCollection;
//Example to sort user-defined class objects
public class Student implements Comparable<Student>{

            public String name;
            
		    public Student(String name) 
		    {  
		    this.name = name;  
		    }
		    
		    public int compareTo(Student person) 
		    {  
		        return name.compareTo(person.name);  
		          
		    }   
	}

