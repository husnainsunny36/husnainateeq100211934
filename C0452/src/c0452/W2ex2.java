import java.util.Scanner;

public class W2ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your letter grade (A, B, C, D, E, or F): ");
        String letterGrade = scanner.nextLine().toUpperCase();
        scanner.close();
        String classification;
        
        switch (letterGrade) {
            case "A":
                classification = "1st";
                break;
            case "B":
                classification = "2:1";
                break;
            case "C":
                classification = "2:2";
                break;
            case "D":
                classification = "3rd";
                break;
            case "E":
                classification = "ordinary";
                break;
            case "F":
                classification = "fail";
                break;
            default:
                classification = "Invalid grade";
        }

        System.out.println("University Undergraduate Classification: " + classification);
    }
}