package sn.ept.git.dic2.ventedevelosmobile.converters;

import androidx.room.TypeConverter;
import java.time.LocalDate;

public class LocalDateConverter {

    @TypeConverter
    public static LocalDate fromString(String value) {
        return value == null ? null : LocalDate.parse(value);
    }

    @TypeConverter
    public static String toString(LocalDate value) {
        return value == null ? null : value.toString();
    }

}
