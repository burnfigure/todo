package Helpers;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTypeAdapter implements JsonSerializer<LocalDateTime>
{
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Y-m-d HH:mm:ss");

    @Override
    public JsonElement serialize(
            LocalDateTime localDateTime,
            Type srcType,
            JsonSerializationContext context
    )
    {
        return new JsonPrimitive(formatter.format(localDateTime));
    }
}
