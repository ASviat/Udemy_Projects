public class Main {
    record BaseballPlayer(String name) {
    }

    record FootballPlayer(String name) {
    }

    public static void main(String[] args) {
        var footballTeam = new Team<FootballPlayer>("Rocket");
        var baseballTeam = new Team<BaseballPlayer>("Foo");

        BaseballPlayer bpp = new BaseballPlayer("Sanya");
        FootballPlayer fpp = new FootballPlayer("Fedya");

        footballTeam.addTeamMember(fpp);
//        footballTeam.addTeamMember(bpp);//works

        baseballTeam.addTeamMember(bpp);
//        baseballTeam.addTeamMember(fpp);//also works

        System.out.println(footballTeam);
        System.out.println(baseballTeam);
    }
}
