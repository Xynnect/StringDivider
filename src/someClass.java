import java.util.*;

/**
 * Created by Xelnect on 2/18/14.
 */
public class someClass {
    private static String infoString =
            "[radio button##do you have some problems with your hearth?##yes##no][radio button##did anyone of your family had hearth problems?##yes##no][check boxes##which memebers of your family have heart problems?##your mother##your father##your uncle##your aunt][text field##weekly, how often do you get high blood presure?][text field##weekly, how often do you get low blood predure?][check boxes##which of the following is right for you?##you eat more than 3000 calories daily##you eat a lot of sugar and sweet products##you drunk more than one cup of alcochol containing drinks every day][radio button##have you had any surgeries that have affected your cardio system?##yes##no]\"";
    private static int intUsedIlliterration1 = 0;
    private static int intUsedIlliterration2 = 0;
    private static int intUsedIlliterration3 = 0;

    private static int intUsedForArrayIlliterration1 = 0;
    private static int intUsedForArrayIlliterratio2 = 0;

    private static ArrayList questionsType = new ArrayList();
    private static ArrayList questionsText = new ArrayList();
    private static ArrayList<String[]> answerText = new ArrayList<String[]>();

    private static StringTokenizer st1;
    private static StringTokenizer st2;
    private static StringTokenizer st3;

    private static String valueOfFirstElement;
    private static String valueOfSecondElement;
    private static String[] valueOfThirdElements;

    public static void main(String[] args) {

        String[] firstSeedingResult = firstDivision(infoString);
        secondDivision(firstSeedingResult);

    }

    public static String[] firstDivision(String infoString) {
        String stringResultOfFirstDivision = "";
        String[] resutlStringAfterFirstDivision = new String[infoString.length()];

        st1 = new StringTokenizer(infoString, "[");


        while (st1.hasMoreElements()) {
            resutlStringAfterFirstDivision[intUsedIlliterration1] = String.valueOf(st1.nextElement());
            stringResultOfFirstDivision += resutlStringAfterFirstDivision[intUsedIlliterration1];
            intUsedIlliterration1++;
        }

        st2 = new StringTokenizer(stringResultOfFirstDivision, "]");
        String[] endStringResultOfFirstDivision = new String[st2.countTokens()];

        while (st2.hasMoreElements()) {
            endStringResultOfFirstDivision[intUsedIlliterration2] = String.valueOf(st2.nextElement());
            intUsedIlliterration2++;
        }

        return endStringResultOfFirstDivision;
    }

    public static void secondDivision(String[] firstSeedingResult) {


        for (intUsedIlliterration3 = 0; intUsedIlliterration3 < firstSeedingResult.length - 1; intUsedIlliterration3++) {
            System.out.println(firstSeedingResult[intUsedIlliterration3]);

            st3 = new StringTokenizer(firstSeedingResult[intUsedIlliterration3], "##");

            valueOfFirstElement = String.valueOf(st3.nextElement());
            valueOfSecondElement = String.valueOf(st3.nextElement());

            while (st3.hasMoreElements()) {
                valueOfThirdElements[intUsedForArrayIlliterration1] = String.valueOf(st3.nextElement());
                intUsedForArrayIlliterration1++;
            }

            questionsType.add(intUsedIlliterration3, valueOfFirstElement);
            questionsText.add(intUsedIlliterration3, valueOfSecondElement);


            while (st3.hasMoreElements()) {
                    answerText.add(intUsedIlliterration3,valueOfThirdElements);
                }



            System.out.println(questionsType.toString());
            System.out.println(questionsText.toString());
            System.out.println(answerText.toString());
        }
    }
}
