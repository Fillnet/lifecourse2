import java.util.ArrayList;

public class Main {
enum Colors{
    RED,
    BLUE,
    YELLOW,
    GREEN
}
    public static void main(String[] args) {
Colors red = Colors.RED;
        System.out.println(red);
        System.out.println();
        ArrayList list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        {
            int i =0;
            while (i < list.size()) {
                System.out.print(list.get(i)+" ");
                i++;
            }
            System.out.println();
            for (i = 0; i < list.size(); i++) {
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
            for (Object s : list) {
                System.out.print(s+" ");
            }
        }
    }
}