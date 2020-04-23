package com.cts.AcademyPortal.Models;

public class AdminLogin {

		private String UserId;
		private String Password;
		public String getUserId() {
			return UserId;
		}
		public void setUserId(String userId) {
			UserId = userId;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		@Override
		public String toString() {
			return "AdminLogin [UserId=" + UserId + ", Password=" + Password + "]";
		}
		

	}
