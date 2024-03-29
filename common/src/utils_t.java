import java.util.ArrayList;
import java.util.List;

/**
 * Created by anton on 10.11.16.
 */
public class utils_t {
    /**
     * Convert date in string to List of integers. Format DD.MM.YYYY
     * @param date - date in string
     * @return List<Integer> - date in List of Integer
     */
    static List<Integer> date_to_int( String date ){
        List<Integer> out = new ArrayList<Integer>();

        out.add(Integer.parseInt(date.substring(0, 1)));
        out.add(Integer.parseInt(date.substring(3, 4)));
        out.add(Integer.parseInt(date.substring(6, 9)));

        return out;
    }

    /**
     * COmpare two dates
     * @param date1
     * @param date2
     * @return - 0 if date1 equals to date2, 1 if date1 < date2, 2 if date1 > date2
     */
    static int compare_dates( List<Integer> date1, List<Integer> date2 ){

    }
}
