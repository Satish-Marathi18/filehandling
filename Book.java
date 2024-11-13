package filehandling;

abstract class Book {
    private String title;
    private String author;
    private boolean isBorrowed;
     
    Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isBorrowed=false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook(){
        if(!isBorrowed){
            isBorrowed=true;
            System.out.println(title+" is borrowed");
        }
        else{
            System.out.println(title+" is already borrowed");
        }
    }

    public void returnBook(){
        if(isBorrowed){
            isBorrowed=false;
            System.out.println(title+" is returned");
        }
        else{
            System.out.println(title+" is not returned");
        }
    }
    
    public abstract void displayDetails();

    
}