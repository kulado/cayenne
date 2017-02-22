package org.apache.cayenne.testdo.binary_pk.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.binary_pk.BinaryPKTest1;

/**
 * Class _BinaryPKTest2 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _BinaryPKTest2 extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<String> DETAIL_NAME = Property.create("detailName", String.class);
    public static final Property<BinaryPKTest1> TO_BINARY_PKMASTER = Property.create("toBinaryPKMaster", BinaryPKTest1.class);

    public void setDetailName(String detailName) {
        writeProperty("detailName", detailName);
    }
    public String getDetailName() {
        return (String)readProperty("detailName");
    }

    public void setToBinaryPKMaster(BinaryPKTest1 toBinaryPKMaster) {
        setToOneTarget("toBinaryPKMaster", toBinaryPKMaster, true);
    }

    public BinaryPKTest1 getToBinaryPKMaster() {
        return (BinaryPKTest1)readProperty("toBinaryPKMaster");
    }


}