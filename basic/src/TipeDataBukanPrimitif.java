public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
         Integer iniInteger = 100;
         Long iniLong = 100000L;
         Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

        // konversi dari primitf ke non primitif
        int iniInt = 100;
        Integer iniObject = iniInt;

        System.out.println(iniObject);

        // berbeda type

        short iniShort = iniObject.shortValue();
        System.out.println(iniShort);
    }
}
