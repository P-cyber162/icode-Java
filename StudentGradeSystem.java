import java.util.Scanner;

public class StudentGradeSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Student index numbers
        String[] indexNumbers = {
            "100221107", "100221107", "100221107", "100221307", "100221407",
            "100221507", "100221607", "100221707", "100221807", "100221907",
            "100222107", "100222207", "100222307", "100222407", "100224407"
        };
        
        int numStudents = indexNumbers.length;
        int[] midSem = new int[numStudents];
        int[] exams = new int[numStudents];
        double[] finalMarks = new double[numStudents];
        String[] grades = new String[numStudents];
        
        // Grade counters
        int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeE = 0, gradeF = 0;
        
        System.out.println("========================================================");
        System.out.println("           STUDENT GRADE COMPUTATION SYSTEM");
        System.out.println("========================================================\n");
        
        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + " - Index No: " + indexNumbers[i]);
            
            System.out.print("Enter Mid Semester mark (out of 100): ");
            midSem[i] = input.nextInt();
            
            System.out.print("Enter End of Semester Exam mark (out of 100): ");
            exams[i] = input.nextInt();
            
            System.out.println();
        }
        
        // Calculate final marks and grades
        System.out.println("\n========================================================");
        System.out.println("                    RESULTS TABLE");
        System.out.println("========================================================\n");
        
        System.out.printf("%-5s %-12s %-10s %-10s %-10s %-10s%n", 
            "S/N", "INDEX NO.", "Mid Sem", "Exams", "Final", "Grade");
        System.out.println("----------------------------------------------------------------");
        
        for (int i = 0; i < numStudents; i++) {
            // Convert mid semester (out of 100) to 30%
            double midSemScaled = (midSem[i] / 100.0) * 30;
            
            // Convert exam (out of 100) to 70%
            double examScaled = (exams[i] / 100.0) * 70;
            
            // Calculate final mark
            finalMarks[i] = midSemScaled + examScaled;
            
            // Determine grade
            if (finalMarks[i] >= 70) {
                grades[i] = "A";
                gradeA++;
            } else if (finalMarks[i] >= 60) {
                grades[i] = "B";
                gradeB++;
            } else if (finalMarks[i] >= 50) {
                grades[i] = "C";
                gradeC++;
            } else if (finalMarks[i] >= 40) {
                grades[i] = "D";
                gradeD++;
            } else {
                grades[i] = "F";
                gradeF++;
            }
            
            // Display student results
            System.out.printf("%-5d %-12s %-10d %-10d %-10.2f %-10s%n", 
                (i + 1), indexNumbers[i], midSem[i], exams[i], finalMarks[i], grades[i]);
        }
        
        // Display grade count
        System.out.println("\n========================================================");
        System.out.println("                    GRADE DISTRIBUTION");
        System.out.println("========================================================");
        System.out.printf("%-10s %-10s%n", "GRADE", "NUMBER");
        System.out.println("------------------------");
        System.out.printf("%-10s %-10d%n", "A", gradeA);
        System.out.printf("%-10s %-10d%n", "B", gradeB);
        System.out.printf("%-10s %-10d%n", "C", gradeC);
        System.out.printf("%-10s %-10d%n", "D", gradeD);
        System.out.printf("%-10s %-10d%n", "F", gradeF);
        
        // Calculate statistics
        double max = finalMarks[0];
        double min = finalMarks[0];
        double sum = 0;
        
        for (int i = 0; i < numStudents; i++) {
            if (finalMarks[i] > max) {
                max = finalMarks[i];
            }
            if (finalMarks[i] < min) {
                min = finalMarks[i];
            }
            sum += finalMarks[i];
        }
        
        double average = sum / numStudents;
        
        // Display statistics
        System.out.println("\n========================================================");
        System.out.println("                       STATISTICS");
        System.out.println("========================================================");
        System.out.printf("MAXIMUM: %.2f%n", max);
        System.out.printf("MINIMUM: %.2f%n", min);
        System.out.printf("AVERAGE: %.2f%n", average);
        System.out.println("========================================================");
        
        input.close();
    }
}