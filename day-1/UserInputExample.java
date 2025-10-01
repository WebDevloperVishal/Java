// import java.util.Scanner;
// import java.time.LocalDate;

// public class UserInputExample {
//     public static void main(String[] args) {
//         try (Scanner scanner = new Scanner(System.in)) {
            
//             // Get user's name
//             System.out.print("Enter your name: ");
//             String name = scanner.nextLine();
            
//             // Get user's age
//             System.out.print("Enter your age: ");
//             int age = scanner.nextInt();
            
//             // Get user's favorite subject
//             scanner.nextLine(); // consume the newline left by nextInt()
//             System.out.print("Enter your favorite subject: ");
//             String subject = scanner.nextLine();
            
//             // Get user's GPA
//             System.out.print("Enter your GPA: ");
//             double gpa = scanner.nextDouble();
            
//             // Display the information
//             System.out.println("\n=== Your Information ===");
//             System.out.println("Name: " + name);
//             System.out.println("Age: " + age);
//             System.out.println("Favorite Subject: " + subject);
//             System.out.println("GPA: " + gpa);
            
//             // Some conditional logic based on input
//             if (age >= 18) {
//                 System.out.println("You are an adult!");
//             } else {
//                 System.out.println("You are a minor.");
//             }
            
//             if (gpa >= 3.5) {
//                 System.out.println("Excellent academic performance!");
//             } else if (gpa >= 3.0) {
//                 System.out.println("Good academic performance!");
//             } else {
//                 System.out.println("Keep working hard!");
//             }
            
//             // Calculate birth year (approximate)
//             int currentYear = LocalDate.now().getYear();
//             int birthYear = currentYear - age;
//             System.out.println("You were born around: " + birthYear);
//         }
//     }
// }


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== STUDENT MANAGEMENT SYSTEM ===\n");
        
        // Get basic information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        scanner.nextLine(); // consume newline
        System.out.print("Enter your favorite subject: ");
        String subject = scanner.nextLine();
        
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();
        
        // Get number of subjects and grades
        System.out.print("How many subjects are you taking? ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        ArrayList<String> subjects = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();
        
        // Input subjects and grades
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter subject " + (i + 1) + " name: ");
            subjects.add(scanner.nextLine());
            
            System.out.print("Enter grade for " + subjects.get(i) + ": ");
            grades.add(scanner.nextDouble());
            scanner.nextLine(); // consume newline
        }
        
        // Get hobbies
        System.out.print("Enter your hobbies (comma-separated): ");
        String hobbiesInput = scanner.nextLine();
        String[] hobbies = hobbiesInput.split(",");
        
        // Get additional info
        System.out.print("Are you a scholarship holder? (yes/no): ");
        String scholarshipStr = scanner.nextLine();
        boolean hasScholarship = scholarshipStr.equalsIgnoreCase("yes");
        
        System.out.print("Enter your city: ");
        String city = scanner.nextLine();
        
        // Display comprehensive information
        System.out.println("\n" + "=".repeat(50));
        System.out.println("         STUDENT INFORMATION REPORT");
        System.out.println("=".repeat(50));
        
        System.out.println("Name: " + name.toUpperCase());
        System.out.println("Age: " + age + " years old");
        System.out.println("City: " + city);
        System.out.println("Favorite Subject: " + subject);
        System.out.printf("Overall GPA: %.2f%n", gpa);
        System.out.println("Scholarship Holder: " + (hasScholarship ? "Yes" : "No"));
        
        // Display subjects and grades
        System.out.println("\n--- ACADEMIC PERFORMANCE ---");
        double totalGrades = 0;
        for (int i = 0; i < subjects.size(); i++) {
            System.out.printf("%-20s: %.2f%n", subjects.get(i), grades.get(i));
            totalGrades += grades.get(i);
        }
        
        double averageGrade = totalGrades / subjects.size();
        System.out.printf("Average Grade: %.2f%n", averageGrade);
        
        // Display hobbies
        System.out.println("\n--- HOBBIES ---");
        for (int i = 0; i < hobbies.length; i++) {
            System.out.println("• " + hobbies[i].trim());
        }
        
        // Analysis and recommendations
        System.out.println("\n--- ANALYSIS ---");
        
        // Age category
        String ageCategory;
        if (age < 13) {
            ageCategory = "Elementary";
        } else if (age < 18) {
            ageCategory = "High School";
        } else if (age < 23) {
            ageCategory = "College";
        } else {
            ageCategory = "Adult Learner";
        }
        System.out.println("Education Level: " + ageCategory);
        
        // GPA Analysis
        String gpaLevel;
        if (gpa >= 3.8) {
            gpaLevel = "Excellent (Dean's List)";
        } else if (gpa >= 3.5) {
            gpaLevel = "Very Good (Honor Roll)";
        } else if (gpa >= 3.0) {
            gpaLevel = "Good";
        } else if (gpa >= 2.5) {
            gpaLevel = "Satisfactory";
        } else {
            gpaLevel = "Needs Improvement";
        }
        System.out.println("Academic Standing: " + gpaLevel);
        
        // Find best and worst performing subjects
        if (subjects.size() > 0) {
            double maxGrade = grades.get(0);
            double minGrade = grades.get(0);
            String bestSubject = subjects.get(0);
            String worstSubject = subjects.get(0);
            
            for (int i = 1; i < grades.size(); i++) {
                if (grades.get(i) > maxGrade) {
                    maxGrade = grades.get(i);
                    bestSubject = subjects.get(i);
                }
                if (grades.get(i) < minGrade) {
                    minGrade = grades.get(i);
                    worstSubject = subjects.get(i);
                }
            }
            
            System.out.printf("Best Subject: %s (%.2f)%n", bestSubject, maxGrade);
            System.out.printf("Subject to Focus: %s (%.2f)%n", worstSubject, minGrade);
        }
        
        // Recommendations
        System.out.println("\n--- RECOMMENDATIONS ---");
        if (gpa < 3.0) {
            System.out.println("• Consider forming study groups");
            System.out.println("• Visit professors during office hours");
            System.out.println("• Use campus tutoring resources");
        } else if (gpa >= 3.5) {
            System.out.println("• Excellent work! Consider leadership opportunities");
            System.out.println("• Look into advanced courses in your field");
        }
        
        if (hasScholarship) {
            System.out.println("• Maintain your GPA to keep scholarship eligibility");
        } else if (gpa >= 3.5) {
            System.out.println("• You may be eligible for academic scholarships");
        }
        
        // Birth year calculation
        int currentYear = 2025;
        int birthYear = currentYear - age;
        System.out.println("\nEstimated Birth Year: " + birthYear);
        
        // Fun fact
        System.out.println("\n--- FUN FACT ---");
        System.out.println("You have " + hobbies.length + " hobbies and are taking " + 
                         subjects.size() + " subjects. That's a lot to balance!");
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Thank you for using Student Management System!");
        System.out.println("=".repeat(50));
        
        scanner.close();
    }
}