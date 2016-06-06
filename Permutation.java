
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author xuefanrong
 */
public class Permutation {
  
 
public StringBuilder permutation(String[] input){
StringBuilder sb = new StringBuilder();
helper(input,sb,1);
return sb; 
}
public  void helper(String[] input,StringBuilder sb,int index){
//base case 
if(sb.length() == input.length || sb.length() == input.length + 1){
return ;
}
//recursive rule:
for(int i = 0; i < input.length;i ++){
sb.append(input[i]);
helper(input,sb,index + 1);
sb.append(" ");
}
}

}

