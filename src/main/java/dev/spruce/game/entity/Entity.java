package dev.spruce.game.entity;

import com.raylib.Raylib.*;

public abstract class Entity {

    protected Vector2 position;

    public Entity(Vector2 position) {
        this.position = position;
    }

    public abstract void update();
    public abstract void render();

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }
}

