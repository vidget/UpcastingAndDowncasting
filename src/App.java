
class Machine{
	public void start(){
		System.out.println("Machine started");
	}
}

class Camera extends Machine{
	
	public void start(){
		System.out.println("Camera started");
	}
	
	public void snap(){
		System.out.println("Photo taken");
	}
	
	
}


public class App {

	public static void main(String[] args) {
		
		
		Machine mach1 = new Machine();
		Camera cam1 = new Camera();
		
		mach1.start();
		cam1.start();
		cam1.snap();
		
		//Upcasting 
		Machine mach2 = cam1;
		mach2.start();
		//The variable decides which methods can be called
		//this won't work. Which implementation are 
		//determinced by the object.
		//	mach2.snap();
		
		
		//Downcasting -- requires brackets () with type of 
		//Object you're downcasting too.
		Machine mach3 = new Camera();
		Camera cam2 = (Camera)mach3;
		cam2.start();
		cam2.snap();
		
		//Can't be done -- causes RUNTIME error 
		//	Machine mach4 = new Machine();
		//	Camera cam3 = (Camera)mach4;
		//	cam3.start();
		//	cam3.snap();
		
		

	}

}
