package dev.spruce.game.state;

public class StateManager {

    private State currentState;

    public StateManager(State startState) {
        this.currentState = startState;
        this.currentState.init();
    }

    public void update() {
        this.currentState.update();
    }

    public void render() {
        this.currentState.render();
    }

    public void changeState(State newState) {
        this.currentState.end();
        this.currentState = newState;
        this.currentState.init();
    }
}
