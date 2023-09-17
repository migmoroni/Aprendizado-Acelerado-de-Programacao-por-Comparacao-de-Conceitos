//Last test in Java version 17

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("System.out.println() -o-o-o-o->\n");

        System.out.println("Hello World!");
        System.out.println("Hello World!");

        System.out.println("\nSystem.out.print() -o-o-o-o->\n");

        System.out.print("Hello World!");
        System.out.print("Hello World!");

        System.out.println("\n\nSystem.out.printf() -o-o-o-o->\n");

        System.out.printf("Text: %s, Letters: %d", "Hello World!", 10);
        System.out.printf("Text: %s, Letters: %d", "Hello World!", 10);

        System.out.println("\n\nSystem.console().printf() -o-o-o-o->\n");

        System.console().printf("Text: %s, Letters: %d", "Hello World!", 10);
        System.console().printf("Text: %s, Letters: %d", "Hello World!", 10);

        System.err.println("\n\nSystem.err -o-o-o-o->\n");

        System.err.println("Hello World!");
        System.err.println("Hello World!");

        System.err.println("");

        System.err.print("Hello World!");
        System.err.print("Hello World!");

        System.err.println("\n");

        System.err.printf("Text: %s, Letters: %d", "Hello World!", 10);
        System.err.printf("Text: %s, Letters: %d", "Hello World!", 10);

        System.err.println("\n");
    }
}