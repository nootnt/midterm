package midterm.nikolozi_lagvilava_1.task4;

import java.util.List;

// Additional apckages I added
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;


        // My code starts here:
        Set<String> uniqueWords = new HashSet<>();
        Map<Integer, Integer> wordLengthCounts = new HashMap<>();
        
        for (String word : fantasyFormatData) {
            uniqueWords.add(word); // Add word to uniqueWords set
            int length = word.length();
            // Update wordLengthCounts map
            wordLengthCounts.put(length, wordLengthCounts.getOrDefault(length, 0) + 1);
        }
        
        // Print the set
        System.out.println("Unique words:");
        System.out.println(uniqueWords);
        
        // Print word length counts
        System.out.println("\nWord length counts:");
        for (Map.Entry<Integer, Integer> entry : wordLengthCounts.entrySet()) {
            System.out.println("Length: " + entry.getKey() + ", Count: " + entry.getValue());
        }
        
        // write task4.txt
        updateTask4File(uniqueWords, wordLengthCounts);
    }

    // Write all the required console output (equivalent) to the text file
    private static void updateTask4File(Set<String> uniqueWords, Map<Integer, Integer> wordLengthCounts) {
        try (FileWriter writer = new FileWriter("task4.txt", true)) {
            writer.write("\n\nUnique words:\n");
            for (String word : uniqueWords) {
                writer.write(word + "\n");
            }
            writer.write("\nWord length counts:\n");
            for (Map.Entry<Integer, Integer> entry : wordLengthCounts.entrySet()) {
                writer.write("Length: " + entry.getKey() + ", Count: " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
