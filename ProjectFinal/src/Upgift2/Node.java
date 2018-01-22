/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Upgift2;

/**
 *
 * @author woj
 */
public class Node {
    private Node next;
    private Object data;
    
    public Node(Object value ){
        next=null;
        data = value;
    }
    
    public Node (Object value, Node nextNode){
        next= nextNode;
        data =value;
    }
    public void  setNext(Node nextNode){
        next= nextNode;
    }

    public Node getNext() {
        return next;
    }

    public Object getData() {
        return data;
    }
    
    
    @Override
    public String toString(){
            String output = "";
        return output;
    }
}
