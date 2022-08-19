package entities.dao.impl;

import entities.Hotel;
import entities.dao.ConfigDB;
import entities.dao.Dao;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class HotelDaoImplImpl implements Dao<Hotel> {

    private ConfigDB configJDBC;
    final static Logger log = Logger.getLogger(HotelDaoImplImpl.class);

    public HotelDaoImplImpl(ConfigDB configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Hotel salvar(Hotel hotel) {
        log.debug("Nova filial: " + hotel.toString());
        Connection connection = configJDBC.conectarBD();
        Statement statement = null;
        String query = String.format("INSERT INTO hoteis(nome, cidade, rua, numero, estado, e5estrelas) VALUES ('%s','%s','%s','%s','%s','%s')",
                hotel.getNomeFilial(), hotel.getCidade(), hotel.getRua(), hotel.getNumero(), hotel.getEstado(), hotel.isE5estrelas());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next())
                hotel.setId(resultSet.getInt(1));

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hotel;
    }
}
