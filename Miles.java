public class Miles {
    public static void main(String[] args) {
        int ticket_price = 4000; // 4 тыс рублей за билет
        int bonus_miles_value = 20; // количество начисляемых бонусных милей за перелет
        int total_bonus = ticket_price / bonus_miles_value; // Начисляемое количество бонусов за перелет
        System.out.println(total_bonus);
    }
}
