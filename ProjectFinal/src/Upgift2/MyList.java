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
public class MyList {

    int nodeCount;
    private Node head;

    public MyList() {
        nodeCount = 0;
    }

    public void add(Object data) {
        if (head == null) {
            head = new Node(data);
            nodeCount++;
        } else {
            Node temp = head;
            head = new Node(data, temp);
            nodeCount++;
        }

    }

    @Override
    public String toString() {
        String output = "";
        if (head != null) {

            while (head.getNext() != null) {
                output = output.concat(String.valueOf(head.getData()));
                output += " ";
                head = head.getNext();
            }
            output = output.concat(String.valueOf(head.getData()));
        }

        return output;
    }
}
