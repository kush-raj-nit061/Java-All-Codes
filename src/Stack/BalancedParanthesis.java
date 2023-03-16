package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack <String> st = new Stack<>();
        int len = s.nextInt();
        String str[] = new String[len];
        for(int i = 0;i<len;i++){
            str[i] = s.next();
        }

        for(int i = 0;i<len;i++){
            if(str[i] == "(" || str[i] =="{" || str[i] =="["){
                st.push(str[i]);
                System.out.println("Pushed");
            }else if(str[i] == ")" || str[i] =="}" || str[i] =="]"){
                System.out.println("Phed");
                if(st.isEmpty()){return ;}
                String top = st.peek();
                st.pop();
                if (top == "{" && str[i] == "}") {

                } else if (top == "(" && str[i] == ")") {

                } else if (top == "[" && str[i] == "]") {

                }else {
                    return;
                }
            }


        }
        if(st.isEmpty()){
            System.out.println("HO GELAI");
        }else{
            System.out.println("Na Holai");
        }


    }

}
