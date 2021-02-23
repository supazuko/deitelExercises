package africa.semicolon.chapterFour;

public class Kata {
    public String name = "Tunji";

    public double calculateAverage(int firstNumber, int secondNumber, int thirdNumber) {
        double average;
        average = (firstNumber + secondNumber + thirdNumber) / 3.0;
        return average;
    }

    public String calculateGrade(int score) {
        if (score >= 0 && score <= 100) {
            if (score >= 90)
                return "A";
            else if (score >= 80 && score <= 89.9)
                return "B";
            else if (score >= 70 && score <= 79.9)
                return "C";
            else if (score < 70)
                return "F";
        } else
            return "Invalid Score";
        return null;
    }

    public boolean isEven(int number){
        boolean isEven = (number % 2 == 0);
            return isEven;
}
}
