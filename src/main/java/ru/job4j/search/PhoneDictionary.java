package ru.job4j.search;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class PhoneDictionary {

    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person: persons) {
            if ((contains(person.getSurname(), key))
                    || (contains(person.getName(), key))
                    || (contains(person.getPhone(), key))
                    || (contains(person.getAddress(), key))) {
                result.add(person);
            }
        }
        return result;
    }

    public static boolean contains(String val1, String val2) {
        return (val1).toLowerCase().contains(val2.toLowerCase());
    }
}
