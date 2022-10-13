package com.api_prog2.apiprog2.service;

import com.api_prog2.apiprog2.model.Kid;
import com.api_prog2.apiprog2.model.ListSE;
import com.api_prog2.apiprog2.model.dto.KidByPositionDTO;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class ListSEService {
    private ListSE list;

    public ListSEService() {
        list = new ListSE();
        list.add(new Kid("233223","Juanita",(byte)19,'F'));
        list.add(new Kid("1002654940","Jeronimo Murillo",(byte)19,'M'));
        list.add(new Kid("34344343","Pedro Pérez",(byte)16,'M'));

        list.add(new Kid("34434343","Cristian",(byte)16,'M'));

        list.add(new Kid("33232","Sara",(byte)19,'F'));

        list.add(new Kid("566565","Sandra",(byte)19,'F'));

    }


    public String add(Kid kid){
        list.add(kid);
        return "Kid adicionado exitosamente";
    }

    public String addToStart(Kid kid){
        list.addToStart(kid);
        return "Kid adicionado al inicio exitosamente";
    }

    public String invert()
    {
        list.invert();
        return "La lista se ha invertido";
    }

    public String addByPosition(KidByPositionDTO kidByPositionDTO){
        if(kidByPositionDTO.getPosition()>0
          && kidByPositionDTO.getPosition() <= (list.getSize()+1))
        {
            list.addByPosition(kidByPositionDTO.getPosition(),
                    kidByPositionDTO.getKid());
            return "Adicionado exitosamente";
        }
        else {
            return "Posición no permitida";
        }

    }

    public String mixByGender()
    {
        list.mixByGender();
        return "Se ha ejecutado la mezcla";
    }


}
