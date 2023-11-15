public class rotationInArray {
    public static void main(String args[]) {
        int array[] = { 1, 2, 3, 4, 5 };
        int k = 2;
        int j = 0;
        while (j < k) {

            int temp = array[4];
            for (int i = 4; i >= 1; i--) {

                array[i] = array[i - 1];

            }
            array[0] = temp;
            j++;

        }
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i]);
        }

    }
}