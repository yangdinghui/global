package com.jscloud.test;

import java.util.function.Consumer;

/**
 * description 描述这个类的主要功能、用途
 * 创建时间 2020-09-14
 *
 * @author 杨丁辉
 */
public class PublicTest {

    public void test() {

        IConverter<String, Integer> iConverter = new IConverter<String, Integer>() {
            @Override
            public Integer convert(String from) {
                return Integer.valueOf(from);
            }
        };

        IConverter<String, Integer> iConverter2 = (form) -> {
            return Integer.valueOf(form);
        };

        IConverter<String, Integer> iConverter1 = from -> Integer.valueOf(from);

        IConverter<String, Integer> iConverter3 = Integer::valueOf;
        Integer convert = iConverter3.convert("1");
        System.out.println(convert);

    }

    public static void main(String[] args) {
        PublicTest pt = new PublicTest();
        pt.test();

        IPersonFactory<Person> personIPersonFactory = Person::new;
        Person person = personIPersonFactory.create("Li", "Hua");

    }
}
