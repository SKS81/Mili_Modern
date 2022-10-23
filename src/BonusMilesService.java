public class BonusMilesService {
    public int calculate(int price) {
        int step = 20; // шаг начисления одной мили
        int miles = (price / step); // расчёт количества миль
        return miles; // вывод результата

    }
}