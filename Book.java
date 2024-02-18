/*
* Activity 2.5.7
*
* A Book class for the MediaLibrary program
*/
public class Book{
    private String title;
    private String author;
    private int rating;

    /*** Constructor ****/
    public Book(String t, String a){
        this.title = t;
        this.author = a;
        this.rating = 0;
    }

    /*** Accessor methods ***/
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getRating() {
        return this.rating;
    }

    public String toString() {
        String info = "\"" + this.title + "\", written by " + this.author;
        if (this.rating != 0) { 
            info += ", rating is " + this.rating;
        }
        return info;
    }

    /*** Mutator methods ***/
    public void setTitle(String t) {
        this.title = t;
    }

    public void setAuthor(String a) {
        this.author = a;
    }
}
