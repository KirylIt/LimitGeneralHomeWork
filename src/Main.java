public class Main {
    public static void main(String[] args) {
        // Вам необходимо создать ограниченный обобщённый класс,
        // который может оперировать только числовыми типами данных.
        // В классе должен быть метод,
        // который ищет сумму всех элементов в массиве и выводит её в консоль.
        Integer[] intArray = {1, 2, 3, 4, 5};
        Generation<Integer> integerGeneration = new Generation<>(intArray);
        System.out.println("Сумма значение Integer: " + integerGeneration.generation());

        Double[] doubleGener = {1.1, 2.2, 3.3, 4.4, 5.5};
        Generation<Double> doubleGeneration = new Generation<>(doubleGener);
        System.out.println("Сумма значение Double: " + doubleGeneration.generation());
    }
}