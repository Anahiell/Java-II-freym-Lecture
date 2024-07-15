package itstep.learning.base;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Begin {
    private final Map<String, String> ukToEnglDictionary;
    private final Map<String, String> englToUkDictionary;
    private final Scanner sc = new Scanner(System.in);

    public Begin() {
        ukToEnglDictionary = new HashMap<>();
        englToUkDictionary = new HashMap<>();
        // Добавим несколько слов
        ukToEnglDictionary.put("привіт", "hello");
        englToUkDictionary.put("hello", "привіт");
    }

    public void menu() {
        System.out.println("Welcome to the Begin Translate Program");
        while (true) {
            System.out.println(
                    "Choose your variant\n" +
                    "1-Find translation for Ukrainian word\n" +
                    "2-Find translation for English word\n" +
                    "3-Add a word\n" +
                    "4-Exit");
            int x = sc.nextInt();
            sc.nextLine();

            switch (x) {
                case 1: {
                    ukForEngl();
                    break;
                }
                case 2: {
                    englForUk();
                    break;
                }
                case 3: {
                    addWord();
                    break;
                }
                case 4: {
                    System.out.println("Exiting program. Goodbye!");
                    return;
                }
                default: {
                    System.out.println("Invalid option. Please try again.");
                    break;
                }
            }
        }
    }

    private void ukForEngl() {
        System.out.print("Enter a Ukrainian word: ");
        String ukWord = sc.nextLine();
        String translation = ukToEnglDictionary.get(ukWord);
        if (translation != null) {
            System.out.println("Translation: " + translation);
        } else {
            System.out.println("Translation not found.");
        }
    }

    private void englForUk() {
        System.out.print("Enter an English word: ");
        String englWord = sc.nextLine();
        String translation = englToUkDictionary.get(englWord);
        if (translation != null) {
            System.out.println("Translation: " + translation);
        } else {
            System.out.println("Translation not found.");
        }
    }

    private void addWord() {
        System.out.print("Enter a Ukrainian word: ");
        String ukWord = sc.nextLine();
        System.out.print("Enter its English translation: ");
        String englWord = sc.nextLine();
        ukToEnglDictionary.put(ukWord, englWord);
        englToUkDictionary.put(englWord, ukWord);
        System.out.println("Word added successfully.");
    }
}
