import java.util.Scanner;
public class TelevisionTest{
    public static void main(String[] args){
	Television remote = new Television(true, false, "LG", 9, 0);
	Scanner input = new Scanner(System.in);

	remote.setOn(false);
        remote.setBrandName("LG");
        remote.setCurrentChannel(9);
	remote.setCurrentVolume(0);
        remote.decreaseChannel();
        remote.increaseChannel();
	remote.decreaseVolume();
	remote.increaseVolume();
		
	System.out.println("Enter a Channel number: ");	
		double channelNumber = input.nextDouble();

	System.out.println("Life is Good " + remote.getBrandName());
        System.out.println("LG TV is on " + remote.isOn());
        System.out.println("Channel is on " + remote.getCurrentChannel());
	//System.out.println("Channel is on" + remote.increaseChannel());
	//System.out.println("Channel is on" + remote.decreaseChannel());
	//System.out.println("Volume is on" + remote.increaseVolume());
	//System.out.println("Volume is on" + remote.increaseVolume());

}
}