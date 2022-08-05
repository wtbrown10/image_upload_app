package com.company.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("wills-image-upload-210");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
