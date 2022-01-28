public class longest_subsequence {



        static int max_ref; // stores the LIST


        static int list1(int arr[], int n)
        {

            if (n == 1)
                return 1;


            int res, max_ending_here = 1;


            for (int i = 1; i < n; i++) {
                res = list1(arr, i);
                if (arr[i - 1] < arr[n - 1] && res + 1 > max_ending_here)
                    max_ending_here = res + 1;
            }


            if (max_ref < max_ending_here)
                max_ref = max_ending_here;

            // Return length of LIST ending with arr[n-1]
            return max_ending_here;
        }


        static int list2(int arr[], int n)
        {

            max_ref = 1;


            list1(arr, n);


            return max_ref;
        }

        // driver program to test above functions
        public static void main(String args[])
        {
            int arr[] = { 2,5,15,1,12,56,55,25,10 };
            int n = arr.length;
            System.out.println("Length is "
                    + list2(arr, n) + "\n");
        }




}
