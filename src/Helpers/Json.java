package Helpers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.time.LocalDateTime;

public class Json
{
    public static String string(Object object)
    {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeTypeAdapter())
                .create();

        return gson.toJson(object);
    }

    public static String pretty(Object object)
    {
        Gson gson = new GsonBuilder()
            .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeTypeAdapter())
            .setPrettyPrinting()
            .create();
        return gson.toJson(object);
    }
}
