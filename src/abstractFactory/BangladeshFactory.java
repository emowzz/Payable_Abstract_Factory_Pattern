package abstractFactory;

import beans.Bangladesh;
import beans.Global;

public class BangladeshFactory implements GlobalAbstractPayableFactory {
    @Override
    public Global createPayable() {
        return new Bangladesh();
    }
}
