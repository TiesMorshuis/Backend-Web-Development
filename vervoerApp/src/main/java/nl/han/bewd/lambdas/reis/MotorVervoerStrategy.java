package nl.han.bewd.lambdas.reis;

public class MotorVervoerStrategy implements VervoerStrategy {
    @Override
    public int berekenReistijd(boolean isReidenTijdensSpits) {
        if (isReidenTijdensSpits) {
            return 35;
        } else {
            return 30;
        }
    }

}
