package pl.quiz.math.app;


import pl.quiz.math.model.MathQuiz;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MathQuiz quiz = new MathQuiz();
        Scanner sc = new Scanner(System.in);

        int pkt = 0;
        System.out.println("Pytanie 1");
        System.out.println("Podaj wynik mnozenia 3*5=");
        int score = sc.nextInt();
        sc.nextLine();
        if(quiz.question1(score)){
            System.out.println("Twoja odpowiedz jest poprawna");
            pkt++;
        }else{
            System.out.println("Twoja odpowiedz jest błedna");
        }

        System.out.println("Pytanie 2");
        System.out.println("Podaj pole kwadratu o boku 12:");
        score = sc.nextInt();
        sc.nextLine();
        if(quiz.question2(score)){
            System.out.println("Twoja odpowiedz jest poprawna");
            pkt++;
        }else{
            System.out.println("Twoja odpowiedz jest błedna");
        }

        System.out.println("Pytanie 3");
        System.out.println("Podaj wynik z pierwiastka kwadratowego 15129");
        score = sc.nextInt();
        sc.nextLine();
        if(quiz.question3(score)){
            System.out.println("Twoja odpowiedz jest poprawna");
            pkt++;
        }else{
            System.out.println("Twoja odpowiedz jest błedna");
        }


        System.out.println("Twój wynik to: " + pkt + "/3 pkt");
    }


}
