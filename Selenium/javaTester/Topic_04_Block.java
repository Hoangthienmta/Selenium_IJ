package javaTester;

public class Topic_04_Block {
//    int number;
//    for(number = 1; number <= 100; number++) {
//        // ... Code của bài thực hành số 5 ở đây
//    }
    public void testSomething() {
        int number;
        for(number = 1; number <= 100; number++) {
            // ... Code của bài thực hành số 5 ở đây
        }
    }
    public static void main(String[] args) {
        //Câu lệnh lặp phải nằm trong block
        int number;
        for(number = 1; number <= 100; number++) {
            // ... Code của bài thực hành số 5 ở đây
        }
    }



    //Break and continue
    public void timSoNguyenTo() {
        for (int number = 2; number <= 10000; number++) {
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(number); j++) {
                if(number % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.println("Số nguyên tố là: " + number);
            }
        }
    }
}
