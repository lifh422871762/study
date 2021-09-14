package com.design.pattern.strategy;

/**
 * Title: Sorter
 * Description: 具体策略执行
 * @author lifh
 * @date 2021/9/14 22:00
 */
public class Sorter {

    public void executeStrategy(People people,Comparator comparator){
        int compare = comparator.compare(people);
        if(compare == 1) {
            shoppingCar(people);
        } else if(compare == -1) {
            shoppingHouse(people);
        } else {
            shoppingVilla(people);
        }
    }

    public void shoppingCar(People people) {
        System.out.println(people.getName() + "要买汽车");
    }

    public void shoppingHouse(People people) {
        System.out.println(people.getName() + "要买房子");
    }

    public void shoppingVilla(People people) {
        System.out.println(people.getName() + "要买别墅");
    }


}
