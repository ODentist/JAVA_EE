import com.example.Odentist.pay.impl.ALiPay;
import com.example.Odentist.pay.pay;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Spring {
    @Test
    public void test(){
        ApplicationContext app=new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
        ALiPay aLiPay = (ALiPay) app.getBean("ALiPay");
        aLiPay.Pay();
        pay wePay = (pay)app.getBean("WePay");
        wePay.Pay();
    }
}
