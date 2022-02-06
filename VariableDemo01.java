/*
	变量定义格式:
		数据类型变量名-变量值;
	基本数据类型:
		byte,short,int,long,float, double,char,boolean
	变量的使用:
		取值格式:变量名
		修改值格式:变量名=变量值;

*/
public class VariableDemo01 {
	public static void main(String[] args) {
		//定义变量
		int a = 10;

		//输出变量
		System.out.println(a);

		//修改变量
		a = 20;
		System.out.println(a);
		System.out.println("----------");

		double b = 1.2;
		System.out.println(b);

		//修改变量
		b = 2.4;
		System.out.println(b);
		System.out.println("----------");

		char c = 'a';
		System.out.println(c);

		//修改变量
		c = 'b';
		System.out.println(c);
		System.out.println("----------");
	}
}
