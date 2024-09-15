import java.util.ArrayList;
import java.util.List;

public class Team<T> {

    private String teamName;
    private int wins;
    private int losses;
    private int ties;

    private List<T> team = new ArrayList<>();

    public Team(String name) {
        teamName = name;
    }

    public void addTeamMember(T player) {
        if (!team.contains(player)) {
            team.add(player);
        }
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", team=" + team +
                '}';
    }
}
