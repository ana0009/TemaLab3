package tema;

public class Equipment implements IEquipment {
    protected int delay;
    protected int time;	

    public Equipment(int delay) {
        this.delay = delay;
    }

    public Equipment(int time) {
        this.dtime = time;
    }


    public Equipment() {
    }

    public void processPacket(IPacket P){
        P.updateTime(delay);
    }


    @Override
    public void printInfo() {
        System.out.println(" Delay-ul este " + this.delay);
    }
}
