import java.util.Arrays;

/*
select  managerId, manager.name, employee.employeeName from managers,employees

where managers.manageId = employees.managerId or managers.manageId <> employees.managerId

managers - managerId, name, department
employees - employeeId, name, department, managerId
*/

public class Practice {

	public static void main(String[] args) {

		/*two arrays non decresing arrays
		a = [1,2,4,]
		b = [3,5,6]
		ans = [1,2,3,4,5,6]
		*/
		
		int[] arr1 = {1,2,9};
		int[] arr2 = {3,5,6,7,8};
		
		int length =  arr1.length + arr2.length;
		
		int result[] = new int[length];
		int len = arr1.length;
		int index1 = 0, index2 = 0;
		for(int i =0;i<length;i++) {
			if(i < len) {
				result[i] = arr1[index1++];
			}
			else {
				result[i] = arr2[index2++];
			}
		}
		
		Arrays.stream(result).sorted().forEach(x -> System.out.print(x + " "));
	}

}

