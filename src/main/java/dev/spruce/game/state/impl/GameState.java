package dev.spruce.game.state.impl;

import dev.spruce.game.entity.EntityManager;
import dev.spruce.game.entity.impl.Player;
import dev.spruce.game.state.State;


import static com.raylib.Raylib.*;

public class GameState extends State {

    private EntityManager entityManager;

    @Override
    public void init() {
        entityManager = new EntityManager();
        entityManager.spawn(new Player(new Vector2()));
    }

    @Override
    public void update() {
        entityManager.update();
    }

    @Override
    public void render() {
        entityManager.render();
    }

    @Override
    public void end() {

    }
}
