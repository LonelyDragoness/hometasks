package java_io;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.*;

public class FileAnalyzer {
    private FileAnalyzer() {
        throw new IllegalStateException("Utility class");
    }

    public static void analyzeFile(String filename) {
        try (FileReader reader = new FileReader(filename); BufferedReader bufferedReader= new BufferedReader(reader)){
            ArrayList<String> foundStrings = new ArrayList<>();
            bufferedReader.lines().forEach(foundStrings::add);

            filesAndFoldersCounter(foundStrings);
            averageNameLengthFinder(foundStrings);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void filesAndFoldersCounter(ArrayList<String> foundStrings) {
        int folderAmount = 0;
        int fileAmount = 0;
        int averageFileAmount = 0;
        Pattern folderPattern = Pattern.compile("(-----)+");
        Pattern filePattern = Pattern.compile("\t {2}");

        for (String string : foundStrings) {
            Matcher folderMatcher = folderPattern.matcher(string);
            Matcher fileMatcher = filePattern.matcher(string);

            if (folderMatcher.find()) {
                folderAmount++;
            } else if (fileMatcher.find()) {
                fileAmount++;
            }
        }
        if (folderAmount != 0) {
            averageFileAmount = fileAmount/folderAmount;
        }
        System.out.println("Amount of folders: " + folderAmount + ".\n" +
                "Amount of files: " + fileAmount + ".\n" +
                "Average amount of files in the folder: " + averageFileAmount + ".");
    }

    private static void averageNameLengthFinder(ArrayList<String> foundStrings) {
        int amountOfNames = 0;
        int summaryNameLength = 0;

        for (String string : foundStrings) {
            amountOfNames++;
            String[] splitString = string.split("\t {2}");

            if (splitString.length == 2) {
                summaryNameLength += splitString[1].length();
            }
        }
        if (amountOfNames != 0) {
            System.out.println("Average filename length: " + summaryNameLength/amountOfNames + ".");
        }
    }
}
