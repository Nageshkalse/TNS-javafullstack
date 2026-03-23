package org.tns.cap.c2tc.srdeveloper;
import org.tns.cap.c2tc.jrdeveloper.*;

public class InternalSystem {
	public void showInternal() {
        System.out.println("Internal system developed by Senior Developer");
        SpeedLimit s = new SpeedLimit();
        s.showSpeedLimit();
        AirBag a = new AirBag();
        a.showAirBag();
    }
	public static void main(String[] args) {
        InternalSystem obj = new InternalSystem();
        obj.showInternal();
    }


}
