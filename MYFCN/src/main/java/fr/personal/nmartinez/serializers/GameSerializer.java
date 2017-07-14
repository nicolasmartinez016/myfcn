package fr.personal.nmartinez.serializers;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import fr.personal.nmartinez.dtos.GameDto;
import fr.personal.nmartinez.entities.Game;

/**
 * Created by marti on 03/07/2017.
 */
public class GameSerializer {

    public static String serialize(Game game){
        GameDto gameDto = new GameDto(game);
        Gson serializer = new Gson();
        String json = serializer.toJson(gameDto);
        return json;
    }

    public static Game deserialize(String jsonGame){
        Gson deserializer = new Gson();
        JsonObject json = new JsonParser().parse(jsonGame).getAsJsonObject();
        json.get()
    }
}
