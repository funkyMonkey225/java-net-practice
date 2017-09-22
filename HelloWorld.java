class HelloWorld {
    // Everything is a class in JavaScript, only methods(no functions)
    public static void main(String [] args) {
        System.out.println("Hello Java");
    }
}

class Meh {
    public static void meh(String wha) {
        System.out.println(wha);
    }

    public static void meh(String wha, String who) {
        System.out.println(wha + " " + who);
    }

    public static void main(String [] args) {
        Meh.meh("yeah?");
        Meh.meh("hey", "you");
    }
}

// Can have different versions of same method based on arguments
// Java compiler looks for a .class file and tries to load main method
// javac HelloWorld.java
// java HelloWorld