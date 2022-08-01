package AverageGradeCalculator;

import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {

        int mathGrade;
        int physicsGrade;
        int chemistryGrade;
        int englishGrade;
        int historyGrade;
        int musicGrade;

        int sumOfGrades;
        double averageGrade;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your Math Grade: ");
        mathGrade = input.nextInt();

        System.out.print("Please enter your Physics Grade: ");
        physicsGrade = input.nextInt();

        System.out.print("Please enter your Chemistry Grade: ");
        chemistryGrade = input.nextInt();

        System.out.print("Please enter your English Grade: ");
        englishGrade = input.nextInt();

        System.out.print("Please enter your History Grade: ");
        historyGrade = input.nextInt();

        System.out.print("Please enter your Music Grade: ");
        musicGrade = input.nextInt();

        //Calculating sum of grades and average grade.
        sumOfGrades = mathGrade + physicsGrade + chemistryGrade + englishGrade + historyGrade + musicGrade;
        averageGrade = sumOfGrades / 6.0;

        System.out.println("Your average grade is : " + averageGrade);

        boolean status = averageGrade >= 60;
        String finalSituation = status ? "Passed the class" : "Failed the class";
        System.out.println(finalSituation);


    }
}
