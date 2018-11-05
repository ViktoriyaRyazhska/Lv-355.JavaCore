package com.swich.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main1 {

    public static void main(String[] args) {

        int n = 10;

        Random random = new Random();

        random.ints(-10, 10).limit(n).forEach(i -> System.out.print(i + " "));

        System.out.println();

        random.ints(-10, 10).limit(n).sorted().forEach(i -> System.out.print(i + " "));

        System.out.println();

        System.out.println(random.ints(-10, 10).limit(n).max().getAsInt());

        LocalDate data = LocalDate.now();

        System.out.println(data.getDayOfWeek());

        LocalDate firstMonday = data.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

        System.out.println(firstMonday);

        List<String> s = Arrays.asList("abc", "a", "bc", "efg", "abd", "b", "jkl");

        System.out.println(sort(s));

    }

    private static List<String> sort(List<String> s) {
        return s.stream().sorted().collect(Collectors.toList());
    }

}
