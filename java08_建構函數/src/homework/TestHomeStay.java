package homework;

public class TestHomeStay {

    public int numOfHomeStays = 4;
    public HomeStay allHomeStays[] = new HomeStay[numOfHomeStays];

    public void addRoom(int homestayNum, String roomID) {
        if (allHomeStays[homestayNum].addRoom(roomID)) {
            System.out.println("Room is added");
        } else {
            System.out.println("A homestay can have only 4 rooms!");
        }
    }

    public void reserve(int homestayNum, int roomNum, String customerName) {
        int status = allHomeStays[homestayNum].reserve(roomNum, customerName);
        switch (status) {
            case 0:
                System.out.println("Reservation is OK");
                break;
            case 1:
                System.out.println("Room is reserved by someone else");
                break;
        }
    }

    public void checkIn(int homestayNum, int roomNum, String customerName, int numOfGuests) {
        int status = allHomeStays[homestayNum].checkIn(roomNum, customerName, numOfGuests);
        switch (status) {
            case 0:
                System.out.println("Check in is OK");
                break;
            case 1:
                System.out.println("Room is reserved by someone else");
                break;
            case 2:
                System.out.println("Room is checked in by someone else");
                break;
        }
    }

    public void checkOut(int homestayNum, int roomNum) {
        int status = allHomeStays[homestayNum].checkOut(roomNum);
        switch (status) {
            case 0:
                System.out.println("Check out is OK");
                break;
            case 1:
                System.out.println("Room is NOT checked in");
                break;
        }
    }

    public void run() {

        allHomeStays[0] = new HomeStay("MoonRiver");
        allHomeStays[1] = new HomeStay("LakeSide");
        allHomeStays[2] = new HomeStay("CreekSide");
        allHomeStays[3] = new HomeStay("OceanSide");

        addRoom(0, "A1");
        addRoom(0, "A2");
        addRoom(0, "B1");
        addRoom(0, "B2");
        addRoom(0, "C");
        addRoom(1, "MoonLake");
        addRoom(1, "SunLake");
        addRoom(2, "Turkey Run");
        addRoom(2, "Potomac Creek");
        addRoom(3, "Pacific");

        reserve(0, 1, "Ben Wu");
        reserve(0, 3, "David Chen");
        reserve(0, 1, "Emily Hwang");
        reserve(2, 1, "Fred Lin");
        reserve(3, 0, "Uli Chien");

        checkIn(0, 1, "Ben Wu", 3);
        checkIn(0, 3, "Nancy Chen", 3);
        checkIn(0, 3, "David Chen", 3);
        checkIn(0, 2, "Gary Ma", 3);
        checkIn(1, 1, "Hellen Kao", 3);

        checkOut(1, 1);
        checkOut(2, 1);

        System.out.println(allHomeStays[1].getUnreservedRooms());

        System.out.println(allHomeStays[3].getUnCheckInRooms());
    }

    public static void main(String[] args) {
        TestHomeStay myApp = new TestHomeStay();
        myApp.run();
    }
}

/*
 本程式的輸出應為:
 Room is added
 Room is added
 Room is added
 Room is added
 A homestay can have only 4 rooms!
 Room is added
 Room is added
 Room is added
 Room is added
 Room is added
 Reservation is OK
 Reservation is OK
 Room is reserved by someone else
 Reservation is OK
 Reservation is OK
 Check in is OK
 Room is reserved by someone else
 Check in is OK
 Check in is OK
 Check in is OK
 Check out is OK
 Room is NOT checked in
 MoonLake
 SunLake

 Pacific

 */
class HomeStayRoom {

    private String roomID;
    private String customerName;
    private int numOfGuests;
    private boolean isReserved;
    private boolean isCheckIn;

    public HomeStayRoom(String someRoomID) {
        roomID = someRoomID;
        customerName = "";
        numOfGuests = 0;
        isReserved = false;
        isCheckIn = false;
    }

    public String getRoomID() {
        return roomID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getNumOfGuests() {
        return numOfGuests;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public boolean isCheckIn() {
        return isCheckIn;
    }

    public int reserve(String someCustomerName) {
        if (isReserved) {
            if (customerName.equals(someCustomerName)) {
                return 0;
            } else {
                return 1;
            }
        } else {
            customerName = someCustomerName;
            isReserved = true;
            isCheckIn = false;
            return 0;
        }
    }

    public int checkIn(String someCustomerName, int someNumOfGuests) {
        if (isReserved) {
            if (!isCheckIn) {
                if (someCustomerName.equals(customerName)) {
                    numOfGuests = someNumOfGuests;
                    isCheckIn = true;
                    return 0;
                } else {
                    return 1;
                }
            } else if (someCustomerName.equals(customerName)) {
                numOfGuests = someNumOfGuests;
                return 0;
            } else {
                return 2;
            }
        } else {
            isReserved = true;
            isCheckIn = true;
            customerName = someCustomerName;
            numOfGuests = someNumOfGuests;
            return 0;
        }
    }

    public int checkOut() {
        if (isCheckIn) {
            isCheckIn = false;
            isReserved = false;
            customerName = "";
            numOfGuests = 0;
            return 0;
        } else {
            return 1;
        }
    }
}

class HomeStay {

    public int numOfRooms = 4;   //房間的數量 , 最多 4 間
    public int nowaddRoomNum;    //已設定的房間數量 , 不能超過 numofRooms
    public String homestayName;  //民宿的名稱
    public HomeStayRoom[] newRoom = new HomeStayRoom[numOfRooms];  //一間民宿有 4 間房間

    public HomeStay(String homestayName) {
        nowaddRoomNum = 0; //先將民宿要設定的房間數歸 0
        this.homestayName = homestayName;  //設定民宿的民稱
    }

    public boolean addRoom(String roomID) {

        //已設定的房間數不能超過規定的數量
        if (nowaddRoomNum >= numOfRooms) { // 如 房間數只有 4 間 , [ 0 , 1 , 2 , 3] 就不能超過 4

            return false;
        } else {
            newRoom[nowaddRoomNum] = new HomeStayRoom(roomID);
            nowaddRoomNum++; //每次設定一間房間 就 把房間數 + 1
            return true;
        }
    }

    public int reserve(int roomNum, String customerName) {
        return newRoom[roomNum].reserve(customerName);  // 預約房間
    }

    public int checkIn(int roomNum, String customerName, int numOfGuests) {
        return newRoom[roomNum].checkIn(customerName, numOfGuests); // checkIn房間
    }

    public int checkOut(int roomNum) {
        return newRoom[roomNum].checkOut(); // checkOut房間
    }

    public String getUnreservedRooms() {
        String name = "";
        for (int i = 0; i < 3; i++) { //把未被預約的房間印出來 , 但必須扣除未被設定的房間

            if (newRoom[i] != null && newRoom[i].isReserved() == false) {
                name = name + newRoom[i].getRoomID() + "\n";  //將未被預約的房間組合
            }
        }
        return name;
    }

    public String getUnCheckInRooms() {
        String name = "";
        for (int i = 0; i < 3; i++) { //把未被checkIn的房間印出來 , 但必須扣除未被設定的房間

            if (newRoom[i] != null && newRoom[i].isCheckIn() == false) {
                name = name + newRoom[i].getRoomID() + "\n";   //將將未被checkIn的房間組合
            }
        }
        return name;
    }
}
