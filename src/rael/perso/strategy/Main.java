package rael.perso.strategy;

import rael.perso.strategy.model.Saumon;
import rael.perso.strategy.model.Strategy;
import rael.perso.strategy.model.StrategyFour;
import rael.perso.strategy.model.StrategyPoele;

public class Main {
    public static void main(String[] args) {
        Saumon saumon = new Saumon();
        Strategy strategyFour = new StrategyFour();
        Strategy strategyPoele = new StrategyPoele();

        saumon.setStrategy(strategyFour);
        saumon.cuire();

        saumon.setStrategy(strategyPoele);
        saumon.cuire();
    }
}
