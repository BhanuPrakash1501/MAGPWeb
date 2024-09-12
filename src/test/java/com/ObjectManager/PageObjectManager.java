package com.ObjectManager;

import com.pages.FaqPage;
import com.pages.FavoutitesPage;
import com.pages.ForgetPasswordPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.PreLoginPage;
import com.pages.ProfilePage;
import com.pages.SignUpPage;
import com.pages.StaffLogin;

public class PageObjectManager {

	private LoginPage login;
	private PreLoginPage preLogin;
	private FaqPage faqPage;
	private FavoutitesPage favoutitesPage;
	private ForgetPasswordPage forgetPasswordPage;
	private HomePage homePage;
	private ProfilePage profilePage;
	private SignUpPage signUpPage;
	private StaffLogin staffLogin;
	

	public FaqPage getFaqPage() {
		return (faqPage == null)? faqPage = new FaqPage():faqPage;
	}

	public FavoutitesPage getFavoutitesPage() {
		return (favoutitesPage == null)? favoutitesPage = new FavoutitesPage():favoutitesPage;
	}

	public ForgetPasswordPage getForgetPasswordPage() {
		return (forgetPasswordPage == null)? forgetPasswordPage = new ForgetPasswordPage():forgetPasswordPage;
	}

	public HomePage getHomePage() {
		return (homePage == null)? homePage = new HomePage():homePage;
	}

	public ProfilePage getProfilePage() {
		return (profilePage == null)? profilePage = new ProfilePage():profilePage;
	}

	public SignUpPage getSignUpPage() {
		return (signUpPage == null)? signUpPage = new SignUpPage():signUpPage;
	}

	public StaffLogin getStaffLogin() {
		return (staffLogin == null)? staffLogin = new StaffLogin():staffLogin;
	}

	public LoginPage getLogin() {
		return (login == null)? login = new LoginPage():login;
	}

	public PreLoginPage getPreLogin() {
		return (preLogin == null)? preLogin = new PreLoginPage():preLogin;
	}

}
