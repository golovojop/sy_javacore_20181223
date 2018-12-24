package competitions;

import competitions.animals.*;
import competitions.obstacle.*;

public class Main {

    public static void main(String[] args) {

        Team team = new Team(new Human("Alice"), new Cat("Барсик"), new Dog("Бобик"), new Snake("Каа"));
        Course course = new Course(new Cross(80), new Wall(2), new Water(10), new Cross(120));

        team.showTeamInfo();
        course.doIt(team);
        team.showResults();
    }
}
