package org.apache.cayenne.testdo.inheritance_vertical.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _IvBase was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _IvBase extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<String> TYPE = Property.create("type", String.class);

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setType(String type) {
        writeProperty("type", type);
    }
    public String getType() {
        return (String)readProperty("type");
    }

}