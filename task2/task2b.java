public class task2b {


    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;


   
        while (i < arr1.length && j < arr2.length) {
            merged[k++] = (arr1[i] < arr2[j]) ? arr1[i++] : arr2[j++];
        }


        while (i < arr1.length) merged[k++] = arr1[i++];
        while (j < arr2.length) merged[k++] = arr2[j++];


        return merged;
    } //


    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};


        for (int num : mergeArrays(arr1, arr2)) {
            System.out.print(num + " ");
        }
    }
}
