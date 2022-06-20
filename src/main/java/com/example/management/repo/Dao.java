package com.example.management.repo;

import java.util.List;

public interface Dao<T> {
        List<T> getAll();

        void delete(int id);

        T insert(T t);

        T update(T t);
}
