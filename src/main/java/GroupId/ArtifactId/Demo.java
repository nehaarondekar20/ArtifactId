package GroupId.ArtifactId;

import org.testng.annotations.Test;

public class Demo implements CentralTraffic
{
    public static void main( String[] args )
    {
        Demo d = new Demo();
        CentralTraffic ct=new Demo();
        //ct.Red();
        d.Red();
        d.Printname();
    }
    @Test
    public void Printname() {
    	System.out.println("neha");
    }

	public void Red() {
		// TODO Auto-generated method stub
		System.out.println("Red signal");
	}

	public void Green() {
		// TODO Auto-generated method stub
		System.out.println("Green signal");
	}

	public void Yellow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow signal");
	}
}
