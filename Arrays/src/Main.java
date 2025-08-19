public class Main {
    //linear search
    public static int linearSearch(int[] arr, int key){
       for(int i=0; i<arr.length;i++){
           if(arr[i]==key){
               return i;
           }
       }
       return -1;
    }

    //binary search
    public static int binarySearch(int[] arr,int key){
        int low=0;
        int high=arr.length-1;
        while(high>low){
            int mid = (high+low)/2;
            if(arr[mid]==key){
                return mid;
            } else if (key>mid) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int linear = linearSearch(new int[]{7,9,3,4,11,2,1},4);
        System.out.println(linear==-1?"element not found":"element found at index: "+linear);

        int binary = binarySearch(new int[]{1,2,3,4,5,6,7,8,9},5);
        System.out.println(binary==-1?"element not found":"element found at index: "+binary);
    }
}
