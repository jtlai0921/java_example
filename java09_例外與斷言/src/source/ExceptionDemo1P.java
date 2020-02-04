package source;

//自訂例外
class ExcpA extends Exception {
}

class ExcpB extends ExcpA {
}

class ExcpC extends Exception {
}
///////////////////////////////////////////////////////////////////////////////

public class ExceptionDemo1P {

    public void abc() throws ExcpA, ArrayIndexOutOfBoundsException {
    }
}

class ExceptionDemo1C extends ExceptionDemo1P {

    //可丟 ExcpA 或 ExcpB 但不能丟 ExcpC 或 不丟也可以
    public void abc() throws ExcpB, NullPointerException {
    }
}

//////////////////////////////////////////////////////////////////////////////

class ExceptionDemo2P {//父

    public void abc() throws ExcpA {
    }
}

class ExceptionDemo2C extends ExceptionDemo2P {//子

    public void abc() { //子類別可以不丟
    }
}
