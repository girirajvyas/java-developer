package io.girirajvyas.questions.pojo;
/**
 * how can we access size variable of outer class inside inner class
 * @author giri
 *
 */
public class InnerClassDemo {
	
	public int size = 0;
	
	static class StaticInnerClass{
		
		public void incrementParentSize(){
			//super.size = super.size + 10;
			//this.size = this.size + 10;
			//InnerClassDemo.size = InnerClassDemo.size + 10;
		}
		
	}
	
	class InnerClass{
		public void incrementParentSize(){
			//super.size = super.size + 10;
			//InnerClass.this.size = this.size + 10;
			//InnerClassDemo.this.size = InnerClassDemo.size + 10;
		}
		
	}

}
