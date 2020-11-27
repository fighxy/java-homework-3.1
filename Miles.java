public class Miles {
    public static void main(String[] args) {
        int ticketPrice = 4000; // 4 тыс рублей за билет
        int bonusMilesValue = 20; // количество начисляемых бонусных милей за перелет
        int totalBonus = ticketPrice / bonusMilesValue; // Начисляемое количество бонусов за перелет
        System.out.println(totalBonus);
    }
}
