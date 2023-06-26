import java.util.*;

public class StringsTally {
	private static String index(String str) {
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);

		return new String(charArray);
	}

	public static String getTally(String[] stringArray) {
		HashMap<String, String> indexMap = new HashMap<>();
		for (int i = 0; i < stringArray.length; i++) {
			String key = index(stringArray[i]);
			String value = indexMap.get(key);
			if (value == null) indexMap.put(key, "" + i);
			else indexMap.replace(key, value + ", " + i);
		}

		var wrapper = new Object() {
			String result = "";
		};
		indexMap.forEach((key, value) ->
				{
					if (value.contains(",")) wrapper.result += (wrapper.result.isEmpty() ? "" : " ") + key + " = " + value;
				}
		);

		return wrapper.result;
	}
}
