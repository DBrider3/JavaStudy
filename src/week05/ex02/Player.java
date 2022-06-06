package week05.ex02;

public class Player {

    private PlayerLevel level;

    public Player() {
        this.level = new BeginnerLevel();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel pLevel) {
        level = pLevel;
    }

    public void play(int num) {
        level.go(num);
    }
}
