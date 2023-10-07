
public class Test {
  public static void main(String[] args) {
    byte var_byte = 5;
    short var_short = 55;
    int var_int = 500;
    long var_long = 150500;
    double var_double = 842.248;
    String var_string = "50";
    char var_char = 'A';
    boolean var_boolean = true;

    float var_float;

    var_float = var_byte;
    System.out.println("byte => " + var_byte + " para int => " + var_float);

    var_float = var_short;
    System.out.println("short => " + var_short + " para int => " + var_float);

    var_float = (int) var_long;
    System.out.println("long => " + var_long + " para int => " + var_float);

    var_float = (int) var_float;
    System.out.println("float => " + var_float + " para int => " + var_float);

    var_float = (int) var_double;
    System.out.println("double => " + var_double + " para int => " + var_float);

    var_float = Integer.parseInt(var_string);
    System.out.println("String => " + var_string + " para int => " + var_float);

    var_float = (int) var_char;
    System.out.println("char => " + var_char + " para int => " + var_float);

    var_float = var_boolean ? 1 : 0;
    System.out.println("boolean => " + var_boolean + " para int => " + var_float);

  }
}