package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDesc {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 123", 20),
                new Attachment("image 123456", 120),
                new Attachment("image 12", 23)
        };
        Comparator<Attachment> comparator = (Attachment left, Attachment right) -> {
            System.out.println("compare - " + left.getName().length() + " : "
                    + right.getName().length());
            return Integer.compare(right.getName().length(), left.getName().length());

        };
        Arrays.sort(atts, comparator);
        for (Attachment a : atts) {
            System.out.println(a);
        }
    }

}
