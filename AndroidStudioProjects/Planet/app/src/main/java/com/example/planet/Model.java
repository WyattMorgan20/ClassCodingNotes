package com.example.planet;

import java.util.ArrayList;

public class Model {

    public static Model theModel = null;
    public ArrayList<Planet> thePlanets = null;

    public static Model getModel(){
        if(theModel == null) theModel = new Model();
        return theModel;
    }

    private Model(){
        thePlanets = new ArrayList<>();
        loadData();
    }

    private void loadData(){
        Planet p = new Planet("Mars", 13414213);
        thePlanets.add(p);
        p = new Planet("Venus", 123123213);
        thePlanets.add(p);
        p = new Planet("Jupiter", 647374123);
        thePlanets.add(p);
    }

    public static class Planet{
        private String name;
        private String dist;
        public Planet(String name, int distance){
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDist() {
            return dist;
        }

        public void setDist(String dist) {
            this.dist = dist;
        }

    }
}
