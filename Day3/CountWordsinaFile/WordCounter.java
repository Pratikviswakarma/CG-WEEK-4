package CountWordsinaFile;

import java.io.*;
import java.util.*;


public class WordCounter {
   public static void main(String[] args) {
       String filePath = "D:\\Capgemini Notes\\sample.txt";
       System.out.println("Processing file: " + filePath);


       // Count words in the file
       Map<String, Integer> wordCounts = countWordsInFile(filePath);


       if (wordCounts != null) {
           int totalWords = wordCounts.values().stream().mapToInt(Integer::intValue).sum();
           System.out.println("Total Words: " + totalWords);


           // Get and display top 5 most frequent words
           displayTopWords(wordCounts, 5);
       }
   }


   // Method to count word occurrences in a file
   public static Map<String, Integer> countWordsInFile(String filePath) {
       Map<String, Integer> wordCounts = new HashMap<>();


       try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
           String line;
           while ((line = reader.readLine()) != null) {
               String[] words = line.toLowerCase().replaceAll("[^a-zA-Z0-9]", " ").split("\\s+");
               for (String word : words) {
                   if (!word.isEmpty()) {
                       wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                   }
               }
           }
       } catch (FileNotFoundException e) {
           System.out.println("Error: File not found - " + e.getMessage());
           return null;
       } catch (IOException e) {
           System.out.println("Error reading file - " + e.getMessage());
           return null;
       }
       return wordCounts;
   }


   // Method to display top N most frequent words
   public static void displayTopWords(Map<String, Integer> wordCounts, int topN) {
       System.out.println("\nTop " + topN + " most frequently occurring words:");


       wordCounts.entrySet().stream()
               .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
               .limit(topN)
               .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
   }
}
