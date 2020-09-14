package com.jscloud.test;

@FunctionalInterface
public interface IConverter<F, T> {

    T convert(F from);
}
