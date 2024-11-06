package randomgame;

public class RandomNumber {
    private int correctNumber;

    RandomNumber(){
        correctNumber = (int) (Math.random()*100);
    }


    public int getCorrectNumber() {
        return correctNumber;
    }

    public String inputNumber(int number) {
        if (number < correctNumber ) return "För lågt";
        if (number > correctNumber) return "För högt";
        return "Rätt";
    }
}
