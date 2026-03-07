import java.util.Scanner;

public class GradeEvaluator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter grade: ");
        int grade = sc.nextInt();

        String result = (grade >= 40) ? "Pass" : "Fail";

        System.out.println("Result:\n\tGrade: " + grade + "\n\tStatus: " + result);

        sc.close();
    }
}