package tema;

public class PacketText extends Packet{

    private int numberLetters;


    public int getNumberLetters(){return numberLetters;}

    public PacketText(int nLetters)
    {
      numberLetters=nLetters;
    };
}
