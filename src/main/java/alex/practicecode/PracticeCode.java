/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package alex.practicecode;
import java.util.Scanner;  // Import the Scanner class

/**
 *
 * @author Alex Resurreccion
 */
public class PracticeCode {

    public static void main(String[] args) {
//        System.out.println("Type your username:");
//        Scanner myObj = new Scanner(System.in);
//        String userName = myObj.nextLine();  // Read user input
//        System.out.println("Username is: " + userName);  // Output user input

        // Class
//        Student practiceStudentDefault = new Student();
//        practiceStudentDefault.main();
//        Student practiceStudent = new Student("Dan", 4);
//        practiceStudent.main();
        
        // Loops
        // for loop
        // for(initial value; condition if loop will continue; what will happen after every loop)
//        for(int i=1;i<=5;i++){
//          System.out.println(i);
//        }
        // while loop
//        int j=1;
//        while(j<=5){
//            System.out.println(j);
//            j++;
//        }
        // do while loop
//        int k=1;
//        do{
//            System.out.println(k);
//            k++;
//        } while(k<=5);
        // decrement
//        int a=5;
//        do{
//            System.out.println(a);
//            a--;
//        } while(a>0);

        // If else
//        if(condition){ // basic if
//            // can be alot of codes
//        }
//        
//        if(condition){ // basic if-else
//            // code to be executed if condition is true
//        } else {
//            // code to be executed if condition(s) above are all false
//        }
        
//        if(condition){ // basic if-else
//            // code to be executed if condition is true
//        } else if(condition) {
//            // code to be executed if condition(s) if current condition is true
//        } else {
//            // code to be executed if condition(s) above are all false
//        }
        
        // switch
        char letter = 'a';
        int day = 2;
        switch(letter){
            case 'a':
                System.out.println("First letter");
                break;
            case 'b':
                System.out.println("Second letter");
                break;
            default:
                System.out.println("Cool letter");
        }
//        switch(day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            default:
//                System.out.println("It's WEEKEND!!!");
//        }

          // Arrays 
//          dataType[] variableName # common structure to declare an array
//          String[] names = {"collagen", "Alex"};
//          Double[] num = {123.45, 678.9};
          
//          String myName = "Alex Res";
//          System.out.println(myName.length());
          int[] incrementNums = {1, 2, 3, 4, 5, 6, 7 , 8, 9};
          for(int i=5; i<incrementNums.length; i++){
              System.out.println(incrementNums[i]);
          }
//          System.out.println(incrementNums[5]);
    }
}

class Student {
    String name = "Alex";
    int year = 1;
    double tuition = 123.45;
    
    Student(){ // default constructor
        this.year = 2;
        this.year = 3;
    }
    
    Student(String student_name, int student_year){ // parameterized constructor
        this.name = student_name;
        this.year = student_year;
    }
    
    Student(double student_tuition){ // overloaded parameterized constructor
        this.tuition = student_tuition;
    }
    
    public void main() {
        String name = "Hello";
        System.out.println("Class variable name: " + this.name);
        System.out.println("Class variable year: " + this.year);
        System.out.println("Method variable  name: " + name);
    }
    
    public int addNumbers(int a, int b){
        return a+b;
    }
}