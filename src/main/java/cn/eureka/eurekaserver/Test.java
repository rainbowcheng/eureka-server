package cn.eureka.eurekaserver;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.google.common.base.Strings;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Object> user=new HashMap<String,Object>();
		user.put("type", 4);
		System.out.println(user.get("type").toString().equals("4"));
		
		String str="http://www.baidu.com/,http://127.0.0.1:2222/rainbow/";
		Strings.isNullOrEmpty(str);
		if(!StringUtils.isEmpty(str)){
			String[] urlsSplit=StringUtils.commaDelimitedListToStringArray(str);
			for (String url : urlsSplit) {
				System.out.println(url);
			}
			System.out.println(org.apache.commons.lang.StringUtils.join(urlsSplit,","));
		}else{
			
		}

	}

}
