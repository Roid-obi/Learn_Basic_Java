public class ForEach {
  public static void main(String[] args) {


    String[] names = {
        "Roid", "Robih", "Sigma",
        "Programmer", "Github", "Spotify"
    };

    for (int i = 0; i < names.length; i++){
      System.out.println(names[i]);
    }

    System.out.println("FOR EACH");

    for(String name: names){
      System.out.println(name);
    }
  }
}
