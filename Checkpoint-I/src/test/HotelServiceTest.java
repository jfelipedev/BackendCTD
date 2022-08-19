package test;

import entities.Hotel;
import entities.dao.ConfigDB;
import entities.dao.impl.HotelDaoImplImpl;
import entities.service.HotelService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelServiceTest {

    private HotelService hotelService = new HotelService(new HotelDaoImplImpl(new ConfigDB()));

    @Test
    public void salvarHotel(){
        Hotel filial1 = new Hotel("Hotel California", "Joao Pessoa", "Av Floriano Peixoto", 155, "PB", true);
        hotelService.salvar(filial1);
        assertTrue(filial1.getId() != 0);

        Hotel filial2 = new Hotel("Confortel", "Campina Grande", "Av Getulio Vargas", 163, "PB", true);
        hotelService.salvar(filial2);
        assertTrue(filial2.getId() != 0);

        Hotel filial3 = new Hotel("Intercity Hotel", "Bananeiras", "Av Marechal Deodoro", 15, "PB", true);
        hotelService.salvar(filial3);
        assertTrue(filial3.getId() != 0);

        Hotel filial4 = new Hotel("Holiday Hotel", "Joao Pessoa", "Av Floriano Peixoto", 155, "PB", false);
        hotelService.salvar(filial4);
        assertTrue(filial4.getId() != 0);

        Hotel filial5 = new Hotel("Fairmont Hotel", "Patos", "Av Epitacio Pessoa", 584, "PB", false);
        hotelService.salvar(filial5);
        assertTrue(filial5.getId() != 0);
    }
}