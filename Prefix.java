public class Prefix {
	
	
	public String reverse(String str) {
		String txt = ""; 
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i)=='(') {
				txt += ')';
			}
			else if(str.charAt(i)==')') {
				txt += '(';
			}
			else
			txt += str.charAt(i);
		}
		return txt;
	}
	
	public String postfix(String exp) {
		LinkedStack s = new LinkedStack();
		String str = "";
		
		char testCh;
		
		for(int i=0; i<exp.length(); i++) {
			testCh = exp.charAt(i);
			switch(testCh){
			case '0' :
			case '1' :
			case '2' :
			case '3' :
			case '4' :
			case '5' :
			case '6' :
			case '7' :
			case '8' :
			case '9' :
			case '.' :
				str += testCh;
				break;
			case '+' : str+="k"; s.push("+");break;
			case '-' : str+="k"; s.push("-");break;
			case '/' : str+="k"; s.push("/");break;
			case '*' : str+="k"; s.push("*");break;

			case ')' :
				str += "k";
				str += s.pop();
				break;
			}
		}
		while(!s.isEmpty()){
			str +="k";
			str += s.pop();
		}
		return str;
	}
	
	public String deleteK(String exp) {
		String str="";
		char ch;
		for(int i=0; i<exp.length(); i++) {
			ch = exp.charAt(i);
			if(ch=='k') {
				str+=" ";
			}else {
				str+=ch;
			}
		}
		return str;
	}
	
	public String prefix(String exp) {
		String first = reverse(exp);
		String second = postfix(first);
		return reverse(second)+"k";
	}
	
	
	
	
	
	
	
}
