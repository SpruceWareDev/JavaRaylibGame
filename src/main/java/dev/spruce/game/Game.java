package dev.spruce.game;

import static com.raylib.Colors.RAYWHITE;
import static com.raylib.Colors.VIOLET;
import static com.raylib.Raylib.*;

public class Game {

    private static Game instance;

    public void init() {
        InitWindow(800, 600, "Test Game :3");
        SetTargetFPS(60);
    }

    public void run() {
        while (!WindowShouldClose()) {
            BeginDrawing();
            ClearBackground(RAYWHITE);
            DrawText("Hello world", 190, 200, 20, VIOLET);
            DrawFPS(20, 20);
            EndDrawing();
        }
        CloseWindow();
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }
}
