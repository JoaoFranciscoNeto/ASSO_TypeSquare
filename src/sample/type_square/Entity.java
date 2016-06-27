package sample.type_square;

import java.util.ArrayList;

/**
 * Created by Joao Neto on 25/06/2016.
 */
public class Entity {

    public EntityType entityType;
    public ArrayList<Property> properties;
    public String name;

    public Entity (EntityType owner, String name) {
        this.entityType = owner;
        this.name = name;
        this.entityType.entities.add(this);
        this.properties = new ArrayList<>();
    }
}
