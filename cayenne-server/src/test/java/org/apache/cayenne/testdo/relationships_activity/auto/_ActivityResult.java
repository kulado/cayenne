package org.apache.cayenne.testdo.relationships_activity.auto;

import java.sql.Date;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _ActivityResult was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ActivityResult extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String APPOINT_DATE_PK_COLUMN = "APPOINT_DATE";
    public static final String APPOINT_NO_PK_COLUMN = "APPOINT_NO";
    public static final String RESULTNAME_PK_COLUMN = "RESULTNAME";

    public static final Property<Date> APPOINT_DATE = new Property<>("appointDate");
    public static final Property<Integer> APPOINT_NO = new Property<>("appointNo");
    public static final Property<String> FIELD = new Property<>("field");

    public void setAppointDate(Date appointDate) {
        writeProperty("appointDate", appointDate);
    }
    public Date getAppointDate() {
        return (Date)readProperty("appointDate");
    }

    public void setAppointNo(int appointNo) {
        writeProperty("appointNo", appointNo);
    }
    public int getAppointNo() {
        Object value = readProperty("appointNo");
        return (value != null) ? (Integer) value : 0;
    }

    public void setField(String field) {
        writeProperty("field", field);
    }
    public String getField() {
        return (String)readProperty("field");
    }

}
