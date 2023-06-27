public class Main {
    /**
     * Сотовый оператор дарит клиенту по 1 рублю за каждые полные 100 рублей пополнения.
     * @value incomingAmount - сумма на счете до пополнения.
     * @value depositAmount - сумма пополнения.
     * @value bonusAmount - расчет начисления бонуса.
     */
    public static void main(String[] args) {

        int incomingAmount = 500;
        int depositAmount = 1500;
        boolean bonusCalc = depositAmount > 1000;

        int bonusAmount;
        if (bonusCalc) {
            bonusAmount = depositAmount / 100;
        } else {
            bonusAmount = 0;
        }

//        int bonusAmount = bonusCalc ? depositAmount / 100 : 0; // попробовал этот вариант, также все работает (похоже на функцию ЕСЛИ из Excel)

        int account = incomingAmount + depositAmount + bonusAmount;

        System.out.println("Итоговая сумма на счете: " + account + " ₽");
        System.out.println("В том числе бонус за пополнение: " + bonusAmount + " ₽");
    }
}