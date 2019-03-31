package com.github.j5ik2o.reactive.aws.s3

import java.nio.file.Path
import com.github.j5ik2o.reactive.aws.s3.model._

trait S3Client[M[_]] /*extends DynamoDBClientSupport[M]*/ {

  def abortMultipartUpload(abortMultipartUploadRequest: AbortMultipartUploadRequest): M[AbortMultipartUploadResponse]

  def completeMultipartUpload(
      completeMultipartUploadRequest: CompleteMultipartUploadRequest
  ): M[CompleteMultipartUploadResponse]

  def copyObject(copyObjectRequest: CopyObjectRequest): M[CopyObjectResponse]

  def createBucket(createBucketRequest: CreateBucketRequest): M[CreateBucketResponse]

  def createMultipartUpload(
      createMultipartUploadRequest: CreateMultipartUploadRequest
  ): M[CreateMultipartUploadResponse]

  def deleteBucket(deleteBucketRequest: DeleteBucketRequest): M[DeleteBucketResponse]

  def deleteBucketAnalyticsConfiguration(
      deleteBucketAnalyticsConfigurationRequest: DeleteBucketAnalyticsConfigurationRequest
  ): M[DeleteBucketAnalyticsConfigurationResponse]

  def deleteBucketCors(deleteBucketCorsRequest: DeleteBucketCorsRequest): M[DeleteBucketCorsResponse]

  def deleteBucketEncryption(
      deleteBucketEncryptionRequest: DeleteBucketEncryptionRequest
  ): M[DeleteBucketEncryptionResponse]

  def deleteBucketInventoryConfiguration(
      deleteBucketInventoryConfigurationRequest: DeleteBucketInventoryConfigurationRequest
  ): M[DeleteBucketInventoryConfigurationResponse]

  def deleteBucketLifecycle(
      deleteBucketLifecycleRequest: DeleteBucketLifecycleRequest
  ): M[DeleteBucketLifecycleResponse]

  def deleteBucketMetricsConfiguration(
      deleteBucketMetricsConfigurationRequest: DeleteBucketMetricsConfigurationRequest
  ): M[DeleteBucketMetricsConfigurationResponse]

  def deleteBucketPolicy(deleteBucketPolicyRequest: DeleteBucketPolicyRequest): M[DeleteBucketPolicyResponse]

  def deleteBucketReplication(
      deleteBucketReplicationRequest: DeleteBucketReplicationRequest
  ): M[DeleteBucketReplicationResponse]

  def deleteBucketTagging(deleteBucketTaggingRequest: DeleteBucketTaggingRequest): M[DeleteBucketTaggingResponse]

  def deleteBucketWebsite(deleteBucketWebsiteRequest: DeleteBucketWebsiteRequest): M[DeleteBucketWebsiteResponse]

  def deleteObject(deleteObjectRequest: DeleteObjectRequest): M[DeleteObjectResponse]

  def deleteObjectTagging(deleteObjectTaggingRequest: DeleteObjectTaggingRequest): M[DeleteObjectTaggingResponse]

  def deleteObjects(deleteObjectsRequest: DeleteObjectsRequest): M[DeleteObjectsResponse]

  def deletePublicAccessBlock(
      deletePublicAccessBlockRequest: DeletePublicAccessBlockRequest
  ): M[DeletePublicAccessBlockResponse]

  def getBucketAccelerateConfiguration(
      getBucketAccelerateConfigurationRequest: GetBucketAccelerateConfigurationRequest
  ): M[GetBucketAccelerateConfigurationResponse]

  def getBucketAcl(getBucketAclRequest: GetBucketAclRequest): M[GetBucketAclResponse]

  def getBucketAnalyticsConfiguration(
      getBucketAnalyticsConfigurationRequest: GetBucketAnalyticsConfigurationRequest
  ): M[GetBucketAnalyticsConfigurationResponse]

  def getBucketCors(getBucketCorsRequest: GetBucketCorsRequest): M[GetBucketCorsResponse]

  def getBucketEncryption(getBucketEncryptionRequest: GetBucketEncryptionRequest): M[GetBucketEncryptionResponse]

  def getBucketInventoryConfiguration(
      getBucketInventoryConfigurationRequest: GetBucketInventoryConfigurationRequest
  ): M[GetBucketInventoryConfigurationResponse]

  def getBucketLifecycleConfiguration(
      getBucketLifecycleConfigurationRequest: GetBucketLifecycleConfigurationRequest
  ): M[GetBucketLifecycleConfigurationResponse]

  def getBucketLocation(getBucketLocationRequest: GetBucketLocationRequest): M[GetBucketLocationResponse]

  def getBucketLogging(getBucketLoggingRequest: GetBucketLoggingRequest): M[GetBucketLoggingResponse]

  def getBucketMetricsConfiguration(
      getBucketMetricsConfigurationRequest: GetBucketMetricsConfigurationRequest
  ): M[GetBucketMetricsConfigurationResponse]

  def getBucketNotificationConfiguration(
      getBucketNotificationConfigurationRequest: GetBucketNotificationConfigurationRequest
  ): M[GetBucketNotificationConfigurationResponse]

  def getBucketPolicy(getBucketPolicyRequest: GetBucketPolicyRequest): M[GetBucketPolicyResponse]

  def getBucketPolicyStatus(
      getBucketPolicyStatusRequest: GetBucketPolicyStatusRequest
  ): M[GetBucketPolicyStatusResponse]

  def getBucketReplication(getBucketReplicationRequest: GetBucketReplicationRequest): M[GetBucketReplicationResponse]

  def getBucketRequestPayment(
      getBucketRequestPaymentRequest: GetBucketRequestPaymentRequest
  ): M[GetBucketRequestPaymentResponse]

  def getBucketTagging(getBucketTaggingRequest: GetBucketTaggingRequest): M[GetBucketTaggingResponse]

  def getBucketVersioning(getBucketVersioningRequest: GetBucketVersioningRequest): M[GetBucketVersioningResponse]

  def getBucketWebsite(getBucketWebsiteRequest: GetBucketWebsiteRequest): M[GetBucketWebsiteResponse]

  def getPublicAccessBlock(getPublicAccessBlockRequest: GetPublicAccessBlockRequest): M[GetPublicAccessBlockResponse]

  def headBucket(headBucketRequest: HeadBucketRequest): M[HeadBucketResponse]

  def headObject(headObjectRequest: HeadObjectRequest): M[HeadObjectResponse]

  def listBucketAnalyticsConfigurations(
      listBucketAnalyticsConfigurationsRequest: ListBucketAnalyticsConfigurationsRequest
  ): M[ListBucketAnalyticsConfigurationsResponse]

  def listBucketInventoryConfigurations(
      listBucketInventoryConfigurationsRequest: ListBucketInventoryConfigurationsRequest
  ): M[ListBucketInventoryConfigurationsResponse]

  def listBucketMetricsConfigurations(
      listBucketMetricsConfigurationsRequest: ListBucketMetricsConfigurationsRequest
  ): M[ListBucketMetricsConfigurationsResponse]

  def listBuckets(listBucketsRequest: ListBucketsRequest): M[ListBucketsResponse]

  def listBuckets(): M[ListBucketsResponse]

  def listMultipartUploads(listMultipartUploadsRequest: ListMultipartUploadsRequest): M[ListMultipartUploadsResponse]

  def listObjectVersions(listObjectVersionsRequest: ListObjectVersionsRequest): M[ListObjectVersionsResponse]

  def listObjects(listObjectsRequest: ListObjectsRequest): M[ListObjectsResponse]

  def listObjectsV2(listObjectsV2Request: ListObjectsV2Request): M[ListObjectsV2Response]

  def listParts(listPartsRequest: ListPartsRequest): M[ListPartsResponse]

  def putBucketAccelerateConfiguration(
      putBucketAccelerateConfigurationRequest: PutBucketAccelerateConfigurationRequest
  ): M[PutBucketAccelerateConfigurationResponse]

  def putBucketAcl(putBucketAclRequest: PutBucketAclRequest): M[PutBucketAclResponse]

  def putBucketAnalyticsConfiguration(
      putBucketAnalyticsConfigurationRequest: PutBucketAnalyticsConfigurationRequest
  ): M[PutBucketAnalyticsConfigurationResponse]

  def putBucketCors(putBucketCorsRequest: PutBucketCorsRequest): M[PutBucketCorsResponse]

  def putBucketEncryption(putBucketEncryptionRequest: PutBucketEncryptionRequest): M[PutBucketEncryptionResponse]

  def putBucketInventoryConfiguration(
      putBucketInventoryConfigurationRequest: PutBucketInventoryConfigurationRequest
  ): M[PutBucketInventoryConfigurationResponse]

  def putBucketLifecycleConfiguration(
      putBucketLifecycleConfigurationRequest: PutBucketLifecycleConfigurationRequest
  ): M[PutBucketLifecycleConfigurationResponse]

  def putBucketLogging(putBucketLoggingRequest: PutBucketLoggingRequest): M[PutBucketLoggingResponse]

  def putBucketMetricsConfiguration(
      putBucketMetricsConfigurationRequest: PutBucketMetricsConfigurationRequest
  ): M[PutBucketMetricsConfigurationResponse]

  def putBucketNotificationConfiguration(
      putBucketNotificationConfigurationRequest: PutBucketNotificationConfigurationRequest
  ): M[PutBucketNotificationConfigurationResponse]

  def putBucketPolicy(putBucketPolicyRequest: PutBucketPolicyRequest): M[PutBucketPolicyResponse]

  def putBucketReplication(putBucketReplicationRequest: PutBucketReplicationRequest): M[PutBucketReplicationResponse]

  def putBucketRequestPayment(
      putBucketRequestPaymentRequest: PutBucketRequestPaymentRequest
  ): M[PutBucketRequestPaymentResponse]

  def putBucketTagging(putBucketTaggingRequest: PutBucketTaggingRequest): M[PutBucketTaggingResponse]

  def putBucketVersioning(putBucketVersioningRequest: PutBucketVersioningRequest): M[PutBucketVersioningResponse]

  def putBucketWebsite(putBucketWebsiteRequest: PutBucketWebsiteRequest): M[PutBucketWebsiteResponse]

  def putObjectAcl(putObjectAclRequest: PutObjectAclRequest): M[PutObjectAclResponse]

  def putObjectLegalHold(putObjectLegalHoldRequest: PutObjectLegalHoldRequest): M[PutObjectLegalHoldResponse]

  def putObjectLockConfiguration(
      putObjectLockConfigurationRequest: PutObjectLockConfigurationRequest
  ): M[PutObjectLockConfigurationResponse]

  def putObjectRetention(putObjectRetentionRequest: PutObjectRetentionRequest): M[PutObjectRetentionResponse]

  def putObjectTagging(putObjectTaggingRequest: PutObjectTaggingRequest): M[PutObjectTaggingResponse]

  def putPublicAccessBlock(putPublicAccessBlockRequest: PutPublicAccessBlockRequest): M[PutPublicAccessBlockResponse]

  def restoreObject(restoreObjectRequest: RestoreObjectRequest): M[RestoreObjectResponse]

  def uploadPartCopy(uploadPartCopyRequest: UploadPartCopyRequest): M[UploadPartCopyResponse]

}
