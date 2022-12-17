import customException.InvalidDriverLicense;
import driver.*;
import transport.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void printRace(List<Transport> transports, List<Driver> drivers){

        for(int i = 0; i < transports.size(); i++) {
            for (int j = 0; j < drivers.size(); j++) {
                if(transports.get(i).getDriverLicense().equals(drivers.get(j).getDriverLicense())) {
                    System.out.println("Водитель " + drivers.get(j).getFullName() + " управляет автомобилем " +
                            transports.get(i).getBrand() + " " + transports.get(i).getModel() + " и будет участвовать в заезде");
                    transports.remove(i);
                    drivers.remove(j);
                    i = 0;
                }
                if(drivers.isEmpty()) {
                    return;
                }
            }
        }
    }

    public static void diagnosticsOfCarsBeforeRaces(List<Transport> transport){
        for(Transport veh : transport) {
            if (veh.getClass().toString().contains("Bus")) {
                System.out.println("Автобусу диагностика не требуется");
            } else if (!veh.passDiagnostics()) {
                throw new IllegalArgumentException("Диагностика не пройдена ");
            } else {
                System.out.println("Автомобиль " + veh.getBrand() + " прошел диагностику");
            }
        }
    }

    static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j, (j % 2 == 0) && (i % 2 == 1) ?  "●"
                        : (j % 2 == 1) && (i % 2 == 0) ? "●" : "◯");
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print( j != 7 ? biDemArrList.get(i).get(j) + " " : biDemArrList.get(i).get(j) + "\n");
            }
        }
    }

    public static void main(String[] args) throws InvalidDriverLicense {

        /*Bus firstBus = new Bus("ЛиАЗ", "4292",202f);
        Bus secondBus = new Bus("СитиРитм", "5270GH",220f);
        Bus thirdBus = new Bus("НефАЗ", "43101/43114",270f);
        Bus fourthBus = new Bus("Серпантин", "10",300f);

        PassengerCar firstPassengerCar = new PassengerCar("Kia", "Rio",42.2f);
        PassengerCar secondPassengerCar = new PassengerCar("Chevrolet", "Lanos",60.5f);
        PassengerCar thirdPassengerCar = new PassengerCar("Daewoo", "Matiz",60.2f);
        PassengerCar fourthPassengerCar = new PassengerCar("Opel", "Manta",70f);

        FreightCar firstFreightCar = new FreightCar("Тонар", "4292",610f);
        FreightCar seconFreightCar = new FreightCar("БелАЗ", "75320",4360f);
        FreightCar thirdFreightCar = new FreightCar("MAN", "TGX",280f);
        FreightCar fourthFreightCar = new FreightCar("Hyundai", "Xcient",320f);

        ATypeDriver firstCarDriver = new ATypeDriver("Artiom Evgeneevich", 20);
        DTypeDriver secondCarDriver = new DTypeDriver("Dina Grach", 10);
        DTypeDriver thirdCarDriver = new DTypeDriver("Ivan Ivanov", 2);
        DTypeDriver fourthCarDriver = new DTypeDriver("Gleb Ivanov", 7);
        ATypeDriver fifthCarDriver = new ATypeDriver("Gustav Irod", 7);

        List<Driver> drivers = new ArrayList<>();
        drivers.add(fifthCarDriver);
        drivers.add(firstCarDriver);
        drivers.add(secondCarDriver);
        drivers.add(thirdCarDriver);
        drivers.add(fourthCarDriver);

        List<Transport> transports = new ArrayList<>();
        transports.add(firstBus);
        transports.add(secondBus);
        transports.add(thirdBus);
        transports.add(fourthBus);
        transports.add(firstPassengerCar);
        transports.add(secondPassengerCar);
        transports.add(thirdPassengerCar);
        transports.add(fourthPassengerCar);
        transports.add(firstFreightCar);
        transports.add(seconFreightCar);
        transports.add(thirdFreightCar);
        transports.add(fourthFreightCar);

        diagnosticsOfCarsBeforeRaces(transports);
        printRace(transports, drivers);*/

        SupermarketCheckout supermarketCheckout =  new SupermarketCheckout();
        supermarketCheckout.printQues();
        supermarketCheckout.addPerson("Blog");
        supermarketCheckout.printQues();

        example();
    }
}