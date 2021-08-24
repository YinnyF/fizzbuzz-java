package tech.makers.fizzbuzz;

public class Fizzbuzz {
    public String generate(Integer upto) {
        String[] strArray = new String[upto];

        // put strings in array of chars
        for (int i = 0; i < upto; i++) {
            if ((i + 1) % 15 == 0) {
                strArray[i] = "FizzBuzz";
            } else if ((i + 1) % 3 == 0) {
                strArray[i] = "Fizz";
            } else if ((i + 1) % 5 == 0 ) {
                strArray[i] = "Buzz";
            } else {
                strArray[i] = Integer.toString(i + 1);
            }
        }

        // convert array of strings into a single string separated with a comma
        return String.join(", ", strArray);
    }
}
