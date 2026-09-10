package Functions;

//What will be the output?

public class num {

    static void change(int x) {
        x = 20;
    }

    public static void main(String[] args){
        int x = 10;

        change(x);

        System.out.println(x);
    }
}
