package http.protocol;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

public class RecommendProtocol extends BaseProtocol<ArrayList<String>> {
    @Override
    public String getKey() {
        return null;
    }

    @Override
    public String getParams() {
        return null;
    }

    @Override
    public ArrayList<String> parseData(String result) {
        try {
            result="['QQ','视频','电子书','酒店','单机','小说','放开那三国','斗地主','优酷','网游','WIFI万能钥匙','播放器','捕鱼达人2','机票','游戏','熊出没之熊大快跑','美图秀秀','浏览器','单机游戏','我的世界','电影电视','QQ空间','旅游','免费游戏','2048','刀塔传奇','壁纸','节奏大师','锁屏','装机必备','天天动听','备份','网盘']";
            JSONArray ja=new JSONArray(result);
            ArrayList<String>list=new ArrayList<String>();
            for (int i = 0; i <ja.length() ; i++) {
                String keyword = ja.getString(i);
                list.add(keyword);
            }
            return list;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
