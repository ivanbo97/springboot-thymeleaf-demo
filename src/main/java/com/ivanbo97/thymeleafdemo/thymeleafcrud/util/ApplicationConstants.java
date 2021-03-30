package com.ivanbo97.thymeleafdemo.thymeleafcrud.util;

public final class ApplicationConstants {

	 //== Entity constants ==
    public static final String ENTITY_EMPLOYEE_TABLE_NAME = "employee";
    public static final String ENTITY_EMPLOYEE_COLUMN_NAME_EMPLOYEE_ID = "id";
    public static final String ENTITY_EMPLOYEE_COLUMN_NAME_EMPLOYEE_FIRST_NAME = "first_name";
    public static final String ENTITY_EMPLOYEE_COLUMN_NAME_EMPLOYEE_LAST_NAME = "last_name";
    public static final String ENTITY_EMPLOYEE_COLUMN_NAME_EMPLOYEE_EMAIL = "email";

    //End Point Mappings
    public static final String API_V1 = "/api/v1";
    public static final String EMPLOYEES_BASE_URL = API_V1 + "/employees";
    public static final String EMPLOYEES_FORM_URL = EMPLOYEES_BASE_URL+ "/showFormForAdd";
    public static final String EMPLOYEES_FORM_SAVE_URL = EMPLOYEES_BASE_URL + "/save";
    
    
    
}
