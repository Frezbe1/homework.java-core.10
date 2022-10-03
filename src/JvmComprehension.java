public class JvmComprehension { // Classloader подгружает класс JvmComprehension
    // в Metaspace для сохранения данных о классе.

    public static void main(String[] args) { // В момент вызова метода main создается фрейм в Stack Memory.
        int i = 1;                      // Во фрейме main создается переменная i со значением 1.
        Object o = new Object();        // В куче создается новый Object
        // и во фрейме мейн создается переменная о, которому присваивается ссылка на Object
        Integer ii = 2;                 // В куче создается объект Integer со значением 2,
        // а во фрейме main появляется переменная ii со ссылкой на этот объект.
        printAll(o, i, ii);             // В момент вызова метода printAll создается фрейм в Stack Memory,
        // в котором используются переменные o, i, ii.
        System.out.println("finished"); // В Stack Memory создается фрейм println,
        // которому передается ссылка на созданный в куче объект String со значением "finished".
        // В ходе работы программы отрабатывает Garbage Collector.
    }

    private static void printAll(Object o, int i, Integer ii) { //
        Integer uselessVar = 700;                   // В куче создается объект Integer со значением 700,
        // а во фрейме  printAll появляется переменная uselessVar со ссылкой на этот объект.
        System.out.println(o.toString() + i + ii);  // В Stack Memory создается фрейм println,
        // куда передаются ссылки на Object o, int i и Integer ii. В Stack Memory созается фрейм toString.
    }
}