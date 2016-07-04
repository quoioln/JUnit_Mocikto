package singleton;

public class CallDBService {

    public User getData() {
        int userID = 1234;
        User user = DBService.getInstance().getUserInfo(userID);
        
        if (user.getUserName() == null) {
            return null;
        }
        
        if (user.getUserName() == "admin") {
            user.setPassword("passadmin");
            
            return user;
        }
        
        return user;
    }
}
