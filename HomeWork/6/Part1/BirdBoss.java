package HomeWork6;

public class BirdBoss {

	public static void main(String[] args) {
		
		Bird [] b = new Bird [4];
		b[0] = new Eagle ("�� ��'�", "³������ ����");
		b[1] = new Swallow ("�� ��'�", "³������ ����");
		b[2] = new Penguin ("�� �� ��'�", "³������ ����");
		b[3] = new Kiwi ("�� ��'�", "³������ ����");
		
		for(int i = 0; i<b.length; i++) {
			b[i].fly();
		}
	}

}
