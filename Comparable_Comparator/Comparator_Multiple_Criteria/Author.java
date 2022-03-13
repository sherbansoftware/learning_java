package Comparable_Comparator.Comparator_Multiple_Criteria;


public class Author {

    String firstName;
    String lastName;
    String bookName;
    int pageNumber;

    public Author(String firstName, String lastName, String bookName, int pageNumber) {
        this.pageNumber = pageNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pageNumber = pageNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}