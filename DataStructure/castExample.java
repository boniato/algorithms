class castExample {
    public int solution(int N) {

      //String to char

      String s = "a";
      char c = s.charAt(0);
      System.out.println(s); //a

      String str = "abc";
      char[] charArr = str.toCharArray();
      System.out.println(charArr); //abc



      //char to String

      char ch = 'a';
      String str = "";

      str = ch + "";
      str = String.valueOf(ch);
      str = Character.toString(ch);
      str = new Character(ch).toString();



      //String to char[]

      String str = "ABcDe";
      char[] charArr = str.toCharArray(); //ABcDe

      //모두 소문자로 만들기		
      char[] charArr1 = str.toLowerCase().toCharArray(); //abcde

      //모두 대문자로 만들기
      char[] charArr2 = str.toUpperCase().toCharArray(); //ABCDE



      //char[] to String

      char charArr[] = {'a','b'};
      str = new String(charArr); //ab
      str = String.valueOf(charArr); //ab



      //equalsIgnoreCase (대소문자 상관없이 알파벳 체크)
      String str2 = "a";

      System.out.println( str2.equalsIgnoreCase("a") ); //true
      System.out.println( str2.equalsIgnoreCase("A") ); //true

      System.out.println( str2.equalsIgnoreCase("b") ); //false
      System.out.println( str2.equalsIgnoreCase("B") ); //false
       
      }
}
