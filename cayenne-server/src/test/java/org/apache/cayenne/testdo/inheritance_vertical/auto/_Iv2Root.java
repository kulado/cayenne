package org.apache.cayenne.testdo.inheritance_vertical.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _Iv2Root was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Iv2Root extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> DISCRIMINATOR = Property.create("discriminator", String.class);

    public void setDiscriminator(String discriminator) {
        writeProperty("discriminator", discriminator);
    }
    public String getDiscriminator() {
        return (String)readProperty("discriminator");
    }

}