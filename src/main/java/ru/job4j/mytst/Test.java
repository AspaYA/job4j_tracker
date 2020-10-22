package ru.job4j.mytst;

public class Test {
    public static void main(String[] args) {
        new Test().execute();
        System.out.println("---");
        execute1();
    }

    public void execute() {
        //http://www.nikisoft.ru/blog/java/kak-poluchit-imya-tekushhego-metodaklassa/
        log("Some message");
    }

    public static void execute1() {
        log("Some message");
    }

    public static void log(String message) {
        Throwable t = new Throwable();
        StackTraceElement[] trace = t.getStackTrace();

        // Глубина стэка должна быть больше 1-го, поскольку интересующий
        // нас элемент стэка находится под индексом 1 массива элементов
        // Элемент с индексом 0 - это текущий метод, т.е. log
        if (trace.length > 1) {
            StackTraceElement element = trace[1];
            System.out.format("[%s] [%s, %d] %s", element.getClassName(), element.getMethodName(), element.getLineNumber(), message);
        } else {
            System.out.format("[no info] %s", message);
        }
    }
}