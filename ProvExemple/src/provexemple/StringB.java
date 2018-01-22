/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provexemple;

/**
 *
 * @author edo
 */
public class StringB {
    public static void main(String[] args) {
        StringBuilder[] sb = new StringBuilder[2];
        sb[0] = new StringBuilder("aaa");
        sb[1] = new StringBuilder("bbb");
        
        sb[0].append(" "+sb[1]+" 1357");
        sb[1]=change(sb);
        sb[1].append(" 1234");
        
        for (int i = 0; i < sb.length; i++) {
            System.out.println(sb[i]);
            
        }
    }
    public static StringBuilder change(StringBuilder[] sb){
        sb[1].append(" aaa");
        return sb[1];
    }
}
