package rael.perso.visitor.model;

public class Studio implements Maison {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
