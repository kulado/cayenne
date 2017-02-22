package org.apache.cayenne.testdo.lob.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.lob.ClobTestEntity;

/**
 * Class _ClobTestRelation was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ClobTestRelation extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<Integer> ID = Property.create("id", Integer.class);
    public static final Property<Integer> VALUE = Property.create("value", Integer.class);
    public static final Property<ClobTestEntity> CLOB_ID = Property.create("clobId", ClobTestEntity.class);

    public void setId(Integer id) {
        writeProperty("id", id);
    }
    public Integer getId() {
        return (Integer)readProperty("id");
    }

    public void setValue(Integer value) {
        writeProperty("value", value);
    }
    public Integer getValue() {
        return (Integer)readProperty("value");
    }

    public void setClobId(ClobTestEntity clobId) {
        setToOneTarget("clobId", clobId, true);
    }

    public ClobTestEntity getClobId() {
        return (ClobTestEntity)readProperty("clobId");
    }


}