package week12.presentation.singleton;

public class GameSettings {
    private static GameSettings instance;

    private int volume = 50;

    private GameSettings() {}

    public static GameSettings getInstance() {
        if(instance == null) {
            instance = new GameSettings();
        }
        return instance;
    }

    public void setVolume(int v) {
        this.volume = v;
    }

    public int getVolume() {
        return volume;
    }
}

class Main {
    public static void main(String[] args) {
        GameSettings setting1 = GameSettings.getInstance();
        GameSettings setting2 = GameSettings.getInstance();

        setting1.setVolume(80);
        setting2.setVolume(20);
    }
}
