/**
 * Created by Vlad on 25.08.2016.
 */
public class task2_2 {
    public static void main(String[] args) {
        double balance = 100;
        double withdrawal = 50;
        double comission = (withdrawal / 100) * 5;
        double outputmoney = 0;
        System.out.println(outputmethod(balance,withdrawal, comission,outputmoney));

    }
    static double outputmethod(double balance, double withdrawal, double comission, double outputmoney ){

        if (withdrawal+comission<balance) {
            withdrawal = withdrawal + comission;
            outputmoney = balance - withdrawal;
        }
        if (withdrawal+comission> balance ){
            System.out.print("Not enough money");
        }



        return outputmoney;
    }





}


