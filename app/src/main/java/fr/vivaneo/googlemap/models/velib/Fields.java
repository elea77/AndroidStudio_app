package fr.vivaneo.googlemap.models.velib;

import java.io.Serializable;

public class Fields implements Serializable {

    private String nom_site;
    private double[] geo_point_2d;


    public String getName() {
        return nom_site;
    }

    public void setName(String name) {
        this.nom_site = name;
    }


    public double[] getGeo_point_2d() {
        return geo_point_2d;
    }

    public void setGeo_point_2d(double[] geo_point_2d) {
        this.geo_point_2d = geo_point_2d;
    }


}
