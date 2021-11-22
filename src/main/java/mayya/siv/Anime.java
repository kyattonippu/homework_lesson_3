package mayya.siv;

public class Anime {
    String nameOfAnime;
    int totalCountOfEpisodes;
    int countOfEpisodesSeen;

    public void sayNameOfAnime() {
        System.out.println(nameOfAnime);
    }

    public void episodesLeftToWatch() {
        int countOfEpisodesRemaining = totalCountOfEpisodes - countOfEpisodesSeen;
        if (countOfEpisodesRemaining == 0) {
            System.out.println("Ура, аниме " + nameOfAnime + " просмотрено");
        } else {
            System.out.println("Осталось просмотреть " + countOfEpisodesRemaining + " серий сериала " + nameOfAnime);
        }
    }
}
