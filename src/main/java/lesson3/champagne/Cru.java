package lesson3.champagne;

public enum Cru {
    AUTRE(80),PREMIER(90),GRAND(100);

    private int Quality;

    Cru(int quality) {
        Quality = quality;
    }

    public int getQuality() {
        return Quality;
    }
}




//
//Написать перечисление Cru с тремя элементами - AUTRE, PREMIER и GRAND.
//Добавить в перечисление поле int quality и сопоставить это "качество" каждому из элементов
// AUTRE(80), PREMIER(90) и GRAND(100)
//
//
//Напишите класс даты MyDate с полями int year, month, day
//Напишите функцию void add(int days), меняющую дату на это количество дней.
// Важно принять в расчет количество дней в каждом из месяцев и является ли какой-либо год високосным.
//Для определения високосности желательно проконсультироваться со статьей на вики.
//Не нужно использовать иные классы или библиотеки для работы с датой.
//Ссылка на проект