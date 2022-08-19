package entities.service;

import entities.Hotel;
import entities.dao.Dao;

public class HotelService {
    private Dao<Hotel> hotelDao;

    public HotelService(Dao<Hotel> hotelDao) {
        this.hotelDao = hotelDao;
    }

    public Hotel salvar(Hotel hotel){
        return hotelDao.salvar(hotel);
    }
}
