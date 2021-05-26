package java_io;

import java.io.File;

import static java_io.DirectoryScanner.directoryScanner;
import static java_io.FileAnalyzer.analyzeFile;

public class TargetScanner {
    public static void main(String[] args) {
        File providedPath = new File(args[0]);

        if (providedPath.isDirectory()) {
            String directoryPath = args[0];
            directoryScanner(directoryPath, "scannedInfo.txt");
        } else if (providedPath.isFile()) {
            String fileName = args[0];
            analyzeFile(fileName);
        } else {
            throw new IllegalArgumentException("Provided argument was not a valid file or directory.");
        }
    }
}
