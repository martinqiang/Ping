package martinqiang.ping;

import martinqiang.ping.objects.*;

public class Main {

    private static final int WIDTH = 512, HEIGHT = 512;
    private static final String NAME = "Ping";

    private static Boolean gameRunning = false;

    private static Game game;
    private static Controller controller;
    private static Window window;

    public static void init() {
        window = new Window(NAME, WIDTH, HEIGHT); // Create the game window
        window.add(new Bat(window));
        window.setVisible(true);

        controller = new Controller();

    }

    public static void run() {
        gameRunning = true;

        while (gameRunning){
            update();
            render();
        }

    }

    public static void stop() {
        gameRunning = false;
    }

    public static void update() {
        // Look for key presses and change variables accordingly
        //controller.listen
    }
    public static void render() {
        // Update/render screen
    }

    public static void main(String[] args) {
        init();
        run();
    }
}
