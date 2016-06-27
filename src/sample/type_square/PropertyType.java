package sample.type_square;

import java.util.ArrayList;

/**
 * Created by Joao Neto on 25/06/2016.
 */
public class PropertyType {
    public EntityType entityType;
    public ArrayList<Property> properties;
    public ArrayList<Entity> entities;
    public String name;

    public PropertyType(EntityType owner, String name) {
        this.entityType = owner;
        this.properties = new ArrayList<>();
        this.entities = new ArrayList<>();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Property " + name + " Entity Type " + entityType;
    }

    public String getEntityType() {
        return entityType.name;
    }

    public String getName() {
        return name;
    }
}
