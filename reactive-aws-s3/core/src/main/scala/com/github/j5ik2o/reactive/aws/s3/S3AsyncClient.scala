// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3

import java.util.concurrent.CompletableFuture

import software.amazon.awssdk.services.s3.model._
import software.amazon.awssdk.services.s3.paginators._
import software.amazon.awssdk.services.s3.{ S3AsyncClient => JavaS3AsyncClient }

import scala.compat.java8.FutureConverters
import scala.concurrent.Future

object S3AsyncClient {

  def apply(underlying: JavaS3AsyncClient): S3AsyncClient =
    new S3AsyncClientImpl(underlying)

  implicit class CompletableFutureOps[A](val cf: CompletableFuture[A]) extends AnyVal {
    def toFuture: Future[A] = FutureConverters.toScala(cf)
  }

}

trait S3AsyncClient extends S3Client[Future] with S3AsyncClientSupport {
  val underlying: JavaS3AsyncClient
  import S3AsyncClient._

  override def abortMultipartUpload(
      abortMultipartUploadRequest: AbortMultipartUploadRequest
  ): Future[AbortMultipartUploadResponse] = {
    underlying.abortMultipartUpload(abortMultipartUploadRequest).toFuture
  }

  override def completeMultipartUpload(
      completeMultipartUploadRequest: CompleteMultipartUploadRequest
  ): Future[CompleteMultipartUploadResponse] = {
    underlying.completeMultipartUpload(completeMultipartUploadRequest).toFuture
  }

  override def copyObject(copyObjectRequest: CopyObjectRequest): Future[CopyObjectResponse] = {
    underlying.copyObject(copyObjectRequest).toFuture
  }

  override def createBucket(createBucketRequest: CreateBucketRequest): Future[CreateBucketResponse] = {
    underlying.createBucket(createBucketRequest).toFuture
  }

  override def createMultipartUpload(
      createMultipartUploadRequest: CreateMultipartUploadRequest
  ): Future[CreateMultipartUploadResponse] = {
    underlying.createMultipartUpload(createMultipartUploadRequest).toFuture
  }

  override def deleteBucket(deleteBucketRequest: DeleteBucketRequest): Future[DeleteBucketResponse] = {
    underlying.deleteBucket(deleteBucketRequest).toFuture
  }

  override def deleteBucketAnalyticsConfiguration(
      deleteBucketAnalyticsConfigurationRequest: DeleteBucketAnalyticsConfigurationRequest
  ): Future[DeleteBucketAnalyticsConfigurationResponse] = {
    underlying.deleteBucketAnalyticsConfiguration(deleteBucketAnalyticsConfigurationRequest).toFuture
  }

  override def deleteBucketCors(deleteBucketCorsRequest: DeleteBucketCorsRequest): Future[DeleteBucketCorsResponse] = {
    underlying.deleteBucketCors(deleteBucketCorsRequest).toFuture
  }

  override def deleteBucketEncryption(
      deleteBucketEncryptionRequest: DeleteBucketEncryptionRequest
  ): Future[DeleteBucketEncryptionResponse] = {
    underlying.deleteBucketEncryption(deleteBucketEncryptionRequest).toFuture
  }

  override def deleteBucketInventoryConfiguration(
      deleteBucketInventoryConfigurationRequest: DeleteBucketInventoryConfigurationRequest
  ): Future[DeleteBucketInventoryConfigurationResponse] = {
    underlying.deleteBucketInventoryConfiguration(deleteBucketInventoryConfigurationRequest).toFuture
  }

  override def deleteBucketLifecycle(
      deleteBucketLifecycleRequest: DeleteBucketLifecycleRequest
  ): Future[DeleteBucketLifecycleResponse] = {
    underlying.deleteBucketLifecycle(deleteBucketLifecycleRequest).toFuture
  }

  override def deleteBucketMetricsConfiguration(
      deleteBucketMetricsConfigurationRequest: DeleteBucketMetricsConfigurationRequest
  ): Future[DeleteBucketMetricsConfigurationResponse] = {
    underlying.deleteBucketMetricsConfiguration(deleteBucketMetricsConfigurationRequest).toFuture
  }

  override def deleteBucketPolicy(
      deleteBucketPolicyRequest: DeleteBucketPolicyRequest
  ): Future[DeleteBucketPolicyResponse] = {
    underlying.deleteBucketPolicy(deleteBucketPolicyRequest).toFuture
  }

  override def deleteBucketReplication(
      deleteBucketReplicationRequest: DeleteBucketReplicationRequest
  ): Future[DeleteBucketReplicationResponse] = {
    underlying.deleteBucketReplication(deleteBucketReplicationRequest).toFuture
  }

  override def deleteBucketTagging(
      deleteBucketTaggingRequest: DeleteBucketTaggingRequest
  ): Future[DeleteBucketTaggingResponse] = {
    underlying.deleteBucketTagging(deleteBucketTaggingRequest).toFuture
  }

  override def deleteBucketWebsite(
      deleteBucketWebsiteRequest: DeleteBucketWebsiteRequest
  ): Future[DeleteBucketWebsiteResponse] = {
    underlying.deleteBucketWebsite(deleteBucketWebsiteRequest).toFuture
  }

  override def deleteObject(deleteObjectRequest: DeleteObjectRequest): Future[DeleteObjectResponse] = {
    underlying.deleteObject(deleteObjectRequest).toFuture
  }

  override def deleteObjectTagging(
      deleteObjectTaggingRequest: DeleteObjectTaggingRequest
  ): Future[DeleteObjectTaggingResponse] = {
    underlying.deleteObjectTagging(deleteObjectTaggingRequest).toFuture
  }

  override def deleteObjects(deleteObjectsRequest: DeleteObjectsRequest): Future[DeleteObjectsResponse] = {
    underlying.deleteObjects(deleteObjectsRequest).toFuture
  }

  override def deletePublicAccessBlock(
      deletePublicAccessBlockRequest: DeletePublicAccessBlockRequest
  ): Future[DeletePublicAccessBlockResponse] = {
    underlying.deletePublicAccessBlock(deletePublicAccessBlockRequest).toFuture
  }

  override def getBucketAccelerateConfiguration(
      getBucketAccelerateConfigurationRequest: GetBucketAccelerateConfigurationRequest
  ): Future[GetBucketAccelerateConfigurationResponse] = {
    underlying.getBucketAccelerateConfiguration(getBucketAccelerateConfigurationRequest).toFuture
  }

  override def getBucketAcl(getBucketAclRequest: GetBucketAclRequest): Future[GetBucketAclResponse] = {
    underlying.getBucketAcl(getBucketAclRequest).toFuture
  }

  override def getBucketAnalyticsConfiguration(
      getBucketAnalyticsConfigurationRequest: GetBucketAnalyticsConfigurationRequest
  ): Future[GetBucketAnalyticsConfigurationResponse] = {
    underlying.getBucketAnalyticsConfiguration(getBucketAnalyticsConfigurationRequest).toFuture
  }

  override def getBucketCors(getBucketCorsRequest: GetBucketCorsRequest): Future[GetBucketCorsResponse] = {
    underlying.getBucketCors(getBucketCorsRequest).toFuture
  }

  override def getBucketEncryption(
      getBucketEncryptionRequest: GetBucketEncryptionRequest
  ): Future[GetBucketEncryptionResponse] = {
    underlying.getBucketEncryption(getBucketEncryptionRequest).toFuture
  }

  override def getBucketInventoryConfiguration(
      getBucketInventoryConfigurationRequest: GetBucketInventoryConfigurationRequest
  ): Future[GetBucketInventoryConfigurationResponse] = {
    underlying.getBucketInventoryConfiguration(getBucketInventoryConfigurationRequest).toFuture
  }

  override def getBucketLifecycleConfiguration(
      getBucketLifecycleConfigurationRequest: GetBucketLifecycleConfigurationRequest
  ): Future[GetBucketLifecycleConfigurationResponse] = {
    underlying.getBucketLifecycleConfiguration(getBucketLifecycleConfigurationRequest).toFuture
  }

  override def getBucketLocation(
      getBucketLocationRequest: GetBucketLocationRequest
  ): Future[GetBucketLocationResponse] = {
    underlying.getBucketLocation(getBucketLocationRequest).toFuture
  }

  override def getBucketLogging(getBucketLoggingRequest: GetBucketLoggingRequest): Future[GetBucketLoggingResponse] = {
    underlying.getBucketLogging(getBucketLoggingRequest).toFuture
  }

  override def getBucketMetricsConfiguration(
      getBucketMetricsConfigurationRequest: GetBucketMetricsConfigurationRequest
  ): Future[GetBucketMetricsConfigurationResponse] = {
    underlying.getBucketMetricsConfiguration(getBucketMetricsConfigurationRequest).toFuture
  }

  override def getBucketNotificationConfiguration(
      getBucketNotificationConfigurationRequest: GetBucketNotificationConfigurationRequest
  ): Future[GetBucketNotificationConfigurationResponse] = {
    underlying.getBucketNotificationConfiguration(getBucketNotificationConfigurationRequest).toFuture
  }

  override def getBucketPolicy(getBucketPolicyRequest: GetBucketPolicyRequest): Future[GetBucketPolicyResponse] = {
    underlying.getBucketPolicy(getBucketPolicyRequest).toFuture
  }

  override def getBucketPolicyStatus(
      getBucketPolicyStatusRequest: GetBucketPolicyStatusRequest
  ): Future[GetBucketPolicyStatusResponse] = {
    underlying.getBucketPolicyStatus(getBucketPolicyStatusRequest).toFuture
  }

  override def getBucketReplication(
      getBucketReplicationRequest: GetBucketReplicationRequest
  ): Future[GetBucketReplicationResponse] = {
    underlying.getBucketReplication(getBucketReplicationRequest).toFuture
  }

  override def getBucketRequestPayment(
      getBucketRequestPaymentRequest: GetBucketRequestPaymentRequest
  ): Future[GetBucketRequestPaymentResponse] = {
    underlying.getBucketRequestPayment(getBucketRequestPaymentRequest).toFuture
  }

  override def getBucketTagging(getBucketTaggingRequest: GetBucketTaggingRequest): Future[GetBucketTaggingResponse] = {
    underlying.getBucketTagging(getBucketTaggingRequest).toFuture
  }

  override def getBucketVersioning(
      getBucketVersioningRequest: GetBucketVersioningRequest
  ): Future[GetBucketVersioningResponse] = {
    underlying.getBucketVersioning(getBucketVersioningRequest).toFuture
  }

  override def getBucketWebsite(getBucketWebsiteRequest: GetBucketWebsiteRequest): Future[GetBucketWebsiteResponse] = {
    underlying.getBucketWebsite(getBucketWebsiteRequest).toFuture
  }

  override def getObjectAcl(getObjectAclRequest: GetObjectAclRequest): Future[GetObjectAclResponse] = {
    underlying.getObjectAcl(getObjectAclRequest).toFuture
  }

  override def getObjectLegalHold(
      getObjectLegalHoldRequest: GetObjectLegalHoldRequest
  ): Future[GetObjectLegalHoldResponse] = {
    underlying.getObjectLegalHold(getObjectLegalHoldRequest).toFuture
  }

  override def getObjectLockConfiguration(
      getObjectLockConfigurationRequest: GetObjectLockConfigurationRequest
  ): Future[GetObjectLockConfigurationResponse] = {
    underlying.getObjectLockConfiguration(getObjectLockConfigurationRequest).toFuture
  }

  override def getObjectRetention(
      getObjectRetentionRequest: GetObjectRetentionRequest
  ): Future[GetObjectRetentionResponse] = {
    underlying.getObjectRetention(getObjectRetentionRequest).toFuture
  }

  override def getObjectTagging(getObjectTaggingRequest: GetObjectTaggingRequest): Future[GetObjectTaggingResponse] = {
    underlying.getObjectTagging(getObjectTaggingRequest).toFuture
  }

  override def getPublicAccessBlock(
      getPublicAccessBlockRequest: GetPublicAccessBlockRequest
  ): Future[GetPublicAccessBlockResponse] = {
    underlying.getPublicAccessBlock(getPublicAccessBlockRequest).toFuture
  }

  override def headBucket(headBucketRequest: HeadBucketRequest): Future[HeadBucketResponse] = {
    underlying.headBucket(headBucketRequest).toFuture
  }

  override def headObject(headObjectRequest: HeadObjectRequest): Future[HeadObjectResponse] = {
    underlying.headObject(headObjectRequest).toFuture
  }

  override def listBucketAnalyticsConfigurations(
      listBucketAnalyticsConfigurationsRequest: ListBucketAnalyticsConfigurationsRequest
  ): Future[ListBucketAnalyticsConfigurationsResponse] = {
    underlying.listBucketAnalyticsConfigurations(listBucketAnalyticsConfigurationsRequest).toFuture
  }

  override def listBucketInventoryConfigurations(
      listBucketInventoryConfigurationsRequest: ListBucketInventoryConfigurationsRequest
  ): Future[ListBucketInventoryConfigurationsResponse] = {
    underlying.listBucketInventoryConfigurations(listBucketInventoryConfigurationsRequest).toFuture
  }

  override def listBucketMetricsConfigurations(
      listBucketMetricsConfigurationsRequest: ListBucketMetricsConfigurationsRequest
  ): Future[ListBucketMetricsConfigurationsResponse] = {
    underlying.listBucketMetricsConfigurations(listBucketMetricsConfigurationsRequest).toFuture
  }

  override def listBuckets(listBucketsRequest: ListBucketsRequest): Future[ListBucketsResponse] = {
    underlying.listBuckets(listBucketsRequest).toFuture
  }

  override def listBuckets(): Future[ListBucketsResponse] = {
    underlying.listBuckets().toFuture
  }

  override def listMultipartUploads(
      listMultipartUploadsRequest: ListMultipartUploadsRequest
  ): Future[ListMultipartUploadsResponse] = {
    underlying.listMultipartUploads(listMultipartUploadsRequest).toFuture
  }

  def listMultipartUploadsPaginator(
      listMultipartUploadsRequest: ListMultipartUploadsRequest
  ): ListMultipartUploadsPublisher = {
    underlying.listMultipartUploadsPaginator(listMultipartUploadsRequest)
  }

  override def listObjectVersions(
      listObjectVersionsRequest: ListObjectVersionsRequest
  ): Future[ListObjectVersionsResponse] = {
    underlying.listObjectVersions(listObjectVersionsRequest).toFuture
  }

  def listObjectVersionsPaginator(listObjectVersionsRequest: ListObjectVersionsRequest): ListObjectVersionsPublisher = {
    underlying.listObjectVersionsPaginator(listObjectVersionsRequest)
  }

  override def listObjects(listObjectsRequest: ListObjectsRequest): Future[ListObjectsResponse] = {
    underlying.listObjects(listObjectsRequest).toFuture
  }

  override def listObjectsV2(listObjectsV2Request: ListObjectsV2Request): Future[ListObjectsV2Response] = {
    underlying.listObjectsV2(listObjectsV2Request).toFuture
  }

  def listObjectsV2Paginator(listObjectsV2Request: ListObjectsV2Request): ListObjectsV2Publisher = {
    underlying.listObjectsV2Paginator(listObjectsV2Request)
  }

  override def listParts(listPartsRequest: ListPartsRequest): Future[ListPartsResponse] = {
    underlying.listParts(listPartsRequest).toFuture
  }

  def listPartsPaginator(listPartsRequest: ListPartsRequest): ListPartsPublisher = {
    underlying.listPartsPaginator(listPartsRequest)
  }

  override def putBucketAccelerateConfiguration(
      putBucketAccelerateConfigurationRequest: PutBucketAccelerateConfigurationRequest
  ): Future[PutBucketAccelerateConfigurationResponse] = {
    underlying.putBucketAccelerateConfiguration(putBucketAccelerateConfigurationRequest).toFuture
  }

  override def putBucketAcl(putBucketAclRequest: PutBucketAclRequest): Future[PutBucketAclResponse] = {
    underlying.putBucketAcl(putBucketAclRequest).toFuture
  }

  override def putBucketAnalyticsConfiguration(
      putBucketAnalyticsConfigurationRequest: PutBucketAnalyticsConfigurationRequest
  ): Future[PutBucketAnalyticsConfigurationResponse] = {
    underlying.putBucketAnalyticsConfiguration(putBucketAnalyticsConfigurationRequest).toFuture
  }

  override def putBucketCors(putBucketCorsRequest: PutBucketCorsRequest): Future[PutBucketCorsResponse] = {
    underlying.putBucketCors(putBucketCorsRequest).toFuture
  }

  override def putBucketEncryption(
      putBucketEncryptionRequest: PutBucketEncryptionRequest
  ): Future[PutBucketEncryptionResponse] = {
    underlying.putBucketEncryption(putBucketEncryptionRequest).toFuture
  }

  override def putBucketInventoryConfiguration(
      putBucketInventoryConfigurationRequest: PutBucketInventoryConfigurationRequest
  ): Future[PutBucketInventoryConfigurationResponse] = {
    underlying.putBucketInventoryConfiguration(putBucketInventoryConfigurationRequest).toFuture
  }

  override def putBucketLifecycleConfiguration(
      putBucketLifecycleConfigurationRequest: PutBucketLifecycleConfigurationRequest
  ): Future[PutBucketLifecycleConfigurationResponse] = {
    underlying.putBucketLifecycleConfiguration(putBucketLifecycleConfigurationRequest).toFuture
  }

  override def putBucketLogging(putBucketLoggingRequest: PutBucketLoggingRequest): Future[PutBucketLoggingResponse] = {
    underlying.putBucketLogging(putBucketLoggingRequest).toFuture
  }

  override def putBucketMetricsConfiguration(
      putBucketMetricsConfigurationRequest: PutBucketMetricsConfigurationRequest
  ): Future[PutBucketMetricsConfigurationResponse] = {
    underlying.putBucketMetricsConfiguration(putBucketMetricsConfigurationRequest).toFuture
  }

  override def putBucketNotificationConfiguration(
      putBucketNotificationConfigurationRequest: PutBucketNotificationConfigurationRequest
  ): Future[PutBucketNotificationConfigurationResponse] = {
    underlying.putBucketNotificationConfiguration(putBucketNotificationConfigurationRequest).toFuture
  }

  override def putBucketPolicy(putBucketPolicyRequest: PutBucketPolicyRequest): Future[PutBucketPolicyResponse] = {
    underlying.putBucketPolicy(putBucketPolicyRequest).toFuture
  }

  override def putBucketReplication(
      putBucketReplicationRequest: PutBucketReplicationRequest
  ): Future[PutBucketReplicationResponse] = {
    underlying.putBucketReplication(putBucketReplicationRequest).toFuture
  }

  override def putBucketRequestPayment(
      putBucketRequestPaymentRequest: PutBucketRequestPaymentRequest
  ): Future[PutBucketRequestPaymentResponse] = {
    underlying.putBucketRequestPayment(putBucketRequestPaymentRequest).toFuture
  }

  override def putBucketTagging(putBucketTaggingRequest: PutBucketTaggingRequest): Future[PutBucketTaggingResponse] = {
    underlying.putBucketTagging(putBucketTaggingRequest).toFuture
  }

  override def putBucketVersioning(
      putBucketVersioningRequest: PutBucketVersioningRequest
  ): Future[PutBucketVersioningResponse] = {
    underlying.putBucketVersioning(putBucketVersioningRequest).toFuture
  }

  override def putBucketWebsite(putBucketWebsiteRequest: PutBucketWebsiteRequest): Future[PutBucketWebsiteResponse] = {
    underlying.putBucketWebsite(putBucketWebsiteRequest).toFuture
  }

  override def putObjectAcl(putObjectAclRequest: PutObjectAclRequest): Future[PutObjectAclResponse] = {
    underlying.putObjectAcl(putObjectAclRequest).toFuture
  }

  override def putObjectLegalHold(
      putObjectLegalHoldRequest: PutObjectLegalHoldRequest
  ): Future[PutObjectLegalHoldResponse] = {
    underlying.putObjectLegalHold(putObjectLegalHoldRequest).toFuture
  }

  override def putObjectLockConfiguration(
      putObjectLockConfigurationRequest: PutObjectLockConfigurationRequest
  ): Future[PutObjectLockConfigurationResponse] = {
    underlying.putObjectLockConfiguration(putObjectLockConfigurationRequest).toFuture
  }

  override def putObjectRetention(
      putObjectRetentionRequest: PutObjectRetentionRequest
  ): Future[PutObjectRetentionResponse] = {
    underlying.putObjectRetention(putObjectRetentionRequest).toFuture
  }

  override def putObjectTagging(putObjectTaggingRequest: PutObjectTaggingRequest): Future[PutObjectTaggingResponse] = {
    underlying.putObjectTagging(putObjectTaggingRequest).toFuture
  }

  override def putPublicAccessBlock(
      putPublicAccessBlockRequest: PutPublicAccessBlockRequest
  ): Future[PutPublicAccessBlockResponse] = {
    underlying.putPublicAccessBlock(putPublicAccessBlockRequest).toFuture
  }

  override def restoreObject(restoreObjectRequest: RestoreObjectRequest): Future[RestoreObjectResponse] = {
    underlying.restoreObject(restoreObjectRequest).toFuture
  }

  override def uploadPartCopy(uploadPartCopyRequest: UploadPartCopyRequest): Future[UploadPartCopyResponse] = {
    underlying.uploadPartCopy(uploadPartCopyRequest).toFuture
  }

}
