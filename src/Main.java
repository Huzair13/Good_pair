import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the elements in an array");
        String arrString=scanner.nextLine();

        String[] arrrayChar =arrString.split(" ");
        int size=arrrayChar.length;

        int array[]=new int[size];
        for(int iterator=0;iterator<size;iterator++) {
            array[iterator] = Integer.parseInt(arrrayChar[iterator]);
        }

        int key=scanner.nextInt();

        //Calling Good pair function
        System.out.println(GoodPair(array,size,key));
    }

    private static int GoodPair(int[] array, int size,int key) {
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if (array[i]+array[j]==key){
                    return 1;
                }
            }
        }
        return 0;
    }
}