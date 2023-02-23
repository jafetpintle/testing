package Player;
public class Player {
    private Dice dice;
    private int minNumToWin;

    public Player(Dice dice, int minNumToWin) {
        this.dice = dice;
        this.minNumToWin = minNumToWin;
    }

    public boolean play(){
        int diceNumber = dice.roll();

        return diceNumber > minNumToWin? true : false;
    }

}
