import java.util.Arrays;

class SortingSolution {
	public static int[] solved(int[] array, int[][] commands) {
		System.out.println("----------solved Activated----------");
		int[] result = new int[commands.length];
		int count = 0;
		for(int[] item : commands) {
			System.out.println("testing commands : " + item[0] +"," +  item[1] +","+ item[2]);
			int[] target = Arrays.copyOfRange(array,item[0]-1,item[1]);
			Arrays.sort(target);
			System.out.print("this is target target array : ");
			for(int itemTarget : target) {
				System.out.print(itemTarget + " ");
			}
			System.out.println("");
			System.out.println("target item : " + target[item[2]-1]);
			result[count] = target[item[2]-1];
			System.out.println("result array added : " + result[count]);
			count++;
			System.out.println("==========Loop Ended==========");
		}
		for(int item : result) {
			System.out.print(item + " ");
		}
		return result;
	}
}