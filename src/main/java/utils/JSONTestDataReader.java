package utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JSONTestDataReader {
    private static final String RESOURCES_MAIN_PATH = "src/test/resources/";
    private JSONParser jsonParser = new JSONParser();
    private FileReader reader;
    //Read JSON file
    private JSONObject root;

    public JSONTestDataReader(String path) throws IOException, ParseException {
        reader = new FileReader(RESOURCES_MAIN_PATH + path);
        root = (JSONObject) jsonParser.parse(reader);
    }

    public JSONObject getField(String fieldName) {
        return (JSONObject) root.get(fieldName);
    }

    public String getStringValue(String fieldName) {
        return (String) root.get(fieldName);
    }

    public String getNestedStringValue(JSONObject parent, String fieldName) {
        return (String) parent.get(fieldName);
    }
}
