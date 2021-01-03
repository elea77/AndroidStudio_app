package fr.vivaneo.googlemap.models.market;

import java.io.Serializable;

public class Fields implements Serializable {

    private String nom_court;
    private double[] geo_point_2d;
    private String jours_tenue;
    private Number lundi;
    private Number mardi;
    private Number mercredi;
    private Number jeudi;
    private Number vendredi;
    private Number samedi;
    private Number dimanche;
    private String h_deb_sem_1;
    private String h_deb_dim;
    private String h_fin_sem_1;
    private String h_fin_dim;
    private Integer ardt;
    private String localisation;
    private String produit;


    public String getName() {
        return nom_court;
    }

    public void setName(String name) {
        this.nom_court = name;
    }


    public double[] getGeo_point_2d() {
        return geo_point_2d;
    }

    public void setGeo_point_2d(double[] geo_point_2d) {
        this.geo_point_2d = geo_point_2d;
    }

    public String getJours_tenue() {
        return jours_tenue;
    }

    public void setJours_tenue(String jours_tenue) {
        this.jours_tenue = jours_tenue;
    }

    public Number getLundi() {
        return lundi;
    }

    public void setLundi(Number lundi) {
        this.lundi = lundi;
    }

    public Number getMardi() {
        return mardi;
    }

    public void setMardi(Number mardi) {
        this.mardi = mardi;
    }

    public Number getMercredi() {
        return mercredi;
    }

    public void setMercredi(Number mercredi) {
        this.mercredi = mercredi;
    }

    public Number getJeudi() {
        return jeudi;
    }

    public void setJeudi(Number jeudi) {
        this.jeudi = jeudi;
    }

    public Number getVendredi() {
        return vendredi;
    }

    public void setVendredi(Number vendredi) {
        this.vendredi = vendredi;
    }

    public Number getSamedi() {
        return samedi;
    }

    public void setSamedi(Number samedi) {
        this.samedi = samedi;
    }

    public Number getDimanche() {
        return dimanche;
    }

    public void setDimanche(Number dimanche) {
        this.dimanche = dimanche;
    }

    public String getH_deb_sem_1() {
        return h_deb_sem_1;
    }

    public void setH_deb_sem_1(String h_deb_sem_1) {
        this.h_deb_sem_1 = h_deb_sem_1;
    }

    public String getH_deb_dim() {
        return h_deb_dim;
    }

    public void setH_deb_dim(String h_deb_dim) {
        this.h_deb_dim = h_deb_dim;
    }

    public String getH_fin_sem_1() {
        return h_fin_sem_1;
    }

    public void setH_fin_sem_1(String h_fin_sem_1) {
        this.h_fin_sem_1 = h_fin_sem_1;
    }

    public String getH_fin_dim() {
        return h_fin_dim;
    }

    public void setH_fin_dim(String h_fin_dim) {
        this.h_fin_dim = h_fin_dim;
    }

    public Integer getArdt() {
        return ardt;
    }

    public void setArdt(Integer ardt) {
        this.ardt = ardt;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }


}
