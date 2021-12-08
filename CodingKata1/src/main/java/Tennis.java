import java.util.Arrays;
import java.util.List;

public class Tennis {

    private String score = "love - love";
    public static final List<String> pointsDescription = Arrays.asList("love", "fifteen", "thirty", "forty");
    
    public String getScore() {
        return score;
    }

    public void addPlayerOneScore() {
        score = "15 - love";
    }

    public void addPlayerTwoScore() {
        score = "love - 15";
    }
}
