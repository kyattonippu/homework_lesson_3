package mayya.siv;

public class Main {

    public static void main(String[] args) {
        Serial loki = new Serial();
        loki.nameOfSerial = "Loki";
        loki.totalCountOfSeries = 6;
        loki.countOfSeriesSeen = 6;
        loki.sayNameOfSerial();
        loki.seriesLeftToWatch();

        Serial helstrom = new Serial();
        helstrom.nameOfSerial = "Helstrom";
        helstrom.totalCountOfSeries = 10;
        helstrom.countOfSeriesSeen = 8;
        helstrom.sayNameOfSerial();
        helstrom.seriesLeftToWatch();

        Anime berserk = new Anime();
        berserk.nameOfAnime = "Berserk";
        berserk.totalCountOfEpisodes = 24;
        berserk.countOfEpisodesSeen = 13;
        berserk.sayNameOfAnime();
        berserk.episodesLeftToWatch();

        Anime barakamon = new Anime();
        barakamon.nameOfAnime = "Barakamon";
        barakamon.totalCountOfEpisodes = 12;
        barakamon.countOfEpisodesSeen = 12;
        barakamon.sayNameOfAnime();
        barakamon.episodesLeftToWatch();
    }
}
