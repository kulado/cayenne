package org.apache.cayenne.testdo.relationships_delete_rules.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.relationships_delete_rules.DeleteRuleTest1;
import org.apache.cayenne.testdo.relationships_delete_rules.DeleteRuleTest3;

/**
 * Class _DeleteRuleTest2 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DeleteRuleTest2 extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String DEL_RULE_TEST2_ID_PK_COLUMN = "DEL_RULE_TEST2_ID";

    public static final Property<List<DeleteRuleTest3>> DELETE_RULE_TEST3ARRAY = new Property<>("deleteRuleTest3Array");
    public static final Property<List<DeleteRuleTest1>> TEST1ARRAY = new Property<>("test1Array");

    public void addToDeleteRuleTest3Array(DeleteRuleTest3 obj) {
        addToManyTarget("deleteRuleTest3Array", obj, true);
    }
    public void removeFromDeleteRuleTest3Array(DeleteRuleTest3 obj) {
        removeToManyTarget("deleteRuleTest3Array", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<DeleteRuleTest3> getDeleteRuleTest3Array() {
        return (List<DeleteRuleTest3>)readProperty("deleteRuleTest3Array");
    }


    public void addToTest1Array(DeleteRuleTest1 obj) {
        addToManyTarget("test1Array", obj, true);
    }
    public void removeFromTest1Array(DeleteRuleTest1 obj) {
        removeToManyTarget("test1Array", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<DeleteRuleTest1> getTest1Array() {
        return (List<DeleteRuleTest1>)readProperty("test1Array");
    }


}
