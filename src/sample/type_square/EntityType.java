package sample.type_square;

import java.util.ArrayList;

/**
 * Created by Joao Neto on 25/06/2016.
 */
public class EntityType {

    public String name;
    public ArrayList<PropertyType> properties;
    public ArrayList<Entity> entities;

    public EntityType(String name){
        this.name = name;
        this.properties = new ArrayList<>();
        this.entities = new ArrayList<>();
    }

    @Override
    public String toString() {
        return name;
    }
}
