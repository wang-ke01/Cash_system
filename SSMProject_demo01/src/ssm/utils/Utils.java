package ssm.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


public class Utils {
	public static String getUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}
	
	public static String formatDate() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date());
	}
	
}
