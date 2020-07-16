
public class PreOpt extends Prefix{

	LinkedStack s = new LinkedStack();
	
	public String preOpt(String opt) {
		String exp = prefix(opt);
		String str ="";
		char ch;
		double a, b;
		double result = 0;
		try {
			for(int i=0; i<exp.length(); i++) {
				ch = exp.charAt(i);
				if(ch=='*'||ch=='/'||ch=='+'||ch=='-') {//연산자일때
					str += ch;
					s.push(str);
					str = "";
				}
				else if(ch!='k'&&ch!='*'&&ch!='/'&&ch!='+'&&ch!='-') {//숫자일때
						str += ch;
				}
				else if(ch=='k'&&!str.equals("")) {//k일때
					if(s.peek().equals("*")||s.peek().equals("/")||s.peek().equals("+")||s.peek().equals("-")) {//top이 연산자일때
						s.push(str);
						str="";
					}
					else if(!s.peek().equals("*")&&!s.peek().equals("/")&&!s.peek().equals("+")&&!s.peek().equals("-")) {//top이 숫자일때
						a = Double.parseDouble(s.pop());
						b = Double.parseDouble(str);
						str = "";
						switch (s.pop()) {
						case "+": result = a+b;s.push(Double.toString(result));break;
						case "-": result = a-b;s.push(Double.toString(result));break;
						case "*": result = a*b;s.push(Double.toString(result));break;
						case "/": result = a/b;s.push(Double.toString(result));break;
						}
					}
				}
			}
			while(s.size()!=1) {
				b = Double.parseDouble(s.pop());
				a = Double.parseDouble(s.pop());
				switch (s.pop()) {
				case "+": result = a+b;s.push(Double.toString(result));break;
				case "-": result = a-b;s.push(Double.toString(result));break;
				case "*": result = a*b;s.push(Double.toString(result));break;
				case "/": result = a/b;s.push(Double.toString(result));break;
				}
			}
		}catch(Exception e) {
		}
		return s.pop();	
	}
}
