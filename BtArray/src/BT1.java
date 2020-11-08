import java.util.Scanner;

public class BT1 {
    public static boolean isPrime(int n) {
        if ((n<2))
            return false;
        for (int i = 2; i < Math.sqrt(n) ; i++) {
            if (n%i==0)
                return  false;

        }
        return  true;
    }
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        int number;
        int [] array = new int[0];


        while(true) {
            System.out.println("Menu ");
            System.out.println("1. Kiểm tra một số lẻ dương: ");
            System.out.println("2. Kiểm tra một số nguyên tố: ");
            System.out.println("3. Danh sách số ngyên tố: ");
            System.out.println("4. Nhập n phần tử vào mảng và hiển thị:  ");
            System.out.println("5. Danh sách các số nguyên tố ở trong mảng: ");
            System.out.println("6. Kiểm tra số nguyên tố ở trong mảng ");
            System.out.println("7. Kiểm tra giá trị trong mảng ");
            System.out.println("8. Xóa n vừa nhập");
            System.out.println("9. Sắp xếp các phần tử của mảng ");
            System.out.println("0. Exit");
            System.out.print("Lựa chọn: ");
            choice = input.nextInt();
//          Bài 1:
            switch (choice) {
                case 1:
                    number = input.nextInt();
                    if (number % 2 > 0) {
                        System.out.println(number + "là số lẻ dương");
                    } else {
                        System.out.println(number + "Không phải là số lẻ dương");
                    }
                    break;
//          Bài 2:
                case 2:
                    System.out.print("Nhập vào một số: ");
                    number = input.nextInt();
                    boolean bool = isPrime(number);
                    if (bool == true) {
                        System.out.print(number + " là số nguyên tố");
                    } else
                        System.out.print(number + " không phải là số nguyên tố");
                    break;
//          Bài 3:
                case 3:
                    System.out.println("Nhập n số nguyên tố cần hiên thị: ");
                    number = input.nextInt();
                    int count = 0;
                    int n = 2;
                    String str = "";

                    while (count < number) {
                        int i = 2;
                        boolean value = true;
                        while (i <= Math.sqrt(n)) {
                            if (n % i == 0) {
                                value = true;
                                break;
                            }
                            i++;
                        }
                        if (value) {
                            str += n + "";
                            count++;
                        }
                        n++;
                    }
                    System.out.print(str);
                    break;
//                 Bài 4
                case 4:
                    int num;
                    do {
                        System.out.print("Nhập số phần tử trong mảng: ");
                        num = input.nextInt();
                    } while (num < 0);
                    array = new int[num];
                    for (int i = 0; i < num; i++) {
                        System.out.print("Nhập phần tử " + (i + 1) + " : ");
                        array[i] = input.nextInt();
                    }
                    break;
//                 Bài 5
                case 5:
                    System.out.println("Hiển thị mảng: ");
                    for (int a : array) {
                        System.out.print(a + "");
                    }
                    break;
//                 Bài 6
                case 6:
                    String a = "";
                    for (int i = 0; i < array.length; i++) {
                        if (isPrime(array[i])) {
                            a += array[i] + "";
                        }
                    }
                    System.out.print("Số nguyên tố trong mảng" + a);
                    break;
//                 Bài 7
                case 7:
                    System.out.print("Nhập giá trị để kiểm tra: ");
                    int x = input.nextInt();
                    int i;
                    for (i = 0; i < array.length; i++) {
                        if (array[i] == x) {
                            System.out.println("Có một phần tử" + x + " trong mảng và nằm ở vị trí" + i);
                            break;
                        }
                    }
                    if (i == array.length) {
                        System.out.println("Không có phần tử x nào trong mảng");
                    }
                    break;
//                 Bài 8
                case 8:
                    int b, c;
                    System.out.print("Enter the value to be deleted: ");
                    int N = input.nextInt();
                    for (b = c = 0; b < array.length; b++) {
                        if (array[b] != N) {
                            array[c] = array[b];
                            c++;
                        }
                    }
                    System.out.print("Array remaining after the element " + N + " is deleted: ");
                    for (int d : array) {
                        System.out.print(d + " ");
                    }
                    break;
//                 Bài 9
                case 9:
                    int temp;
                    for (int j = 0; j < array.length; j++) {
                        for (int l = j + 1; l < array.length; l++) {
                            if (array[j] > array[l]) {
                                temp = array[j];
                                array[j] = array[l];
                                array[l] = temp;
                            }
                        }
                    }
                    System.out.print("Sorts the array in ascending order: ");
                    for (int f : array) {
                        System.out.print( f + " ");
                    }
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }
}
