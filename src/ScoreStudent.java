import java.util.ArrayList;
import java.util.Scanner;

public class ScoreStudent {

 static Scanner scan = new Scanner(System.in);
 static ArrayList student = new ArrayList();

 public static void main(String[] args) {

  ScoreStudent2 score = new ScoreStudent2(scan, student);

  System.out.println("============ 切积 己利 包府 橇肺弊伐 ============\n\n");

  score.input();

  for (int i = 1; i <= student.size(); i += 4) {
   score.choose();
  }
  score.average();
  score.average(0);
  score.averageee();
 
 }
}
