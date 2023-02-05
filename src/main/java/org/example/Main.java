package org.example;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Path currentPath = Paths.get("");
        String path = currentPath.toAbsolutePath().toString();
        System.out.println("현재 작업 경로: " + path);
    }
}