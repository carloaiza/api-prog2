package com.api_prog2.apiprog2.service;

import com.api_prog2.apiprog2.model.Kid;
import com.api_prog2.apiprog2.model.ListSE;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class ListSEService {
    private ListSE list;

    public ListSEService() {
        list = new ListSE();
        list.add(new Kid("1002654940","Jeronimo Murillo",(byte)19,'M'));
        list.add(new Kid("34344343","Pedro Pérez",(byte)16,'M'));

    }


}
