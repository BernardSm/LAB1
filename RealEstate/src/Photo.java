
public class Photo {
	private String name;
	private int size_in_kb;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getsize_in_kb() {
		return size_in_kb;
	}
	public void setsize_in_kb(int size_in_kb) {
		this.size_in_kb = size_in_kb;
	}
	
	public Photo() {
		super();
		this.name = "";
		this.size_in_kb = 0;
	}
	
	public Photo(String name, int size_in_kb) {
		super();
		this.name = name;
		this.size_in_kb = size_in_kb;
	}
	
	@Override
	public String toString() {
		return "Photo [name=" + name + ", size_in_kb=" + size_in_kb + "]";
	}
	
	
}
