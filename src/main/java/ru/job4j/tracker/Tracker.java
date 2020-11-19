package ru.job4j.tracker;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;

/**
 * Created by Sergey
 */
public class Tracker {

    /**
     * Массив для хранения заявок.
     */
   // private final Item[] items = new Item[100];
List<Item> items= new ArrayList<>();
    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items.add(position++, item);
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private int generateId() {
        Random rm = new Random();
        return (int) (rm.nextLong() + System.currentTimeMillis());
    }


    /**
     * Поиск всех элементов массива без null
     *
     * @return массив без null
     */

        public List<Item> findAll() {
            List<Item> result = new ArrayList<>();
            for (Item item: items) {
                if (item != null) {
                    result.add(item);
                }
            }
            return result;
        }

    /**
     * Поиск по имени
     *
     * @param key
     * @return массив значений найденный по имени
     */
    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item item: items) {
            if (item.getName().equals(key)) {
                result.add(item);
            }
        }
        return result;
    }

    /**
     * Замена заявки
     *
     * @param id
     * @param item
     */
    public boolean replace(int id, Item item) {
        boolean result = false;
        item.setId(id);
                for (int index = 0; index < items.size(); index++) {
                    if (items.get(index).getId()==id) {
                        items.set(index, item);
                        result = true;
                        break;
                    }
                }
                return result;
    }

    /**
     * Поиск по id
     *
     * @param id
     * @return найденная item заявка
     */
    public Item findById(int id) {
        // Находим индекс
        int index = indexOf(id);
        // Если индекс найден возвращаем item, иначе null
        return index != -1 ? items.get(index) : null;
    }

    private int indexOf(int id) {
        int rez = -1;
        int index = 0;
        for (Item item : items) {
            if (item.getId() == id) {
                rez = index;
                break;
            }
            index++;
        }
        return rez;
    }

    /**
     * Удаление заявки по id
     *
     * @param id
     */
    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = false;
        if (index != -1) {
            items.remove(index);
            rsl = true;
        }
        return rsl;
    }
}
