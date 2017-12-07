package Homework.Task_2;

public class Main {
    public static void main(String[] args) {
        try {
            Plants plants[] = new Plants[]{
                    new Plants("rose", "white", 5),
                    new Plants("orchid", "red", 3),
                    new Plants("chamomile", "white", 7),
                    new Plants("chamomile", "blue", 2),
                    new Plants("rose", "red", 6),
            };
        } catch (ColorException e) {
            e.printStackTrace();
        } catch (TypeException e) {
            e.printStackTrace();
        }
        try {
            Plants pl = new Plants("rose", "blue", 5);
            System.out.println(pl);
        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage() + "\n");
            //e.printStackTrace();
        }
    }

}
