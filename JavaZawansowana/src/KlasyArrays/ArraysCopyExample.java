package KlasyArrays;

public class ArraysCopyExample {
    public static void main(String[] args) {
        int[] numbers1 = {1,2,3,4,5,6,7,8,9};

        int[] numbers2 = new int[numbers1.length];

        System.arraycopy(numbers1,4,numbers2,0,numbers1.length-4);

        for (int num : numbers2){
            System.out.println(num + " ");
        }
    }
}
