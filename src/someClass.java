import java.util.StringTokenizer;

/**
 * Created by Xelnect on 2/18/14.
 */
public class someClass {
    private static String infoString =
            "[radio button##do you have some problems with your hearth?##yes##no][radio button##did anyone of your family had hearth problems?##yes##no][check boxes##which memebers of your family have heart problems?##your mother##your father##your uncle##your aunt][text field##weekly, how often do you get high blood presure?][text field##weekly, how often do you get low blood predure?][check boxes##which of the following is right for you?##you eat more than 3000 calories daily##you eat a lot of sugar and sweet products##you drunk more than one cup of alcochol containing drinks every day][radio button##have you had any surgeries that have affected your cardio system?##yes##no]\"";
    private static int intUsedIlliterraion1 = 0;
    private static int intUsedIlliterraion2 = 0;


    public static void main(String[] args) {

        String[] firstSeedingResult = firstDivision(infoString);
        secondDivision(firstSeedingResult);

    }

    public static String[] firstDivision(String infoString) {
        String stringResultOfFirstDivision = "";
        String[] resutlStringAfterFirstDivision = new String[infoString.length()];

        StringTokenizer st1 = new StringTokenizer(infoString, "[");


        while (st1.hasMoreElements()) {
            resutlStringAfterFirstDivision[intUsedIlliterraion1] = String.valueOf(st1.nextElement());
            stringResultOfFirstDivision += resutlStringAfterFirstDivision[intUsedIlliterraion1];
            intUsedIlliterraion1++;
        }

        StringTokenizer st2 = new StringTokenizer(stringResultOfFirstDivision, "]");
        String[] endStringResultOfFirstDivision = new String[st2.countTokens()];

        while (st2.hasMoreElements()) {
            endStringResultOfFirstDivision[intUsedIlliterraion2] = String.valueOf(st2.nextElement());
            intUsedIlliterraion2++;
        }

        return endStringResultOfFirstDivision;
    }

    public static void secondDivision(String[] firstSeedingResult) {
        System.out.print("result of second division");
        System.out.println("");


        String[] resultStringAfterSecondDivision = new String[firstSeedingResult.length* 50];

        StringTokenizer st3;


        for (int iiii = 0; iiii < 7; iiii++) {
            st3 = new StringTokenizer(firstSeedingResult[iiii], "##");
            while (st3.hasMoreElements()) {
                System.out.println(st3.nextElement());
            }
        }
    }
}
