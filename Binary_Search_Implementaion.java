package data_structure;
public class Binary_Search_Implementaion {
    public static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (key == arr[mid]) {
                return arr[mid];
            }
            if (key < arr[mid]) {
                high = mid - 1;

            } if (key > arr[mid]) {
                low = mid + 1;
            }

        }
        return -1;
    }
        public static void main (String[]arg)
        {

          int arr[]={1,2,3,4,5,6,7,8,9};
            int result=binarySearch(arr,10);
            System.out.println(result);
        }
    }

