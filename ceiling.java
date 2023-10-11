/**
 * ceiling
 */
public class ceiling {

    public static void main(String[] args) {
        int arr [] = { 2,3,5,9,14,16,18};
        int target = 15;
        int answer = binarySearch(arr, target);
        System.out.println(answer);
        
    }


    //function of binary search

    static int binarySearch (int arr[] , int target)
    {

        if (target > arr[arr.length-1])
        {
            return -1;
        }
        int start = 0;
        int end =arr.length-1;

        //to check its ascending or desecnding

        boolean isAscending ;
        {

            if(arr[start] < arr[end])
            {
                isAscending = true;
            }
            else{
                isAscending=false;
            }
        }

        while ( start <= end )
        {
            int mid = start + (end - start);

            if(arr[mid] == target)
            {
                return mid;
            }

            if(isAscending)
            {
                if(target < arr[mid])
                {
                    end = mid -1 ;
                }

                else if (target < arr[mid])
                {
                    start= mid +1;
                }

            }

            else
            {
                 if(target > arr[mid])
                {
                    end = mid -1 ;
                }

                else if (target < arr[mid])
                {
                    start= mid +1;
                }
            }



        }

        return start;


    }
}
