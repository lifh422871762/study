package com.design.pattern.singleton;

/**
 * 枚举单例模式，最优方式，不仅可以保证多线程的同步，也可以保证对象被反序列化
 */
public enum User05 {

    instance;

    /**
     * 测试方法
     * @param args
     */
    public static void main(String[]args){

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(User05.instance.hashCode());
            }).start();
        }

    }

}
