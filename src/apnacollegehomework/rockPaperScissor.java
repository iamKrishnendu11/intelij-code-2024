package apnacollegehomework;
import java.util.Scanner;
import java.util.Random;

public class rockPaperScissor {
    public static void main(String[] args) {
        System.out.println("Enter 0 for rock\nEnter 1 for paper\nEnter 2 for scissor");
        System.out.println("enter your input below:-");
        // taking user input
        Scanner sc = new Scanner(System.in);
        int yourCall = sc.nextInt();

        if(yourCall== 0) {
            System.out.println("you choose rock");
        }
        else if(yourCall==1) {
            System.out.println("you choose paper");
        }
        else {
            System.out.println("you choose scissor");
        }

        // taking random input from computer
        Random random = new Random();
        int computerCall = random.nextInt(3);

        if(computerCall==0) {
            System.out.println("computer choose rock");
        }
        else if(computerCall==1) {
            System.out.println("computer choose paper");
        }
        else {
            System.out.println("computer chosse scissor");
        }

        // condition
        if(yourCall == computerCall) {
            System.out.println("match is drawn");
            }
        else if (yourCall == 0 && computerCall == 2 || yourCall==1 && computerCall==0 || yourCall==2 && computerCall==1 ) {
            System.out.println("you win,congratulation");
        }
        else {
            System.out.println("sorry, better luck next time");
        }
    }
}



