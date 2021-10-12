package abstractFactory;

import beans.Global;
import beans.India;

public class IndiaFactory implements GlobalAbstractPayableFactory {
    @Override
    public Global createPayable() {
        return new India();
    }
}
