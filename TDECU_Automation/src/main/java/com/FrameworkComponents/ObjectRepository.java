package com.FrameworkComponents;

public class ObjectRepository {

	//login page
	public static String username_txt="//input[@id='frmLogin_main_tbxUserName']";
	public static String password_txt="//input[@id='frmLogin_main_tbxPassword']";
	public static String login_btn="//input[@id='frmLogin_main_btnLogin']";
	public static String logout_lnk="//input[@id='frmAccountsLanding_postLoginHdr_btnLogOut']";

//transfer page	
	public static String transferPay="//div[@id='frmAccountsLanding_postLoginHdr_lblTransferAndPay']";
	public static String transferMoney="//div[@id='frmAccountsLanding_postLoginHdr_flxTransferMoney']";
	public static String transferscreentitle="//div[contains(text(),'Select a Transfer Type')]";
	public static String continuebtn_MyTDECU="//input[@id='frmTransfers_transfermain_btnToMyKonyBankProceed']";
	public static String continuebtn_OtherTDECU="//input[@id='frmTransfers_transfermain_btnToOtherKonyBankProceed']";
	public static String configuretransfertitle="//div[@id='frmTransfers_transfermain_maketransfer_lblTransferFrom']";
	
	public static String fromacntdroparw="//span[@id='frmTransfers_transfermain_maketransfer_imgDropdown_span']";
	public static String toacntdroparw="//span[@id='frmTransfers_transfermain_maketransfer_imgDropdownTo_span']";
	public static String frequencydrop="//select[@id='frmTransfers_transfermain_maketransfer_lbxFrequency']";
	public static String howlongdrop="//select[@id='frmTransfers_transfermain_maketransfer_lbxForHowLong']";
	public static String sendOnCal="//input[@id='calSendOn']";
	public static String endOnCal="//input[@id='calEndingOn']";
	public static String noOfRecurrences="//input[@id='frmTransfers_transfermain_maketransfer_tbxNoOfRecurrences']";
	
	public static String amount_txt="//input[@id='frmTransfers_transfermain_maketransfer_tbxAmount']";
	public static String notes_txt="//input[@id='frmTransfers_transfermain_maketransfer_txtNotes']";
	public static String maketransfer_btn="//input[@id='frmTransfers_transfermain_maketransfer_btnConfirm']";
	public static String confirm_header="//div[@id='frmConfirm_confirmDialog_confirmHeaders_lblHeading']";
	public static String confirm_btn="//input[@id='frmConfirm_confirmDialog_confirmButtons_btnConfirm']";
	public static String success_msg="//input[@id='frmConfirm_confirmDialog_confirmButtons_btnConfirm']";
	
	public static String noaccountmsg="//div[@id='frmTransfers_NoAccounts_txtMessage']";
	
	
	
	
}
