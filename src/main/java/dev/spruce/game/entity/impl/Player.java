package dev.spruce.game.entity.impl;

import dev.spruce.game.entity.Entity;

import static com.raylib.Colors.BLACK;
import static com.raylib.Raylib.*;

public class Player extends Entity {

    public Player(Vector2 position) {
        super(position);
    }

    @Override
    public void update() {
        Vector2 velocity = Vector2Zero();

        if (IsKeyDown(KEY_W)) {
            velocity.y(velocity.y() - 1);
        }

        if (IsKeyDown(KEY_S)) {
            velocity.y(velocity.y() + 1);
        }

        if (IsKeyDown(KEY_A)) {
            velocity.x(velocity.x() - 1);
        }

        if (IsKeyDown(KEY_D)) {
            velocity.x(velocity.x() + 1);
        }

        if (Vector2Length(velocity) > 0) {
            velocity = Vector2Normalize(velocity);
        }

        velocity = Vector2Scale(velocity, 1000 * GetFrameTime());

        this.position = Vector2Add(this.position, velocity);
    }

    @Override
    public void render() {
        DrawRectangle((int) getPosition().x(), (int) getPosition().y(), 100, 100, BLACK);
    }
}
