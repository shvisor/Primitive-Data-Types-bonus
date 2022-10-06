public class Main {
    public static void main(String[] args) {

        int incomingAmount = 500;                                    // сумма на счете до пополнения
        int depositAmount = 1500;                                    // сумма пополнения
        boolean bonusCalc = depositAmount > 1000;

        int bonusAmount;                                             // расчет начисления бонуса
        if (bonusCalc) {
            bonusAmount = depositAmount / 100;
        } else {
            bonusAmount = 0;
        }

        /* int bonusAmount = bonusCalc ? depositAmount / 100 : 0; */ // попробовал этот вариант. также все работает

        int account = incomingAmount + depositAmount + bonusAmount;

        System.out.println("Итоговая сумма на счете: " + account + " ₽");
        System.out.println("В том числе бонус за пополнение: " + bonusAmount + " ₽");
    }
}