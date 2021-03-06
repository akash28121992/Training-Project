package com.training.v1.constant;

public enum SignupConstant {
	
	REQUEST_KEY_ERROR_CODE ("0100"),
	REQUEST_KEY_ERROR_MESSAGE ("REQUEST KEY IS NOT AVAILABLE IN REQUEST DATA BODY OR INVALID"),
	
	REQUEST_VALUE_ERROR_CODE ("0101"),
	REQUEST_VALUE_ERROR_MESSAGE ("REQUEST VALUE IS NOT AVAILABLE IN REQUEST DATA BODY OR INVALID"),
	
	SIGNUP_OBJECT_ERROR_CODE ("0102"),
	SIGNUP_OBJECT_ERROR_MESSAGE ("SIGNUP OBJECT IS NOT AVAILABLE IN REQUEST DATA BODY OR INVALID"),
	
	USER_TYPE_ERROR_CODE ("0103"),
	USER_TYPE_ERROR_MESSAGE ("USER TYPE OBJECT IS NOT AVAILABLE IN AUTHENTICATION BODY OR INVALID"),
	
	SIGNUP_USER_STAGE1_MESSAGE_SUCCESS ("SIGNUP STAGE 1 IS SUCCESSFULL"),
	SIGNUP_USER_STAGE1_MESSAGE_FAILIRE ("EITHER SIGNUP DATA IS EMPTY OR INVALID"),
	
	SIGNUP_USER_STAGE1_CODE_FAILURE ("0104"),
	SIGNUP_USER_STAGE1_CODE_SUCCESS ("0105"),
	
	SIGNUP_STUDENT_STAGE2_MESSAGE_SUCCESS ("SIGNUP STAGE 2 IS SUCCESSFULL"),
	SIGNUP_STUDENT_STAGE2_MESSAGE_FAILIRE ("EITHER STUDENT DETAILS DATA IS EMPTY OR INVALID"),
	SIGNUP_STUDENT_STAGE2_CODE_FAILURE ("0106"),
	SIGNUP_STUDENT_STAGE2_CODE_SUCCESS ("0107"),
	
	SIGNUP_STUDENT_STAGE3_MESSAGE_SUCCESS ("SIGNUP STAGE 3 IS SUCCESSFULL"),
	SIGNUP_STUDENT_STAGE3_MESSAGE_FAILIRE ("EITHER PARENT DETAILS DATA IS EMPTY OR INVALID"),
	SIGNUP_STUDENT_STAGE3_CODE_FAILURE ("0108"),
	SIGNUP_STUDENT_STAGE3_CODE_SUCCESS ("0109"),
	
	SIGNUP_EMAIL_CONFIRM_CODE_FAILD ("0110"),
	SIGNUP_EMAIL_CONFIRM_MESSAGE_FAILD ("Email Address and Confirm Email Address must be same"),
	
	SIGNUP_PASSWORD_CONFIRM_CODE_FAILD ("0111"),
	SIGNUP_PASSWORD_CONFIRM_MESSAGE_FAILD ("Password and Confirm password must be same"),
	
	SIGNUP_EMAIL_EMPTY_CODE_FAILD ("0112"),
	SIGNUP_EMAIL_EMPTY_MESSAGE_FAILD ("Email address is mandatory"),
	
	SIGNUP_CONFIRMEMAIL_EMPTY_CODE_FAILD ("0114"),
	SIGNUP_CONFIRMEMAIL_EMPTY_MESSAGE_FAILD ("Confirm Email Address is required"),
	
	SIGNUP_PASSWORD_EMPTY_CODE_FAILD ("0115"),
	SIGNUP_PASSWORD_EMPTY_MESSAGE_FAILD ("Password is mandatory"),
	
	SIGNUP_PASSWORD_CONFIRMEMPTY_CODE_FAILD ("0116"),
	SIGNUP_PASSWORD_CONFIRMEMPTY_MESSAGE_FAILD ("Confirm Password is mandatory"),
	
	SIGNUP_CAPTCHA_CODE_FAILD ("0117"),
	SIGNUP_CAPTCHA_MESSAGE_FAILD ("Enter captcha"),
	
	SIGNUP_CAPTCHA_EMPTY_CODE_FAILD ("0118"),
	SIGNUP_CAPTCHA_EMPTY_MESSAGE_FAILD ("PLEASE ENTER VALID CAPTCHA."),
	
	SIGNUP_CHECKBOX_EMPTY_CODE_FAILD ("0119"),
	SIGNUP_CHECKBOX_EMPTY_MESSAGE_FAILD ("PLEASE READ TERM OF USE AND PRIVACY POLICY."),
	
	SIGNUP_EMAIL_VALID_CODE_FAILD ("0120"),
	SIGNUP_EMAIL_VALID_MESSAGE_FAILD ("Please enter a valid email address"),
	
	SIGNUP_CONFIRMEMAIL_VALID_CODE_FAILD ("0121"),
	SIGNUP_CONFIRMEMAIL_VALID_MESSAGE_FAILD ("Please enter valid confirm email address"),
	
	SIGNUP_PASSWORD_LIMIT_CODE_FAILD ("0122"),
	SIGNUP_PASSWORD_LIMIT_MESSAGE_FAILD ("Password must be a minimum of 5 characters long."),
	
	SIGNUP_PASSWORD_CONFIRM_LIMIT_CODE_FAILD ("0123"),
	SIGNUP_PASSWORD_CONFIRM_LIMIT_MESSAGE_FAILD ("Confirm Password must be a minimum of 5 characters long."),
	
	SIGNUP_STUDENT_STAGE4_MESSAGE_SUCCESS ("SIGNUP STAGE 4 IS SUCCESSFULL"),
	SIGNUP_STUDENT_STAGE4_MESSAGE_FAILIRE ("EITHER ADDRESS DETAILS DATA IS EMPTY OR INVALID"),
	SIGNUP_STUDENT_STAGE4_CODE_FAILURE ("0124"),
	SIGNUP_STUDENT_STAGE4_CODE_SUCCESS ("0125"),
	
	SIGNUP_STUDENT_STAGE5_MESSAGE_SUCCESS ("SIGNUP STAGE 5 IS SUCCESSFULL"),
	SIGNUP_STUDENT_STAGE5_MESSAGE_FAILIRE ("EITHER COURSE DETAILS DATA IS EMPTY OR INVALID"),
	SIGNUP_STUDENT_STAGE5_CODE_FAILURE ("0126"),
	SIGNUP_STUDENT_STAGE5_CODE_SUCCESS ("0127"),
	
	SIGNUP_STEP_NUM_CODE_FAILD ("0128"),
	SIGNUP_STEP_NUM_MESSAGE_FAILD ("PLEASE SET STEP NUMBER."),
	
	SCHOLARSHIP_CODE_FAILURE("0129"),
	SCHOLARSHIP_CODE_SUCCESS("0130"),
	SCHOLARSHIP_CODE_FAILURE_MESSAGE("Either the code has been expired or not available"),
	SCHOLARSHIP_CODE_SUCCESS_APPLIED_MESSAGE("Scholarship has been applied successfully"),
	SCHOLARSHIP_CODE_SUCCESS_REMOVED_MESSAGE("Scholarship has been removed successfully"),
	
	SIGNUP_STUDENT_STAGE2_FIRSTNAME_CODE_FAILD ("0123"),
	SIGNUP_STUDENT_STAGE2_FIRSTNAME_MESSAGE_FAILD ("First Name is required."),
	
	SIGNUP_STUDENT_STAGE2_LASTNAME_CODE_FAILD ("0124"),
	SIGNUP_STUDENT_STAGE2_LASTNAME_MESSAGE_FAILD ("Last Name is required."),
	
	SIGNUP_STUDENT_STAGE2_DOB_CODE_FAILD ("0125"),
	SIGNUP_STUDENT_STAGE2_DOB_MESSAGE_FAILD ("Please choose your Date of Birth."),
	
	SIGNUP_STUDENT_STAGE2_COUNTRY_CODE_FAILD ("0125"),
	SIGNUP_STUDENT_STAGE2_COUNTRY_MESSAGE_FAILD ("Country is required."),
	
	SIGNUP_STUDENT_STAGE2_STATE_CODE_FAILD ("0126"),
	SIGNUP_STUDENT_STAGE2_STATE_MESSAGE_FAILD ("State is required."),
	
	SIGNUP_STUDENT_STAGE2_CITY_CODE_FAILD ("0127"),
	SIGNUP_STUDENT_STAGE2_CITY_MESSAGE_FAILD ("City is required."),
	
	
	SIGNUP_STUDENT_STAGE2_LEARNING_CODE_FAILD ("0128"),
	SIGNUP_STUDENT_STAGE2_LEARNING_MESSAGE_FAILD ("Learning centre is required."),
	
	SIGNUP_STUDENT_STAGE2_GENDER_CODE_FAILD ("0129"),
	SIGNUP_STUDENT_STAGE2_GENDER_MESSAGE_FAILD ("Gender is required"),
	
	SIGNUP_STUDENT_STAGE2_EMAIL_CODE_FAILD ("0130"),
	SIGNUP_STUDENT_STAGE2_EMAIL_MESSAGE_FAILD ("PLEASE ENTER VALIED EMAIL."),
	
	SIGNUP_STUDENT_STAGE2_CONTACT_CODE_FAILD ("0131"),
	SIGNUP_STUDENT_STAGE2_CONTACT_MESSAGE_FAILD ("Phone no is required."),
	
	SIGNUP_STUDENT_STAGE2_CONTACTALT_CODE_FAILD ("0132"),
	SIGNUP_STUDENT_STAGE2_CONTACTALT_MESSAGE_FAILD ("Alternate phone no is required."),
	
	SIGNUP_STUDENT_STAGE2_MIDDLE_CODE_FAILD ("0133"),
	SIGNUP_STUDENT_STAGE2_MIDDLE_MESSAGE_FAILD ("PLEASE ENTER VALID MIDDLE NAME."),
	
	SIGNUP_STUDENT_STAGE4_RESIADD1_CODE_FAILURE ("0134"),
	SIGNUP_STUDENT_STAGE4_RESIADD1_MESSAGE_FAILIRE ("PLEASE ENTER VALID RESIDENTIAL ADDRESS LINE 1 ALLOW ONLY APPLY(MINUS, SPACE OR COMMA)"),
	
	SIGNUP_STUDENT_STAGE4_RESIADD2_CODE_FAILURE ("0135"),
	SIGNUP_STUDENT_STAGE4_RESIADD2_MESSAGE_FAILIRE ("Residential Address Line 2 is required"),
    /*SIGNUP_STUDENT_STAGE4_RESIADD2_MESSAGE_FAILIRE ("PLEASE ENTER VALID RESIDENTIAL ADDRESS2 ALLOW ONLY APPLY(MINUS, SPACE OR COMMA)"),*/
	
	SIGNUP_STUDENT_STAGE4_ZIPCODE_CODE_FAILURE ("0136"),
	SIGNUP_STUDENT_STAGE4_ZIPCODE_MESSAGE_FAILIRE ("PLEASE ENTER VALID RESIDENTIAL ZIPCODE"),
	
	SIGNUP_STUDENT_STAGE4_MAILADD1_CODE_FAILURE ("0137"),
	SIGNUP_STUDENT_STAGE4_MAILADD1_MESSAGE_FAILIRE ("PLEASE ENTER VALID MAILING ADDRESS LINE 1 ALLOW ONLY APPLY(MINUS, SPACE OR COMMA)"),
	
	SIGNUP_STUDENT_STAGE4_MAILADD2_CODE_FAILURE ("0138"),
	SIGNUP_STUDENT_STAGE4_MAILADD2_MESSAGE_FAILIRE ("Mailing Address Line 2 is required"),
	
	SIGNUP_STUDENT_STAGE4_MAILZIPCODE_CODE_FAILURE ("0139"),
	SIGNUP_STUDENT_STAGE4_MAILZIPCODE_MESSAGE_FAILIRE ("PLEASE ENTER VALID MAILING ZIPCODE ALLOW ONLY APPLY(MINUS, SPACE OR COMMA)"),
	
	SIGNUP_STUDENT_STAGE5_OPTSUBJECT_LIMIT3_CODE_FAILURE ("0140"),
	SIGNUP_STUDENT_STAGE5_OPTSUBJECT_LIMIT3_MESSAGE_FAILIRE ("PLEASE CHOOSE MINIMUM 3 SUBJECT."),
	
	SIGNUP_STUDENT_STAGE5_OPTSUBJECT_LIMIT5_CODE_FAILURE ("0141"),
	SIGNUP_STUDENT_STAGE5_OPTSUBJECT_LIMIT5_MESSAGE_FAILIRE ("PLEASE CHOOSE MAXIMUM 5 SUBJECT."),
	
	SIGNUP_STUDENT_STAGE5_PAYMODE_CODE_FAILURE ("0142"),
	SIGNUP_STUDENT_STAGE5_PAYMODE_MESSAGE_FAILIRE ("PLEASE CHOOSE PAYMENT METHOD."),
	
	SIGNUP_STUDENT_STAGE2_OTHERNAME_CODE_FAILD ("0143"),
	SIGNUP_STUDENT_STAGE2_OTHERNAME_MESSAGE_FAILD ("PLEASE ENTER SPECIFY OTHER NAME."),
	
	SIGNUP_TEACHER_STAGE3_MESSAGE_SUCCESS ("SIGNUP STAGE 3 IS SUCCESSFULL"),
	SIGNUP_TEACHER_STAGE3_MESSAGE_FAILIRE ("EITHER UPDATE PROFILE DETAILS DATA IS EMPTY OR INVALID"),
	SIGNUP_TEACHER_STAGE3_CODE_FAILURE ("0144"),
	SIGNUP_TEACHER_STAGE3_CODE_SUCCESS ("0145"),
	
	SIGNUP_TEACHER_STAGE5_MESSAGE_SUCCESS ("SIGNUP STAGE 5 IS SUCCESSFULL"),
	SIGNUP_TEACHER_STAGE5_MESSAGE_FAILIRE ("EITHER Interview DETAILS DATA IS EMPTY OR INVALID"),
	SIGNUP_TEACHER_STAGE5_CODE_FAILURE ("0146"),
	SIGNUP_TEACHER_STAGE5_CODE_SUCCESS ("0147"),
	
	SIGNUP_TEACHER_STAGE6_MESSAGE_SUCCESS ("SIGNUP STAGE 6 IS SUCCESSFULL"),
	SIGNUP_TEACHER_STAGE6_MESSAGE_FAILIRE ("EITHER Payment Info DETAILS DATA IS EMPTY OR INVALID"),
	SIGNUP_TEACHER_STAGE6_CODE_FAILURE ("0148"),
	SIGNUP_TEACHER_STAGE6_CODE_SUCCESS ("0149"),
	
	SIGNUP_TEACHER_STAGE6_DECLARATION_MESSAGE_SUCCESS ("TEACHER AGREEMENT SAVED SUCCESSFULLY"),
	SIGNUP_TEACHER_STAGE6_DECLARATION_CODE_FAILURE ("0150"),
	SIGNUP_TEACHER_STAGE6_DECLARATION_CODE_SUCCESS ("0151"),
	
	
	PAYMENT_MODE("LIVE"),
	PAYMENT_MODE_IP("https://k8school.org"),
	
	PAYMENT_PENDING_CODE("140"),
	PAYMENT_PENDING_MESSAGE("PAYMENT PEDNING/CANCELED BY USER"),
	
	PAYMENT_FAILURE_CODE("141"),
	PAYMENT_FAILURE_MESSAGE("PAYMENT FAILED/EXCEPTION OCCURED"),
	
	PAYMENT_SUCCESS_CODE("142"),
	PAYMENT_SUCCESS_MESSAGE("PAYMENT HAS BEEN DONE SUCCESFULLY"),
	
	PAYMENT_STAUS_FAILURE_CODE("143"),
	PAYMENT_STAUS_FAILURE_MESSAGE("PAYMENT STATUS HAS AN EXCEPTION"),
	
	
	SIGNUP_TEACHER_STAGE2_MESSAGE_SUCCESS ("TEACHER BASIC DETAILS SAVE SUCCESSFULL"),
	SIGNUP_TEACHER_STAGE2_MESSAGE_FAILIRE ("EITHER TEACHER BASI IS EMPTY OR INVALID"),
	SIGNUP_TEACHER_STAGE2_CODE_FAILURE ("0144"),
	SIGNUP_TEACHER_STAGE2_CODE_SUCCESS ("0145"),
	
	
	SIGNUP_SCHOOL_STAGE2_MESSAGE_SUCCESS ("SCHOOL BASIC DETAILS SAVE SUCCESSFULL"),
	SIGNUP_SCHOOL_STAGE2_MESSAGE_FAILIRE ("EITHER SCHOOL BASIC IS EMPTY OR INVALID"),
	SIGNUP_SCHOOL_STAGE2_CODE_FAILURE ("0146"),
	SIGNUP_SCHOOL_STAGE2_CODE_SUCCESS ("0147"),
	
	SIGNUP_SCHOOL_STAGE3_MESSAGE_SUCCESS ("SCHOOL UPDATE PROFILE SAVE SUCCESSFULL"),
	SIGNUP_SCHOOL_STAGE3_MESSAGE_FAILIRE ("EITHER UPDATE PROFILE IS EMPTY OR INVALID"),
	SIGNUP_SCHOOL_STAGE3_CODE_FAILURE ("0148"),
	SIGNUP_SCHOOL_STAGE3_CODE_SUCCESS ("0149"),
	
	
	SIGNUP_SCHOOL_STAGE4_MESSAGE_SUCCESS ("SCHOOL REVIEW AND APPROVAL SAVE SUCCESSFULL"),
	SIGNUP_SCHOOL_STAGE4_MESSAGE_FAILIRE ("EITHER REVIEW AND APPROVAL IS EMPTY OR INVALID"),
	SIGNUP_SCHOOL_STAGE4_CODE_FAILURE ("0150"),
	SIGNUP_SCHOOL_STAGE4_CODE_SUCCESS ("0151"),
	
	SIGNUP_SCHOOL_STAGE5_MESSAGE_SUCCESS ("SCHOOL PAYMENT STRUCTURE SAVE SUCCESSFULL"),
	SIGNUP_SCHOOL_STAGE5_MESSAGE_FAILIRE ("EITHER PAYMENT STRUCTURE IS EMPTY OR INVALID"),
	SIGNUP_SCHOOL_STAGE5_CODE_FAILURE ("0152"),
	SIGNUP_SCHOOL_STAGE5_CODE_SUCCESS ("0153"),
	
	SIGNUP_SCHOOL_STAGE6_MESSAGE_SUCCESS ("SCHOOL SIGNING CONTRACT SAVE SUCCESSFULL"),
	SIGNUP_SCHOOL_STAGE6_MESSAGE_FAILIRE ("EITHER SIGNING CONTRACT IS EMPTY OR INVALID"),
	SIGNUP_SCHOOL_STAGE6_CODE_FAILURE ("0154"),
	SIGNUP_SCHOOL_STAGE6_CODE_SUCCESS ("0155"),
	
	SIGNUP_STUDENT_STAGE2_FLEXCOURSEHIGH_CODE_FAILD ("01231"),
	SIGNUP_STUDENT_STAGE2_FLEXCOURSEHIGH_MESSAGE_FAILD ("Please select Highest Educational."),
	
	SIGNUP_STUDENT_STAGE2_FLEXCOURSENAME_CODE_FAILD ("01232"),
	SIGNUP_STUDENT_STAGE2_FLEXCOURSENAME_MESSAGE_FAILD ("Please Enter Name of School."),
	
	SIGNUP_STUDENT_STAGE2_FLEXCOURSESTUDY_CODE_FAILD ("01233"),
	SIGNUP_STUDENT_STAGE2_FLEXCOURSESTUDY_MESSAGE_FAILD ("Please Enter study/course."),
	
	SIGNUP_STUDENT_STAGE2_FLEXCOURSEFINALMARKS_CODE_FAILD ("01234"),
	SIGNUP_STUDENT_STAGE2_FLEXCOURSEFINALMARKS_MESSAGE_FAILD ("Please Enter final marks."),
	
	SIGNUP_STUDENT_STAGE2_FLEXCOURSEMONTHYEAR_CODE_FAILD ("01234"),
	SIGNUP_STUDENT_STAGE2_FLEXCOURSEMONTHYEAR_MESSAGE_FAILD ("Please Enter month/year."),
	
	
	
	;
	
	private String value;
	private Integer activityValue;
	
	private SignupConstant(final Integer activityValue){
		this.activityValue = activityValue;
	}
	private SignupConstant(final String value){
		this.value = value;
	}
	public String getValue() {
		return value;
	}
	public Integer getactivityValue() {
		return activityValue;
	}
}
