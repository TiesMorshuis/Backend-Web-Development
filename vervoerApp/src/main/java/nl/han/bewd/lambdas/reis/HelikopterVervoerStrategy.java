package nl.han.bewd.lambdas.reis;

public class HelikopterVervoerStrategy implements VervoerStrategy {
    @Override
    public int berekenReistijd (boolean isReisTijdesnSpits) {
        return 10;
    }
}
