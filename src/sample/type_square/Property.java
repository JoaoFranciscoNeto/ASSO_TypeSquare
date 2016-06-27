package sample.type_square;

/**
 * Created by Joao Neto on 25/06/2016.
 */
public class Property {

    public Entity entity;
    public PropertyType propertyType;
    public Object value;

    public Property(Entity entity, PropertyType property, Object value) {
        this.entity = entity;
        this.propertyType = property;
        this.value = value;

        this.entity.properties.add(this);
        this.propertyType.properties.add(this);
    }

}
