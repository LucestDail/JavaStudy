public class DirReduction {
    public static String[] dirReduc(String[] arr) {
    	StringBuilder sb = new StringBuilder("");
    	for(String arrString : arr) {
    		sb.append(" ");
    		sb.append(arrString);
    	}
    	String sbString = sb.toString();
    	System.out.println(sbString);
    	String[] resultArray = new String[arr.length];
    	int count = 0;
    	if(arr.length == 0) {
    		return new String[] {};
    	}else {
        	String[] compareArray = arr.clone();
    		for(int i = 0; i < compareArray.length;i++) {
    			for(int j = i; j< compareArray.length;j++) {
    				switch(compareArray[i]){
    				case "NORTH":
    					if(compareArray[j].equals("SOUTH")) {
    						System.out.println("NORTH catch SOUTH" + " i : " + i + "/ j : " + j);
    						compareArray[i] = "";
    						compareArray[j] = "";
    						break;
    					}else if(j == compareArray.length-1) {
    						resultArray[count] = compareArray[i];
        					count++;
        					System.out.println("NORTH count rised : " + count + " : " + resultArray[count-1]);
        					break;
    					}else
    						continue;
    				case "SOUTH":
    					if(compareArray[j].equals("NORTH")) {
    						System.out.println("SOUTH catch NORTH" + " i : " + i + "/ j : " + j);
    						compareArray[i] = "";
    						compareArray[j] = "";
    						break;
    					}else if(j == compareArray.length-1) {
    						resultArray[count] = compareArray[i];
        					count++;
        					System.out.println("SOUTH count rised : " + count + " : " + resultArray[count-1]);
        					break;
    					}else
    						continue;
    				case "EAST":
    					if(compareArray[j].equals("WEST")) {
    						System.out.println("EAST catch WEST" + " i : " + i + "/ j : " + j);
    						compareArray[i] = "";
    						compareArray[j] = "";
    						break;
    					}else if(j == compareArray.length-1) {
    						resultArray[count] = compareArray[i];
        					count++;
        					System.out.println("EAST count rised : " + count + " : " + resultArray[count-1]);
        					break;
    					}else
    						continue;
    				case "WEST":
    					if(compareArray[j].equals("EAST")) {
    						System.out.println("WEST catch EAST" + " i : " + i + "/ j : " + j);
    						compareArray[i] = "";
    						compareArray[j] = "";
    						break;
    					}else if(j == compareArray.length-1) {
    						resultArray[count] = compareArray[i];
        					count++;
        					System.out.println("WEST count rised : " + count + " : " + resultArray[count-1]);
        					break;
    					}else
    						continue;
    				case "":
    					break;
    				default:
    					break;
    				}
    			}
    		}
    	}
    	String[] finalResultArray = new String[count];
    	for(int i = 0; i < count; i ++) {
    		finalResultArray[i] = resultArray[i];
    	}
        return finalResultArray;
    }
}
