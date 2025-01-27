package automation.dice;

public class Player {
    private String name;
    private int sumTotal = 0;
    private boolean goal = false;

    Player(String name) {
        this.name = name;
    }

    public int getSumTotal() {
        return sumTotal;
    }

    public void addSumTotal(int sum) {
        this.sumTotal += sum;
    }

    public boolean isGoal() {
        return goal;
    }

    public void setGoal(boolean goal) {
        this.goal = goal;
    }

    public String getName() {
        return name;
    }

}
