package driver;
import customException.InvalidDriverLicense;
import transport.FreightCar;

public class CTypeDriver extends Driver<FreightCar>{

    public CTypeDriver(String fullName, Integer experience) throws InvalidDriverLicense {
        super(fullName, "C", experience);
    }
}
