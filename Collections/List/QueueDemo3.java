package Collections.List;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
//The elements in PriorityQueue must be of Comparable type.. so we implements Comparable
class Book implements Comparable<Book> {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Book b) {
        if(id>b.id){
            return 1;
        }else if(id<b.id){
            return -1;
        }else{
            return 0;
        }
    }
}


public class QueueDemo3
{
    public static void main(String[] args) {
        Queue<Book> queue=new PriorityQueue<>();
        queue.add(new Book(1245,"ramayanam","Valmiki","Bhakthi Trust",12));
        queue.add(new Book(1245,"Mahabharata","Veda Vyas","Bhakthi Trust",15));
        queue.add(new Book(1245,"Shiva Puranam","Markhandeya","Bhakthi Trust",11));
        queue.add(new Book(1245,"Guru charitra","baradwaj","Bhakthi Trust",15));
       // System.out.println(queue);

       for (Book book:queue) {
//System.out.println("List of Books are: ");

System.out.println(book.getId()+" "+book.getName()+" "+book.getAuthor()+" "+book.getPublisher()+" "+book.getQuantity()+" ");
        }
    }
}
