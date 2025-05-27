package com.rajib.practice;

import java.util.concurrent.atomic.AtomicReference;

public final class SingletonJava8 {

    // Use AtomicReference for thread-safe lazy initialization
    private static final AtomicReference<SingletonJava8> INSTANCE = new AtomicReference<>();

    private SingletonJava8() {}

    public static SingletonJava8 getInstance() {

        SingletonJava8 temp = INSTANCE.get();

        if (temp == null) {
            temp = new SingletonJava8();
            if (INSTANCE.compareAndSet(null, temp)) {
                return temp;
            }
            else {
                return INSTANCE.get();
            }
        }

        return temp;
    }
}
