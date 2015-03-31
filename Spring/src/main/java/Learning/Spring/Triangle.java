package Learning.Spring;

public class Triangle {

	private String type;
	private int id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void draw()
	{
		System.out.println("From triangle");
	}
}
