// package Part1.week1.hello;

public class HelloGoodbye {
    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        StringBuilder helloString = new StringBuilder("Hello");
        StringBuilder goodbyeString = new StringBuilder("Goodbye");
        for(int idx=0; idx<args.length; idx++){
            helloString.append(" "+args[idx]);
            goodbyeString.append(" "+args[args.length - 1 - idx]);
            if(idx != args.length - 1){
                helloString.append(" and");
                goodbyeString.append(" and");
            }
        }
        helloString.append('.');
        goodbyeString.append('.');
        System.out.println(helloString);
        System.out.println(goodbyeString);
    }
}
