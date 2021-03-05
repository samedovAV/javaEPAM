package fourthChapter.fourthChapterA.task6;

import lombok.Data;

import java.util.ArrayList;

@Data
public class StarSystem {

    private ArrayList<Planet> planets;
    private ArrayList<Star> stars;
    private Moon moon;

    // Количество планет в звездной системе
    public void showPlanetsAmount() {
        System.out.println(this.getPlanets().size());
    }

    // Название звезды
    public void showStarName() {
        System.out.println(this.getStars().get(0).getName());
    }

    // Добавить планету
    public void addPlanet(Planet planet) {
        this.getPlanets().add(planet);
    }
}
