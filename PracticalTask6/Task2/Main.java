
public class Main {
public static void main(String [] args) {
	Person[] p = {new Student(),new Teacher(),new Cleaner(), new Teacher(),new Cleaner()};
for(int i = 0;i<p.length;i++) {
	p[i].print();
if(p[i] instanceof Staff) {
	((Staff) p[i]).salary();
}
}
}
}
