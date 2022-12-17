package driver;
import customException.InvalidDriverLicense;
import transport.Bus;

public class DTypeDriver extends Driver<Bus>{

    public DTypeDriver(String fullName, Integer experience) throws InvalidDriverLicense {
        super(fullName, "D", experience);
    }
}
