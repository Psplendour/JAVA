package javaQueue;

public class Book implements Comparable<Book> {
        int id;  
		String name,author,publisher;  
		int quantity;  
		 
		public Book(int id, String name, String author, String publisher, int quantity) //Constructor Initialzation
		{  
		    this.id = id;  
		    this.name = name;  
		    this.author = author;  
		    this.publisher = publisher;  
		    this.quantity = quantity;  
		}  
		
		    public int compareTo(Book b) //Implementing the compareTo Method to make the Book Object Comparable which follow the Default natural sorting order
		    {                            //This method is called by JVM Internally
		    if(id>b.id){  
		        return 1;  
		    }else if(id<b.id){  
		        return -1;  
		    }else{  
		    return 0;  
		    }  
		}  
	}


