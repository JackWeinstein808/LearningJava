import java.util.ArrayList;

class GradeAnalyzer {
  
  public GradeAnalyzer() {
  }
  //method to get the average of all your grades
  public int getAverage(ArrayList<Integer> grades) {
    //if there are no grades in the list
    if (grades.size() < 1) {
      System.out.println("Error: The ArrayList getAverage is empty.");
      return 0;
    }
    //gets the sum of all the grades
    else {
      int sum = 0;
      for (Integer grade : grades) {
        sum = sum + grade;
      }
      //gets the average by dividing the sum by the number of grades
      int average = sum/grades.size();
      System.out.println("Your average grade is: " + average);
      return average;
    }
  }
  //method to get highest grade
  public int getHighest(ArrayList<Integer> grades) {
    if (grades.size() < 1) {
            System.out.println("Error: The ArrayList getAverage is empty.");
      return 0;
    }
    else {
      int high = 0;
      for (Integer grade : grades) {
        if (grade > high) {
          high = grade;
        }
      }
      System.out.println("Your highest grade is: " + high);
      return high;
    }
  }
  //method to get lowest grade
  public int getLowest(ArrayList<Integer> grades) {
    if (grades.size() < 1) {
            System.out.println("Error: The ArrayList getAverage is empty.");
      return 0;
    }
    else {
      int low = 100;
      for (Integer grade : grades) {
        if (grade < low) {
          low = grade;
        }
      }
      System.out.println("Your lowest grade is: " + low);
      return low;
    }
  }
  
  public static void main(String[] args) {
    //grades
    ArrayList<Integer> myClassroom = new ArrayList<Integer>();
    myClassroom.add(98);
    myClassroom.add(92);
    myClassroom.add(88);
    myClassroom.add(75);
    myClassroom.add(61);
    myClassroom.add(89);
    myClassroom.add(95);
    
    GradeAnalyzer myAnalyzer = new GradeAnalyzer();
    //calling on the methods
    myAnalyzer.getAverage(myClassroom);
    myAnalyzer.getHighest(myClassroom);
    myAnalyzer.getLowest(myClassroom);
  }
}
