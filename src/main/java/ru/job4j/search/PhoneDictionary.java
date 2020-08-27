package ru.job4j.search;

import java.util.ArrayList;

/**
 * Created by Sergey
 */
public class PhoneDictionary {

    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();

        for (Person value : persons) {
            if (persons.contains(value)) {
                result = persons;

            }
        }
            return result;
    }

}
