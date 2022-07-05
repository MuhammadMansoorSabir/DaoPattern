package com.example.management.repo;

import java.util.List;

public interface Dao<T> {
        List<T> getAll();

        String delete(int id);

        String insert(T t);

        String update(T t);
}
