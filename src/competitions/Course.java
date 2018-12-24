package competitions;

import competitions.obstacle.Obstacle;

public class Course {
    Obstacle[] obstacles;

    public Course(Obstacle... _obstacles) {
        obstacles = _obstacles;
    }


    public void doIt(Team team) {
        for(Obstacle o: obstacles) {
            team.goAhead(o);
        }
    }

}
