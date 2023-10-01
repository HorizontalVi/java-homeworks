package generics.task1;

public class Main {
    public static void main(String[] args) {
        Box<String> sample1 = new Box<>("Runtime");
        System.out.println(sample1);
        // параметризируем класс типом Integer
        Box<Integer> sample2 = new Box<>(1);
        // В параметрах приведенного типа был записан String хотя подается тип Integer
        System.out.println(sample2);
        // параметризируем класс типом Boolean
        Box<Boolean> sample3 = new Box<>(Boolean.TRUE);
        System.out.println(sample3);
    }
}
