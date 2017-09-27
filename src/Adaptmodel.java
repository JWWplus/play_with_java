/**
 * author: jiangweiwei
 */

interface DBinterface {
    void powerWithTwo();
}

interface GBinterface {
    void powerWithThree();
}

class DBsocket implements DBinterface {
    @Override
    public void powerWithTwo() {
        System.out.println("德标两个接口");
    }
}

class GBsocket implements GBinterface {
    @Override
    public void powerWithThree() {
        System.out.println("国标三个接口");
    }
}

class Hotel {

    //旅馆中有一个德标的插口
    private DBinterface dbSocket;

    public Hotel(){}

    public Hotel(DBinterface dbSocket) {
        this.dbSocket = dbSocket;
    }

    public void setSocket (DBinterface dbSocket){
        this.dbSocket = dbSocket;
    }

    //旅馆中有一个充电的功能
    public void charge(){

        //使用德标插口充电
        dbSocket.powerWithTwo();
    }
}

public class Adaptmodel implements DBinterface{
    private GBinterface GBsocket;

    public Adaptmodel(GBinterface gBinterface) {
        this.GBsocket = gBinterface;
    }

    @Override
    public void powerWithTwo() {
        GBsocket.powerWithThree();
    }
}

class TestAdapt {
    public void test() {
        GBinterface gBinterface = new GBsocket();
        Hotel hotel = new Hotel();
        Adaptmodel adaptmodel = new Adaptmodel(gBinterface);
        hotel.setSocket(adaptmodel);

        hotel.charge();
    }
}