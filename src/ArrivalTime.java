import static java.lang.Integer.min;
import static java.lang.Integer.parseInt;

public class ArrivalTime {
    // 29.Skapa ett program som beräknar ankomsttiden för ett tåg. I inmatningsrutan finns
    //följande:
    //tidpunkt i timma och minut för avgången (t ex 12 41)
    //körtid i timma och minut (t ex 3 47)
    //I utmatningsrutan ska klockslaget för ankomsttiden skrivas. Om midnatt passeras ska det
    //även skrivas “NÄSTA DAG“ i utmatningsrutan.

    public static void main(String[] args) {
        String departureTimeString = "22 41";
        String runTimeString = "1 20";
        System.out.println(hoursFromString(departureTimeString));
        System.out.println(minutesFromString(departureTimeString));

        int arrivalTimeMinutes = hoursFromString(departureTimeString) * 60
                + minutesFromString(departureTimeString)
                + hoursFromString((runTimeString)) * 60
                + minutesFromString(runTimeString);
        System.out.println(arrivalTimeMinutes);

        if (overMidnight(arrivalTimeMinutes)) System.out.println("Nästa Dag");

        String arrivalTime = timeFromMinutes(arrivalTimeMinutes);
        System.out.println(arrivalTime);


    }

    // "12 41" "3 47"
    static int hoursFromString(String timeString) {
        String hours = timeString.substring(0, 2);
        hours = hours.trim();
        return parseInt(hours);
    }

    static int minutesFromString(String timeString) {
        String minutes = timeString.substring(timeString.length() - 2, timeString.length());
        minutes = minutes.trim();
        return parseInt(minutes);
    }

    static boolean overMidnight(int minutes) {
        if (minutes > 24 * 60) return true;
        else return false;
    }

    static String timeFromMinutes(int minutesTotal) {
        if (minutesTotal >= 24*60) minutesTotal = minutesTotal - 24*60;
        int hours = minutesTotal / 60;
        System.out.println(hours);
        int minutes = minutesTotal - hours * 60;
        System.out.println(minutes);
        return Integer.toString(hours)+" "+Integer.toString(minutes);
    }
}
