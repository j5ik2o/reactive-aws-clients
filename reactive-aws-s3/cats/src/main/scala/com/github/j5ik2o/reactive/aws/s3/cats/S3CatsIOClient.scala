// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.cats

import cats.effect.IO
import com.github.j5ik2o.reactive.aws.s3.{ S3AsyncClient, S3Client }
import software.amazon.awssdk.services.s3.model._
import software.amazon.awssdk.services.s3.paginators._

import scala.concurrent.{ ExecutionContext, Future }

object S3CatsIOClient {

  def apply(underlying: S3AsyncClient): S3CatsIOClient =
    new S3CatsIOClientImpl(underlying)

}

trait S3CatsIOClient extends S3Client[IO] {

  val underlying: S3AsyncClient

  override def abortMultipartUpload(
      abortMultipartUploadRequest: AbortMultipartUploadRequest
  ): IO[AbortMultipartUploadResponse] =
    IO.fromFuture {
      IO(underlying.abortMultipartUpload(abortMultipartUploadRequest))
    }

  override def completeMultipartUpload(
      completeMultipartUploadRequest: CompleteMultipartUploadRequest
  ): IO[CompleteMultipartUploadResponse] =
    IO.fromFuture {
      IO(underlying.completeMultipartUpload(completeMultipartUploadRequest))
    }

  override def copyObject(
      copyObjectRequest: CopyObjectRequest
  ): IO[CopyObjectResponse] =
    IO.fromFuture {
      IO(underlying.copyObject(copyObjectRequest))
    }

  override def createBucket(
      createBucketRequest: CreateBucketRequest
  ): IO[CreateBucketResponse] =
    IO.fromFuture {
      IO(underlying.createBucket(createBucketRequest))
    }

  override def createMultipartUpload(
      createMultipartUploadRequest: CreateMultipartUploadRequest
  ): IO[CreateMultipartUploadResponse] =
    IO.fromFuture {
      IO(underlying.createMultipartUpload(createMultipartUploadRequest))
    }

  override def deleteBucket(
      deleteBucketRequest: DeleteBucketRequest
  ): IO[DeleteBucketResponse] =
    IO.fromFuture {
      IO(underlying.deleteBucket(deleteBucketRequest))
    }

  override def deleteBucketAnalyticsConfiguration(
      deleteBucketAnalyticsConfigurationRequest: DeleteBucketAnalyticsConfigurationRequest
  ): IO[DeleteBucketAnalyticsConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.deleteBucketAnalyticsConfiguration(deleteBucketAnalyticsConfigurationRequest))
    }

  override def deleteBucketCors(
      deleteBucketCorsRequest: DeleteBucketCorsRequest
  ): IO[DeleteBucketCorsResponse] =
    IO.fromFuture {
      IO(underlying.deleteBucketCors(deleteBucketCorsRequest))
    }

  override def deleteBucketEncryption(
      deleteBucketEncryptionRequest: DeleteBucketEncryptionRequest
  ): IO[DeleteBucketEncryptionResponse] =
    IO.fromFuture {
      IO(underlying.deleteBucketEncryption(deleteBucketEncryptionRequest))
    }

  override def deleteBucketInventoryConfiguration(
      deleteBucketInventoryConfigurationRequest: DeleteBucketInventoryConfigurationRequest
  ): IO[DeleteBucketInventoryConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.deleteBucketInventoryConfiguration(deleteBucketInventoryConfigurationRequest))
    }

  override def deleteBucketLifecycle(
      deleteBucketLifecycleRequest: DeleteBucketLifecycleRequest
  ): IO[DeleteBucketLifecycleResponse] =
    IO.fromFuture {
      IO(underlying.deleteBucketLifecycle(deleteBucketLifecycleRequest))
    }

  override def deleteBucketMetricsConfiguration(
      deleteBucketMetricsConfigurationRequest: DeleteBucketMetricsConfigurationRequest
  ): IO[DeleteBucketMetricsConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.deleteBucketMetricsConfiguration(deleteBucketMetricsConfigurationRequest))
    }

  override def deleteBucketPolicy(
      deleteBucketPolicyRequest: DeleteBucketPolicyRequest
  ): IO[DeleteBucketPolicyResponse] =
    IO.fromFuture {
      IO(underlying.deleteBucketPolicy(deleteBucketPolicyRequest))
    }

  override def deleteBucketReplication(
      deleteBucketReplicationRequest: DeleteBucketReplicationRequest
  ): IO[DeleteBucketReplicationResponse] =
    IO.fromFuture {
      IO(underlying.deleteBucketReplication(deleteBucketReplicationRequest))
    }

  override def deleteBucketTagging(
      deleteBucketTaggingRequest: DeleteBucketTaggingRequest
  ): IO[DeleteBucketTaggingResponse] =
    IO.fromFuture {
      IO(underlying.deleteBucketTagging(deleteBucketTaggingRequest))
    }

  override def deleteBucketWebsite(
      deleteBucketWebsiteRequest: DeleteBucketWebsiteRequest
  ): IO[DeleteBucketWebsiteResponse] =
    IO.fromFuture {
      IO(underlying.deleteBucketWebsite(deleteBucketWebsiteRequest))
    }

  override def deleteObject(
      deleteObjectRequest: DeleteObjectRequest
  ): IO[DeleteObjectResponse] =
    IO.fromFuture {
      IO(underlying.deleteObject(deleteObjectRequest))
    }

  override def deleteObjectTagging(
      deleteObjectTaggingRequest: DeleteObjectTaggingRequest
  ): IO[DeleteObjectTaggingResponse] =
    IO.fromFuture {
      IO(underlying.deleteObjectTagging(deleteObjectTaggingRequest))
    }

  override def deleteObjects(
      deleteObjectsRequest: DeleteObjectsRequest
  ): IO[DeleteObjectsResponse] =
    IO.fromFuture {
      IO(underlying.deleteObjects(deleteObjectsRequest))
    }

  override def deletePublicAccessBlock(
      deletePublicAccessBlockRequest: DeletePublicAccessBlockRequest
  ): IO[DeletePublicAccessBlockResponse] =
    IO.fromFuture {
      IO(underlying.deletePublicAccessBlock(deletePublicAccessBlockRequest))
    }

  override def getBucketAccelerateConfiguration(
      getBucketAccelerateConfigurationRequest: GetBucketAccelerateConfigurationRequest
  ): IO[GetBucketAccelerateConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.getBucketAccelerateConfiguration(getBucketAccelerateConfigurationRequest))
    }

  override def getBucketAcl(
      getBucketAclRequest: GetBucketAclRequest
  ): IO[GetBucketAclResponse] =
    IO.fromFuture {
      IO(underlying.getBucketAcl(getBucketAclRequest))
    }

  override def getBucketAnalyticsConfiguration(
      getBucketAnalyticsConfigurationRequest: GetBucketAnalyticsConfigurationRequest
  ): IO[GetBucketAnalyticsConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.getBucketAnalyticsConfiguration(getBucketAnalyticsConfigurationRequest))
    }

  override def getBucketCors(
      getBucketCorsRequest: GetBucketCorsRequest
  ): IO[GetBucketCorsResponse] =
    IO.fromFuture {
      IO(underlying.getBucketCors(getBucketCorsRequest))
    }

  override def getBucketEncryption(
      getBucketEncryptionRequest: GetBucketEncryptionRequest
  ): IO[GetBucketEncryptionResponse] =
    IO.fromFuture {
      IO(underlying.getBucketEncryption(getBucketEncryptionRequest))
    }

  override def getBucketInventoryConfiguration(
      getBucketInventoryConfigurationRequest: GetBucketInventoryConfigurationRequest
  ): IO[GetBucketInventoryConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.getBucketInventoryConfiguration(getBucketInventoryConfigurationRequest))
    }

  override def getBucketLifecycleConfiguration(
      getBucketLifecycleConfigurationRequest: GetBucketLifecycleConfigurationRequest
  ): IO[GetBucketLifecycleConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.getBucketLifecycleConfiguration(getBucketLifecycleConfigurationRequest))
    }

  override def getBucketLocation(
      getBucketLocationRequest: GetBucketLocationRequest
  ): IO[GetBucketLocationResponse] =
    IO.fromFuture {
      IO(underlying.getBucketLocation(getBucketLocationRequest))
    }

  override def getBucketLogging(
      getBucketLoggingRequest: GetBucketLoggingRequest
  ): IO[GetBucketLoggingResponse] =
    IO.fromFuture {
      IO(underlying.getBucketLogging(getBucketLoggingRequest))
    }

  override def getBucketMetricsConfiguration(
      getBucketMetricsConfigurationRequest: GetBucketMetricsConfigurationRequest
  ): IO[GetBucketMetricsConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.getBucketMetricsConfiguration(getBucketMetricsConfigurationRequest))
    }

  override def getBucketNotificationConfiguration(
      getBucketNotificationConfigurationRequest: GetBucketNotificationConfigurationRequest
  ): IO[GetBucketNotificationConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.getBucketNotificationConfiguration(getBucketNotificationConfigurationRequest))
    }

  override def getBucketPolicy(
      getBucketPolicyRequest: GetBucketPolicyRequest
  ): IO[GetBucketPolicyResponse] =
    IO.fromFuture {
      IO(underlying.getBucketPolicy(getBucketPolicyRequest))
    }

  override def getBucketPolicyStatus(
      getBucketPolicyStatusRequest: GetBucketPolicyStatusRequest
  ): IO[GetBucketPolicyStatusResponse] =
    IO.fromFuture {
      IO(underlying.getBucketPolicyStatus(getBucketPolicyStatusRequest))
    }

  override def getBucketReplication(
      getBucketReplicationRequest: GetBucketReplicationRequest
  ): IO[GetBucketReplicationResponse] =
    IO.fromFuture {
      IO(underlying.getBucketReplication(getBucketReplicationRequest))
    }

  override def getBucketRequestPayment(
      getBucketRequestPaymentRequest: GetBucketRequestPaymentRequest
  ): IO[GetBucketRequestPaymentResponse] =
    IO.fromFuture {
      IO(underlying.getBucketRequestPayment(getBucketRequestPaymentRequest))
    }

  override def getBucketTagging(
      getBucketTaggingRequest: GetBucketTaggingRequest
  ): IO[GetBucketTaggingResponse] =
    IO.fromFuture {
      IO(underlying.getBucketTagging(getBucketTaggingRequest))
    }

  override def getBucketVersioning(
      getBucketVersioningRequest: GetBucketVersioningRequest
  ): IO[GetBucketVersioningResponse] =
    IO.fromFuture {
      IO(underlying.getBucketVersioning(getBucketVersioningRequest))
    }

  override def getBucketWebsite(
      getBucketWebsiteRequest: GetBucketWebsiteRequest
  ): IO[GetBucketWebsiteResponse] =
    IO.fromFuture {
      IO(underlying.getBucketWebsite(getBucketWebsiteRequest))
    }

  override def getObjectAcl(
      getObjectAclRequest: GetObjectAclRequest
  ): IO[GetObjectAclResponse] =
    IO.fromFuture {
      IO(underlying.getObjectAcl(getObjectAclRequest))
    }

  override def getObjectLegalHold(
      getObjectLegalHoldRequest: GetObjectLegalHoldRequest
  ): IO[GetObjectLegalHoldResponse] =
    IO.fromFuture {
      IO(underlying.getObjectLegalHold(getObjectLegalHoldRequest))
    }

  override def getObjectLockConfiguration(
      getObjectLockConfigurationRequest: GetObjectLockConfigurationRequest
  ): IO[GetObjectLockConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.getObjectLockConfiguration(getObjectLockConfigurationRequest))
    }

  override def getObjectRetention(
      getObjectRetentionRequest: GetObjectRetentionRequest
  ): IO[GetObjectRetentionResponse] =
    IO.fromFuture {
      IO(underlying.getObjectRetention(getObjectRetentionRequest))
    }

  override def getObjectTagging(
      getObjectTaggingRequest: GetObjectTaggingRequest
  ): IO[GetObjectTaggingResponse] =
    IO.fromFuture {
      IO(underlying.getObjectTagging(getObjectTaggingRequest))
    }

  override def getPublicAccessBlock(
      getPublicAccessBlockRequest: GetPublicAccessBlockRequest
  ): IO[GetPublicAccessBlockResponse] =
    IO.fromFuture {
      IO(underlying.getPublicAccessBlock(getPublicAccessBlockRequest))
    }

  override def headBucket(
      headBucketRequest: HeadBucketRequest
  ): IO[HeadBucketResponse] =
    IO.fromFuture {
      IO(underlying.headBucket(headBucketRequest))
    }

  override def headObject(
      headObjectRequest: HeadObjectRequest
  ): IO[HeadObjectResponse] =
    IO.fromFuture {
      IO(underlying.headObject(headObjectRequest))
    }

  override def listBucketAnalyticsConfigurations(
      listBucketAnalyticsConfigurationsRequest: ListBucketAnalyticsConfigurationsRequest
  ): IO[ListBucketAnalyticsConfigurationsResponse] =
    IO.fromFuture {
      IO(underlying.listBucketAnalyticsConfigurations(listBucketAnalyticsConfigurationsRequest))
    }

  override def listBucketInventoryConfigurations(
      listBucketInventoryConfigurationsRequest: ListBucketInventoryConfigurationsRequest
  ): IO[ListBucketInventoryConfigurationsResponse] =
    IO.fromFuture {
      IO(underlying.listBucketInventoryConfigurations(listBucketInventoryConfigurationsRequest))
    }

  override def listBucketMetricsConfigurations(
      listBucketMetricsConfigurationsRequest: ListBucketMetricsConfigurationsRequest
  ): IO[ListBucketMetricsConfigurationsResponse] =
    IO.fromFuture {
      IO(underlying.listBucketMetricsConfigurations(listBucketMetricsConfigurationsRequest))
    }

  override def listBuckets(
      listBucketsRequest: ListBucketsRequest
  ): IO[ListBucketsResponse] =
    IO.fromFuture {
      IO(underlying.listBuckets(listBucketsRequest))
    }

  override def listMultipartUploads(
      listMultipartUploadsRequest: ListMultipartUploadsRequest
  ): IO[ListMultipartUploadsResponse] =
    IO.fromFuture {
      IO(underlying.listMultipartUploads(listMultipartUploadsRequest))
    }

  def listMultipartUploadsPaginator(
      listMultipartUploadsRequest: ListMultipartUploadsRequest
  ): ListMultipartUploadsPublisher =
    underlying.listMultipartUploadsPaginator(listMultipartUploadsRequest)

  override def listObjectVersions(
      listObjectVersionsRequest: ListObjectVersionsRequest
  ): IO[ListObjectVersionsResponse] =
    IO.fromFuture {
      IO(underlying.listObjectVersions(listObjectVersionsRequest))
    }

  def listObjectVersionsPaginator(listObjectVersionsRequest: ListObjectVersionsRequest): ListObjectVersionsPublisher =
    underlying.listObjectVersionsPaginator(listObjectVersionsRequest)

  override def listObjects(
      listObjectsRequest: ListObjectsRequest
  ): IO[ListObjectsResponse] =
    IO.fromFuture {
      IO(underlying.listObjects(listObjectsRequest))
    }

  override def listObjectsV2(
      listObjectsV2Request: ListObjectsV2Request
  ): IO[ListObjectsV2Response] =
    IO.fromFuture {
      IO(underlying.listObjectsV2(listObjectsV2Request))
    }

  def listObjectsV2Paginator(listObjectsV2Request: ListObjectsV2Request): ListObjectsV2Publisher =
    underlying.listObjectsV2Paginator(listObjectsV2Request)

  override def listParts(
      listPartsRequest: ListPartsRequest
  ): IO[ListPartsResponse] =
    IO.fromFuture {
      IO(underlying.listParts(listPartsRequest))
    }

  def listPartsPaginator(listPartsRequest: ListPartsRequest): ListPartsPublisher =
    underlying.listPartsPaginator(listPartsRequest)

  override def putBucketAccelerateConfiguration(
      putBucketAccelerateConfigurationRequest: PutBucketAccelerateConfigurationRequest
  ): IO[PutBucketAccelerateConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.putBucketAccelerateConfiguration(putBucketAccelerateConfigurationRequest))
    }

  override def putBucketAcl(
      putBucketAclRequest: PutBucketAclRequest
  ): IO[PutBucketAclResponse] =
    IO.fromFuture {
      IO(underlying.putBucketAcl(putBucketAclRequest))
    }

  override def putBucketAnalyticsConfiguration(
      putBucketAnalyticsConfigurationRequest: PutBucketAnalyticsConfigurationRequest
  ): IO[PutBucketAnalyticsConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.putBucketAnalyticsConfiguration(putBucketAnalyticsConfigurationRequest))
    }

  override def putBucketCors(
      putBucketCorsRequest: PutBucketCorsRequest
  ): IO[PutBucketCorsResponse] =
    IO.fromFuture {
      IO(underlying.putBucketCors(putBucketCorsRequest))
    }

  override def putBucketEncryption(
      putBucketEncryptionRequest: PutBucketEncryptionRequest
  ): IO[PutBucketEncryptionResponse] =
    IO.fromFuture {
      IO(underlying.putBucketEncryption(putBucketEncryptionRequest))
    }

  override def putBucketInventoryConfiguration(
      putBucketInventoryConfigurationRequest: PutBucketInventoryConfigurationRequest
  ): IO[PutBucketInventoryConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.putBucketInventoryConfiguration(putBucketInventoryConfigurationRequest))
    }

  override def putBucketLifecycleConfiguration(
      putBucketLifecycleConfigurationRequest: PutBucketLifecycleConfigurationRequest
  ): IO[PutBucketLifecycleConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.putBucketLifecycleConfiguration(putBucketLifecycleConfigurationRequest))
    }

  override def putBucketLogging(
      putBucketLoggingRequest: PutBucketLoggingRequest
  ): IO[PutBucketLoggingResponse] =
    IO.fromFuture {
      IO(underlying.putBucketLogging(putBucketLoggingRequest))
    }

  override def putBucketMetricsConfiguration(
      putBucketMetricsConfigurationRequest: PutBucketMetricsConfigurationRequest
  ): IO[PutBucketMetricsConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.putBucketMetricsConfiguration(putBucketMetricsConfigurationRequest))
    }

  override def putBucketNotificationConfiguration(
      putBucketNotificationConfigurationRequest: PutBucketNotificationConfigurationRequest
  ): IO[PutBucketNotificationConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.putBucketNotificationConfiguration(putBucketNotificationConfigurationRequest))
    }

  override def putBucketPolicy(
      putBucketPolicyRequest: PutBucketPolicyRequest
  ): IO[PutBucketPolicyResponse] =
    IO.fromFuture {
      IO(underlying.putBucketPolicy(putBucketPolicyRequest))
    }

  override def putBucketReplication(
      putBucketReplicationRequest: PutBucketReplicationRequest
  ): IO[PutBucketReplicationResponse] =
    IO.fromFuture {
      IO(underlying.putBucketReplication(putBucketReplicationRequest))
    }

  override def putBucketRequestPayment(
      putBucketRequestPaymentRequest: PutBucketRequestPaymentRequest
  ): IO[PutBucketRequestPaymentResponse] =
    IO.fromFuture {
      IO(underlying.putBucketRequestPayment(putBucketRequestPaymentRequest))
    }

  override def putBucketTagging(
      putBucketTaggingRequest: PutBucketTaggingRequest
  ): IO[PutBucketTaggingResponse] =
    IO.fromFuture {
      IO(underlying.putBucketTagging(putBucketTaggingRequest))
    }

  override def putBucketVersioning(
      putBucketVersioningRequest: PutBucketVersioningRequest
  ): IO[PutBucketVersioningResponse] =
    IO.fromFuture {
      IO(underlying.putBucketVersioning(putBucketVersioningRequest))
    }

  override def putBucketWebsite(
      putBucketWebsiteRequest: PutBucketWebsiteRequest
  ): IO[PutBucketWebsiteResponse] =
    IO.fromFuture {
      IO(underlying.putBucketWebsite(putBucketWebsiteRequest))
    }

  override def putObjectAcl(
      putObjectAclRequest: PutObjectAclRequest
  ): IO[PutObjectAclResponse] =
    IO.fromFuture {
      IO(underlying.putObjectAcl(putObjectAclRequest))
    }

  override def putObjectLegalHold(
      putObjectLegalHoldRequest: PutObjectLegalHoldRequest
  ): IO[PutObjectLegalHoldResponse] =
    IO.fromFuture {
      IO(underlying.putObjectLegalHold(putObjectLegalHoldRequest))
    }

  override def putObjectLockConfiguration(
      putObjectLockConfigurationRequest: PutObjectLockConfigurationRequest
  ): IO[PutObjectLockConfigurationResponse] =
    IO.fromFuture {
      IO(underlying.putObjectLockConfiguration(putObjectLockConfigurationRequest))
    }

  override def putObjectRetention(
      putObjectRetentionRequest: PutObjectRetentionRequest
  ): IO[PutObjectRetentionResponse] =
    IO.fromFuture {
      IO(underlying.putObjectRetention(putObjectRetentionRequest))
    }

  override def putObjectTagging(
      putObjectTaggingRequest: PutObjectTaggingRequest
  ): IO[PutObjectTaggingResponse] =
    IO.fromFuture {
      IO(underlying.putObjectTagging(putObjectTaggingRequest))
    }

  override def putPublicAccessBlock(
      putPublicAccessBlockRequest: PutPublicAccessBlockRequest
  ): IO[PutPublicAccessBlockResponse] =
    IO.fromFuture {
      IO(underlying.putPublicAccessBlock(putPublicAccessBlockRequest))
    }

  override def restoreObject(
      restoreObjectRequest: RestoreObjectRequest
  ): IO[RestoreObjectResponse] =
    IO.fromFuture {
      IO(underlying.restoreObject(restoreObjectRequest))
    }

  override def uploadPartCopy(
      uploadPartCopyRequest: UploadPartCopyRequest
  ): IO[UploadPartCopyResponse] =
    IO.fromFuture {
      IO(underlying.uploadPartCopy(uploadPartCopyRequest))
    }

}
