package _07_tea_party;

public class TeaParty {
	
    public String welcome(String name, boolean isWoman, boolean isKnighted) {
    String one = "Hello ";
    String two = "0";
    if(isWoman == true){
    	if(isKnighted == true){
    		two = "Lady ";
    	}
    	else{
    		two = "Ms. ";
    	}
    }
    if(isWoman == false){
    	if(isKnighted == true){
    		two = "Sir ";
    	}
    	else{
    	     two = "Mr. ";
    	}
    }
    
    String n = one+two+name;
    return n;
    
    }
    
    
}
