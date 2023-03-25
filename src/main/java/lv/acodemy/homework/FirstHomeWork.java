package lv.acodemy.homework;

public class FirstHomeWork {

    public static void main(String[] args) {

        // byte data type
        byte lionCurrenTailMin = 72; // Tail length min
        System.out.println(lionCurrenTailMin);
        byte lionCurrentTailMax = 90; // Tail length max
        System.out.println(lionCurrentTailMax);


        //short data type
        short lionCurrentWeight = 140;  // in Southern Africa
        System.out.println(lionCurrentWeight);

        short lionCurrentWeight2 = 120;  // in East Africa
        System.out.println(lionCurrentWeight2);

        // char short type

        char firstNameLetter = 83; // "S" Simba
        System.out.println(firstNameLetter);
        char firstNameLetter2 = 78; // "N" Nala
        System.out.println(firstNameLetter2);

        // in data type
        int imaxRelease = 25102002; // Lion king Re-release IMAX and large-format
        System.out.println(imaxRelease);

        int threeDConversion = 16092011; // Lion king Re-release 3D conversion
        System.out.println(threeDConversion);

        // long data type
        long populationOfAfrica = 1433751160;
        System.out.println(populationOfAfrica);

        //float data type
        float jumpTime = 01.30F;
        System.out.println(jumpTime);

        // double data type
        double smallSimbaWeight = 42.5;
        System.out.println(smallSimbaWeight);

        double smallNalaWeight = 38.5;
        System.out.println(smallNalaWeight);

        //boolean is; has;
        boolean isWinter = false;
        boolean isKing = true;
        boolean hasApples = true;

        // String
        String lionKing = "Simba";
        String lionKingfriend = "Nala";

        //Concatenation
        String love = lionKing + " "+" " + lionKingfriend;
        System.out.println(love);



        System.out.printf("The Lion king name is %s. And her love name is %s.\n", lionKing, lionKingfriend);


        //*
        int a = 6;
        int b = 3;
        int c = a * b;
        System.out.println(c);
        System.out.println(a * b);

        //-
        System.out.println(a - b);

        //+
        System.out.println(a + b);

        //division
        double result = (double) a / b;
        System.out.println(result);

        //%
        int number = 8 % 4;
        System.out.println(number);


    }
}
