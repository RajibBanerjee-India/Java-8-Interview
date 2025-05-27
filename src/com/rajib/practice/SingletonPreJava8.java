package com.rajib.practice;

// final class - Cannot be extended
public final class SingletonPreJava8 {

    // Static Field to Hold Instance
    // volatile prevents instruction reordering
    private static volatile SingletonPreJava8 INSTANCE;

    // Private Constructor - Prevents external instantiation via new
    private SingletonPreJava8() {}

    public static SingletonPreJava8 getInstance() {
        if (INSTANCE == null) { // First check (no locking)
            synchronized (SingletonPreJava8.class) { // Lock only once
                if (INSTANCE == null) { // Second check (inside lock)
                    INSTANCE = new SingletonPreJava8();
                }
            }
        }

        return INSTANCE;
    }
}
