public class Array {
    public static void main(String[] args) {
        String[] stringArray = new String[3];

        stringArray[0] = "Tommy";
        stringArray[1] = "Shanum";
        stringArray[2] = "Test";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        int[] arrayInt = {1,2,3,4};

        String[][] members = {
                {"Test", "Java"},
                {"Tommy", "Alhamra"},
                {"Shanum", "Ina"},
        };

        System.out.println(members[0][0]);

        String[] namaTeman = {"Tommy", "Irfan", "Doni"};
        System.out.println(namaTeman[1]);
    }
}
