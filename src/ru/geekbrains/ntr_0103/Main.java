package ru.geekbrains.ntr_0103;

public class Main {

    public static void main(String[] args) {
        //1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки
        // угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число
        // чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз?
        // 1 – да / 0 – нет»(1 – повторить, 0 – нет).
        Games.guessNumberGame(0, 9, 3);


        //2 * Создать массив из слов
        // String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
        // "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его
        // с загаданным словом и сообщает правильно ли ответил пользователь.
        //Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
        //apple – загаданное
        //apricot - ответ игрока
        //ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        //Для сравнения двух слов посимвольно, можно пользоваться:
        //String str = "apple";
        //str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        //Играем до тех пор, пока игрок не отгадает слово
        //Используем только маленькие буквы

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Games.guessWord(words);


        // 3 Доделать задачу с урока
        String s = "Предложение     один  Теперь     предложение    два   Тут  предложение          три";
        System.out.println(SentenceCorrector.getCorrectedSentence(s));


    }
}
