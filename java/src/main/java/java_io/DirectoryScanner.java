package java_io;

import java.io.*;

public class DirectoryScanner {
    static int directoryDepth = 1;

    private DirectoryScanner() {
        throw new IllegalStateException("Utility class");
    }

    public static void directoryScanner(String directoryPath, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            String[] sentences = directoryPath.split("\\\\");
            writer.write(sentences[sentences.length - 1] + "\n");

            scanDirectory(directoryPath, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void scanDirectory(String directoryPath, BufferedWriter writer) throws IOException {
        File directory = new File(directoryPath);
        File[] listFile = directory.listFiles();

        if (listFile != null) {
            for (File file : listFile) {
                if (file.isDirectory()) {
                    writer.write("|"
                            + new String(new char[directoryDepth]).replace("\0", "-----")
                            + file.getName() + "\n");
                    directoryDepth++;
                    scanDirectory(file.toString(), writer);
                    directoryDepth--;
                } else {
                    writer.write("|\t  " + file.getName() + "\n");
                }
            }
            writer.write("|" + "\n");
        }
    }
}
