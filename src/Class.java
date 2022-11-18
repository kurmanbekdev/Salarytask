import java.util.Arrays;

public class Class {
    private int number;
    private String word;
    private int array;

    public Class(int number, String word, int array) {
        this.number = number;
        this.word = word;
        this. array = array;
    }

    @Override
    public String toString() {
        return "Class || " +
                "number=" + number +
                ", word= " + word + '\'' +
                ", array=" + array +
                " ||";
    }
}
