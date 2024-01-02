package com.mta.springBootDemo.DataAccess;

import java.util.List;

public interface ICRUDLbase<T> {
    List<T> getAll();
    void add(T t);
    void update(T t);
    void delete(T t);
}
