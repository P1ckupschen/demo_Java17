package com.schen.demo_java17.threadlocal;

public class localholder {
    private final static ThreadLocal<String> local = new ThreadLocal<String>();

    public static void set(String s){
        local.set(s);
    }
    public static String get(){
        return local.get();
    }
    public static void remove(){
        local.remove();
    }
}
