package com.training.constant;

public enum ServiceConstant {
	
	PROPERTY_NAME_DATABASE_DRIVER  ("spring.datasource.driver-class-name"),
	PROPERTY_NAME_DATABASE_URL  ("spring.datasource.url"),
	PROPERTY_NAME_DATABASE_USERNAME  ("spring.datasource.username"),
	PROPERTY_NAME_DATABASE_PASSWORD  ("spring.datasource.password"),
	PROPERTY_NAME_JPA_DDL_UPDATE  ("spring.jpa.hibernate.ddl-auto"),
	PROPERTY_NAME_JPA_DIALECT  ("spring.jpa.database-platform"),
	PROPERTY_NAME_JPA_SHOW_SQL  ("spring.jpa.show-sql"),
	PROPERTY_NAME_TOMCAT_INITIAL_SIZE  ("spring.datasource.tomcat.initial-size"),
	PROPERTY_NAME_TOMCAT_MAX_ACTIVE  ("spring.datasource.tomcat.max-active"),
	PROPERTY_NAME_TOMCAT_MAX_IDLE  ("spring.datasource.tomcat.max-idle"),
	PROPERTY_NAME_TOMCAT_JMX_ENABLED  ("spring.datasource.tomcat.jmx-enabled"),
	PROPERTY_NAME_TOMCAT_TIME_BETWEEN_EVICTION_RUN  ("spring.datasource.tomcat.time-between-eviction-runs-millis"),
	PROPERTY_NAME_TOMCAT_REMOVE_ABONDONED  ("spring.datasource.tomcat.remove-abandoned"),
	PROPERTY_NAME_TOMCAT_REMOVE_ABONDONED_TIMEOUT  ("spring.datasource.tomcat.remove-abandoned-timeout"),
	PROPERTY_NAME_TOMCAT_REMOVE_ABONDONED_WHEN_PERCENTAGE_FULL  ("spring.datasource.tomcat.abandon-when-percentage-full"),
	PROPERTY_NAME_TOMCAT_TEST_ON_BORROW  ("spring.datasource.tomcat.test-on-borrow"),
	PROPERTY_NAME_TOMCAT_VALIDATION_QUERY  ("spring.datasource.tomcat.validation-query"),
	PROPERTY_NAME_TOMCAT_VALIDATION_INTERVAL  ("spring.datasource.tomcat.validation-interval"),
	ERROR_CODE ("errorCode="),
	ERROR_MESSAGE ("errorMessage="),
	STATUS_CODE_FAILED ("0"),
	STATUS_CODE_SUCCESS  ("1"),
	STATUS_CODE_EXCEPTION  ("2"),
	
	STATUS_MSG_FAILED ("FAILED"),
	STATUS_MSG_SUCCESS ("SUCCESS"),
	STATUS_MSG_EXCEPTION ("EXCEPTION"),
	SERVICE_ADMIN_EXCEPTION  ("1001"),
	
	USER_MOB_TYPE_ERROR_CODE ("E001"),
	USER_MOB_TYPE_ERROR_MESSAGE ("INVALID MOBILE NUMBER"),
	
	USER_EMAIL_TYPE_ERROR_CODE ("E002"),
	USER_EMAIL_TYPE_ERROR_MESSAGE ("INVALID EMAIL ID"),
	
	USER_TYPE_ERROR_CODE ("E003"),
	USER_TYPE_ERROR_MESSAGE ("INVALID REQUEST"),
	
	USER_TYPE_SUCCESS_CODE ("E004"),
	USER_TYPE_SUCCESS_MESSAGE ("USER FOUND"),
	
	REQUEST_KEY_ERROR_CODE("E005"),
	REQUEST_KEY_ERROR_MESSAGE("REQUEST KEY IS NOT AVAILABLE"),
	
	REQUEST_VALUE_ERROR_CODE("E006"),
	REQUEST_VALUE_ERROR_MESSAGE("REQUEST VALUE IS NOT AVAILABLE"),
	
	PRODUCT_START_POSITION_ERROR_CODE("E007"),
	PRODUCT_START_POSITION_MESSAGE("Please send start position"),
	
	PRODUCT_ROWSIZE_ERROR_CODE("E008"),
	PRODUCT_ROWSIZE_ERROR_MESSAGE("Please send row size."),
	
	PRODUCT_ID_ERROR_CODE("E009"),
	PRODUCT_ID_ERROR_MESSAGE("Please send product Id"),
	
	USER_ID_ERROR_CODE("E010"),
	USER_ID_ERROR_MESSAGE("Please send user Id"),
	
	PRODUCT_SEARCH_ERROR_CODE("E007"),
	PRODUCT_SEARCH_MESSAGE("Please send start position"),
	
	SORRY_FOR_INCONVIENCE("Sorry for inconvience, we are facing some technical glitch and we are working on it."),
	
	INVALID_REQUEST_MESSAGE("Invalid Request"),
	
	MAXIMUM_OTP_REQUEST("You have reached the maximum limit of OTPs. Try again after 30 mins."),
	REPOERT_USER_BLOCK("You report abuse rights has been blocked for 30 days."),
	
	PAYMENT_MODE("LIVE"),
	
	BASE_CURRENCY_USD  ("USD"),
	BASE_CURRENCY_AUD  ("AUD"),
	BASE_CURRENCY_GBP  ("GBP"),
	BASE_CURRENCY_CAD  ("CAD"),
	BASE_CURRENCY_EUR  ("EUR"),
	BASE_CURRENCY_NZD  ("NZD"),
	BASE_CURRENCY_INR  ("INR"),
	BASE_CURRENCY_BDT  ("BDT"),
	
	BASE_LANG  ("en"),
	CMSWITHVERSION("JavaCode1.0"),
	IPADD("192.168.11.1"),
	
	
	CATEGORY_LIST_KEY("CATEGORY-LIST"),
	CATEGORY_FRONT_LIST_KEY("FRONT-CATEGORY-LIST"),
	COUNTRY_LIST_KEY("COUNTRIES-LIST"),
	STATE_LIST_KEY ("STATES-LIST"),
	CITY_LIST_KEY ("CITIES-LIST"),
	REVIEW_TYPE_LIST_KEY ("REVIEW-TYPE-LIST"),
	REVIEW_REPORT_ABUSE_LIST_KEY ("REVIEW-REPORT-ABUSE-LIST"),
	GENDER_LIST_KEY ("GENDER-LIST"),
	ISD_CODE_LIST_KEY ("ISD-CODE-LIST"),

	UPLOAD_FILE_PROFILE_KEY("PROFILE"),
	UPLOAD_FILE_REIVEW_KEY("REVIEW"),
	UPLOAD_FILE_PRODUCT_KEY("PRODUCT"),
	
	FILE_TYPE_IMAGE("IMAGE"),
	FILE_TYPE_AUDIO("AUDIO"),
	FILE_TYPE_VIDEO("VIDEO"),
	TEMPLATE_TYPE_EMAIL ("1"),
	;
	
	
	public enum PAYMENT_STAGE{
		SCHEDULED,INITIATED,PENDING,SUCCESS,FAILURE,PAID,UNPAID,REJECTED;
	}
	private Integer activityValue;
	private String value;

	private ServiceConstant(final String value){
		this.value = value;
	}
	private ServiceConstant(final Integer activityValue){
		this.activityValue = activityValue;
	}

	public Integer getactivityValue() {
		return activityValue;
	}
	public String getValue() {
		return value;
	}
}
