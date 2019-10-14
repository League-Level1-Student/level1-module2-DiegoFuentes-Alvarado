package _06_minion;

public class Minion {
	private String name; 
	private int eyes; 
	private String color; 
	private String master;
	
	
	Minion(String name, int eyes, String color, String master){
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}
		public String getName(){
			return name;
		}
		public void setName(String n){
			name = n;
		}
		
		
		public String getColor(){
			return color;
		}
		public void setColor(String c){
			color = c;
		}
		
		
		public String getMaster(){
			return master;
		}
		public void setMaster(String m){
			master = m;
		}
		
		
		public int getEyes(){
			return eyes;
		}
		public void setEyes(int e){
			eyes = e;
		}
		
	}

