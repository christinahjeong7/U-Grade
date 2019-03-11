import java.util.Scanner;

class comprehensivelab1_Jeong {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.println("Please enter your name.");
    String userName = in.nextLine();

    int menu = 1;
    double homeworkTotal = 0; //total number of assignments
    double quizTotal = 0;
    double examTotal = 0;
    double seTotal = 0;
    double cpTotal = 0; 
    double quizPercentage = 0; 
    double examPercentage = 0;
    double sePercentage = 0; 
    double cpPercentage = 0; 
    double homeworkPercentage = 0; 
    double gradeTotal = 0;
    boolean input = false;
    
    while ((menu != 3) && ((menu <= 3) && (menu >= 1))) {
    System.out.println("Welcome to uGrade! Please select a menu option:");
    System.out.println("(Enter 1, 2, or 3)");
    System.out.println("1. Calculate 1301 Grades");
    System.out.println("2. Calculate Letter Grade");
    System.out.println("3. Exit");
    menu = in.nextInt();
    //percentage out of the grade category
    if (menu == 1) {
      System.out.println("Grade Categories and percentages:");
      System.out.println("1: 20% Homework");
      System.out.println("2: 15% Quizzes");
      System.out.println("3: 50% Exams");
      System.out.println("4: 5% Student Engagement");
      System.out.println("5: 10% Class Participation");
      System.out.println("Input the number of grades you have received for homework:");
      int numHomework = in.nextInt();
      System.out.println("Input the maximum score for all the homeworks:");
      double homeworkMax = in.nextDouble();

      for (int h = 1; h <= numHomework; h++) {
        System.out.println("Input grade " + h + ":");
        double homeworkGrade = in.nextDouble();
          
        homeworkTotal = homeworkTotal + homeworkGrade; 
      }
        
      System.out.println("Your current score for this cateogry is " + homeworkTotal + " out of " + homeworkMax);

      homeworkPercentage = ((homeworkTotal / homeworkMax) * 20);
        
      System.out.print("Given that homework is worth 20%");
      System.out.printf(", your current grade percentage for this category is: %.2f", homeworkPercentage);
      System.out.println("%");


      System.out.println("Input the number of grades you have received for quizzes:");
      int numQuiz = in.nextInt();
      System.out.println("Input the maximum score for all the quizzes:");
      double quizMax = in.nextDouble();

      for (int q = 1; q <= numQuiz; q++) {
        System.out.println("Input grade " + q + ":");
        double quizGrade = in.nextDouble();
          
        quizTotal = quizTotal + quizGrade; 
      }
        
      System.out.println("Your current score for this cateogry is " + quizTotal + " out of " + quizMax);
        
      quizPercentage = ((quizTotal / quizMax) * 15);
        
      System.out.print("Given that quizzes worth 15%");
      System.out.printf(", your current grade percentage for this category is: %.2f", quizPercentage);
      System.out.println("%");


      System.out.println("Input the number of grades you have received for exams:");
      int numExam = in.nextInt();
      System.out.println("Input the maximum score for all the exams:");
      double examMax = in.nextDouble();

      for (int e = 1; e <= numExam; e++) {
        System.out.println("Input grade " + e + ":");
        double examGrade = in.nextDouble();
          
        examTotal = examTotal + examGrade; 
      }
        
      System.out.println("Your current score for this cateogry is " + examTotal + " out of " + examMax);

      examPercentage = ((examTotal / examMax) * 50);
        
      System.out.print("Given that exams are worth 50%");
      System.out.printf(", your current grade percentage for this category is: %.2f", examPercentage);
      System.out.println("%");


      System.out.println("Input the number of grades you have received for student engagement:");
      int numSE = in.nextInt();
      System.out.println("Input the maximum score for all the student engagement:");
      double seMax = in.nextDouble();

      for (int se = 1; se <= numSE; se++) {
        System.out.println("Input grade " + se + ":");
        double seGrade = in.nextDouble();
          
        seTotal = seTotal + seGrade; 
      }
        
      System.out.println("Your current score for this cateogry is " + seTotal + " out of " + seMax);

      sePercentage = ((seTotal / seMax) * 5);
        
      System.out.print("Given that student engagement is worth 5%");
      System.out.printf(", your current grade percentage for this category is: %.2f", sePercentage);
      System.out.println("%");


      System.out.println("Input the number of grades you have received for class participation:");
      int numCP = in.nextInt();
      System.out.println("Input the maximum score for all the class participation:");
      double cpMax = in.nextDouble();

      for (int cp = 1; cp <= numCP; cp++) {
        System.out.println("Input grade " + cp + ":");
        double cpGrade = in.nextDouble();
          
        cpTotal = cpTotal + cpGrade; 
      }
        
      System.out.println("Your current score for this cateogry is " + cpTotal + " out of " + cpMax);

      cpPercentage = ((cpTotal / cpMax) * 10);
        
      System.out.print("Given that class participation is worth 10%");
      System.out.printf(", your current grade percentage for this category is: %.2f", cpPercentage);
      System.out.println("%");

      gradeTotal = quizPercentage + examPercentage + sePercentage + cpPercentage + homeworkPercentage; 

      System.out.print(userName);
      System.out.printf(", your current overall grade for CS 1301 lab is: %.2f", gradeTotal);
      System.out.println("%");
      input = true;
    }

      String gradeA = "A";
      String gradeB = "B";
      String gradeC = "C";
      String gradeD = "D";
      String gradeF = "F";
        
      if ((menu == 2) && (input != false)) {
          System.out.println("You've selected: Calculate Letter Grade.");
          
          if ((gradeTotal >= 90) && (gradeTotal <= 100 )) {
              System.out.printf("Your current grade of %.2f", gradeTotal);
              System.out.println("% corresponds to the letter grade: " + gradeA);
          } else if ((gradeTotal >= 80) && (gradeTotal <= 89 ))  {
              System.out.printf("Your current grade of %.2f", gradeTotal);
              System.out.println("% corresponds to the letter grade: " + gradeB);
          } else if ((gradeTotal >= 70) && (gradeTotal <= 79 ))  {
              System.out.printf("Your current grade of %.2f", gradeTotal);
              System.out.println("% corresponds to the letter grade: " + gradeC);
          } else if ((gradeTotal >= 60) && (gradeTotal <= 69 ))  {
              System.out.printf("Your current grade of %.2f", gradeTotal);
              System.out.println("% corresponds to the letter grade: " + gradeD);
          } else if (gradeTotal <= 59) {
              System.out.printf("Your current grade of %.2f", gradeTotal);
            
              System.out.println("% corresponds to the letter grade: " + gradeF);
              System.out.println("Would you like to try for extra credit to pass with a D? Enter yes or no.");

              in = new Scanner (System.in);
              String xtraCredit = in.nextLine().toLowerCase();

            if (xtraCredit.equals("yes")) {
              System.out.println("You must answer the following question correctly to recieve the extra credit. You have only one attempt.");

              System.out.println("Solve the following equation: 2 + 2 = ");
              int solution = in.nextInt();

              if (solution == 4) {
                System.out.println("Congrats! You pass with a D!");

              } else {
                  System.out.println("Looks like you're going to have to retake the course.");
              }
            } else {
                System.out.println("Your grade will remain at an F.");
            }
          }
      } if (menu == 2) {
        System.out.println("You've selected: Calculate Letter Grade. Please calculate your percent grade first.");
      }
          if (menu == 3) {
            System.out.println("3. Exit");
            System.out.println("Goodbye, thank you for using uGrade!");}
          if ((menu > 3) || (menu < 1)) {
            System.out.println("Error. Please enter a value between 1 and 3.");
        } 
      }
    }
}