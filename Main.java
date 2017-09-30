package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args){
        dayOfWeek week= new dayOfWeek();

        System.out.println("Welcome to how to get the girlSimulator! (Please type Y or N to continue)");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();

        String yes = "Y";
        String no = "N";


        if (answer.equals(yes)) { System.out.println("Let's Begin! You are at Adams Hanover academy, a cute girl at the library caught your eye, do you say Hi? (Please type Y or N to continue)");

            Scanner input1 = new Scanner(System.in);
            String answer1 = input.nextLine();
            if (answer1.equals(yes)) {System.out.println("You said Hi! She waves back at you. Ask her for her name. (Please type Y or N to continue)");

                Scanner input2 = new Scanner(System.in);
                String answer2 = input.nextLine();

                if (answer2.equals(yes)) {System.out.println("She tells you her name and ask you for yours, do you tell her? (Please type Y or N to continue)");

                    Scanner input3 = new Scanner(System.in);
                    String answer3 = input.nextLine();
                    if (answer3.equals(yes)) {System.out.println("You tell her your name, now ask her about her next class!  (Please type Y or N to continue)");

                        Scanner input4 = new Scanner(System.in);
                        String answer4 = input.nextLine();

                        if (answer4.equals(yes)) {System.out.println("You're in History together! Bell rings, walk her to class?  (Please type Y or N to continue)");

                            Scanner input5 = new Scanner(System.in);
                            String answer5 = input.nextLine();

                            if (answer5.equals(yes)) {System.out.println("You drop her at Calculus, tell her you'll see her soon?  (Please type Y or N to continue)");

                                Scanner input6 = new Scanner(System.in);
                                String answer6 = input.nextLine();
                                //boolean m=true;
                                //while(m){
                                // String answer7= input.nextint();
                                if (answer6.equals(yes)) {System.out.println("She askes you what day on the weekend you'd like to meet! (Please print 1 for Saturday and 2 for Sunday) ");

                                    int answer7= input.nextInt();
                                    String answer8= week.getDay(answer7);
                                    System.out.println("You chose: "+ answer8 + " She says Yes, she'll see you on " + answer8 + ". ");

                                    System.out.println("It's now " + answer8 + "! You meet her near her house and both of you walk together. But the destination hasn't been decided yet. Where to go? ");

                                    DatePlace datePlace = new DatePlace();
                                    datePlace.getDestinations();

                                    System.out.println("\n Success! Congrats! You've reached the end of this sim. ");
                                }
                                else {System.out.println(" You're too far in, give the girl an answer."); }


                            }
                            else {System.out.println(" Didn't work out, that's ok.");}


                        }
                        else {System.out.println(" Alright try again.");}

                    }
                    else {System.out.println("Aww you're shy.");}
                }

                else {System.out.println("You're a rude one. Bye."); }
            }
            else {System.out.println("Cold feet? Okay, bye.");}

        }
        else {System.out.println("Don't want to play? Okay bye.");}



    }
}