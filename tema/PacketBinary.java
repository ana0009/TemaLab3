package tema;

public class PacketBinary extends Packet{
 int numberBytes;

    public PacketBinary(int initialTime, int time, int ipDest, int ipSource, int numberBytes) {
        super(initialTime, time, ipDest, ipSource);
        this.numberBytes = numberBytes;
    }

    @Override
    public String toString() {
        return "PacketBinary" +
                "numberBytes=" + numberBytes;
    }

    public int getNumberBytes() {
        return numberBytes;
    }

    public void setNumberBytes(int numberBytes) {
        this.numberBytes = numberBytes;
    }
}
