// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3

import software.amazon.awssdk.services.s3.model._
import software.amazon.awssdk.services.s3.paginators._
import software.amazon.awssdk.services.s3.{ S3AsyncClient => JavaS3AsyncClient }

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object S3AsyncClient {

  def apply(asyncClient: JavaS3AsyncClient): S3AsyncClient =
    new S3AsyncClient {
      override val underlying: JavaS3AsyncClient = asyncClient
    }

}

/**
  * @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/s3/S3AsyncClient.html */
trait S3AsyncClient extends S3Client[Future] with S3AsyncClientSupport {
  val underlying: JavaS3AsyncClient

  override def abortMultipartUpload(
      abortMultipartUploadRequest: AbortMultipartUploadRequest
  ): Future[AbortMultipartUploadResponse] =
    underlying.abortMultipartUpload(abortMultipartUploadRequest).toScala

  override def completeMultipartUpload(
      completeMultipartUploadRequest: CompleteMultipartUploadRequest
  ): Future[CompleteMultipartUploadResponse] =
    underlying.completeMultipartUpload(completeMultipartUploadRequest).toScala

  override def copyObject(copyObjectRequest: CopyObjectRequest): Future[CopyObjectResponse] =
    underlying.copyObject(copyObjectRequest).toScala

  override def createBucket(createBucketRequest: CreateBucketRequest): Future[CreateBucketResponse] =
    underlying.createBucket(createBucketRequest).toScala

  override def createMultipartUpload(
      createMultipartUploadRequest: CreateMultipartUploadRequest
  ): Future[CreateMultipartUploadResponse] =
    underlying.createMultipartUpload(createMultipartUploadRequest).toScala

  override def deleteBucket(deleteBucketRequest: DeleteBucketRequest): Future[DeleteBucketResponse] =
    underlying.deleteBucket(deleteBucketRequest).toScala

  override def deleteBucketAnalyticsConfiguration(
      deleteBucketAnalyticsConfigurationRequest: DeleteBucketAnalyticsConfigurationRequest
  ): Future[DeleteBucketAnalyticsConfigurationResponse] =
    underlying.deleteBucketAnalyticsConfiguration(deleteBucketAnalyticsConfigurationRequest).toScala

  override def deleteBucketCors(deleteBucketCorsRequest: DeleteBucketCorsRequest): Future[DeleteBucketCorsResponse] =
    underlying.deleteBucketCors(deleteBucketCorsRequest).toScala

  override def deleteBucketEncryption(
      deleteBucketEncryptionRequest: DeleteBucketEncryptionRequest
  ): Future[DeleteBucketEncryptionResponse] =
    underlying.deleteBucketEncryption(deleteBucketEncryptionRequest).toScala

  override def deleteBucketInventoryConfiguration(
      deleteBucketInventoryConfigurationRequest: DeleteBucketInventoryConfigurationRequest
  ): Future[DeleteBucketInventoryConfigurationResponse] =
    underlying.deleteBucketInventoryConfiguration(deleteBucketInventoryConfigurationRequest).toScala

  override def deleteBucketLifecycle(
      deleteBucketLifecycleRequest: DeleteBucketLifecycleRequest
  ): Future[DeleteBucketLifecycleResponse] =
    underlying.deleteBucketLifecycle(deleteBucketLifecycleRequest).toScala

  override def deleteBucketMetricsConfiguration(
      deleteBucketMetricsConfigurationRequest: DeleteBucketMetricsConfigurationRequest
  ): Future[DeleteBucketMetricsConfigurationResponse] =
    underlying.deleteBucketMetricsConfiguration(deleteBucketMetricsConfigurationRequest).toScala

  override def deleteBucketPolicy(
      deleteBucketPolicyRequest: DeleteBucketPolicyRequest
  ): Future[DeleteBucketPolicyResponse] =
    underlying.deleteBucketPolicy(deleteBucketPolicyRequest).toScala

  override def deleteBucketReplication(
      deleteBucketReplicationRequest: DeleteBucketReplicationRequest
  ): Future[DeleteBucketReplicationResponse] =
    underlying.deleteBucketReplication(deleteBucketReplicationRequest).toScala

  override def deleteBucketTagging(
      deleteBucketTaggingRequest: DeleteBucketTaggingRequest
  ): Future[DeleteBucketTaggingResponse] =
    underlying.deleteBucketTagging(deleteBucketTaggingRequest).toScala

  override def deleteBucketWebsite(
      deleteBucketWebsiteRequest: DeleteBucketWebsiteRequest
  ): Future[DeleteBucketWebsiteResponse] =
    underlying.deleteBucketWebsite(deleteBucketWebsiteRequest).toScala

  override def deleteObject(deleteObjectRequest: DeleteObjectRequest): Future[DeleteObjectResponse] =
    underlying.deleteObject(deleteObjectRequest).toScala

  override def deleteObjectTagging(
      deleteObjectTaggingRequest: DeleteObjectTaggingRequest
  ): Future[DeleteObjectTaggingResponse] =
    underlying.deleteObjectTagging(deleteObjectTaggingRequest).toScala

  override def deleteObjects(deleteObjectsRequest: DeleteObjectsRequest): Future[DeleteObjectsResponse] =
    underlying.deleteObjects(deleteObjectsRequest).toScala

  override def deletePublicAccessBlock(
      deletePublicAccessBlockRequest: DeletePublicAccessBlockRequest
  ): Future[DeletePublicAccessBlockResponse] =
    underlying.deletePublicAccessBlock(deletePublicAccessBlockRequest).toScala

  override def getBucketAccelerateConfiguration(
      getBucketAccelerateConfigurationRequest: GetBucketAccelerateConfigurationRequest
  ): Future[GetBucketAccelerateConfigurationResponse] =
    underlying.getBucketAccelerateConfiguration(getBucketAccelerateConfigurationRequest).toScala

  override def getBucketAcl(getBucketAclRequest: GetBucketAclRequest): Future[GetBucketAclResponse] =
    underlying.getBucketAcl(getBucketAclRequest).toScala

  override def getBucketAnalyticsConfiguration(
      getBucketAnalyticsConfigurationRequest: GetBucketAnalyticsConfigurationRequest
  ): Future[GetBucketAnalyticsConfigurationResponse] =
    underlying.getBucketAnalyticsConfiguration(getBucketAnalyticsConfigurationRequest).toScala

  override def getBucketCors(getBucketCorsRequest: GetBucketCorsRequest): Future[GetBucketCorsResponse] =
    underlying.getBucketCors(getBucketCorsRequest).toScala

  override def getBucketEncryption(
      getBucketEncryptionRequest: GetBucketEncryptionRequest
  ): Future[GetBucketEncryptionResponse] =
    underlying.getBucketEncryption(getBucketEncryptionRequest).toScala

  override def getBucketInventoryConfiguration(
      getBucketInventoryConfigurationRequest: GetBucketInventoryConfigurationRequest
  ): Future[GetBucketInventoryConfigurationResponse] =
    underlying.getBucketInventoryConfiguration(getBucketInventoryConfigurationRequest).toScala

  override def getBucketLifecycleConfiguration(
      getBucketLifecycleConfigurationRequest: GetBucketLifecycleConfigurationRequest
  ): Future[GetBucketLifecycleConfigurationResponse] =
    underlying.getBucketLifecycleConfiguration(getBucketLifecycleConfigurationRequest).toScala

  override def getBucketLocation(
      getBucketLocationRequest: GetBucketLocationRequest
  ): Future[GetBucketLocationResponse] =
    underlying.getBucketLocation(getBucketLocationRequest).toScala

  override def getBucketLogging(getBucketLoggingRequest: GetBucketLoggingRequest): Future[GetBucketLoggingResponse] =
    underlying.getBucketLogging(getBucketLoggingRequest).toScala

  override def getBucketMetricsConfiguration(
      getBucketMetricsConfigurationRequest: GetBucketMetricsConfigurationRequest
  ): Future[GetBucketMetricsConfigurationResponse] =
    underlying.getBucketMetricsConfiguration(getBucketMetricsConfigurationRequest).toScala

  override def getBucketNotificationConfiguration(
      getBucketNotificationConfigurationRequest: GetBucketNotificationConfigurationRequest
  ): Future[GetBucketNotificationConfigurationResponse] =
    underlying.getBucketNotificationConfiguration(getBucketNotificationConfigurationRequest).toScala

  override def getBucketPolicy(getBucketPolicyRequest: GetBucketPolicyRequest): Future[GetBucketPolicyResponse] =
    underlying.getBucketPolicy(getBucketPolicyRequest).toScala

  override def getBucketPolicyStatus(
      getBucketPolicyStatusRequest: GetBucketPolicyStatusRequest
  ): Future[GetBucketPolicyStatusResponse] =
    underlying.getBucketPolicyStatus(getBucketPolicyStatusRequest).toScala

  override def getBucketReplication(
      getBucketReplicationRequest: GetBucketReplicationRequest
  ): Future[GetBucketReplicationResponse] =
    underlying.getBucketReplication(getBucketReplicationRequest).toScala

  override def getBucketRequestPayment(
      getBucketRequestPaymentRequest: GetBucketRequestPaymentRequest
  ): Future[GetBucketRequestPaymentResponse] =
    underlying.getBucketRequestPayment(getBucketRequestPaymentRequest).toScala

  override def getBucketTagging(getBucketTaggingRequest: GetBucketTaggingRequest): Future[GetBucketTaggingResponse] =
    underlying.getBucketTagging(getBucketTaggingRequest).toScala

  override def getBucketVersioning(
      getBucketVersioningRequest: GetBucketVersioningRequest
  ): Future[GetBucketVersioningResponse] =
    underlying.getBucketVersioning(getBucketVersioningRequest).toScala

  override def getBucketWebsite(getBucketWebsiteRequest: GetBucketWebsiteRequest): Future[GetBucketWebsiteResponse] =
    underlying.getBucketWebsite(getBucketWebsiteRequest).toScala

  override def getObjectAcl(getObjectAclRequest: GetObjectAclRequest): Future[GetObjectAclResponse] =
    underlying.getObjectAcl(getObjectAclRequest).toScala

  override def getObjectLegalHold(
      getObjectLegalHoldRequest: GetObjectLegalHoldRequest
  ): Future[GetObjectLegalHoldResponse] =
    underlying.getObjectLegalHold(getObjectLegalHoldRequest).toScala

  override def getObjectLockConfiguration(
      getObjectLockConfigurationRequest: GetObjectLockConfigurationRequest
  ): Future[GetObjectLockConfigurationResponse] =
    underlying.getObjectLockConfiguration(getObjectLockConfigurationRequest).toScala

  override def getObjectRetention(
      getObjectRetentionRequest: GetObjectRetentionRequest
  ): Future[GetObjectRetentionResponse] =
    underlying.getObjectRetention(getObjectRetentionRequest).toScala

  override def getObjectTagging(getObjectTaggingRequest: GetObjectTaggingRequest): Future[GetObjectTaggingResponse] =
    underlying.getObjectTagging(getObjectTaggingRequest).toScala

  override def getPublicAccessBlock(
      getPublicAccessBlockRequest: GetPublicAccessBlockRequest
  ): Future[GetPublicAccessBlockResponse] =
    underlying.getPublicAccessBlock(getPublicAccessBlockRequest).toScala

  override def headBucket(headBucketRequest: HeadBucketRequest): Future[HeadBucketResponse] =
    underlying.headBucket(headBucketRequest).toScala

  override def headObject(headObjectRequest: HeadObjectRequest): Future[HeadObjectResponse] =
    underlying.headObject(headObjectRequest).toScala

  override def listBucketAnalyticsConfigurations(
      listBucketAnalyticsConfigurationsRequest: ListBucketAnalyticsConfigurationsRequest
  ): Future[ListBucketAnalyticsConfigurationsResponse] =
    underlying.listBucketAnalyticsConfigurations(listBucketAnalyticsConfigurationsRequest).toScala

  override def listBucketInventoryConfigurations(
      listBucketInventoryConfigurationsRequest: ListBucketInventoryConfigurationsRequest
  ): Future[ListBucketInventoryConfigurationsResponse] =
    underlying.listBucketInventoryConfigurations(listBucketInventoryConfigurationsRequest).toScala

  override def listBucketMetricsConfigurations(
      listBucketMetricsConfigurationsRequest: ListBucketMetricsConfigurationsRequest
  ): Future[ListBucketMetricsConfigurationsResponse] =
    underlying.listBucketMetricsConfigurations(listBucketMetricsConfigurationsRequest).toScala

  override def listBuckets(listBucketsRequest: ListBucketsRequest): Future[ListBucketsResponse] =
    underlying.listBuckets(listBucketsRequest).toScala

  override def listBuckets(): Future[ListBucketsResponse] =
    underlying.listBuckets().toScala

  override def listMultipartUploads(
      listMultipartUploadsRequest: ListMultipartUploadsRequest
  ): Future[ListMultipartUploadsResponse] =
    underlying.listMultipartUploads(listMultipartUploadsRequest).toScala

  def listMultipartUploadsPaginator(
      listMultipartUploadsRequest: ListMultipartUploadsRequest
  ): ListMultipartUploadsPublisher =
    underlying.listMultipartUploadsPaginator(listMultipartUploadsRequest)

  override def listObjectVersions(
      listObjectVersionsRequest: ListObjectVersionsRequest
  ): Future[ListObjectVersionsResponse] =
    underlying.listObjectVersions(listObjectVersionsRequest).toScala

  def listObjectVersionsPaginator(listObjectVersionsRequest: ListObjectVersionsRequest): ListObjectVersionsPublisher =
    underlying.listObjectVersionsPaginator(listObjectVersionsRequest)

  override def listObjects(listObjectsRequest: ListObjectsRequest): Future[ListObjectsResponse] =
    underlying.listObjects(listObjectsRequest).toScala

  override def listObjectsV2(listObjectsV2Request: ListObjectsV2Request): Future[ListObjectsV2Response] =
    underlying.listObjectsV2(listObjectsV2Request).toScala

  def listObjectsV2Paginator(listObjectsV2Request: ListObjectsV2Request): ListObjectsV2Publisher =
    underlying.listObjectsV2Paginator(listObjectsV2Request)

  override def listParts(listPartsRequest: ListPartsRequest): Future[ListPartsResponse] =
    underlying.listParts(listPartsRequest).toScala

  def listPartsPaginator(listPartsRequest: ListPartsRequest): ListPartsPublisher =
    underlying.listPartsPaginator(listPartsRequest)

  override def putBucketAccelerateConfiguration(
      putBucketAccelerateConfigurationRequest: PutBucketAccelerateConfigurationRequest
  ): Future[PutBucketAccelerateConfigurationResponse] =
    underlying.putBucketAccelerateConfiguration(putBucketAccelerateConfigurationRequest).toScala

  override def putBucketAcl(putBucketAclRequest: PutBucketAclRequest): Future[PutBucketAclResponse] =
    underlying.putBucketAcl(putBucketAclRequest).toScala

  override def putBucketAnalyticsConfiguration(
      putBucketAnalyticsConfigurationRequest: PutBucketAnalyticsConfigurationRequest
  ): Future[PutBucketAnalyticsConfigurationResponse] =
    underlying.putBucketAnalyticsConfiguration(putBucketAnalyticsConfigurationRequest).toScala

  override def putBucketCors(putBucketCorsRequest: PutBucketCorsRequest): Future[PutBucketCorsResponse] =
    underlying.putBucketCors(putBucketCorsRequest).toScala

  override def putBucketEncryption(
      putBucketEncryptionRequest: PutBucketEncryptionRequest
  ): Future[PutBucketEncryptionResponse] =
    underlying.putBucketEncryption(putBucketEncryptionRequest).toScala

  override def putBucketInventoryConfiguration(
      putBucketInventoryConfigurationRequest: PutBucketInventoryConfigurationRequest
  ): Future[PutBucketInventoryConfigurationResponse] =
    underlying.putBucketInventoryConfiguration(putBucketInventoryConfigurationRequest).toScala

  override def putBucketLifecycleConfiguration(
      putBucketLifecycleConfigurationRequest: PutBucketLifecycleConfigurationRequest
  ): Future[PutBucketLifecycleConfigurationResponse] =
    underlying.putBucketLifecycleConfiguration(putBucketLifecycleConfigurationRequest).toScala

  override def putBucketLogging(putBucketLoggingRequest: PutBucketLoggingRequest): Future[PutBucketLoggingResponse] =
    underlying.putBucketLogging(putBucketLoggingRequest).toScala

  override def putBucketMetricsConfiguration(
      putBucketMetricsConfigurationRequest: PutBucketMetricsConfigurationRequest
  ): Future[PutBucketMetricsConfigurationResponse] =
    underlying.putBucketMetricsConfiguration(putBucketMetricsConfigurationRequest).toScala

  override def putBucketNotificationConfiguration(
      putBucketNotificationConfigurationRequest: PutBucketNotificationConfigurationRequest
  ): Future[PutBucketNotificationConfigurationResponse] =
    underlying.putBucketNotificationConfiguration(putBucketNotificationConfigurationRequest).toScala

  override def putBucketPolicy(putBucketPolicyRequest: PutBucketPolicyRequest): Future[PutBucketPolicyResponse] =
    underlying.putBucketPolicy(putBucketPolicyRequest).toScala

  override def putBucketReplication(
      putBucketReplicationRequest: PutBucketReplicationRequest
  ): Future[PutBucketReplicationResponse] =
    underlying.putBucketReplication(putBucketReplicationRequest).toScala

  override def putBucketRequestPayment(
      putBucketRequestPaymentRequest: PutBucketRequestPaymentRequest
  ): Future[PutBucketRequestPaymentResponse] =
    underlying.putBucketRequestPayment(putBucketRequestPaymentRequest).toScala

  override def putBucketTagging(putBucketTaggingRequest: PutBucketTaggingRequest): Future[PutBucketTaggingResponse] =
    underlying.putBucketTagging(putBucketTaggingRequest).toScala

  override def putBucketVersioning(
      putBucketVersioningRequest: PutBucketVersioningRequest
  ): Future[PutBucketVersioningResponse] =
    underlying.putBucketVersioning(putBucketVersioningRequest).toScala

  override def putBucketWebsite(putBucketWebsiteRequest: PutBucketWebsiteRequest): Future[PutBucketWebsiteResponse] =
    underlying.putBucketWebsite(putBucketWebsiteRequest).toScala

  override def putObjectAcl(putObjectAclRequest: PutObjectAclRequest): Future[PutObjectAclResponse] =
    underlying.putObjectAcl(putObjectAclRequest).toScala

  override def putObjectLegalHold(
      putObjectLegalHoldRequest: PutObjectLegalHoldRequest
  ): Future[PutObjectLegalHoldResponse] =
    underlying.putObjectLegalHold(putObjectLegalHoldRequest).toScala

  override def putObjectLockConfiguration(
      putObjectLockConfigurationRequest: PutObjectLockConfigurationRequest
  ): Future[PutObjectLockConfigurationResponse] =
    underlying.putObjectLockConfiguration(putObjectLockConfigurationRequest).toScala

  override def putObjectRetention(
      putObjectRetentionRequest: PutObjectRetentionRequest
  ): Future[PutObjectRetentionResponse] =
    underlying.putObjectRetention(putObjectRetentionRequest).toScala

  override def putObjectTagging(putObjectTaggingRequest: PutObjectTaggingRequest): Future[PutObjectTaggingResponse] =
    underlying.putObjectTagging(putObjectTaggingRequest).toScala

  override def putPublicAccessBlock(
      putPublicAccessBlockRequest: PutPublicAccessBlockRequest
  ): Future[PutPublicAccessBlockResponse] =
    underlying.putPublicAccessBlock(putPublicAccessBlockRequest).toScala

  override def restoreObject(restoreObjectRequest: RestoreObjectRequest): Future[RestoreObjectResponse] =
    underlying.restoreObject(restoreObjectRequest).toScala

  override def uploadPartCopy(uploadPartCopyRequest: UploadPartCopyRequest): Future[UploadPartCopyResponse] =
    underlying.uploadPartCopy(uploadPartCopyRequest).toScala

}
