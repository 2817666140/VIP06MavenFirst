package com.testing.maven06.VIP06MavenFirst;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class Json2Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baiduIp="{\"status\":\"0\",\"t\":\"1589380383500\",\"set_cache_time\":\"\",\"data\":[{\"location\":\"美国\",\"titlecont\":\"IP地址查询\",\"origip\":\"3.3.3.3\",\"origipquery\":\"3.3.3.3\",\"showlamp\":\"1\",\"showLikeShare\":1,\"shareImage\":1,\"ExtendedLocation\":\"\",\"OriginQuery\":\"3.3.3.3\",\"tplt\":\"ip\",\"resourceid\":\"6006\",\"fetchkey\":\"3.3.3.3\",\"appinfo\":\"\",\"role_id\":0,\"disp_type\":0}]}";
		//解析百度IP字符串为json格式对象
		JSONObject baidujson=JSON.parseObject(baiduIp);
		System.out.println("jsonobject的内容："+baidujson);
		//遍历每个键值对，存储到map中
		System.out.println(baidujson.get("data"));
		
		Map<String, Object> baidumap=new HashMap<>();
		//遍历json中所有键
		Set<String> jsonkeys= baidujson.keySet();
		for(String key : jsonkeys) {
			System.out.println("键是"+key+"值是"+baidujson.get(key));
			baidumap.put(key, baidujson.get(key));
		}
		//打印map内容
		System.out.println("map格式存储的结果："+baidumap);
		
		
		JSONArray result=baidujson.getJSONArray("data");
		System.out.println("jsonarray的内容："+result);
		JSONObject results=result.getJSONObject(0);
		
		String datas=results.toString();
		System.out.println("datas的内容："+datas);
		String datas1=result.toString();
		String datas2=datas1.substring(1, datas1.length()-1);
		System.out.println("datas2的内容："+datas2);

		
		
		
		
		
		
	}



}
