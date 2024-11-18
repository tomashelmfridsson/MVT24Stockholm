package solidus;

public class Solidus {
    private int solidus;
    private int startAmount = 5;
    private int goldMemberAmount = 20;
    private int loginAmount = 1;
    private int hoodiePrice = 20;
    private int tshirtPrice = 15;
    private int stickersPrice = 5;

    public Solidus() {
        this.solidus = 5;
    }

    public int getSolidus() {
        return solidus;
    }

    public void login() {
        this.solidus++;
    }

    public boolean withdraw(int withdrawAmount) {
        if (withdrawAmount <= this.solidus) {
            this.solidus -= withdrawAmount;
            return true;
        } else return false;
    }

    public void goldMember() {
        this.solidus += 20;
    }

    public boolean buyHoodie() {
        if (20 <= this.solidus) {
            this.solidus -= 20;
            return true;
        } else return false;
    }

    public boolean buyTshirt() {
        if (15 <= this.solidus) {
            this.solidus -= 15;
            return true;
        }else return false;
    }

    public boolean buyStickers() {
        if (5 <= this.solidus) {
            this.solidus -= 5;
            return true;
        } else return false;
    }
}

