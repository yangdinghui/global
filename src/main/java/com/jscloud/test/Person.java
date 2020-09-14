package com.jscloud.test;

/**
 * description 描述这个类的主要功能、用途
 * 创建时间 2020-09-14
 *
 * @author 杨丁辉
 */
public class Person {
    String firstName;
    String lastName;

    Person() {
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

@FunctionalInterface
interface IPersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
