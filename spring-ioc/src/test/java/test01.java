import com.eric.service.UserService;
import com.eric.service.UserServiceImpl;

public class test01 {
    public static void main(String[] args) {
        UserService service = new UserServiceImpl();
        service.getService();
    }
}
