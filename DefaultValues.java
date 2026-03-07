public class DefaultValues {

    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean flag;

    public static void main(String[] args) {

        DefaultValues obj = new DefaultValues();

        System.out.println("Byte: " + obj.b);
        System.out.println("Short: " + obj.s);
        System.out.println("Int: " + obj.i);
        System.out.println("Long: " + obj.l);
        System.out.println("Float: " + obj.f);
        System.out.println("Double: " + obj.d);
        System.out.println("Char: " + obj.c);
        System.out.println("Boolean: " + obj.flag);
    }

}

/*
Local variables inside methods must be initialized manually.
Otherwise Java compiler throws an error.
*/