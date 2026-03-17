class Config {
    static String appName;
    static int version;

    static {
        appName = "MyApp";
        version = 2;
        System.out.println("Static block executed");
    }
}

public class Main6 {
    public static void main(String[] args) {
        System.out.println(config.appName);
    }
}