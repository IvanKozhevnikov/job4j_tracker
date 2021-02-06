package ru.job4j.stream.builder;

public class Main {
    public static void main(String[] args) {
        ProgrammingLanguage user = new ProgrammingLanguage.Builder()
                .buildName("Java")
                .buildVersion("1.0, 1.1, 1.2  ..... 14")
                .buildAge((byte) 26)
                .buildAuthor("James Gosling")
                .buildDeveloper("Sun Microsystems and Oracle")
                .buildLanguageClass("multi-paradigm programming language")
                .buildExtension(".java")
                .build();
        System.out.println(user.toString());
    }
}
