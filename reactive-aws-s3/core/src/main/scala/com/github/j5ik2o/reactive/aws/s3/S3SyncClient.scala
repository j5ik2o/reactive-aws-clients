// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.s3.model._
import software.amazon.awssdk.services.s3.paginators._
import software.amazon.awssdk.services.s3.{ S3Client => JavaS3SyncClient }

object S3SyncClient extends ToEitherSupport {

  def apply(javaClient: JavaS3SyncClient): S3SyncClient = new S3SyncClient {
    override val underlying: JavaS3SyncClient = javaClient
  }

}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/s3/S3Client.html
  */
trait S3SyncClient extends S3Client[Either[Throwable, ?]] with S3SyncClientSupport {
  val underlying: JavaS3SyncClient

  import S3SyncClient._

  override def abortMultipartUpload(
      abortMultipartUploadRequest: AbortMultipartUploadRequest
  ): Either[Throwable, AbortMultipartUploadResponse] =
    underlying.abortMultipartUpload(abortMultipartUploadRequest).toEither

  override def completeMultipartUpload(
      completeMultipartUploadRequest: CompleteMultipartUploadRequest
  ): Either[Throwable, CompleteMultipartUploadResponse] =
    underlying.completeMultipartUpload(completeMultipartUploadRequest).toEither

  override def copyObject(copyObjectRequest: CopyObjectRequest): Either[Throwable, CopyObjectResponse] =
    underlying.copyObject(copyObjectRequest).toEither

  override def createBucket(createBucketRequest: CreateBucketRequest): Either[Throwable, CreateBucketResponse] =
    underlying.createBucket(createBucketRequest).toEither

  override def createMultipartUpload(
      createMultipartUploadRequest: CreateMultipartUploadRequest
  ): Either[Throwable, CreateMultipartUploadResponse] =
    underlying.createMultipartUpload(createMultipartUploadRequest).toEither

  override def deleteBucket(deleteBucketRequest: DeleteBucketRequest): Either[Throwable, DeleteBucketResponse] =
    underlying.deleteBucket(deleteBucketRequest).toEither

  override def deleteBucketAnalyticsConfiguration(
      deleteBucketAnalyticsConfigurationRequest: DeleteBucketAnalyticsConfigurationRequest
  ): Either[Throwable, DeleteBucketAnalyticsConfigurationResponse] =
    underlying.deleteBucketAnalyticsConfiguration(deleteBucketAnalyticsConfigurationRequest).toEither

  override def deleteBucketCors(
      deleteBucketCorsRequest: DeleteBucketCorsRequest
  ): Either[Throwable, DeleteBucketCorsResponse] =
    underlying.deleteBucketCors(deleteBucketCorsRequest).toEither

  override def deleteBucketEncryption(
      deleteBucketEncryptionRequest: DeleteBucketEncryptionRequest
  ): Either[Throwable, DeleteBucketEncryptionResponse] =
    underlying.deleteBucketEncryption(deleteBucketEncryptionRequest).toEither

  override def deleteBucketInventoryConfiguration(
      deleteBucketInventoryConfigurationRequest: DeleteBucketInventoryConfigurationRequest
  ): Either[Throwable, DeleteBucketInventoryConfigurationResponse] =
    underlying.deleteBucketInventoryConfiguration(deleteBucketInventoryConfigurationRequest).toEither

  override def deleteBucketLifecycle(
      deleteBucketLifecycleRequest: DeleteBucketLifecycleRequest
  ): Either[Throwable, DeleteBucketLifecycleResponse] =
    underlying.deleteBucketLifecycle(deleteBucketLifecycleRequest).toEither

  override def deleteBucketMetricsConfiguration(
      deleteBucketMetricsConfigurationRequest: DeleteBucketMetricsConfigurationRequest
  ): Either[Throwable, DeleteBucketMetricsConfigurationResponse] =
    underlying.deleteBucketMetricsConfiguration(deleteBucketMetricsConfigurationRequest).toEither

  override def deleteBucketPolicy(
      deleteBucketPolicyRequest: DeleteBucketPolicyRequest
  ): Either[Throwable, DeleteBucketPolicyResponse] =
    underlying.deleteBucketPolicy(deleteBucketPolicyRequest).toEither

  override def deleteBucketReplication(
      deleteBucketReplicationRequest: DeleteBucketReplicationRequest
  ): Either[Throwable, DeleteBucketReplicationResponse] =
    underlying.deleteBucketReplication(deleteBucketReplicationRequest).toEither

  override def deleteBucketTagging(
      deleteBucketTaggingRequest: DeleteBucketTaggingRequest
  ): Either[Throwable, DeleteBucketTaggingResponse] =
    underlying.deleteBucketTagging(deleteBucketTaggingRequest).toEither

  override def deleteBucketWebsite(
      deleteBucketWebsiteRequest: DeleteBucketWebsiteRequest
  ): Either[Throwable, DeleteBucketWebsiteResponse] =
    underlying.deleteBucketWebsite(deleteBucketWebsiteRequest).toEither

  override def deleteObject(deleteObjectRequest: DeleteObjectRequest): Either[Throwable, DeleteObjectResponse] =
    underlying.deleteObject(deleteObjectRequest).toEither

  override def deleteObjectTagging(
      deleteObjectTaggingRequest: DeleteObjectTaggingRequest
  ): Either[Throwable, DeleteObjectTaggingResponse] =
    underlying.deleteObjectTagging(deleteObjectTaggingRequest).toEither

  override def deleteObjects(deleteObjectsRequest: DeleteObjectsRequest): Either[Throwable, DeleteObjectsResponse] =
    underlying.deleteObjects(deleteObjectsRequest).toEither

  override def deletePublicAccessBlock(
      deletePublicAccessBlockRequest: DeletePublicAccessBlockRequest
  ): Either[Throwable, DeletePublicAccessBlockResponse] =
    underlying.deletePublicAccessBlock(deletePublicAccessBlockRequest).toEither

  override def getBucketAccelerateConfiguration(
      getBucketAccelerateConfigurationRequest: GetBucketAccelerateConfigurationRequest
  ): Either[Throwable, GetBucketAccelerateConfigurationResponse] =
    underlying.getBucketAccelerateConfiguration(getBucketAccelerateConfigurationRequest).toEither

  override def getBucketAcl(getBucketAclRequest: GetBucketAclRequest): Either[Throwable, GetBucketAclResponse] =
    underlying.getBucketAcl(getBucketAclRequest).toEither

  override def getBucketAnalyticsConfiguration(
      getBucketAnalyticsConfigurationRequest: GetBucketAnalyticsConfigurationRequest
  ): Either[Throwable, GetBucketAnalyticsConfigurationResponse] =
    underlying.getBucketAnalyticsConfiguration(getBucketAnalyticsConfigurationRequest).toEither

  override def getBucketCors(getBucketCorsRequest: GetBucketCorsRequest): Either[Throwable, GetBucketCorsResponse] =
    underlying.getBucketCors(getBucketCorsRequest).toEither

  override def getBucketEncryption(
      getBucketEncryptionRequest: GetBucketEncryptionRequest
  ): Either[Throwable, GetBucketEncryptionResponse] =
    underlying.getBucketEncryption(getBucketEncryptionRequest).toEither

  override def getBucketInventoryConfiguration(
      getBucketInventoryConfigurationRequest: GetBucketInventoryConfigurationRequest
  ): Either[Throwable, GetBucketInventoryConfigurationResponse] =
    underlying.getBucketInventoryConfiguration(getBucketInventoryConfigurationRequest).toEither

  override def getBucketLifecycleConfiguration(
      getBucketLifecycleConfigurationRequest: GetBucketLifecycleConfigurationRequest
  ): Either[Throwable, GetBucketLifecycleConfigurationResponse] =
    underlying.getBucketLifecycleConfiguration(getBucketLifecycleConfigurationRequest).toEither

  override def getBucketLocation(
      getBucketLocationRequest: GetBucketLocationRequest
  ): Either[Throwable, GetBucketLocationResponse] =
    underlying.getBucketLocation(getBucketLocationRequest).toEither

  override def getBucketLogging(
      getBucketLoggingRequest: GetBucketLoggingRequest
  ): Either[Throwable, GetBucketLoggingResponse] =
    underlying.getBucketLogging(getBucketLoggingRequest).toEither

  override def getBucketMetricsConfiguration(
      getBucketMetricsConfigurationRequest: GetBucketMetricsConfigurationRequest
  ): Either[Throwable, GetBucketMetricsConfigurationResponse] =
    underlying.getBucketMetricsConfiguration(getBucketMetricsConfigurationRequest).toEither

  override def getBucketNotificationConfiguration(
      getBucketNotificationConfigurationRequest: GetBucketNotificationConfigurationRequest
  ): Either[Throwable, GetBucketNotificationConfigurationResponse] =
    underlying.getBucketNotificationConfiguration(getBucketNotificationConfigurationRequest).toEither

  override def getBucketPolicy(
      getBucketPolicyRequest: GetBucketPolicyRequest
  ): Either[Throwable, GetBucketPolicyResponse] =
    underlying.getBucketPolicy(getBucketPolicyRequest).toEither

  override def getBucketPolicyStatus(
      getBucketPolicyStatusRequest: GetBucketPolicyStatusRequest
  ): Either[Throwable, GetBucketPolicyStatusResponse] =
    underlying.getBucketPolicyStatus(getBucketPolicyStatusRequest).toEither

  override def getBucketReplication(
      getBucketReplicationRequest: GetBucketReplicationRequest
  ): Either[Throwable, GetBucketReplicationResponse] =
    underlying.getBucketReplication(getBucketReplicationRequest).toEither

  override def getBucketRequestPayment(
      getBucketRequestPaymentRequest: GetBucketRequestPaymentRequest
  ): Either[Throwable, GetBucketRequestPaymentResponse] =
    underlying.getBucketRequestPayment(getBucketRequestPaymentRequest).toEither

  override def getBucketTagging(
      getBucketTaggingRequest: GetBucketTaggingRequest
  ): Either[Throwable, GetBucketTaggingResponse] =
    underlying.getBucketTagging(getBucketTaggingRequest).toEither

  override def getBucketVersioning(
      getBucketVersioningRequest: GetBucketVersioningRequest
  ): Either[Throwable, GetBucketVersioningResponse] =
    underlying.getBucketVersioning(getBucketVersioningRequest).toEither

  override def getBucketWebsite(
      getBucketWebsiteRequest: GetBucketWebsiteRequest
  ): Either[Throwable, GetBucketWebsiteResponse] =
    underlying.getBucketWebsite(getBucketWebsiteRequest).toEither

  override def getObjectAcl(getObjectAclRequest: GetObjectAclRequest): Either[Throwable, GetObjectAclResponse] =
    underlying.getObjectAcl(getObjectAclRequest).toEither

  override def getObjectLegalHold(
      getObjectLegalHoldRequest: GetObjectLegalHoldRequest
  ): Either[Throwable, GetObjectLegalHoldResponse] =
    underlying.getObjectLegalHold(getObjectLegalHoldRequest).toEither

  override def getObjectLockConfiguration(
      getObjectLockConfigurationRequest: GetObjectLockConfigurationRequest
  ): Either[Throwable, GetObjectLockConfigurationResponse] =
    underlying.getObjectLockConfiguration(getObjectLockConfigurationRequest).toEither

  override def getObjectRetention(
      getObjectRetentionRequest: GetObjectRetentionRequest
  ): Either[Throwable, GetObjectRetentionResponse] =
    underlying.getObjectRetention(getObjectRetentionRequest).toEither

  override def getObjectTagging(
      getObjectTaggingRequest: GetObjectTaggingRequest
  ): Either[Throwable, GetObjectTaggingResponse] =
    underlying.getObjectTagging(getObjectTaggingRequest).toEither

  override def getPublicAccessBlock(
      getPublicAccessBlockRequest: GetPublicAccessBlockRequest
  ): Either[Throwable, GetPublicAccessBlockResponse] =
    underlying.getPublicAccessBlock(getPublicAccessBlockRequest).toEither

  override def headBucket(headBucketRequest: HeadBucketRequest): Either[Throwable, HeadBucketResponse] =
    underlying.headBucket(headBucketRequest).toEither

  override def headObject(headObjectRequest: HeadObjectRequest): Either[Throwable, HeadObjectResponse] =
    underlying.headObject(headObjectRequest).toEither

  override def listBucketAnalyticsConfigurations(
      listBucketAnalyticsConfigurationsRequest: ListBucketAnalyticsConfigurationsRequest
  ): Either[Throwable, ListBucketAnalyticsConfigurationsResponse] =
    underlying.listBucketAnalyticsConfigurations(listBucketAnalyticsConfigurationsRequest).toEither

  override def listBucketInventoryConfigurations(
      listBucketInventoryConfigurationsRequest: ListBucketInventoryConfigurationsRequest
  ): Either[Throwable, ListBucketInventoryConfigurationsResponse] =
    underlying.listBucketInventoryConfigurations(listBucketInventoryConfigurationsRequest).toEither

  override def listBucketMetricsConfigurations(
      listBucketMetricsConfigurationsRequest: ListBucketMetricsConfigurationsRequest
  ): Either[Throwable, ListBucketMetricsConfigurationsResponse] =
    underlying.listBucketMetricsConfigurations(listBucketMetricsConfigurationsRequest).toEither

  override def listBuckets(): Either[Throwable, ListBucketsResponse] =
    underlying.listBuckets().toEither

  override def listBuckets(listBucketsRequest: ListBucketsRequest): Either[Throwable, ListBucketsResponse] =
    underlying.listBuckets(listBucketsRequest).toEither

  override def listMultipartUploads(
      listMultipartUploadsRequest: ListMultipartUploadsRequest
  ): Either[Throwable, ListMultipartUploadsResponse] =
    underlying.listMultipartUploads(listMultipartUploadsRequest).toEither

  def listMultipartUploadsPaginator(
      listMultipartUploadsRequest: ListMultipartUploadsRequest
  ): ListMultipartUploadsIterable =
    underlying.listMultipartUploadsPaginator(listMultipartUploadsRequest)

  override def listObjectVersions(
      listObjectVersionsRequest: ListObjectVersionsRequest
  ): Either[Throwable, ListObjectVersionsResponse] =
    underlying.listObjectVersions(listObjectVersionsRequest).toEither

  def listObjectVersionsPaginator(listObjectVersionsRequest: ListObjectVersionsRequest): ListObjectVersionsIterable =
    underlying.listObjectVersionsPaginator(listObjectVersionsRequest)

  override def listObjects(listObjectsRequest: ListObjectsRequest): Either[Throwable, ListObjectsResponse] =
    underlying.listObjects(listObjectsRequest).toEither

  override def listObjectsV2(listObjectsV2Request: ListObjectsV2Request): Either[Throwable, ListObjectsV2Response] =
    underlying.listObjectsV2(listObjectsV2Request).toEither

  def listObjectsV2Paginator(listObjectsV2Request: ListObjectsV2Request): ListObjectsV2Iterable =
    underlying.listObjectsV2Paginator(listObjectsV2Request)

  override def listParts(listPartsRequest: ListPartsRequest): Either[Throwable, ListPartsResponse] =
    underlying.listParts(listPartsRequest).toEither

  def listPartsPaginator(listPartsRequest: ListPartsRequest): ListPartsIterable =
    underlying.listPartsPaginator(listPartsRequest)

  override def putBucketAccelerateConfiguration(
      putBucketAccelerateConfigurationRequest: PutBucketAccelerateConfigurationRequest
  ): Either[Throwable, PutBucketAccelerateConfigurationResponse] =
    underlying.putBucketAccelerateConfiguration(putBucketAccelerateConfigurationRequest).toEither

  override def putBucketAcl(putBucketAclRequest: PutBucketAclRequest): Either[Throwable, PutBucketAclResponse] =
    underlying.putBucketAcl(putBucketAclRequest).toEither

  override def putBucketAnalyticsConfiguration(
      putBucketAnalyticsConfigurationRequest: PutBucketAnalyticsConfigurationRequest
  ): Either[Throwable, PutBucketAnalyticsConfigurationResponse] =
    underlying.putBucketAnalyticsConfiguration(putBucketAnalyticsConfigurationRequest).toEither

  override def putBucketCors(putBucketCorsRequest: PutBucketCorsRequest): Either[Throwable, PutBucketCorsResponse] =
    underlying.putBucketCors(putBucketCorsRequest).toEither

  override def putBucketEncryption(
      putBucketEncryptionRequest: PutBucketEncryptionRequest
  ): Either[Throwable, PutBucketEncryptionResponse] =
    underlying.putBucketEncryption(putBucketEncryptionRequest).toEither

  override def putBucketInventoryConfiguration(
      putBucketInventoryConfigurationRequest: PutBucketInventoryConfigurationRequest
  ): Either[Throwable, PutBucketInventoryConfigurationResponse] =
    underlying.putBucketInventoryConfiguration(putBucketInventoryConfigurationRequest).toEither

  override def putBucketLifecycleConfiguration(
      putBucketLifecycleConfigurationRequest: PutBucketLifecycleConfigurationRequest
  ): Either[Throwable, PutBucketLifecycleConfigurationResponse] =
    underlying.putBucketLifecycleConfiguration(putBucketLifecycleConfigurationRequest).toEither

  override def putBucketLogging(
      putBucketLoggingRequest: PutBucketLoggingRequest
  ): Either[Throwable, PutBucketLoggingResponse] =
    underlying.putBucketLogging(putBucketLoggingRequest).toEither

  override def putBucketMetricsConfiguration(
      putBucketMetricsConfigurationRequest: PutBucketMetricsConfigurationRequest
  ): Either[Throwable, PutBucketMetricsConfigurationResponse] =
    underlying.putBucketMetricsConfiguration(putBucketMetricsConfigurationRequest).toEither

  override def putBucketNotificationConfiguration(
      putBucketNotificationConfigurationRequest: PutBucketNotificationConfigurationRequest
  ): Either[Throwable, PutBucketNotificationConfigurationResponse] =
    underlying.putBucketNotificationConfiguration(putBucketNotificationConfigurationRequest).toEither

  override def putBucketPolicy(
      putBucketPolicyRequest: PutBucketPolicyRequest
  ): Either[Throwable, PutBucketPolicyResponse] =
    underlying.putBucketPolicy(putBucketPolicyRequest).toEither

  override def putBucketReplication(
      putBucketReplicationRequest: PutBucketReplicationRequest
  ): Either[Throwable, PutBucketReplicationResponse] =
    underlying.putBucketReplication(putBucketReplicationRequest).toEither

  override def putBucketRequestPayment(
      putBucketRequestPaymentRequest: PutBucketRequestPaymentRequest
  ): Either[Throwable, PutBucketRequestPaymentResponse] =
    underlying.putBucketRequestPayment(putBucketRequestPaymentRequest).toEither

  override def putBucketTagging(
      putBucketTaggingRequest: PutBucketTaggingRequest
  ): Either[Throwable, PutBucketTaggingResponse] =
    underlying.putBucketTagging(putBucketTaggingRequest).toEither

  override def putBucketVersioning(
      putBucketVersioningRequest: PutBucketVersioningRequest
  ): Either[Throwable, PutBucketVersioningResponse] =
    underlying.putBucketVersioning(putBucketVersioningRequest).toEither

  override def putBucketWebsite(
      putBucketWebsiteRequest: PutBucketWebsiteRequest
  ): Either[Throwable, PutBucketWebsiteResponse] =
    underlying.putBucketWebsite(putBucketWebsiteRequest).toEither

  override def putObjectAcl(putObjectAclRequest: PutObjectAclRequest): Either[Throwable, PutObjectAclResponse] =
    underlying.putObjectAcl(putObjectAclRequest).toEither

  override def putObjectLegalHold(
      putObjectLegalHoldRequest: PutObjectLegalHoldRequest
  ): Either[Throwable, PutObjectLegalHoldResponse] =
    underlying.putObjectLegalHold(putObjectLegalHoldRequest).toEither

  override def putObjectLockConfiguration(
      putObjectLockConfigurationRequest: PutObjectLockConfigurationRequest
  ): Either[Throwable, PutObjectLockConfigurationResponse] =
    underlying.putObjectLockConfiguration(putObjectLockConfigurationRequest).toEither

  override def putObjectRetention(
      putObjectRetentionRequest: PutObjectRetentionRequest
  ): Either[Throwable, PutObjectRetentionResponse] =
    underlying.putObjectRetention(putObjectRetentionRequest).toEither

  override def putObjectTagging(
      putObjectTaggingRequest: PutObjectTaggingRequest
  ): Either[Throwable, PutObjectTaggingResponse] =
    underlying.putObjectTagging(putObjectTaggingRequest).toEither

  override def putPublicAccessBlock(
      putPublicAccessBlockRequest: PutPublicAccessBlockRequest
  ): Either[Throwable, PutPublicAccessBlockResponse] =
    underlying.putPublicAccessBlock(putPublicAccessBlockRequest).toEither

  override def restoreObject(restoreObjectRequest: RestoreObjectRequest): Either[Throwable, RestoreObjectResponse] =
    underlying.restoreObject(restoreObjectRequest).toEither

  override def uploadPartCopy(uploadPartCopyRequest: UploadPartCopyRequest): Either[Throwable, UploadPartCopyResponse] =
    underlying.uploadPartCopy(uploadPartCopyRequest).toEither

}
