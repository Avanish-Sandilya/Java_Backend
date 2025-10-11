package com.example.UniversityCourseManagement.Service;

import java.util.List;

public abstract class BaseService<T> {
    public abstract List<T> getAll();
    public abstract T add(T entity);
    public abstract String delete(Long id);
    public abstract T getById(Long id);
}
