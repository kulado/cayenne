package org.apache.cayenne.testdo.qualified.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.qualified.Qualified1;

/**
 * Class _Qualified2 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Qualified2 extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<Boolean> DELETED = new Property<>("deleted");
    public static final Property<String> NAME = new Property<>("name");
    public static final Property<Qualified1> QUALIFIED1 = new Property<>("qualified1");

    public void setDeleted(Boolean deleted) {
        writeProperty("deleted", deleted);
    }
    public Boolean getDeleted() {
        return (Boolean)readProperty("deleted");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setQualified1(Qualified1 qualified1) {
        setToOneTarget("qualified1", qualified1, true);
    }

    public Qualified1 getQualified1() {
        return (Qualified1)readProperty("qualified1");
    }


}
