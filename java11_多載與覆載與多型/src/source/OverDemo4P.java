package source;

class One {
}

class Two extends One {
}

class Three extends Two {
}

class Four{
    
}

public class OverDemo4P {

    public One abc() {
        return new One();
    }
}

class OverDemo4C extends OverDemo4P {

    public Two abc() {
        return new Two();
    }
}