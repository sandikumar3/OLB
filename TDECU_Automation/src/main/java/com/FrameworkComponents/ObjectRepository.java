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
	public static String confirm_frmAcnt="//div[@id='frmConfirm_confirmDialog_keyValueFrom_lblValue']";
	public static String confirm_toAcnt="//div[@id='frmConfirm_confirmDialog_keyValueTo_lblValue']";
	public static String confirm_amnt="//div[@id='frmConfirm_confirmDialog_keyValueThree_lblValue']";
	public static String confirm_btn="//input[@id='frmConfirm_confirmDialog_confirmButtons_btnConfirm']";
	public static String success_msg="//div[contains(@aria-label,'Your transaction has been done successfully')]";
	
	public static String refNum="//div[@id='frmAcknowledgement_acknowledgment_lblRefrenceNumberValue']";
	public static String trnsfrActvty="//input[@id='frmAcknowledgement_activity_btnAddAnotherAccount']";
	public static String postedtb_selcted="//div[contains(@class,'Selected')]/input[@aria-label='Posted ']";
	
	public static String noaccountmsg="//div[@id='frmTransfers_NoAccounts_txtMessage']";
	public static String scheduledtab="//input[@id='frmTransfers_transfermain_btnScheduled']";
	public static String postedtab="//input[@id='frmTransfers_transfermain_btnRecent']";
//edoc 	
	public static String edoctab="//div[@id='frmAccountsLanding_postLoginHdr_lblEdoc']";
	public static String enableedocmsg="//div[@id='frmEDocuments_lblEnableEDocs']";
	public static String enablebtn="//input[@id='frmEDocuments_btnEnable']";
	public static String cancelbtn="//input[@id='frmEDocuments_btnCancel']";
	public static String settingsimg="//div[@id='frmAccountsLanding_postLoginHdr_flxUserId']";
	public static String accntsettinglnk="//div[@id='flxAccountTypes_lblUsers' and text()='Account Settings']";
	public static String edoclnk="//div[@id='frmProfileManagement_settings_lblEDocuments']";
	public static String edocpagettl="//div[@id='frmEDocuments_lblHeading']";
	public static String edocTnc="//img[@id='frmEDocuments_imgCheck']";
	public static String savebtn="//input[@title='Save']";
	public static String enablesuccess="//div[@id='frmEDocuments_lblConfirmation']";
	public static String viewdocbtn="//input[@id='frmEDocuments_btnEdocView']";
	public static String enableedocchk="//img[@id='frmProfileManagement_settings_imgEnableEDocs']";
	public static String disablepopupttl="//div[text()='Disable e-Documents']";
	public static String yesbtn="//input[@id='frmProfileManagement_btnYes']";
	public static String nobtn="//input[@title='No']";
	public static String disableack="//div[@id='frmProfileManagement_lblConfirmation']";
	
	
	
	
	
}
