class Demo 
{
	int x,  y ; 
	static int z = 30;
	
	void add (){
		int q = x + y +z ;
		System.out.println("q = " + q) ; 	
		modify () ;
	}

	static void modify (){
		Demo d = new Demo() ;
		int a = d.x + d.y + z ;
		z *= 2  ;  //mark thi s...it is a local variable not the static variable*/
		//int z = this.z * 2 ; This can't be used here 
		System.out.println("z= " + z) ;
	}
	Demo (){
		x = 5 ; 
		y = 10 ; 
		//z = 30 ;
	}
	public static void main (String [] args){
		Demo d = new Demo () ;
		d.add () ; 
		Demo d2 = new Demo () ;
		modify () ; 
		d2.add () ; 
		Demo d3= new Demo () ;
		modify () ;
		d3.add () ;
		d.i.display () ;
		d.new Inner ().display () ;
	}
	class Inner  //inner class behaves as a member function of the outer class
	{
		int t  = 50 ;
		void display (){
			System.out.println("x+y+t =  " + x+y+t) ;
		}

		/*static void abc (){
			System.out.println ("testing") ;
		}*/
		
	}

	Inner i = new Inner() ; 
	//i.display()  ;
}
