import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        System.out.println("enter elements of the array");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }
        largestElement(arr,size);

    }

    private static void largestElement(int[] arr1, int size) {
        int first,second,third;
        first=second=third=Integer.MIN_VALUE;
        if(size<3){
            System.out.println("invalid input");
        }
        for (int i = 0; i < size; i++) {

            if(arr1[i]>first){
                third=second;
                second=first;
                first=arr1[i];
            }
            else if(arr1[i]>second){
                third=second;
                second=arr1[i];
            }
            else if(arr1[i]>third){
                third=arr1[i];
            }

        }
        System.out.println("three largest elements are: "+ first + " "+ second+" "+ third);
    }
}