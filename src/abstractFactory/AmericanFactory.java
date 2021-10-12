package abstractFactory;

import beans.America;
import beans.Global;

public class AmericanFactory implements GlobalAbstractPayableFactory {
    @Override
    public Global createPayable() {
        return new America();
    }
}
