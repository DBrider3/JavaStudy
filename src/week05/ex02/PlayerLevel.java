package week05.ex02;

public abstract class PlayerLevel {

    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    final void go (int num) {

        showLevelMessage();
        run();
        for (int i = 0; i < num; i++) {
            jump();
        }
        turn();
    }
}
