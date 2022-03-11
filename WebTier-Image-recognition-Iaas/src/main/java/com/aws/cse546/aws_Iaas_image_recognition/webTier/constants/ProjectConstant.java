package com.aws.cse546.aws_Iaas_image_recognition.webTier.constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.amazonaws.regions.Regions;

public class ProjectConstant {

	public static final String INPUT_QUEUE = "inputQueue.fifo";

	public static final String OUTPUT_QUEUE = "outputQueue.fifo";
	
	// accessKey - The AWS access key.
	public static final String ACCESS_KEY_ID = "";		 

	// secretKey - The AWS secret access key.
	public static final String SECRET_ACCESS_KEY = "";
	
	public static final String PRIVATE_KEY = "";

	public static final Regions AWS_REGION = Regions.US_EAST_1;

	public static final String INPUT_BUCKET = "image-input-bucket-cse546-version-1";
	
	public static final Integer MAX_NUM_OF_APP_INSTANCES = 19;
	
	public static final String AMI_ID = "ami-0e0d6ce25c65da960"; 
	
	public static final String INSTANCE_TYPE = "t2.micro";
	
	public static final String TOTAL_MSG_IN_SQS = "ApproximateNumberOfMessages";
	
	public static final String TOTAL_MSG_IN_SQS_NOT_VISIBLE = "ApproximateNumberOfMessagesNotVisible";

	public static final List<String> SQS_METRICS = new ArrayList<String>(Arrays.asList(TOTAL_MSG_IN_SQS,TOTAL_MSG_IN_SQS_NOT_VISIBLE));
	
	public static final String TAG_KEY = "AppTier";

	public static final String TAG_VALUE = "App Instance";

	public static final String RESOURCE_INSTANCE = "instance";

	public static final String USER_DATA = "#!/bin/bash" + "\n" + "cd /home/ubuntu/classifier" + "\n"
			+ "chmod +x AppTier-Image_recognition_Iaas-0.0.1-SNAPSHOT.jar" + "\n" + "java -jar AppTier-Image_recognition_Iaas-0.0.1-SNAPSHOT.jar"; //User data passed on instance creation to perform some task as soon as instance start.

	public static final Integer MAX_WAIT_TIME_OUT = 20;

	public static final String INPUT_OUTPUT_SEPARATOR = "---";
	
	
}