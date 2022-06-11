package com.crud.training.ias.ejercicio.crud.infrastructure.models;

import com.crud.training.ias.ejercicio.crud.birds.aplication.domain.Bird;
import com.crud.training.ias.ejercicio.crud.birds.aplication.domain.valueObjs.*;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BirdDAO {

    private static com.crud.training.ias.ejercicio.crud.infrastructure.models.BirdDAO BirdDAO;
    private Long birdId;
    private String birdCommonName;
    private String birdScientistName;
    private String birdZoneName;
    private int birdQuantityConfirm;

    public BirdDAO(Long birdId, String birdCommonName, String birdScientistName, String birdZoneName, Integer birdQuantityConfirm) {
        this.birdId = birdId;
        this.birdCommonName = birdCommonName;
        this.birdScientistName = birdScientistName;
        this.birdZoneName = birdZoneName;
        this.birdQuantityConfirm = birdQuantityConfirm;
    }
    public BirdDAO(Long value, String birdCommonName, String birdScientistName, Integer integer, String s){

    }

    public BirdDAO() {

    }

    public Bird toDomain(){
        return new Bird(
                new BirdId(birdId),
                new BirdCommonName(birdCommonName),
                new BirdScientistName(birdScientistName),
                new BirdQuantityConfirm(birdQuantityConfirm),
                new BirdZoneName(birdZoneName)
        );


    }

    public static BirdDAO fromDomain(Bird bird){
        BirdDAO birdDAO = new BirdDAO(
                bird.getBirdId().getValue(),
                bird.getBirdCommonName().getValue(),
                bird.getBirdScientistName().getValue(),
                bird.getBirdQuantityConfirm().getValue(),
                bird.getBirdZoneName().getValue()
        );
        return BirdDAO;
    }
    public static BirdDAO fromResultSet(ResultSet resultSet) throws SQLException {
        BirdDAO birdDAO = new BirdDAO();
        birdDAO.setBirdId(resultSet.getLong("birdId"));
        birdDAO.setBirdCommonName(resultSet.getString("birdCommonName"));
        birdDAO.setBirdScientistName(resultSet.getString("birdScientistName"));
        birdDAO.setBirdZoneName(resultSet.getString("birdZoneName"));
        birdDAO.setBirdQuantityConfirm(resultSet.getInt("birdQuantityConfirm"));
        return birdDAO;
    }

    public Long getBirdId() {
        return birdId;
    }

    public String getBirdCommonName() {
        return birdCommonName;
    }

    public String getBirdScientistName() {
        return birdScientistName;
    }

    public String getBirdZoneName() {
        return birdZoneName;
    }

    public int getBirdQuantityConfirm() {
        return birdQuantityConfirm;
    }

    public void setBirdId(Long birdId) {
        this.birdId = birdId;
    }

    public void setBirdCommonName(String birdCommonName) {
        this.birdCommonName = birdCommonName;
    }

    public void setBirdScientistName(String birdScientistName) {
        this.birdScientistName = birdScientistName;
    }

    public void setBirdZoneName(String birdZoneName) {
        this.birdZoneName = birdZoneName;
    }

    public void setBirdQuantityConfirm(int birdQuantityConfirm) {
        this.birdQuantityConfirm = birdQuantityConfirm;
    }
}
