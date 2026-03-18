public class HelloApp {
    public static void main(String[] args) {
        String name = "World";

        if (args.length > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                if (i > 0) 
					sb.append(", ");
                    sb.append(args[i]);
            }
            name = sb.toString();
        }

        System.out.println("Hello, " + name);
    }
}