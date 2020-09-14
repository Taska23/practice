import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public final class MatchModel {



    private static List<Match> matches = new ArrayList<>();

    public static void save(Match match) {
        if (match != null){
            matches.add(match);
            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("save.txt"))) {
                oos.writeObject(matches);
                System.out.println("File has been written");

            }catch (Exception ex){
                ex.getMessage();

            }
        }
    }

    public static List<Match> getMatches(){

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("save.txt")))
        {
            matches=((List<Match>)ois.readObject());

        }
        catch(Exception ex){
            System.out.println(ex.getMessage());

        }

        return matches;
    }
}
