package com.company;

public class Singleton {

    private static Singleton singleton ;

    private static int value = 0;

    private Singleton(){
        System.out.println("Oluşturuldu");
    }
    public static Singleton getSingleton(){ //Nesneyi new'lemeden de o nesneye ait bir methodu methodu static yaparak kullanabiliriz.

        if (singleton == null) {
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton =  new Singleton();
                }
            }
        }
        value++;
        System.out.println(value);

        return singleton;
    } //nesnenin kendisini dönen bir method yazdık ve public ile bunu dışarı açtık.
}
