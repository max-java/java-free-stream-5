package com.exemple.HW1_task1;

//делаю домашку первую задачу
public class App {
    public static void main(String[] args) {
        App app = new App();
    }
    public App() {
        fan();
        spoon();
        paper();
        cup();
        glove();
        column();
        postcard();
        folder();
        scissors();
        chair();
    }
    public void fan() {
        System.out.println("1. Вентилятор\n" +
                "\n" +
                "Состояние:\n" +
                "-вкл/выкл\n" +
                "-раздвинут/сдвинут\n" +
                "-разобран/собран\n" +
                "Поведение:\n" +
                "-дует/не дует\n" +
                "-можно поставить в др. место\n");
    }
    public void spoon() {
        System.out.println("2. Ложка\n" +
                "\n" +
                "Состояние:\n" +
                "-не ржавая\n" +
                "-лежит\n" +
                "-грязная\n" +
                "Поведение:\n" +
                "-находится в состоянии пооя\n" +
                "-можно поднести ко рту\n");
    }
    public void paper() {
        System.out.println("3. Лист бумаги\n" +
                "\n" +
                "Состояние:\n" +
                "-чистый\n" +
                "-расписанный\n" +
                "-помят\n" +
                "Поведение:\n" +
                "-находится в папке\n" +
                "-находится в руке\n" +
                "-мнется руками\n");
    }
    public void cup() {
        System.out.println("4. Кружка\n" +
                "\n" +
                "Состояние:\n" +
                "-наполнена водой\n" +
                "-пустая\n" +
                "-стоит на столе\n" +
                "Поведение:\n" +
                "-разбивается\n" +
                "-переносится с места на место\n" +
                "-передвигается вверх вниз\n");
    }
    public void glove() {
        System.out.println("5. Перчатка\n" +
                "\n" +
                "Состояние:\n" +
                "-старая\n" +
                "-теплая\n" +
                "-находится в покое\n" +
                "Поведение:\n" +
                "-носится на руке\n" +
                "-греет\n" +
                "-защищает от мокрого снега\n");
    }
    public void column() {
        System.out.println("6. Колонка\n" +
                "\n" +
                "Состояние:\n" +
                "-вкл/выкл\n" +
                "-теплая\n" +
                "-воспроизводит звук\n" +
                "Поведение:\n" +
                "-стоит на полу\n" +
                "-дребежжит\n" +
                "-моргает\n");
    }
    public void postcard() {
        System.out.println("7. Открытка\n" +
                "\n" +
                "Состояние:\n" +
                "-ровная\n" +
                "-раскрыта\n" +
                "-твердая\n" +
                "Поведение:\n" +
                "-приносит радость\n" +
                "-удивляет\n" +
                "-стоит на полке\n");
    }
    public void folder() {
        System.out.println("8. Папка\n" +
                "\n" +
                "Состояние:\n" +
                "-помята\n" +
                "-твердая\n" +
                "-заполнена\n" +
                "Поведение:\n" +
                "-лежит в шкафу\n" +
                "-мозолит глаз\n" +
                "-находится в покое\n");
    }
    public void scissors() {
        System.out.println("9. Ножницы\n" +
                "\n" +
                "Состояние:\n" +
                "-холодные\n" +
                "-твердые\n" +
                "-острые\n" +
                "Поведение:\n" +
                "-носятся в руке\n" +
                "-режут\n" +
                "-ровняют\n");
    }
    public void chair() {
        System.out.println("10. Стул\n" +
                "\n" +
                "Состояние:\n" +
                "-крепкий\n" +
                "-обтянут кожей\n" +
                "-на высокой ножке\n" +
                "Поведение:\n" +
                "-крутится вокруг своей оси\n" +
                "-спинка наклоняется\n" +
                "-поддерживает осанку");
    }
}