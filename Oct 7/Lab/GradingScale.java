public class GradingScale {
  
     public static void main(String[] args) {
        int grade = 54;
        switch (grade){
        
        case 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100:
            System.out.println("Your grade is an A");
        break;
        case 80, 81, 82, 83, 84, 85, 86, 87, 88, 89:
            System.out.println("Your grade is a B");
        break;
        case 70, 71, 72, 73, 74, 75, 76, 77, 78, 79:
            System.out.println("Your grade is a C");
        break;
        case 60, 61, 62, 63, 64, 65, 66, 67, 68, 69:
            System.out.println("Your grade is a D");
        break;
        default: 
            System.out.println("Your grade is an F");

        if (grade > 80) {
            System.out.println("Keep up the good work!");
         } else if (grade < 80) {
            System.out.println("More practice is needed.");
         } else 
            System.out.println("Much more practice is needed.");
         }
    }
}

