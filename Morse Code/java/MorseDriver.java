public class MorseDriver {

  public static void main(String[] args) {
    Morse morse = new Morse();

    System.out.println(morse.encode("hello")); // .... . .-.. .-.. --- 
    System.out.println(morse.encode("candy")); // -.-. .- -. -.. -.-- 
    System.out.println(morse.encode("what is your name")); // .-- .... .- -   .. ...   -.-- --- ..- .-.   -. .- -- . 

    System.out.println(morse.decode(".... ..   - .... . .-. . ")); // hi there
    System.out.println(morse.decode(".-- .   .-.. .. -.- .   -.-. --- -.. . -.. .- -.-- ")); // we like codeday
    System.out.println(morse.decode("- .... .- -. -.- ...   ..-. --- .-.   .--. .-.. .- -.-- .. -. --. ")); // thanks for playing


    // Checks, should all be true
    System.out.println(morse.encode("hello").equals(".... . .-.. .-.. --- "));
    System.out.println(morse.encode("candy").equals("-.-. .- -. -.. -.-- "));
    System.out.println(morse.encode("what is your name").equals(".-- .... .- -   .. ...   -.-- --- ..- .-.   -. .- -- . "));

    System.out.println(morse.decode(".... ..   - .... . .-. . ").equals("hi there"));
    System.out.println(morse.decode(".-- .   .-.. .. -.- .   -.-. --- -.. . -.. .- -.-- ").equals("we like codeday"));
    System.out.println(morse.decode("- .... .- -. -.- ...   ..-. --- .-.   .--. .-.. .- -.-- .. -. --. ").equals("thanks for playing"));


    
  }

}