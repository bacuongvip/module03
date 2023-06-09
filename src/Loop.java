import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so bat ki: ");
        int snt = Integer.parseInt(sc.nextLine());
        for(int i = 2; i < snt; i++) {
            boolean check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.println(i);
            }
        }
    }
}
