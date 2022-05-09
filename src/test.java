import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 4, 5, 7};
        System.arraycopy(arr, 3, arr, 2, 3);
        //копирует три символа начиная с 4 символа (457) и вставляет в массив начиная с третьего (8)


        //Arrays.copyOf(arr, 5);// чтобы метод скопировал массив и задал ему новую длинну надо присвоить его массиву
        arr = Arrays.copyOf(arr, 5);
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
