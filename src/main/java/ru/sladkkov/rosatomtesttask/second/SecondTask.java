package ru.sladkkov.rosatomtesttask.second;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

@Slf4j
public class SecondTask {

    public static int[] swap() {
        int a = ThreadLocalRandom.current().nextInt(10);
        int b = ThreadLocalRandom.current().nextInt(10);

        log.info("До: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        log.info("После: a = " + a + ", b = " + b);

        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int[] swap = SecondTask.swap();
        log.info("Результат: " + Arrays.toString(swap));
    }
}
