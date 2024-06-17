
package com.solidprinciple.di;

public class Main {

	public static void main(String[] args) {
		 MessageService emailService = new EmailService();
	        MessageService smsService = new SMSService();

	        NotificationService emailNotificationService = new NotificationService(emailService);
	        emailNotificationService.sendNotification("Hello, Email World!");

	        NotificationService smsNotificationService = new NotificationService(smsService);
	        smsNotificationService.sendNotification("Hello, SMS World!");
	    }
}

