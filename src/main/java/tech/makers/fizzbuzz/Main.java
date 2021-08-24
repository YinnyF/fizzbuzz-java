package tech.makers.fizzbuzz;

public class Main {
    public static void main(String[] args) {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String result = fizzbuzz.generate(100);
        System.out.print(result);
    }
}

