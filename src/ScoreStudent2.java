import java.util.Scanner;
import java.util.ArrayList;

public class ScoreStudent2 {

 int students;
 String name;
 int number;
 int kor, math, english;
 int aver;
 Scanner scan;
 ArrayList student;
 static int sum = 0;
 //static int summ = 0;
 static int summm = 0;

 public ScoreStudent2(Scanner scan, ArrayList student) {
  this.student = student;
  this.scan = scan;

 }

 public void input() {

  System.out.println("자네 이름은 무엇인가~?");
  name = scan.next();
  student.add(name);

  System.out.println("자네 국어 성적은 몇 점인가~?");
  kor = scan.nextInt();
  student.add(kor);

  System.out.println("자네 수학 성적은 몇 점인가~?");
  math = scan.nextInt();
  student.add(math);

  System.out.println("자네 영어 성적은 몇 점인가~?");
  english = scan.nextInt();
  student.add(english);

 }

 public void choose() {
  System.out.println("\n[더 입력할꺼면 1 아니면 2]");
  int n = scan.nextInt();
  if (n == 1) {
   input();
  } else if (n == 2) {
   num();
  }
 }

 public void num() {

  for (int i = 0, count = 1; i < student.size(); i += 4, count++) {

   System.out.println((count) + "번 " + student.get(i) + "학생은 " + "국어 성적 :" + student.get(i + 1) + " 수학 성적:"
     + student.get(i + 2) + " 영어 성적:" + student.get(i + 3) + " 입니다~\n");

  }

 }

 public void average() {

  for (int i = 1; i <= student.size(); i += 4) {
   int a = (int) student.get(i);
   sum += a;
  }

  int b = student.size() / 4;
  System.out.println("국어 성적 총 평균은" + (sum / b));

 }

 public void average(int sum) {

  for (int i = 2; i <= student.size(); i += 4) {
   int a = (int) student.get(i);
   sum += a;
  }

  int b = student.size() / 4;
  System.out.println("\n수학 성적 총 평균은" + (sum / b));

 }

 public void averageee() {

  for (int  i = 3; i <= student.size(); i += 4) {
   int a = (int) student.get(i);
   summm += a;
  }

  int b = student.size() / 4;
  System.out.println("\n영어 성적 총 평균은" + (summm / b));

 }
} 
