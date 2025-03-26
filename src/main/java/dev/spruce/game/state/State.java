package dev.spruce.game.state;

public abstract class State {
    public abstract void init();
    public abstract void update();
    public abstract void render();
    public abstract void end();
}
