import java.util.ArrayList;
import java.util.Scanner;

public class ScoreStudent {

 static Scanner scan = new Scanner(System.in);
 static ArrayList student = new ArrayList();

 public static void main(String[] args) {

  ScoreStudent2 score = new ScoreStudent2(scan, student);

  System.out.println("============ �л� ���� ���� ���α׷� ============\n\n");

  score.input();

  for (int i = 1; i <= student.size(); i += 4) {
   score.choose();
  }
  score.average();
  score.average(0);
  score.average(3, 0);
 
 }
}
