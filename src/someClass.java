import java.util.StringTokenizer;

/**
 * Created by Xelnect on 2/18/14.
 */
public class someClass {
    public static void main(String[] args) {
        String infoString =
                "[radio button ## do you have some problems with your hearth? ## yes ## no][radio button ## did anyone of your family had hearth problems? ## yes ## no][check boxes ## which memebers of your family have heart problems? ## your mother ## your father ## your uncle ## your aunt][text field ## weekly, how often do you get high blood presure?][text field ## weekly, how often do you get low blood predure?][check boxes ## which of the following is right for you? ## you eat more than 3000 calories daily ## you eat a lot of sugar and sweet products ## you drunk more than one cup of alcochol containing drinks every day][radio button ## have you had any surgeries that have affected your cardio system? ## yes ## no]";
        String str = "this is string ## string this is";
        int i = 0;
        int ii=0;

        String stringResultOfFirstDivision = "";


        String[] resutlStringAfterFirstDivision = new String[infoString.length()];

        StringTokenizer st1 = new StringTokenizer(infoString, "[");


        while (st1.hasMoreElements()) {
            resutlStringAfterFirstDivision[i] = String.valueOf(st1.nextElement());
            stringResultOfFirstDivision += resutlStringAfterFirstDivision[i];
            i++;
        }

        StringTokenizer st2 = new StringTokenizer(stringResultOfFirstDivision, "]");
        String[] endStringResultOfFirstDivision = new String[st2.countTokens()];

        System.out.print("result of first division");
        System.out.println("");

        while (st2.hasMoreElements()) {
            endStringResultOfFirstDivision[ii] = String.valueOf(st2.nextElement());
            ii++;
        }

        for(int iii=0;iii<endStringResultOfFirstDivision.length;iii++){
            System.out.println(endStringResultOfFirstDivision[iii]);
        }

        System.out.print("result of second division");
        System.out.println("");


        String[] resultStringAfterSecondDivision = new String[endStringResultOfFirstDivision.length * 50];

        StringTokenizer st3;



        for(int iiii=0;iiii<7;iiii++){
            st3 = new StringTokenizer(endStringResultOfFirstDivision[iiii], "##");
            while(st3.hasMoreElements()){
            System.out.println(st3.nextElement());
            }
        }

    }

}
