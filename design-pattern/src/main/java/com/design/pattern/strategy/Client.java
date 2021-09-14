package com.design.pattern.strategy;

/**
 * Title: Client
 * Description:
 * @author lifh
 * @date 2021/9/14 22:16
 */
public class Client {

    public static void main(String[] args) {
        People people = new People();
        people.setName("张三");
        people.setPrice(5000001);

        Sorter sorter = new Sorter();
        sorter.executeStrategy(people,new PriceComparator());

        People people01 = new People();
        people01.setName("李四");
        people01.setHeight(30);
        sorter.executeStrategy(people01,new HeightComparator());


    }

}
