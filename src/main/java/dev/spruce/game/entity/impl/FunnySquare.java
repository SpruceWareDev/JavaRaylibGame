package dev.spruce.game.entity.impl;

import dev.spruce.game.entity.Entity;

import static com.raylib.Colors.BLACK;
import static com.raylib.Raylib.DrawRectangle;

public class FunnySquare extends Entity {

    public FunnySquare(float x, float y) {
        super(x, y);
    }

    @Override
    public void update() {

    }

    @Override
    public void render() {
        DrawRectangle((int) getX(), (int) getY(), 100, 100, BLACK);
    }
}
