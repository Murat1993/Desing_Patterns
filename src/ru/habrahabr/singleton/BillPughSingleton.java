package ru.habrahabr.singleton;


public class BillPughSingleton {
    private BillPughSingleton() {

    }

    private static class SingletonHolder {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
