package jsonUtil;

import net.sf.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * 解析指定JSON文本
 *
 * @author zengxiaoqiang
 * @create 2021-04-24-14:12
 */
public class Test01 {

    public String getFileValue(String path) throws IOException {
        File file = new File(path);
        InputStream inputStream = new FileInputStream(file);
        return null;
    }



    public static List<HashMap<String,Object>> getJsonList(String json){
        List<HashMap<String,Object>> dataList;
        dataList = new ArrayList<>();
        JSONObject rootObject = new JSONObject();
        return null;
    }
}
