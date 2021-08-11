public class List {
    private String id;
        private String name;
	private String Phone;
        private String dep;
	
	public List(String id, String name, String Phone, String dep) {
		super();
                this.id = id;
		this.name = name;
		this.Phone = Phone;
                this.dep = dep;
	}
        
        public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String Phone) {
		this.Phone = Phone;
	}
        public String getDepartment() {
		return dep;
	}
	public void setDepartment(String dep) {
		this.dep = dep;
	}
	
}

