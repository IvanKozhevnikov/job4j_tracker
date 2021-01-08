package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SearchAtt {

    private static Attachment filter(List<Attachment> list, Function<Attachment, Attachment> func) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment attachment : list) {
            rsl = (List<Attachment>) func.apply(list.get(attachment.getSize(), attachment.getName()));

        }
        return (Attachment) rsl;
    }

    public static List<Attachment> filterSize(List<Attachment> list) {
        Function<Attachment, Attachment> func = new Function<Attachment, Attachment>() {
            @Override
            public Attachment apply(Attachment attachment) {
                List<Attachment> rsl = new ArrayList<>();
                if (attachment.getSize() > 100) {
                    rsl.add(new Attachment(attachment.getName(), attachment.getSize()));
                }
                return (Attachment) rsl;
            }
        };
        return (List<Attachment>) filter(list, func);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        Function<Attachment, Attachment> func = new Function<Attachment, Attachment>() {
            @Override
            public Attachment apply(Attachment attachment) {
                List<Attachment> rsl = new ArrayList<>();
                if (attachment.getName().contains("bug")) {
                    rsl.add(new Attachment(attachment.getName(), attachment.getSize()));
                }
                return (Attachment) rsl;
            }
        };
        return (List<Attachment>) filter(list, func);
    }
}