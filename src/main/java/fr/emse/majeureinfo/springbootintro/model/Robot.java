package fr.emse.majeureinfo.springbootintro.model;

//whole class imported
import javax.persistence.*;
@Entity
@SuppressWarnings("serial")
public class Robot {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Sensor sensor;

    @Enumerated(EnumType.STRING)
    private Actuator actuator;

    public Robot(Sensor sensor, Actuator actuator) {
        this.sensor = sensor;
        this.actuator = actuator;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public Actuator getActuator() {
        return actuator;
    }

    public void setActuator(Actuator actuator) {
        this.actuator = actuator;
    }

    public void switchSensor() {
        if (getSensor().getStatus() == Status.ON){
            getSensor().setStatus(Status.OFF);
        }
        else {
            getSensor().setStatus(Status.ON);
        }
    }


    public void switchActuator() {
        if (getActuator().getStatus() == Status.ON) {
            getActuator().setStatus(Status.OFF);
        }
        else {
            getActuator().setStatus(Status.ON);
        }
    }



}
