class Untitiled {

    public static void main(String[] args) {
        // Начальная сумма на счету
        int currentBalance = 100;
        // Сумма пополнения
        int topUpAmount = 1100;

        // Рассчитываем бонусы
        int bonus = calculateBonus(topUpAmount);

        // Обновляем баланс
        int finalBalance = currentBalance + topUpAmount + bonus;

        // Выводим результат
        System.out.println("Итоговый счет: " + finalBalance);
        System.out.println("Бонусные рубли: " + bonus);
    }

    // Метод для расчета бонусов
    private static int calculateBonus(int topUpAmount) {
        int bonus = 0;
        if (topUpAmount > 1000) {
            bonus = topUpAmount / 100;
        }
        return bonus;
    }
}