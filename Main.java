import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main (String[]args) {
            Scanner input = new Scanner(System.in);
//Dizinin boyutunu kullanıcıdan al//Get the size of array from user
        System.out.print("Enter the size of Array : ");
        int size = input.nextInt();

        int[] array = new int[size];

        //Dizinin elemanlarını kullanıcıdan al

        for(int i = 0; i < size; i++) {
            System.out.print("Dizinin " + (i+1) + ". elemanını girin: ");
                array[i] = input.nextInt();
            }
            Arrays.sort(array);

            System.out.println("Dizinin küçükten büyüğe sıralanmış hali:");
            for ( int i = 0 ; i < size ; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }



