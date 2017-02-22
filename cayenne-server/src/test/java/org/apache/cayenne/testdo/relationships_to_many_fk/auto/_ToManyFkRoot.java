package org.apache.cayenne.testdo.relationships_to_many_fk.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.relationships_to_many_fk.ToManyFkDep;

/**
 * Class _ToManyFkRoot was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ToManyFkRoot extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<Integer> DEP_ID = Property.create("depId", Integer.class);
    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<List<ToManyFkDep>> DEPS = Property.create("deps", List.class);

    public void setDepId(Integer depId) {
        writeProperty("depId", depId);
    }
    public Integer getDepId() {
        return (Integer)readProperty("depId");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void addToDeps(ToManyFkDep obj) {
        addToManyTarget("deps", obj, true);
    }
    public void removeFromDeps(ToManyFkDep obj) {
        removeToManyTarget("deps", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ToManyFkDep> getDeps() {
        return (List<ToManyFkDep>)readProperty("deps");
    }


}