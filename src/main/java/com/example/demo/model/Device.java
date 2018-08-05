package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Device {


    @Id
    @Column(name = "Device_ID")
    private String D_id; // ID type is STRING, hence JpaRepository<Device, STRING>
    
    @Column(name = "Vehicle_ID")
    private String V_id;

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

    public void setUsername(String u_name) {
        this.username = u_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pw) {
        this.password = pw;
    }


}

