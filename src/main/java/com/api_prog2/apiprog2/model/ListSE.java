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
           // Node newNode= new Node(kid);
            temp.setNext(new Node(kid));
        }
        size++;
    }

    public void addToStart(Kid kid)
    {
        if(head==null)
        {
            head= new Node(kid);
        }
        else {
            Node newNode = new Node(kid);
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    public void invert()
    {
        if(head != null)
        {
            ListSE listCP = new ListSE();
            Node temp = head;
            while(temp !=null)
            {
                listCP.addToStart(temp.getData());
                temp = temp.getNext();
            }
            head = listCP.getHead();
        }
    }

    public void addByPosition(int position, Kid kid)
    {
        if(position == 1)
        {
            addToStart(kid);
        }
        else
        {
            int posTemp=1;
            Node temp = head;
            while(posTemp < (position -1))
            {
                temp = temp.getNext();
                posTemp++;
            }
            //Estoy parado uno antes de donde debe quedar
            Node newNode = new Node(kid);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
            size++;
        }
    }

    public void mixByGender()
    {
        //Se valida que existan por lo menos dos para mezclar
        if(size > 1)
        {
            int contM=1;
            int contF=2;
            //Creo un ayudante y lo posiciono en la cabeza
            Node temp = head;
            ListSE listCp = new ListSE();
            //Recorre la lista de principio a fin
            while(temp != null)
            {
                if(temp.getData().getGender()=='M')
                {
                    if(contM > listCp.size)
                    {
                        listCp.add(temp.getData());
                    }
                    else
                    {
                        listCp.addByPosition(contM,temp.getData());
                    }
                    contM +=2;
                }
                else
                {
                    if(contF > listCp.size)
                    {
                        listCp.add(temp.getData());
                    }
                    else
                    {
                        listCp.addByPosition(contF,temp.getData());
                    }
                    contF +=2;
                }
                temp = temp.getNext();
            }
            head = listCp.getHead();
        }
    }

}
