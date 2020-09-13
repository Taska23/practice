import java.util.ArrayList;
import java.util.List;

public final class MatchModel {

    private static List<Match> matches = new ArrayList<>();

    public static void save(Match match) {
        if (match != null){
            matches.add(match);
        }
    }

    public static List<Match> getMatches(){
        return matches;
    }
}
