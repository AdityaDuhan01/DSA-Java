public class linears {
    public static void main(String[] args) {

        int arr[] = {11, 34, 67, 88, 90};
        int target = 67;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println("Element found at index " + i);
                break;
            }

        }
    }
}