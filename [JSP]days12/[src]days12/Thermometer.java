package days12;

import java.util.HashMap;
import java.util.Map;

public class Thermometer {

	private Map<String, Double> locationCelsiuesMap = new HashMap<>();
	
	
	public void setCelsius(String location, Double value) {
		locationCelsiuesMap.put(location,value);
	}
	
	public Double getCelsius(String location) {
		return locationCelsiuesMap.get(location);
	}
	//지역 섭씨 온도 -> 화씨 변환 반환 메서드
	public Double getFahernheit(String location) {
		Double celsius = getCelsius(location);
		if(celsius==null) {
			return null;			
		}
		return celsius.doubleValue()*1.8+32.0;
	}
	
	public String getInfo() {
		return "온도계 변환기 1.1";
	}
	
}
