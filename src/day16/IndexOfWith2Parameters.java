package day16;

public class IndexOfWith2Parameters {
    public static void main(String[] args) {
                    // 012345678901234567890123456789012
        String name = "I love Java I Love Java Java Java";

        System.out.println(name.indexOf("Java"));
        System.out.println(name.indexOf("Java" ,7));
        System.out.println(name.indexOf("Java" ,8));
        System.out.println(name.indexOf("Java" ,9));
        System.out.println(name.indexOf("Java" ,19));
        System.out.println(name.indexOf("Java" ,20));

        // how do i start from the location that get past first Java
        // basically starting point different that 0 so that it get past first java

        int firstJava = name.indexOf("Java");
        System.out.println("firstJava = " + firstJava);
        int secondJavaSearching = firstJava + 1 ;
        int secondJava = name.indexOf("Java" , secondJavaSearching);

        System.out.println("secondJava = " + secondJava);

        // I dont know how many word in this sentence, i only know there 3+words
        // i just want to know what is the second word
        // the word in between first space and second space is second word
        int firstSpaceLocation = name.indexOf(" ");
        int secondSpace = name.indexOf(" ", firstSpaceLocation+1 );

        System.out.println("Second word in this sentence is "
                + name.substring(firstSpaceLocation+1 , secondSpace));


















    }
}
