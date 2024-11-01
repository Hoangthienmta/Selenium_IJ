package javaTester;

public class Topic_05_Array {
    int[] myArray = new int[10];
    // Mảng là tập hợp các phần tử có chung một kiểu dữ liệu
    //Khởi tạo các giá trị của mảng với giá trị bằng không
    boolean[] khoitao = new boolean[3];
    //Khởi tạo mang với gia trị là false
    //Giá trị khởi tạo default tương ứng voi gia tri ban đầu
    int[] ArrayWithInt = {1, 2, 3};

    int[] array;
    public static void main(String args[]) {
//        int[] myArray = {1, 2, 4, 7, 8};
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println("Phần tử thứ " + i + " có giá trị " + myArray[i]);
//        }
        int[] myArray = { 3, 5, 7, 30, 10, 5, 8, 23, 0, -5 };
        int count = myArray.length;
        int sum = 0;
        double avg;
        for(int i = 0; i < count; i++) {
            sum += myArray[i];
        }
        avg = sum/count;
    }


    //Một số khái niệm về foreach -> Sinh ra để làm việc với mảng


}
