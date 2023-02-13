package hw04;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int taskChoice;
        while (true) {
            System.out.println("Для выбора задачи \n Реализовать консольное приложение введите: 1 \n Переворот списка: 2");
            try {
                taskChoice = Integer.parseInt(sc.next());
                if (taskChoice == 1) {
                    ex1();
                    break;
                }
                if (taskChoice == 2) {
                    ex2();
                    break;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Введите корректный номер задачи");
            }
        }
    }

    public static void ex1() {
        ArrayDeque<String> userDeque = new ArrayDeque<>();
        while(true) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("(print - печать списка \n revert - удаление последней введенной строки \n exit - выход) \n Введите строку: ");
            String userString = userInput.nextLine();
            switch (userString) {
                case "print" :
                    System.out.println(userDeque);
                    break;
                case "revert" :
                    System.out.println("Последний элемент удален");
                    userDeque.removeFirst();
                    System.out.println(userDeque);
                    break;
                case "exit" :
                    System.out.println("Программа завершена");
                    System. exit(0);
                default:
                    userDeque.addFirst(userString);
            }

        }
    }

    public static void ex2() {
        LinkedList<Integer> premadeList = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(premadeList);
        LinkedList<Integer> resultList = new LinkedList<>();
        /**
        for (int i = 0; i < premadeList.size(); i++) {
            resultList.add(i, premadeList.get(premadeList.size() - i - 1));
        }
         **/
        for (int i = premadeList.size()-1; i >= 0; i--) {
            resultList.add(premadeList.get(i));
        }
        System.out.println(resultList);
    }
}