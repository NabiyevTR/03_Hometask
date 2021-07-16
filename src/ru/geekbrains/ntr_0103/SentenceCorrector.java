package ru.geekbrains.ntr_0103;

public class SentenceCorrector {
    public static String getCorrectedSentence(String sentence) {

        String s1 = sentence.replaceAll(" +", " ");

        StringBuilder s2 = new StringBuilder(s1);

        for (int i = 1; i < s1.length(); i++) {
            if (s1.charAt(i) >= 'А' && s1.charAt(i) <= 'Я') {
                s2.setCharAt(i - 1, '.');
            }
        }
        //Добавляем точку в конце
        s1 = s2.append(".").toString();
        //Добавляем пробелы
        s1 = s1.replaceAll("\\.", ". ");
        // Удаляем последний пробел
        return s1.substring(0, s1.length() - 1);
    }
}
