package oop.encapsulation.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Sergey
 */
public class Tracker {

    private int ids = 1;
    private int size = 0;
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

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
        items[position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }


    /**
     * Поиск всех элементов массива без null
     *
     * @return массив без null
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }


    /**
     * Поиск по имени
     *
     * @param key
     * @return массив значений найденный по имени
     */
    public Item[] findByName(String key) {

        Item[] rsl = new Item[position];
        for (int index = 0; index < position; index++) {
                if (items[index].getName().equals(key)) {
                    size++;
                }

        }
        rsl = Arrays.copyOf(items, size);
        return rsl;
    }

    /**
     * Замена заявки
     *
     * @param id
     * @param item
     */
    public void replace(String id, Item item) {
        int index = indexOf(id);
        items[index].setName(item.getName());
    }

    /**
     * Поиск по id
     *
     * @param id
     * @return найденная item заявка
     */
    public Item findById(String id) {
        // Находим индекс
        int index = indexOf(id);
        // Если индекс найден возвращаем item, иначе null
        return index != -1 ? items[index] : null;
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

}
