package com.aws.cse546.aws_Iaas_image_recognition.webTier.repositories;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.s3.model.PutObjectRequest;
import com.aws.cse546.aws_Iaas_image_recognition.webTier.configurations.AWSConfigurations;
import com.aws.cse546.aws_Iaas_image_recognition.webTier.constants.ProjectConstants;

@Repository
public class AWSS3RepositoryImpl implements AWSS3Repository {
	
	@Autowired
	private AWSConfigurations awsConfigurations;

	@Override
	public void uploadFile(String fileName, File file) {
		try {
            if (!awsConfigurations.getS3().doesBucketExistV2(ProjectConstants.INPUT_BUCKET))
                awsConfigurations.getS3().createBucket(ProjectConstants.INPUT_BUCKET);
            awsConfigurations.getS3().putObject(new PutObjectRequest(ProjectConstants.INPUT_BUCKET, fileName, file));
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
