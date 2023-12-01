package Collections.enumSet;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetMain {
    public static void main(String[] args) {
        Set<PaymentStatus> paymentStatusList = EnumSet.allOf(PaymentStatus.class);
        for(PaymentStatus p1 : paymentStatusList){
            System.out.println(p1);
        }
    }
}
