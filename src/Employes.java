
public abstract class Employes implements Cloneable {

	private String id;
	protected String type;
	
	abstract void data();
	public String getid(){
		return id;
	}
	public String gettype(){
		return type;
	}
	public void setid(String id){
		this.id=id;
	}
	public void settype(String type){
		this.type=type;
	}
	protected Object Clone(){
		Object clone=null;
		try{
			clone=super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return clone;
		
	}
}
