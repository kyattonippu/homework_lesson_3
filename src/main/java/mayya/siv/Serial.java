package mayya.siv;

public class Serial {
    String nameOfSerial;
    int totalCountOfSeries;
    int countOfSeriesSeen;

    public void sayNameOfSerial() {
        System.out.println(nameOfSerial);
    }

    public void seriesLeftToWatch() {
        int countOfSeriesRemaining = totalCountOfSeries - countOfSeriesSeen;
        if (countOfSeriesRemaining == 0) {
            System.out.println("Ура, сериал " + nameOfSerial + " просмотрен");
        } else {
            System.out.println("Осталось просмотреть " + countOfSeriesRemaining + " серии сериала " + nameOfSerial);
        }
    }
}
