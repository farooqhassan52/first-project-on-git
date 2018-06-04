import java.util.Hashtable;

public class EmployeeCache {
private static Hashtable<String, Employes> shapemap=new Hashtable<String, Employes>();
	
	public static Employes getEmployes(String employeeeid){
		
		Employes cachedShape = shapemap.get(employeeeid);
		
		return (Employes) cachedShape.Clone();
	}
	
	public static void loadCache(){
		Teacher circle =new Teacher();
		circle.setid("1");
		shapemap.put(circle.getid(),circle);
		Cashier cashier=new Cashier();
		cashier.setid("2");
		shapemap.put(cashier.getid(),cashier);
		
	}
}
