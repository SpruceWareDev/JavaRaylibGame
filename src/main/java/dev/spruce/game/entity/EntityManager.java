package dev.spruce.game.entity;

import java.nio.file.CopyOption;
import java.util.concurrent.CopyOnWriteArrayList;

public class EntityManager {

    private CopyOnWriteArrayList<Entity> entities;

    public EntityManager() {
        this.entities = new CopyOnWriteArrayList<>();
    }

    public void spawn(Entity entity) {
        this.entities.add(entity);
    }

    public void despawn(Entity entity) {
        entities.remove(entity);
    }

    public void update() {
        for (Entity entity : entities) {
            entity.update();
        }
    }

    public void render() {
        for (Entity entity : entities) {
            entity.render();
        }
    }

    public CopyOnWriteArrayList<Entity> getEntities() {
        return entities;
    }
}
