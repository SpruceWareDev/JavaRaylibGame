package dev.spruce.game.state.impl;

import dev.spruce.game.state.State;

import static com.raylib.Colors.*;
import static com.raylib.Raylib.DrawRectangle;

public class GameState extends State {

    @Override
    public void init() {

    }

    @Override
    public void update() {

    }

    @Override
    public void render() {
        DrawRectangle(100, 100, 100, 100, BLACK);
    }

    @Override
    public void end() {

    }
}
