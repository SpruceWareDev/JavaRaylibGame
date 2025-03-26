package dev.spruce.game;

import dev.spruce.game.state.StateManager;
import dev.spruce.game.state.impl.GameState;

import static com.raylib.Colors.RAYWHITE;
import static com.raylib.Raylib.*;

public class Game {

    private static Game instance;

    private static StateManager stateManager;

    public void init() {
        InitWindow(800, 600, "Test Game :3");
        SetTargetFPS(60);
        stateManager = new StateManager(new GameState());
    }

    public void run() {
        while (!WindowShouldClose()) {
            stateManager.update();
            BeginDrawing();
            ClearBackground(RAYWHITE);
            DrawFPS(6, 6);
            stateManager.render();
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
