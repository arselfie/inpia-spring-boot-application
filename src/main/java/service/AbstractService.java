package service;

import java.util.List;

public interface AbstractService<T> {
    void save(T t);

    List<T> getAll();
}
