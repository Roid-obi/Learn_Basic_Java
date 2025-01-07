public class Scope {
  public static void main(String[] args) {
    sayHello("Roid");
    sayHello("");
  }

  static void sayHello(String name) {
    String hello = "Hello " + name;

    // Ganti isBlank() dengan trim().isEmpty() untuk kompatibilitas
    if (!name.trim().isEmpty()) {
      String hi = "Hi " + name;
      System.out.println(hi);
    }

    System.out.println(hello);
  }
}
