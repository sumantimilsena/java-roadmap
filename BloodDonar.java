import java.util.Scanner;
public class BloodDonar     {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.print("Input Weight: ");
            int weight = sc.nextInt();
            if(weight>50){
                System.out.println("You can Donate");
            }else{
                System.out.println("You are not eligible");
            }
        }else{
            System.out.println("Your age must be greater than 18");
        }
        sc.close();
    }
}