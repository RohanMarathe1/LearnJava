//If the char a is within a string when looping though then the code will replace a with a $.
public class Looping{
     public void replaceWithLoop(){
         String st = "abcdsfrt";

         int len_st = st.length();

          for (int i = 0; i < len_st ; i++)
          {
            char ch =st.charAt(i);
              if (ch == 'a') {
                  st = st.replace('a', '$');
                  System.out.println(st);
              }else continue;

              }
          }
}









