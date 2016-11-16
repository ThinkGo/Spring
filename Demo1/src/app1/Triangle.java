package app1;
public class Triangle  {
	private String type = "";
	private int height = 0;

	public Triangle(String type) {
		this.type = type;
		System.out.println("constructore"+getType());
	}
	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
		System.out.println("constructore type="+getType()+"; height="+getHeight());
	}

	public void draw() {
		System.out.println("i'm triangle of type=" + getType());
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public int getHeight() {
		return height;
	}
//	public void setHeight(int height) {
//		this.height = height;
//	}

}
