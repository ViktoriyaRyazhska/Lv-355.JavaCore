/*�������� 2
 2.	�������� �� ����������� �����������  , �������� ���  ����������� �� ��������� ��������:
 �0=0, �1=5/8, �� =((�[i]-1)/2)+ 3/4*(x[i]-2), i = 2,3... 

  */
public class Task2 {

	public static void main(String[] args) {
		double[] massive = new double[20];
		massive[0] = 0;
		massive[1] = 5.0/8.0;
		double[] a = new double[20];
		for(int i = 2;i<massive.length;i++) {
			massive[i] = (massive[i-1]/2.0)+((3.0/4.0)*massive[i-2]);
			a[i]=massive[i];
			}
		for(int i = 2;i<massive.length;i++) {
		System.out.println(a[i]);}
		
         
		}}



