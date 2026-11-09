import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        Scanner userInput =  new Scanner(System.in);
        System.out.println("enter your name: ");
        String userName = userInput.nextLine();
        System.out.println("enter lastName: ");
        String lastName = userInput.nextLine();
        System.out.println("enter age: ");
        int age = userInput.nextInt();
        userInput.close();
        System.out.println(userName +  " " + lastName + " " + age + " years old");
        while (age<18) {
            System.out.println(age + " years old, user is not old enough to vote");
            age++;
        }
    }
}

//ASK USER FOR LAST NAME AND PRINT IT OUT (First name, last name, age)
