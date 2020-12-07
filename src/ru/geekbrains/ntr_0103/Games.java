package ru.geekbrains.ntr_0103;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.SocketOption;
import java.util.Random;

public class Games {
    private static void guessNumberRound(int minNumber, int maxNumber, int attempts) {

        Random random = new Random();
        int targetNumber = minNumber + random.nextInt(maxNumber + minNumber + 1);


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int counter = 0;
        System.out.printf("Угадайте число от %d до %d. \n", minNumber, maxNumber);
        System.out.printf("У вас %d попытки \n", attempts);

        for (int i = 0; i < attempts; i++) {
            try {
                int number = Integer.parseInt(reader.readLine());
                if (number > targetNumber) {
                    System.out.println("Загаданное число меньше.");
                } else if (number < targetNumber) {
                    System.out.println("Загаданное число больше.");
                } else {
                    System.out.println("Вы угадали!");
                    return;
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("Нужно ввести целое число!");
                continue;
            }
        }
        System.out.println("Вы проиграли!");
        System.out.printf("Загаданное число - %d.\n", targetNumber);
    }

    public static void guessNumberGame(int minNumber, int maxNumber, int attempts) {
        minNumber = Math.abs(minNumber);
        maxNumber = Math.abs(maxNumber);
        attempts = Math.abs(attempts);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Игра - угадай число!");

        while (true) {
            guessNumberRound(minNumber, maxNumber, attempts);

            int choice = -1;

            while (choice != 0 && choice != 1) {
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                try {
                    choice = Integer.parseInt(reader.readLine());
                } catch (IOException | NumberFormatException e) {
                    continue;
                }
            }

            if (choice == 0) return;
        }
    }

    public static void guessWord(String[] wordArray)  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Random random = new Random();
        String targetName = wordArray[random.nextInt(wordArray.length)];


        System.out.println("Игра - угадай слово!");
        while (true) {
           try {
               System.out.println("Введите ответ.");
               String answer = reader.readLine().toLowerCase();
               if (answer.equals(targetName)) {
                   System.out.println("Вы угадали!");
                   return;
               } else {
                   System.out.println("Вы не угадали!");
                   System.out.println(getHint(answer, targetName));
               }
           } catch (IOException e) {

           }
        }
    }

    private static String getHint(String answer, String targetWord) {
        StringBuilder hint = new StringBuilder().append("###############");
        int wordLength = answer.length() < targetWord.length() ? answer.length() : targetWord.length();
        for (int i = 0; i < wordLength; i++) {
            if (answer.charAt(i) == targetWord.charAt(i)) {
                hint.setCharAt(i, answer.charAt(i));
            }
        }
        return hint.toString();
    }
}
