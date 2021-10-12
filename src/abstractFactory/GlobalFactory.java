package abstractFactory;

import beans.Global;

public class GlobalFactory {

    public static Global createPayable(GlobalAbstractPayableFactory gapf)
    {
        return gapf.createPayable();
    }
}
