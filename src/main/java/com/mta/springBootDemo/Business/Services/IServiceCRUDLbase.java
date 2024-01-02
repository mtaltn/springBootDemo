package com.mta.springBootDemo.Business.Services;

import java.util.List;

public interface IServiceCRUDLbase<T> {
    List<T> getAll();
    void add(T t);
    void update(T t);
    void delete(T t);
}
