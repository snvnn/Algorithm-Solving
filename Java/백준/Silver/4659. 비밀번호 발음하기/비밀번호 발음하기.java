    import java.util.*;

    public class Main{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            while(true){
                String input;
                input = scanner.next();
                boolean vowel = false;
                boolean continuous = false;
                boolean c3 = false;
                if(input.equals("end"))
                    break;

                String[] sliced = input.split("");

                for (int i = 0; i < sliced.length; i++) {

                    if(!vowel){
                        if(sliced[i].equals("a")||sliced[i].equals("e")||sliced[i].equals("i")||sliced[i].equals("o")||sliced[i].equals("u"))
                            vowel = true;
                    }


                    if(i>1){
                        if(sliced[i].equals("a")||sliced[i].equals("e")||sliced[i].equals("i")||sliced[i].equals("o")||sliced[i].equals("u")){
                            if(sliced[i-1].equals("a")||sliced[i-1].equals("e")||sliced[i-1].equals("i")||sliced[i-1].equals("o")||sliced[i-1].equals("u")){
                                if(sliced[i-2].equals("a")||sliced[i-2].equals("e")||sliced[i-2].equals("i")||sliced[i-2].equals("o")||sliced[i-2].equals("u")){
                                    c3 = true;
                                }
                            }
                        }


                        if(!sliced[i].equals("a")&&!sliced[i].equals("e")&&!sliced[i].equals("i")&&!sliced[i].equals("o")&&!sliced[i].equals("u")){
                            if(!sliced[i-1].equals("a")&&!sliced[i-1].equals("e")&&!sliced[i-1].equals("i")&&!sliced[i-1].equals("o")&&!sliced[i-1].equals("u")){
                                if(!sliced[i-2].equals("a")&&!sliced[i-2].equals("e")&&!sliced[i-2].equals("i")&&!sliced[i-2].equals("o")&&!sliced[i-2].equals("u"))
                                    c3 = true;
                            }
                        }
                    }


                    if(!continuous){
                        if(i>0 && sliced[i].equals(sliced[i-1])){
                            if(!sliced[i].equals("e") && !sliced[i].equals("o"))
                                continuous = true;
                        }
                    }
                }


                if(vowel && !continuous && !c3)
                    System.out.println("<"+ input +"> is acceptable.");
                else
                    System.out.println("<"+ input +"> is not acceptable.");

            }
        }
    }