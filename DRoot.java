public class DRoot {
	public static int digital_root(int n) {
		int result = 0;
		int SumString = 0;
		boolean judge = false;
		String StringN = Integer.toString(n);
		while(!judge) {
			String[] StringArray = StringN.split("");
			for(int i=0;i<StringArray.length;i++) {
				SumString += Integer.parseInt(StringArray[i]);
			}
			StringN = Integer.toString(SumString);
			if(StringN.length() == 1) {
				judge = true;
				result = Integer.parseInt(StringN);
			}
			else{
				SumString = 0;
				continue;
			}
		}

		return result;
		}
	}