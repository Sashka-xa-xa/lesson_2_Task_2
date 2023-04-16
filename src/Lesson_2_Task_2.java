public class Lesson_2_Task_2 {
    public static void main(String[] args) {
        int currentAmount = 100; // initial amount of money in the account
        int addedAmount = 1100; // amount of money being added to the account
        int bonus = 0; // bonus amount

        if (addedAmount > 1000) {
            bonus = (addedAmount - 1000) / 100; // calculate bonus amount
        }

        int totalAmount = currentAmount + addedAmount + bonus; // calculate total amount

        System.out.println("Total amount: " + totalAmount);
        System.out.println("Bonus amount: " + bonus);
    }
}

