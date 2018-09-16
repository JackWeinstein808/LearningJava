import java.util.HashMap;

class Library {
  
  public Library() {
  }
  
  //method that gets the booms that are finished
  //HashMap library stores the book name as a string and a boolean value of wether it is finished or not
  public void getFinishedBooks(HashMap<String, Boolean> library) {
    //if there are no books in the library
    if (library.size() < 1 ) {
      System.out.println("Error: HashMap library is empty.");
    }
    else {
      //getting the boolean value of the book, if true than it is finished
      for (String book : library.keySet()) {
        if ((library.get(book)) == true) {
          System.out.println("You finished " + book);
        }
      }
    }
  }
  //method for determining if the book is unfinished
  public void getUnfinishedBooks(HashMap<String, Boolean> library) {
    if (library.size() < 1 ) {
    	System.out.println("Error: HashMap library is empty.");
    }
    else {
      for (String book : library.keySet()) {
        if ((library.get(book)) == false) {
          System.out.println("You have not finished " + book);
        }
      }
    }
  }
  
  public static void main(String[] args) {
    //adding books to myBooks HashMap
    HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
    myBooks.put("Road Down The Funnel", true);
    myBooks.put("Rat: A Biology", false);
    myBooks.put("TimeIn", true);
    myBooks.put("3D Food Printing", false);
    
    Library myLibrary = new Library();
    //calling on the 2 methods
    myLibrary.getFinishedBooks(myBooks);
    myLibrary.getUnfinishedBooks(myBooks);
  }
}
