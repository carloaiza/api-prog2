package com.api_prog2.apiprog2.controller;

import com.api_prog2.apiprog2.model.Kid;
import com.api_prog2.apiprog2.model.Node;
import com.api_prog2.apiprog2.model.dto.KidByPositionDTO;
import com.api_prog2.apiprog2.model.dto.RangeByAgeDTO;
import com.api_prog2.apiprog2.service.ListSEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @PostMapping
    public String addKid(@RequestBody Kid kid)
    {
        return listSEService.add(kid);
    }

    @PostMapping(path="/tostart")
    public String addKidToStart(@RequestBody Kid kid)
    {

        return listSEService.addToStart(kid);
    }

    @GetMapping(path="/invert")
    public String invertList()
    {
        return listSEService.invert();
    }


    @PostMapping(path="/byposition")
    public String addByPosition2(@RequestBody KidByPositionDTO kidByPositionDTO)
    {
        return listSEService.addByPosition(kidByPositionDTO);
    }

    @GetMapping("/ranges")
    public List<RangeByAgeDTO> getRanges()
    {
        List<RangeByAgeDTO> ranges = new ArrayList<>();
        ranges.add(new RangeByAgeDTO(1,4,0));
        ranges.add(new RangeByAgeDTO(5,9,0));
        ranges.add(new RangeByAgeDTO(10,14,6));
        return ranges;
    }

    @GetMapping(path = "/mixbygender")
    public String mixByGender()
    {
        return listSEService.mixByGender();
    }


}
