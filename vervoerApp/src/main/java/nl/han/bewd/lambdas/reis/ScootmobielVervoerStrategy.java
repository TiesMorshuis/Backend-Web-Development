package nl.han.bewd.lambdas.reis;

public class ScootmobielVervoerStrategy implements VervoerStrategy{
    @Override
    public int berekenReistijd(boolean isReisTijdensSpits) {
        if (isReisTijdensSpits) {
            return 300;
        } else {
            return 240;
        }
    }
}
