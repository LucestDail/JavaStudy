class Persist {
	public static int persistence(long n) {
		
		int count = 0;
		
		long value = n;
		long calculation = 1;
		while(true) {
			String StringLongValue = Long.toString(value);
			String[] StringLongValueArray = StringLongValue.split("");
			if(StringLongValueArray.length == 1)
				break;
			else {
				for(int i=0; i<StringLongValueArray.length;i++) {
					calculation = calculation * Long.parseLong(StringLongValueArray[i]);
				}
				value = calculation;
			}
			count++;
			calculation = 1;
		}
		return count;
	}
}