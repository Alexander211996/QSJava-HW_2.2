public class Main {
    public static void main(String[] args) {
        int clientBalance = 1100;
        int transferSum = 3200;
        int totalBalance;
        int bonusRub;

        if (transferSum > 1000) {
            bonusRub = transferSum / 100;
        } else {
            bonusRub = 0;
        }
        totalBalance = clientBalance + transferSum + bonusRub;
        System.out.println(totalBalance);
        System.out.println(bonusRub);
    }
}
