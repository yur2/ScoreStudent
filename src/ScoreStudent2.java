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


 public ScoreStudent2(Scanner scan, ArrayList student) {
  this.student = student;
  this.scan = scan;

 }

 public void input() {

  System.out.println("�ڳ� �̸��� �����ΰ�~?");
  name = scan.next();
  student.add(name);

  System.out.println("�ڳ� ���� ������ �� ���ΰ�~?");
  kor = scan.nextInt();
  student.add(kor);

  System.out.println("�ڳ� ���� ������ �� ���ΰ�~?");
  math = scan.nextInt();
  student.add(math);

  System.out.println("�ڳ� ���� ������ �� ���ΰ�~?");
  english = scan.nextInt();
  student.add(english);

 }

 public void choose() {
  System.out.println("\n[�� �Է��Ҳ��� 1 �ƴϸ� 2]");
  int n = scan.nextInt();
  if (n == 1) {
   input();
  } else if (n == 2) {
   num();
  }
 }

 public void num() {

  for (int i = 0, count = 1; i < student.size(); i += 4, count++) {

   System.out.println((count) + "�� " + student.get(i) + "�л��� " + "���� ���� :" + student.get(i + 1) + " ���� ����:"
     + student.get(i + 2) + " ���� ����:" + student.get(i + 3) + " �Դϴ�~\n");

  }

 }

 public void average() {

  for (int i = 1; i <= student.size(); i += 4) {
   int a = (int) student.get(i);
   sum += a;
  }

  int b = student.size() / 4;
  System.out.println("���� ���� �� �����" + (sum / b));

 }

 public void average(int sum) {

  for (int i = 2; i <= student.size(); i += 4) {
   int a = (int) student.get(i);
   sum += a;
  }

  int b = student.size() / 4;
  System.out.println("\n���� ���� �� �����" + (sum / b));

 }

 public void average(int i, int sum) {

  for (i = 3; i <= student.size(); i += 4) {
   int a = (int) student.get(i);
   sum += a;
  }

  int b = student.size() / 4;
  System.out.println("\n���� ���� �� �����" + (sum / b));

 }
} 
