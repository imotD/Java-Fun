public class Main {

    public static  String[] model = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
       viewShowTodoList();
    }

    //view todoList
    public static void showTodoList() {

        System.out.println("## TODOLIST");

        for( var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if(todo != null){
                System.out.println(no +". "+ todo );
            }
        }
    }

    public static void testShowTodoList() {
        model[0] = "Belajar java Dasar";
        model[1] = "Belajar Javascript";

        showTodoList();
    }

    //add todoList
    public static void addTodoList(String todo){
        //cek model
        var isfull = true;
        for (int item = 0; item < model.length; item++) {

            if(model[item] == null){
                isfull = false;
                break;
            }
        }

        //update resize array
        if(isfull){
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length ; i++) {
                model[i] = temp[i];
            }
        }

        // add data ke posisi array yang null
        for(var i = 0; i < model.length; i++){
            if(model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    // removeTodoList
    public static boolean removeTodoList(Integer number) {

        if (number -1 >= model.length){
            return  false;
        } else if ( model[number-1] == null){
            return false;
        } else {
            for (int i = number - 1; i < model.length ; i++) {
                if(i == model.length - 1){
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }
            }

            return  true;
        }
    }

    public static void testRemoveTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");

        var result = removeTodoList(20);
        System.out.println(result);

        result = removeTodoList(4);
        System.out.println(result);

        result =removeTodoList(1);
        System.out.println(result);

        showTodoList();
    }


    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput(){
        var name = input("Nama");
        System.out.println("Hi " + name);

        var channel = input("Channel");
        System.out.println(channel);
    }


    // View Page

    public static void viewShowTodoList() {
        while (true) {
            showTodoList();

            System.out.println("## MENU: ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");

            if(input.equals("1")){
                viewAddTodoList();
            } else if (input.equals("2")) {
                viewRemoveTodoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("==> Pilih sesuai menu");
            }
        }

    }

    public static void testviewShowTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");

        viewShowTodoList();
    }

    public  static void viewAddTodoList(){
        System.out.println("## MENAMBAH TODOLIST");

        var todo = input("Todo (tekan x jika batal)");
        if(todo.equals("x")){
            //cancel
        } else {
            addTodoList(todo);
        }
    }

    public  static void testViewAddTodoList(){

        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");

        viewAddTodoList();

        showTodoList();
    }


    public  static void viewRemoveTodoList(){
        System.out.println("## MENGHAPUS TODOLIST");

        var number = input("Pilih nomor yang ingin Dihapus (tekan x jika batal)");

        if(number.equals("x")){
            //batal
        }else {
            var success = removeTodoList(Integer.valueOf(number));
            if(!success){
                System.out.println("Gagal menghapus todolist: " + number);
            }
        }

    }
    public  static void testViewRemoveTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");

        showTodoList();
        viewRemoveTodoList();
        showTodoList();
    }

}