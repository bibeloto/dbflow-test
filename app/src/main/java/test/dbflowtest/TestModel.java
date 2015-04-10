package test.dbflowtest;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ForeignKeyReference;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by renan on 09/04/15.
 */

@Table(databaseName = AppDatabase.NAME)
public class TestModel extends BaseModel {

    // All tables must have a least one primary key
    @Column(columnType = Column.PRIMARY_KEY)
    String name;

    // By default the column name is the field name
    @Column(columnType = Column.FOREIGN_KEY,
            references = {@ForeignKeyReference(columnName = "fooId", columnType = String.class, foreignColumnName = "id")/*,
                    @ForeignKeyReference(columnName = "column2InTable", columnType = String.class, foreignColumnName = "column2InForeignKeyTable")*/})
    String fooId;

}
