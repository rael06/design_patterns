package rael.perso.visitor.model;

public class Passant implements Visitor {
    @Override
    public void visit(Villa villa) {
        System.out.println("Elle est grande la " + villa.getClass().getSimpleName());
    }

    @Override
    public void visit(Studio studio) {
        System.out.println("Il est petit le " + studio.getClass().getSimpleName());
    }
}
