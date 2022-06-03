package com.example.designpattern._02_factory;

import com.example.designpattern._03_abstract_factory._01_before.WhiteAnchor;
import com.example.designpattern._03_abstract_factory._01_before.WhiteWheel;
import com.example.designpattern._03_abstract_factory._02_after.Anchor;
import com.example.designpattern._03_abstract_factory._02_after.Wheel;
import org.yaml.snakeyaml.serializer.AnchorGenerator;

public class Ship {

    private String name;

    private String color;

    private String logo;

    private Anchor anchor;

    private Wheel wheel;

    public Ship() {
    }

    public Ship(String name, String color, String logo) {
        this.name = name;
        this.color = color;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Anchor getAnchor() {
        return anchor;
    }

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
