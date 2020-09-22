package rael.perso.strategy.model;

public class Saumon {
    private Strategy strategy;

    public void cuire() {
        strategy.cuire();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
