package springboot.homework3.REST.services;

public class RegistrationService {

    private UserService userService;
    private DataProcessingService dataProcessingService;
    private NotificationService notificationService;
    
    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

}
