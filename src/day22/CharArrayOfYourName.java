package day22;

public class CharArrayOfYourName {
    public static void main(String[] args) {

        char[] name = new char[4];

        name[0]= 'N';
        name[1]= 'U';
        name[2]= 'R';
        name[3]= 'I';

        System.out.print(name[0]);
        System.out.print(name[1]);
        System.out.print(name[2]);
        System.out.print(name[3]);

        System.out.println("");
        ///This will actually print the content of char array not memory address
        // and this is only for char array, anything else will print memory address
        System.out.println(name);


        boolean [] yesNo = new boolean[3];

        yesNo[0] = true;
        yesNo[1] = false;
        yesNo[2] = 10>7;

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);










    }

}
