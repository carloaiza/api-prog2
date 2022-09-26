package com.api_prog2.apiprog2.controller;

import com.api_prog2.apiprog2.model.Node;
import com.api_prog2.apiprog2.service.ListSEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "listse")
public class ListSEController {
    @Autowired
    private ListSEService listSEService;

    @GetMapping
    public Node getList()
    {
        return listSEService.getList().getHead();
    }

}
