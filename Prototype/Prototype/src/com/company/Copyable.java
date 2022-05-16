package com.company;

// IPrototype

public interface Copyable {
    Object clone();
    // Object, чтобы интерфейс был универсальным.
    // Если напишем Animal, это значит, что интерфейс
    // сможет быть использован только для класса животное,
    // а в нашем случае этот класс может быть любым.
}
