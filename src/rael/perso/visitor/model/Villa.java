package rael.perso.visitor.model;

public class Villa implements Maison {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
