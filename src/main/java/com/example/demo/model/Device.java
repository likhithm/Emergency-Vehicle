package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Device {


    @Column(name = "Vehicle_ID")
    private String V_id;

    @Id
    @Column(name = "Device_ID")
    private String D_id; // ID type is INTEGER hence JpaRepository<Device, Integer>

    @Column(name = "Username")
    private String username;

    @Column(name = "Password")
    private String password;

    // alt + insert to add constructors, getters/setters
    public Device() {
    }

    public String getDeviceId() {
        return D_id;
    }

    public void setDeviceId(String id) {
        this.D_id = id;
    }

    public String getVehicleId() {
        return V_id;
    }

    public void setVehicleId( String vid) {
        this.V_id = vid;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passw) {
        this.password = passw;
    }


}

