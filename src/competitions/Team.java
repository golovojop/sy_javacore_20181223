package competitions;

import competitions.competitor.Competitor;
import competitions.obstacle.Obstacle;

public class Team {

    private Competitor[] team;


    public Team(Competitor... _team) {
        this.team = _team;

    }

    /**
     * Print participants info
     */
    public void showTeamInfo() {
        System.out.println("\nНаша команда:");
        for(Competitor c : team) {
            System.out.println(c.getName());
        }
        System.out.println("\n");
    }

    public void showResults() {
        System.out.println("\nДистанцию завершили:");
        for(Competitor c: team) {
            if(c.isOnDistance()) {
                c.info();
            }
        }
    }

    public void goAhead(Obstacle o) {
        for(Competitor c: team) {
            o.doIt(c);
        }
    }
}
