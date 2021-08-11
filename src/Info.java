public class Info {
    private String id;
    private String tri;
    private String cgpa;
	
	public Info(String id, String tri, String cgpa) {
            super();
            this.id = id;
            this.tri = tri;
            this.cgpa = cgpa;
	}
        
        public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	public String getTrimester() {
		return tri;
	}
	public void getTrimester(String tri) {
		this.tri = tri;
	}
	public String getCGPA() {
		return cgpa;
	}
	public void getCGPA(String cgpa) {
		this.cgpa = cgpa;
	}
}
