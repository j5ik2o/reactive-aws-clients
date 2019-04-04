// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3

import software.amazon.awssdk.services.s3.model._
import software.amazon.awssdk.services.s3.paginators._
import software.amazon.awssdk.services.s3.{ S3Client => JavaS3SyncClient }

object S3SyncClient {

  def apply(underlying: JavaS3SyncClient): S3SyncClient = new S3SyncClientImpl(underlying)

}

trait S3SyncClient extends S3Client[Either[Throwable, ?]] with S3SyncClientSupport {
  val underlying: JavaS3SyncClient

  protected def toEither[A](f: => A): Either[Throwable, A] = {
    try {
      Right(f)
    } catch {
      case t: Throwable =>
        Left(t)
    }
  }

  override def abortMultipartUpload(
      abortMultipartUploadRequest: AbortMultipartUploadRequest
  ): Either[Throwable, AbortMultipartUploadResponse] = {
    toEither(underlying.abortMultipartUpload(abortMultipartUploadRequest))
  }

  override def completeMultipartUpload(
      completeMultipartUploadRequest: CompleteMultipartUploadRequest
  ): Either[Throwable, CompleteMultipartUploadResponse] = {
    toEither(underlying.completeMultipartUpload(completeMultipartUploadRequest))
  }

  override def copyObject(copyObjectRequest: CopyObjectRequest): Either[Throwable, CopyObjectResponse] = {
    toEither(underlying.copyObject(copyObjectRequest))
  }

  override def createBucket(createBucketRequest: CreateBucketRequest): Either[Throwable, CreateBucketResponse] = {
    toEither(underlying.createBucket(createBucketRequest))
  }

  override def createMultipartUpload(
      createMultipartUploadRequest: CreateMultipartUploadRequest
  ): Either[Throwable, CreateMultipartUploadResponse] = {
    toEither(underlying.createMultipartUpload(createMultipartUploadRequest))
  }

  override def deleteBucket(deleteBucketRequest: DeleteBucketRequest): Either[Throwable, DeleteBucketResponse] = {
    toEither(underlying.deleteBucket(deleteBucketRequest))
  }

  override def deleteBucketAnalyticsConfiguration(
      deleteBucketAnalyticsConfigurationRequest: DeleteBucketAnalyticsConfigurationRequest
  ): Either[Throwable, DeleteBucketAnalyticsConfigurationResponse] = {
    toEither(underlying.deleteBucketAnalyticsConfiguration(deleteBucketAnalyticsConfigurationRequest))
  }

  override def deleteBucketCors(
      deleteBucketCorsRequest: DeleteBucketCorsRequest
  ): Either[Throwable, DeleteBucketCorsResponse] = {
    toEither(underlying.deleteBucketCors(deleteBucketCorsRequest))
  }

  override def deleteBucketEncryption(
      deleteBucketEncryptionRequest: DeleteBucketEncryptionRequest
  ): Either[Throwable, DeleteBucketEncryptionResponse] = {
    toEither(underlying.deleteBucketEncryption(deleteBucketEncryptionRequest))
  }

  override def deleteBucketInventoryConfiguration(
      deleteBucketInventoryConfigurationRequest: DeleteBucketInventoryConfigurationRequest
  ): Either[Throwable, DeleteBucketInventoryConfigurationResponse] = {
    toEither(underlying.deleteBucketInventoryConfiguration(deleteBucketInventoryConfigurationRequest))
  }

  override def deleteBucketLifecycle(
      deleteBucketLifecycleRequest: DeleteBucketLifecycleRequest
  ): Either[Throwable, DeleteBucketLifecycleResponse] = {
    toEither(underlying.deleteBucketLifecycle(deleteBucketLifecycleRequest))
  }

  override def deleteBucketMetricsConfiguration(
      deleteBucketMetricsConfigurationRequest: DeleteBucketMetricsConfigurationRequest
  ): Either[Throwable, DeleteBucketMetricsConfigurationResponse] = {
    toEither(underlying.deleteBucketMetricsConfiguration(deleteBucketMetricsConfigurationRequest))
  }

  override def deleteBucketPolicy(
      deleteBucketPolicyRequest: DeleteBucketPolicyRequest
  ): Either[Throwable, DeleteBucketPolicyResponse] = {
    toEither(underlying.deleteBucketPolicy(deleteBucketPolicyRequest))
  }

  override def deleteBucketReplication(
      deleteBucketReplicationRequest: DeleteBucketReplicationRequest
  ): Either[Throwable, DeleteBucketReplicationResponse] = {
    toEither(underlying.deleteBucketReplication(deleteBucketReplicationRequest))
  }

  override def deleteBucketTagging(
      deleteBucketTaggingRequest: DeleteBucketTaggingRequest
  ): Either[Throwable, DeleteBucketTaggingResponse] = {
    toEither(underlying.deleteBucketTagging(deleteBucketTaggingRequest))
  }

  override def deleteBucketWebsite(
      deleteBucketWebsiteRequest: DeleteBucketWebsiteRequest
  ): Either[Throwable, DeleteBucketWebsiteResponse] = {
    toEither(underlying.deleteBucketWebsite(deleteBucketWebsiteRequest))
  }

  override def deleteObject(deleteObjectRequest: DeleteObjectRequest): Either[Throwable, DeleteObjectResponse] = {
    toEither(underlying.deleteObject(deleteObjectRequest))
  }

  override def deleteObjectTagging(
      deleteObjectTaggingRequest: DeleteObjectTaggingRequest
  ): Either[Throwable, DeleteObjectTaggingResponse] = {
    toEither(underlying.deleteObjectTagging(deleteObjectTaggingRequest))
  }

  override def deleteObjects(deleteObjectsRequest: DeleteObjectsRequest): Either[Throwable, DeleteObjectsResponse] = {
    toEither(underlying.deleteObjects(deleteObjectsRequest))
  }

  override def deletePublicAccessBlock(
      deletePublicAccessBlockRequest: DeletePublicAccessBlockRequest
  ): Either[Throwable, DeletePublicAccessBlockResponse] = {
    toEither(underlying.deletePublicAccessBlock(deletePublicAccessBlockRequest))
  }

  override def getBucketAccelerateConfiguration(
      getBucketAccelerateConfigurationRequest: GetBucketAccelerateConfigurationRequest
  ): Either[Throwable, GetBucketAccelerateConfigurationResponse] = {
    toEither(underlying.getBucketAccelerateConfiguration(getBucketAccelerateConfigurationRequest))
  }

  override def getBucketAcl(getBucketAclRequest: GetBucketAclRequest): Either[Throwable, GetBucketAclResponse] = {
    toEither(underlying.getBucketAcl(getBucketAclRequest))
  }

  override def getBucketAnalyticsConfiguration(
      getBucketAnalyticsConfigurationRequest: GetBucketAnalyticsConfigurationRequest
  ): Either[Throwable, GetBucketAnalyticsConfigurationResponse] = {
    toEither(underlying.getBucketAnalyticsConfiguration(getBucketAnalyticsConfigurationRequest))
  }

  override def getBucketCors(getBucketCorsRequest: GetBucketCorsRequest): Either[Throwable, GetBucketCorsResponse] = {
    toEither(underlying.getBucketCors(getBucketCorsRequest))
  }

  override def getBucketEncryption(
      getBucketEncryptionRequest: GetBucketEncryptionRequest
  ): Either[Throwable, GetBucketEncryptionResponse] = {
    toEither(underlying.getBucketEncryption(getBucketEncryptionRequest))
  }

  override def getBucketInventoryConfiguration(
      getBucketInventoryConfigurationRequest: GetBucketInventoryConfigurationRequest
  ): Either[Throwable, GetBucketInventoryConfigurationResponse] = {
    toEither(underlying.getBucketInventoryConfiguration(getBucketInventoryConfigurationRequest))
  }

  override def getBucketLifecycleConfiguration(
      getBucketLifecycleConfigurationRequest: GetBucketLifecycleConfigurationRequest
  ): Either[Throwable, GetBucketLifecycleConfigurationResponse] = {
    toEither(underlying.getBucketLifecycleConfiguration(getBucketLifecycleConfigurationRequest))
  }

  override def getBucketLocation(
      getBucketLocationRequest: GetBucketLocationRequest
  ): Either[Throwable, GetBucketLocationResponse] = {
    toEither(underlying.getBucketLocation(getBucketLocationRequest))
  }

  override def getBucketLogging(
      getBucketLoggingRequest: GetBucketLoggingRequest
  ): Either[Throwable, GetBucketLoggingResponse] = {
    toEither(underlying.getBucketLogging(getBucketLoggingRequest))
  }

  override def getBucketMetricsConfiguration(
      getBucketMetricsConfigurationRequest: GetBucketMetricsConfigurationRequest
  ): Either[Throwable, GetBucketMetricsConfigurationResponse] = {
    toEither(underlying.getBucketMetricsConfiguration(getBucketMetricsConfigurationRequest))
  }

  override def getBucketNotificationConfiguration(
      getBucketNotificationConfigurationRequest: GetBucketNotificationConfigurationRequest
  ): Either[Throwable, GetBucketNotificationConfigurationResponse] = {
    toEither(underlying.getBucketNotificationConfiguration(getBucketNotificationConfigurationRequest))
  }

  override def getBucketPolicy(
      getBucketPolicyRequest: GetBucketPolicyRequest
  ): Either[Throwable, GetBucketPolicyResponse] = {
    toEither(underlying.getBucketPolicy(getBucketPolicyRequest))
  }

  override def getBucketPolicyStatus(
      getBucketPolicyStatusRequest: GetBucketPolicyStatusRequest
  ): Either[Throwable, GetBucketPolicyStatusResponse] = {
    toEither(underlying.getBucketPolicyStatus(getBucketPolicyStatusRequest))
  }

  override def getBucketReplication(
      getBucketReplicationRequest: GetBucketReplicationRequest
  ): Either[Throwable, GetBucketReplicationResponse] = {
    toEither(underlying.getBucketReplication(getBucketReplicationRequest))
  }

  override def getBucketRequestPayment(
      getBucketRequestPaymentRequest: GetBucketRequestPaymentRequest
  ): Either[Throwable, GetBucketRequestPaymentResponse] = {
    toEither(underlying.getBucketRequestPayment(getBucketRequestPaymentRequest))
  }

  override def getBucketTagging(
      getBucketTaggingRequest: GetBucketTaggingRequest
  ): Either[Throwable, GetBucketTaggingResponse] = {
    toEither(underlying.getBucketTagging(getBucketTaggingRequest))
  }

  override def getBucketVersioning(
      getBucketVersioningRequest: GetBucketVersioningRequest
  ): Either[Throwable, GetBucketVersioningResponse] = {
    toEither(underlying.getBucketVersioning(getBucketVersioningRequest))
  }

  override def getBucketWebsite(
      getBucketWebsiteRequest: GetBucketWebsiteRequest
  ): Either[Throwable, GetBucketWebsiteResponse] = {
    toEither(underlying.getBucketWebsite(getBucketWebsiteRequest))
  }

  override def getObjectAcl(getObjectAclRequest: GetObjectAclRequest): Either[Throwable, GetObjectAclResponse] = {
    toEither(underlying.getObjectAcl(getObjectAclRequest))
  }

  override def getObjectLegalHold(
      getObjectLegalHoldRequest: GetObjectLegalHoldRequest
  ): Either[Throwable, GetObjectLegalHoldResponse] = {
    toEither(underlying.getObjectLegalHold(getObjectLegalHoldRequest))
  }

  override def getObjectLockConfiguration(
      getObjectLockConfigurationRequest: GetObjectLockConfigurationRequest
  ): Either[Throwable, GetObjectLockConfigurationResponse] = {
    toEither(underlying.getObjectLockConfiguration(getObjectLockConfigurationRequest))
  }

  override def getObjectRetention(
      getObjectRetentionRequest: GetObjectRetentionRequest
  ): Either[Throwable, GetObjectRetentionResponse] = {
    toEither(underlying.getObjectRetention(getObjectRetentionRequest))
  }

  override def getObjectTagging(
      getObjectTaggingRequest: GetObjectTaggingRequest
  ): Either[Throwable, GetObjectTaggingResponse] = {
    toEither(underlying.getObjectTagging(getObjectTaggingRequest))
  }

  override def getPublicAccessBlock(
      getPublicAccessBlockRequest: GetPublicAccessBlockRequest
  ): Either[Throwable, GetPublicAccessBlockResponse] = {
    toEither(underlying.getPublicAccessBlock(getPublicAccessBlockRequest))
  }

  override def headBucket(headBucketRequest: HeadBucketRequest): Either[Throwable, HeadBucketResponse] = {
    toEither(underlying.headBucket(headBucketRequest))
  }

  override def headObject(headObjectRequest: HeadObjectRequest): Either[Throwable, HeadObjectResponse] = {
    toEither(underlying.headObject(headObjectRequest))
  }

  override def listBucketAnalyticsConfigurations(
      listBucketAnalyticsConfigurationsRequest: ListBucketAnalyticsConfigurationsRequest
  ): Either[Throwable, ListBucketAnalyticsConfigurationsResponse] = {
    toEither(underlying.listBucketAnalyticsConfigurations(listBucketAnalyticsConfigurationsRequest))
  }

  override def listBucketInventoryConfigurations(
      listBucketInventoryConfigurationsRequest: ListBucketInventoryConfigurationsRequest
  ): Either[Throwable, ListBucketInventoryConfigurationsResponse] = {
    toEither(underlying.listBucketInventoryConfigurations(listBucketInventoryConfigurationsRequest))
  }

  override def listBucketMetricsConfigurations(
      listBucketMetricsConfigurationsRequest: ListBucketMetricsConfigurationsRequest
  ): Either[Throwable, ListBucketMetricsConfigurationsResponse] = {
    toEither(underlying.listBucketMetricsConfigurations(listBucketMetricsConfigurationsRequest))
  }

  override def listBuckets(): Either[Throwable, ListBucketsResponse] = {
    toEither(underlying.listBuckets())
  }

  override def listBuckets(listBucketsRequest: ListBucketsRequest): Either[Throwable, ListBucketsResponse] = {
    toEither(underlying.listBuckets(listBucketsRequest))
  }

  override def listMultipartUploads(
      listMultipartUploadsRequest: ListMultipartUploadsRequest
  ): Either[Throwable, ListMultipartUploadsResponse] = {
    toEither(underlying.listMultipartUploads(listMultipartUploadsRequest))
  }

  def listMultipartUploadsPaginator(
      listMultipartUploadsRequest: ListMultipartUploadsRequest
  ): ListMultipartUploadsIterable = {
    underlying.listMultipartUploadsPaginator(listMultipartUploadsRequest)
  }

  override def listObjectVersions(
      listObjectVersionsRequest: ListObjectVersionsRequest
  ): Either[Throwable, ListObjectVersionsResponse] = {
    toEither(underlying.listObjectVersions(listObjectVersionsRequest))
  }

  def listObjectVersionsPaginator(listObjectVersionsRequest: ListObjectVersionsRequest): ListObjectVersionsIterable = {
    underlying.listObjectVersionsPaginator(listObjectVersionsRequest)
  }

  override def listObjects(listObjectsRequest: ListObjectsRequest): Either[Throwable, ListObjectsResponse] = {
    toEither(underlying.listObjects(listObjectsRequest))
  }

  override def listObjectsV2(listObjectsV2Request: ListObjectsV2Request): Either[Throwable, ListObjectsV2Response] = {
    toEither(underlying.listObjectsV2(listObjectsV2Request))
  }

  def listObjectsV2Paginator(listObjectsV2Request: ListObjectsV2Request): ListObjectsV2Iterable = {
    underlying.listObjectsV2Paginator(listObjectsV2Request)
  }

  override def listParts(listPartsRequest: ListPartsRequest): Either[Throwable, ListPartsResponse] = {
    toEither(underlying.listParts(listPartsRequest))
  }

  def listPartsPaginator(listPartsRequest: ListPartsRequest): ListPartsIterable = {
    underlying.listPartsPaginator(listPartsRequest)
  }

  override def putBucketAccelerateConfiguration(
      putBucketAccelerateConfigurationRequest: PutBucketAccelerateConfigurationRequest
  ): Either[Throwable, PutBucketAccelerateConfigurationResponse] = {
    toEither(underlying.putBucketAccelerateConfiguration(putBucketAccelerateConfigurationRequest))
  }

  override def putBucketAcl(putBucketAclRequest: PutBucketAclRequest): Either[Throwable, PutBucketAclResponse] = {
    toEither(underlying.putBucketAcl(putBucketAclRequest))
  }

  override def putBucketAnalyticsConfiguration(
      putBucketAnalyticsConfigurationRequest: PutBucketAnalyticsConfigurationRequest
  ): Either[Throwable, PutBucketAnalyticsConfigurationResponse] = {
    toEither(underlying.putBucketAnalyticsConfiguration(putBucketAnalyticsConfigurationRequest))
  }

  override def putBucketCors(putBucketCorsRequest: PutBucketCorsRequest): Either[Throwable, PutBucketCorsResponse] = {
    toEither(underlying.putBucketCors(putBucketCorsRequest))
  }

  override def putBucketEncryption(
      putBucketEncryptionRequest: PutBucketEncryptionRequest
  ): Either[Throwable, PutBucketEncryptionResponse] = {
    toEither(underlying.putBucketEncryption(putBucketEncryptionRequest))
  }

  override def putBucketInventoryConfiguration(
      putBucketInventoryConfigurationRequest: PutBucketInventoryConfigurationRequest
  ): Either[Throwable, PutBucketInventoryConfigurationResponse] = {
    toEither(underlying.putBucketInventoryConfiguration(putBucketInventoryConfigurationRequest))
  }

  override def putBucketLifecycleConfiguration(
      putBucketLifecycleConfigurationRequest: PutBucketLifecycleConfigurationRequest
  ): Either[Throwable, PutBucketLifecycleConfigurationResponse] = {
    toEither(underlying.putBucketLifecycleConfiguration(putBucketLifecycleConfigurationRequest))
  }

  override def putBucketLogging(
      putBucketLoggingRequest: PutBucketLoggingRequest
  ): Either[Throwable, PutBucketLoggingResponse] = {
    toEither(underlying.putBucketLogging(putBucketLoggingRequest))
  }

  override def putBucketMetricsConfiguration(
      putBucketMetricsConfigurationRequest: PutBucketMetricsConfigurationRequest
  ): Either[Throwable, PutBucketMetricsConfigurationResponse] = {
    toEither(underlying.putBucketMetricsConfiguration(putBucketMetricsConfigurationRequest))
  }

  override def putBucketNotificationConfiguration(
      putBucketNotificationConfigurationRequest: PutBucketNotificationConfigurationRequest
  ): Either[Throwable, PutBucketNotificationConfigurationResponse] = {
    toEither(underlying.putBucketNotificationConfiguration(putBucketNotificationConfigurationRequest))
  }

  override def putBucketPolicy(
      putBucketPolicyRequest: PutBucketPolicyRequest
  ): Either[Throwable, PutBucketPolicyResponse] = {
    toEither(underlying.putBucketPolicy(putBucketPolicyRequest))
  }

  override def putBucketReplication(
      putBucketReplicationRequest: PutBucketReplicationRequest
  ): Either[Throwable, PutBucketReplicationResponse] = {
    toEither(underlying.putBucketReplication(putBucketReplicationRequest))
  }

  override def putBucketRequestPayment(
      putBucketRequestPaymentRequest: PutBucketRequestPaymentRequest
  ): Either[Throwable, PutBucketRequestPaymentResponse] = {
    toEither(underlying.putBucketRequestPayment(putBucketRequestPaymentRequest))
  }

  override def putBucketTagging(
      putBucketTaggingRequest: PutBucketTaggingRequest
  ): Either[Throwable, PutBucketTaggingResponse] = {
    toEither(underlying.putBucketTagging(putBucketTaggingRequest))
  }

  override def putBucketVersioning(
      putBucketVersioningRequest: PutBucketVersioningRequest
  ): Either[Throwable, PutBucketVersioningResponse] = {
    toEither(underlying.putBucketVersioning(putBucketVersioningRequest))
  }

  override def putBucketWebsite(
      putBucketWebsiteRequest: PutBucketWebsiteRequest
  ): Either[Throwable, PutBucketWebsiteResponse] = {
    toEither(underlying.putBucketWebsite(putBucketWebsiteRequest))
  }

  override def putObjectAcl(putObjectAclRequest: PutObjectAclRequest): Either[Throwable, PutObjectAclResponse] = {
    toEither(underlying.putObjectAcl(putObjectAclRequest))
  }

  override def putObjectLegalHold(
      putObjectLegalHoldRequest: PutObjectLegalHoldRequest
  ): Either[Throwable, PutObjectLegalHoldResponse] = {
    toEither(underlying.putObjectLegalHold(putObjectLegalHoldRequest))
  }

  override def putObjectLockConfiguration(
      putObjectLockConfigurationRequest: PutObjectLockConfigurationRequest
  ): Either[Throwable, PutObjectLockConfigurationResponse] = {
    toEither(underlying.putObjectLockConfiguration(putObjectLockConfigurationRequest))
  }

  override def putObjectRetention(
      putObjectRetentionRequest: PutObjectRetentionRequest
  ): Either[Throwable, PutObjectRetentionResponse] = {
    toEither(underlying.putObjectRetention(putObjectRetentionRequest))
  }

  override def putObjectTagging(
      putObjectTaggingRequest: PutObjectTaggingRequest
  ): Either[Throwable, PutObjectTaggingResponse] = {
    toEither(underlying.putObjectTagging(putObjectTaggingRequest))
  }

  override def putPublicAccessBlock(
      putPublicAccessBlockRequest: PutPublicAccessBlockRequest
  ): Either[Throwable, PutPublicAccessBlockResponse] = {
    toEither(underlying.putPublicAccessBlock(putPublicAccessBlockRequest))
  }

  override def restoreObject(restoreObjectRequest: RestoreObjectRequest): Either[Throwable, RestoreObjectResponse] = {
    toEither(underlying.restoreObject(restoreObjectRequest))
  }

  override def uploadPartCopy(
      uploadPartCopyRequest: UploadPartCopyRequest
  ): Either[Throwable, UploadPartCopyResponse] = {
    toEither(underlying.uploadPartCopy(uploadPartCopyRequest))
  }

}
