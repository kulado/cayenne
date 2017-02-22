package org.apache.cayenne.testdo.inheritance_vertical.auto;

import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.inheritance_vertical.IvRoot;

/**
 * Class _IvSub2 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _IvSub2 extends IvRoot {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> SUB2ATTR = Property.create("sub2Attr", String.class);
    public static final Property<String> SUB2NAME = Property.create("sub2Name", String.class);

    public void setSub2Attr(String sub2Attr) {
        writeProperty("sub2Attr", sub2Attr);
    }
    public String getSub2Attr() {
        return (String)readProperty("sub2Attr");
    }

    public void setSub2Name(String sub2Name) {
        writeProperty("sub2Name", sub2Name);
    }
    public String getSub2Name() {
        return (String)readProperty("sub2Name");
    }

}