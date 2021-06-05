package com.harbor.example.module.classes.domain;

import com.harbor.example.module.shared.domain.ClassId;

import java.util.List;
import java.util.Optional;

public interface ClassRepository {
    void save(Class newClass);

    Optional<Class> search(ClassId id);

    void remove(ClassId id);

    List<Class> searchAll();
}
