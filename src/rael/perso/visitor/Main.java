package rael.perso.visitor;

import rael.perso.visitor.model.Passant;
import rael.perso.visitor.model.Studio;
import rael.perso.visitor.model.Villa;

public class Main {
    public static void main(String[] args) {
        Passant passant = new Passant();

        Villa villa = new Villa();
        Studio studio = new Studio();

        passant.visit(villa);
        passant.visit(studio);
    }
}
