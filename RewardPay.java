import java.util.Scanner;
public class RewardPay {
    /*事前に paica にチャージをすることで利用できます。
    バスの運賃支払に paica のカード残額を使うと、運賃の 10 % が paica ポイントとしてたまります。
    バスを降車する時に、支払う運賃以上のポイントがある場合は、
    ポイントが優先的に運賃の支払いに使われます。ただし、1 ポイントは 1 円になります。
    ただし、ポイントで運賃を支払った場合、新たなポイントは発生しません。 */
    public static void main(String[] args) {

        // calculation for shooping and reward points
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Charge Amount: ");
        int chargeAmount = sc.nextInt();
        int balance = chargeAmount;
        System.out.print("Enter Fare Count: ");
        int fareCount = sc.nextInt();

        int rewardPoints = 0; // 10% of total fare paid by IC Card not used for reward points
        


        for (int i = 1; i <= fareCount; i++) {
            int totlFare = sc.nextInt();

            if (rewardPoints >= totlFare) {
                rewardPoints -= totlFare; // use reward points to pay fare

            } else {
                balance -= totlFare; // use charge amount to pay fare
                rewardPoints += totlFare / 10;
            }    

            if(i <= fareCount){
                System.out.println(balance + " "+ rewardPoints);
            }
        }
        sc.close();
    }
}