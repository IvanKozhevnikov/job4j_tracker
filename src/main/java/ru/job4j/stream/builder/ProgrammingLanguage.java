package ru.job4j.stream.builder;

public class ProgrammingLanguage {

    private String name;

    private String version;

    private byte age;

    private String author;

    private String developer;

    private String languageClass;

    private String extension;

    static class Builder {
        private String name;
        private String version;
        private byte age;
        private String author;
        private String developer;
        private String languageClass;
        private String extension;

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildVersion(String version) {
            this.version = version;
            return this;
        }

        Builder buildAge(byte age) {
            this.age = age;
            return this;
        }

        Builder buildAuthor(String author) {
            this.author = author;
            return this;
        }

        Builder buildDeveloper(String developer) {
            this.developer = developer;
            return this;
        }

        Builder buildLanguageClass(String languageClass) {
            this.languageClass = languageClass;
            return this;
        }

        Builder buildExtension(String extension) {
            this.extension = extension;
            return this;
        }

        public ProgrammingLanguage build() {
            ProgrammingLanguage user = new ProgrammingLanguage();
            user.name = name;
            user.version = version;
            user.age = age;
            user.author = author;
            user.developer = developer;
            user.languageClass = languageClass;
            user.extension = extension;
            return user;
        }
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage{"
                + "name='" + name + '\''
                + ", version='" + version + '\''
                + ", age=" + age
                + ", author='" + author + '\''
                + ", developer='" + developer + '\''
                + ", languageClass='" + languageClass + '\''
                + ", extension='" + extension + '\''
                + '}';
    }
}