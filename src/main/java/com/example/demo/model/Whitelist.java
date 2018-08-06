package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Whitelist {
    @Id
    @Column(name = "DeviceID")
    private String D_id;

    @Column(name = "Time_Stamp")
    private Timestamp time_stamp;

    public Whitelist() {
    }

    public String getDeviceId() {
        return D_id;
    }

    public void setDeviceId(String id) {
        this.D_id = id;
    }


    public Timestamp getTimeStamp() {
        return time_stamp;
    }

    public void setTimeStamp(Timestamp time_s) {
        this.time_stamp = time_s;
    }
}

