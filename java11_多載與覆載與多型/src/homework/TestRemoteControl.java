package homework;

interface RemoteControl {

    public String getName();

    public String turnOn();

    public String turnOff();
}
//冷氣遙控器類別
class AirConditioner implements RemoteControl {

    private String name;

    public AirConditioner(String cTemp) {
        this.name = cTemp;
    }

    public String getName() {
        return this.name;
    }

    public String turnOn() {
        return "AirConditioner ON";
    }

    public String turnOff() {
        return "AirConditioner OFF";
    }
}
//電動門遙控器類別
class ElectronicDoor implements RemoteControl {

    private String name;

    public ElectronicDoor(String cTemp) {
        this.name = cTemp;
    }

    public String getName() {
        return this.name;
    }

    public String turnOn() {
        return "ElectronicDoor ON";
    }

    public String turnOff() {
        return "ElectronicDoor OFF";
    }
}

public class TestRemoteControl {

    public static void main(String[] args) {
        Operater(new AirConditioner("Pansonic"));
        Operater(new ElectronicDoor("National"));
    }

    //Super Remote Controller
    public static void Operater(RemoteControl oRC) {
        System.out.println("RemoteName: " + oRC.getName());
        System.out.println(oRC.turnOn());
        System.out.println(oRC.turnOff());
    }
}

//RemoteName: Pansonic
//AirConditioner ON
//AirConditioner OFF
//RemoteName: National
//ElectronicDoor ON
//ElectronicDoor OFF