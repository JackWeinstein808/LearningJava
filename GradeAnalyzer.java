import java.util.ArrayList;

class GradeAnalyzer {
  
  public GradeAnalyzer() {
  }
  
  public int getAverage(ArrayList<Integer> grades) {
    if (grades.size() < 1) {
      System.out.println("Error: The ArrayList getAverage is empty.");
      return 0;
    }
    else {
      int sum = 0;
      for (Integer grade : grades) {
        sum = sum + grade;
      }
      int average = sum/grades.size();
      System.out.println("Your average grade is: " + average);
      return average;
    }
  }
  
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
    ArrayList<Integer> myClassroom = new ArrayList<Integer>();
    myClassroom.add(98);
    myClassroom.add(92);
    myClassroom.add(88);
    myClassroom.add(75);
    myClassroom.add(61);
    myClassroom.add(89);
    myClassroom.add(95);
    
    GradeAnalyzer myAnalyzer = new GradeAnalyzer();
    myAnalyzer.getAverage(myClassroom);
    myAnalyzer.getHighest(myClassroom);
    myAnalyzer.getLowest(myClassroom);
  }
}
