package th.ac.su.speedrecords.dp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import th.ac.su.speedrecords.model.Record;


@Dao
public interface RecordDao {

    @Query("SELECT * FROM record")
    Record[] getAllRecord();

    @Query("SELECT * FROM record WHERE id = :id")
    Record getRecordById(int id);

    @Insert
    void addRecord(Record... users);

    @Delete
    void deleteRecord(Record user);
}
