package africa.semicolon.chapterFour;

public class KataTest {
    public static void main(String[] args) {
        Kata kata = new Kata();
        System.out.println("The average is "+ kata.calculateAverage(23, 14, 11));
        System.out.println("Student Grade is "+ kata.calculateGrade(20));
        System.out.println("Even number is "+ kata.isEven(68));

    }
}
