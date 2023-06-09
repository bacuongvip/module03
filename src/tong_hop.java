import java.util.Arrays;
import java.util.Scanner;

public class tong_hop {
    static int[] arr1 = {1, 2, 3, 4, 5};
    static int[] arr2 = {6, 7, 8, 9, 10};
    static int[] arr3 = {11, 12, 13, 14, 15};
    public static void main(String[] args) {
        //cho sẵn 3 danh danh sách số nguyên;
        //hiển thị 1 menu với các lựa chọn sau:
        //1 hiển thị 3 mảng số nguyên
        //2.hiển thị mảng đc gộp từ 2 mảng số nguyên, lựa chọn được mảng để gộp
        //3. hiển thị mảng được gộp 3 mảng số ngyên
        //4. chọn 1 mảng số nguyên để in ra
        //4.1 thêm 1 phần tử vào cuối
        //4.2 thêm 1 phần tử vào đầu
        //4.3 xóa 1 phần tử ở vị trí đc chọn
        //5. dừng chương trình
        //
        //chương trình được lặp lại cho đến khi chọn 5.

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("1. Hiển thị các mảng số nguyên");
                System.out.println("2. Gộp 2 mảng số nguyên");
                System.out.println("3. Gộp 3 mảng số nguyên");
                System.out.println("4. Hiển thị 1 mảng");
                System.out.println("5. Dừng chương trình");
                System.out.println("Nhap lua chon : ");
                int choice = new Scanner(System.in).nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Hien thi mang ban dau");
                        showArr(arr1, "mang1 :");
                        showArr(arr2, "mang2 :");
                        showArr(arr3, "mang3 :");
                        break;
                    case 3:
                        System.out.println(Arrays.toString(gop3mang()));
                        break;
                    case 5:
                        System.exit(0);
                }
            }

//            private static int[] gopMang () {
//                System.out.println("Nhap 2 mang ban muon gop: ");
//                int mang = scanner.nextInt();
//                System.out.println("Mang 2: ");
//                int mang2 = scanner.nextInt();
//            }
    }

    public static void showArr(int[] arr, String nameArr){
        System.out.println(nameArr + Arrays.toString(arr));
    }
    public static int[] gop3mang(){
        int[] arr = new int[arr1.length + arr2.length + arr3.length];
        int index = 0;
        for(int e1 : arr1) {
            arr[index] = e1;
            index++;
        }
        for(int e2 : arr2) {
            arr[index] = e2;
            index++;
        }
        for(int e3 : arr3) {
            arr[index] = e3;
            index++;
        }
        return arr;
    }
}
