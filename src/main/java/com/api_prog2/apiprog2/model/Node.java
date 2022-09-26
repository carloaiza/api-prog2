package com.api_prog2.apiprog2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class Node {
    private Kid data;
    private Node next;

    public Node(Kid data) {
        this.data = data;
    }
}
