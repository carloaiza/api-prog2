package com.api_prog2.apiprog2.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ListSE {
    private Node  head;
    private int size;

    public void add(Kid kid)
    {
        if(head == null)
        {
            head = new Node(kid);
        }
        else
        {
            Node temp = head;
            while(temp.getNext()!=null)
            {
                temp = temp.getNext();
            }
            ///Ayudante esta en el ultimo
            Node newNode= new Node(kid);
            temp.setNext(newNode);
        }
    }

}
