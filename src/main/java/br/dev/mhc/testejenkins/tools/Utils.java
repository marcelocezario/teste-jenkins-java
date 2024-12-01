package br.dev.mhc.testejenkins.tools;

import java.util.stream.Stream;

public class Utils {

    public static Integer sum(Integer ...values) {
        return Stream.of(values).reduce(0, Integer::sum);
    }
}
