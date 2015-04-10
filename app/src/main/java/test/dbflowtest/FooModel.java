package test.dbflowtest;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by renan on 09/04/15.
 */
@Table(databaseName = AppDatabase.NAME)
public class FooModel extends BaseModel{
    // All tables must have a least one primary key
    @Column(columnType = Column.PRIMARY_KEY)
    String id;
}
