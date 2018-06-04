
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeCache.loadCache();
		Employes clonedShape= (Employes) EmployeeCache.getEmployes("1");
		System.out.println("Shape: "+clonedShape.gettype());
		Employes clonedShape2= (Employes) EmployeeCache.getEmployes("2");
		System.out.println("Shape: "+clonedShape2.gettype());
	}

}
