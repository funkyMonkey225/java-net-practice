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

    public static void main(String [] args) {
        Meh.meh("yeah?");
    }
}

// Java compiler looks for a .class file and tries to load main method
// javac HelloWorld.java
// java HelloWorld