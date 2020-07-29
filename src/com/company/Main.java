package com.company;
// İlgili nesneden bir tane olmasını istersen singleton ve Creational bir design patterndir.
public class Main {

    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            Singleton singleton = Singleton.getSingleton();
        }
    }
}
//Methodu kullanabilmek için önce nesneyi oluşturduk