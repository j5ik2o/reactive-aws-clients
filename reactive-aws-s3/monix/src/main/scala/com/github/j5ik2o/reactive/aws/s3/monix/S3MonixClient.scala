// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.monix

import software.amazon.awssdk.services.s3.model._
import com.github.j5ik2o.reactive.aws.s3.{ S3AsyncClient, S3Client }
import monix.eval.Task
import monix.reactive.Observable

object S3MonixClient {

  def apply(underlying: S3AsyncClient): S3MonixClient = new S3MonixClientImpl(underlying)

}

trait S3MonixClient extends S3Client[Task] {

  val underlying: S3AsyncClient

  override def abortMultipartUpload(
      abortMultipartUploadRequest: AbortMultipartUploadRequest
  ): Task[AbortMultipartUploadResponse] =
    Task.deferFuture {
      underlying.abortMultipartUpload(abortMultipartUploadRequest)
    }

  override def completeMultipartUpload(
      completeMultipartUploadRequest: CompleteMultipartUploadRequest
  ): Task[CompleteMultipartUploadResponse] =
    Task.deferFuture {
      underlying.completeMultipartUpload(completeMultipartUploadRequest)
    }

  override def copyObject(copyObjectRequest: CopyObjectRequest): Task[CopyObjectResponse] =
    Task.deferFuture {
      underlying.copyObject(copyObjectRequest)
    }

  override def createBucket(createBucketRequest: CreateBucketRequest): Task[CreateBucketResponse] =
    Task.deferFuture {
      underlying.createBucket(createBucketRequest)
    }

  override def createMultipartUpload(
      createMultipartUploadRequest: CreateMultipartUploadRequest
  ): Task[CreateMultipartUploadResponse] =
    Task.deferFuture {
      underlying.createMultipartUpload(createMultipartUploadRequest)
    }

  override def deleteBucket(deleteBucketRequest: DeleteBucketRequest): Task[DeleteBucketResponse] =
    Task.deferFuture {
      underlying.deleteBucket(deleteBucketRequest)
    }

  override def deleteBucketAnalyticsConfiguration(
      deleteBucketAnalyticsConfigurationRequest: DeleteBucketAnalyticsConfigurationRequest
  ): Task[DeleteBucketAnalyticsConfigurationResponse] =
    Task.deferFuture {
      underlying.deleteBucketAnalyticsConfiguration(deleteBucketAnalyticsConfigurationRequest)
    }

  override def deleteBucketCors(deleteBucketCorsRequest: DeleteBucketCorsRequest): Task[DeleteBucketCorsResponse] =
    Task.deferFuture {
      underlying.deleteBucketCors(deleteBucketCorsRequest)
    }

  override def deleteBucketEncryption(
      deleteBucketEncryptionRequest: DeleteBucketEncryptionRequest
  ): Task[DeleteBucketEncryptionResponse] =
    Task.deferFuture {
      underlying.deleteBucketEncryption(deleteBucketEncryptionRequest)
    }

  override def deleteBucketInventoryConfiguration(
      deleteBucketInventoryConfigurationRequest: DeleteBucketInventoryConfigurationRequest
  ): Task[DeleteBucketInventoryConfigurationResponse] =
    Task.deferFuture {
      underlying.deleteBucketInventoryConfiguration(deleteBucketInventoryConfigurationRequest)
    }

  override def deleteBucketLifecycle(
      deleteBucketLifecycleRequest: DeleteBucketLifecycleRequest
  ): Task[DeleteBucketLifecycleResponse] =
    Task.deferFuture {
      underlying.deleteBucketLifecycle(deleteBucketLifecycleRequest)
    }

  override def deleteBucketMetricsConfiguration(
      deleteBucketMetricsConfigurationRequest: DeleteBucketMetricsConfigurationRequest
  ): Task[DeleteBucketMetricsConfigurationResponse] =
    Task.deferFuture {
      underlying.deleteBucketMetricsConfiguration(deleteBucketMetricsConfigurationRequest)
    }

  override def deleteBucketPolicy(
      deleteBucketPolicyRequest: DeleteBucketPolicyRequest
  ): Task[DeleteBucketPolicyResponse] =
    Task.deferFuture {
      underlying.deleteBucketPolicy(deleteBucketPolicyRequest)
    }

  override def deleteBucketReplication(
      deleteBucketReplicationRequest: DeleteBucketReplicationRequest
  ): Task[DeleteBucketReplicationResponse] =
    Task.deferFuture {
      underlying.deleteBucketReplication(deleteBucketReplicationRequest)
    }

  override def deleteBucketTagging(
      deleteBucketTaggingRequest: DeleteBucketTaggingRequest
  ): Task[DeleteBucketTaggingResponse] =
    Task.deferFuture {
      underlying.deleteBucketTagging(deleteBucketTaggingRequest)
    }

  override def deleteBucketWebsite(
      deleteBucketWebsiteRequest: DeleteBucketWebsiteRequest
  ): Task[DeleteBucketWebsiteResponse] =
    Task.deferFuture {
      underlying.deleteBucketWebsite(deleteBucketWebsiteRequest)
    }

  override def deleteObject(deleteObjectRequest: DeleteObjectRequest): Task[DeleteObjectResponse] =
    Task.deferFuture {
      underlying.deleteObject(deleteObjectRequest)
    }

  override def deleteObjectTagging(
      deleteObjectTaggingRequest: DeleteObjectTaggingRequest
  ): Task[DeleteObjectTaggingResponse] =
    Task.deferFuture {
      underlying.deleteObjectTagging(deleteObjectTaggingRequest)
    }

  override def deleteObjects(deleteObjectsRequest: DeleteObjectsRequest): Task[DeleteObjectsResponse] =
    Task.deferFuture {
      underlying.deleteObjects(deleteObjectsRequest)
    }

  override def deletePublicAccessBlock(
      deletePublicAccessBlockRequest: DeletePublicAccessBlockRequest
  ): Task[DeletePublicAccessBlockResponse] =
    Task.deferFuture {
      underlying.deletePublicAccessBlock(deletePublicAccessBlockRequest)
    }

  override def getBucketAccelerateConfiguration(
      getBucketAccelerateConfigurationRequest: GetBucketAccelerateConfigurationRequest
  ): Task[GetBucketAccelerateConfigurationResponse] =
    Task.deferFuture {
      underlying.getBucketAccelerateConfiguration(getBucketAccelerateConfigurationRequest)
    }

  override def getBucketAcl(getBucketAclRequest: GetBucketAclRequest): Task[GetBucketAclResponse] =
    Task.deferFuture {
      underlying.getBucketAcl(getBucketAclRequest)
    }

  override def getBucketAnalyticsConfiguration(
      getBucketAnalyticsConfigurationRequest: GetBucketAnalyticsConfigurationRequest
  ): Task[GetBucketAnalyticsConfigurationResponse] =
    Task.deferFuture {
      underlying.getBucketAnalyticsConfiguration(getBucketAnalyticsConfigurationRequest)
    }

  override def getBucketCors(getBucketCorsRequest: GetBucketCorsRequest): Task[GetBucketCorsResponse] =
    Task.deferFuture {
      underlying.getBucketCors(getBucketCorsRequest)
    }

  override def getBucketEncryption(
      getBucketEncryptionRequest: GetBucketEncryptionRequest
  ): Task[GetBucketEncryptionResponse] =
    Task.deferFuture {
      underlying.getBucketEncryption(getBucketEncryptionRequest)
    }

  override def getBucketInventoryConfiguration(
      getBucketInventoryConfigurationRequest: GetBucketInventoryConfigurationRequest
  ): Task[GetBucketInventoryConfigurationResponse] =
    Task.deferFuture {
      underlying.getBucketInventoryConfiguration(getBucketInventoryConfigurationRequest)
    }

  override def getBucketLifecycleConfiguration(
      getBucketLifecycleConfigurationRequest: GetBucketLifecycleConfigurationRequest
  ): Task[GetBucketLifecycleConfigurationResponse] =
    Task.deferFuture {
      underlying.getBucketLifecycleConfiguration(getBucketLifecycleConfigurationRequest)
    }

  override def getBucketLocation(getBucketLocationRequest: GetBucketLocationRequest): Task[GetBucketLocationResponse] =
    Task.deferFuture {
      underlying.getBucketLocation(getBucketLocationRequest)
    }

  override def getBucketLogging(getBucketLoggingRequest: GetBucketLoggingRequest): Task[GetBucketLoggingResponse] =
    Task.deferFuture {
      underlying.getBucketLogging(getBucketLoggingRequest)
    }

  override def getBucketMetricsConfiguration(
      getBucketMetricsConfigurationRequest: GetBucketMetricsConfigurationRequest
  ): Task[GetBucketMetricsConfigurationResponse] =
    Task.deferFuture {
      underlying.getBucketMetricsConfiguration(getBucketMetricsConfigurationRequest)
    }

  override def getBucketNotificationConfiguration(
      getBucketNotificationConfigurationRequest: GetBucketNotificationConfigurationRequest
  ): Task[GetBucketNotificationConfigurationResponse] =
    Task.deferFuture {
      underlying.getBucketNotificationConfiguration(getBucketNotificationConfigurationRequest)
    }

  override def getBucketPolicy(getBucketPolicyRequest: GetBucketPolicyRequest): Task[GetBucketPolicyResponse] =
    Task.deferFuture {
      underlying.getBucketPolicy(getBucketPolicyRequest)
    }

  override def getBucketPolicyStatus(
      getBucketPolicyStatusRequest: GetBucketPolicyStatusRequest
  ): Task[GetBucketPolicyStatusResponse] =
    Task.deferFuture {
      underlying.getBucketPolicyStatus(getBucketPolicyStatusRequest)
    }

  override def getBucketReplication(
      getBucketReplicationRequest: GetBucketReplicationRequest
  ): Task[GetBucketReplicationResponse] =
    Task.deferFuture {
      underlying.getBucketReplication(getBucketReplicationRequest)
    }

  override def getBucketRequestPayment(
      getBucketRequestPaymentRequest: GetBucketRequestPaymentRequest
  ): Task[GetBucketRequestPaymentResponse] =
    Task.deferFuture {
      underlying.getBucketRequestPayment(getBucketRequestPaymentRequest)
    }

  override def getBucketTagging(getBucketTaggingRequest: GetBucketTaggingRequest): Task[GetBucketTaggingResponse] =
    Task.deferFuture {
      underlying.getBucketTagging(getBucketTaggingRequest)
    }

  override def getBucketVersioning(
      getBucketVersioningRequest: GetBucketVersioningRequest
  ): Task[GetBucketVersioningResponse] =
    Task.deferFuture {
      underlying.getBucketVersioning(getBucketVersioningRequest)
    }

  override def getBucketWebsite(getBucketWebsiteRequest: GetBucketWebsiteRequest): Task[GetBucketWebsiteResponse] =
    Task.deferFuture {
      underlying.getBucketWebsite(getBucketWebsiteRequest)
    }

  override def getObjectAcl(getObjectAclRequest: GetObjectAclRequest): Task[GetObjectAclResponse] =
    Task.deferFuture {
      underlying.getObjectAcl(getObjectAclRequest)
    }

  override def getObjectLegalHold(
      getObjectLegalHoldRequest: GetObjectLegalHoldRequest
  ): Task[GetObjectLegalHoldResponse] =
    Task.deferFuture {
      underlying.getObjectLegalHold(getObjectLegalHoldRequest)
    }

  override def getObjectLockConfiguration(
      getObjectLockConfigurationRequest: GetObjectLockConfigurationRequest
  ): Task[GetObjectLockConfigurationResponse] =
    Task.deferFuture {
      underlying.getObjectLockConfiguration(getObjectLockConfigurationRequest)
    }

  override def getObjectRetention(
      getObjectRetentionRequest: GetObjectRetentionRequest
  ): Task[GetObjectRetentionResponse] =
    Task.deferFuture {
      underlying.getObjectRetention(getObjectRetentionRequest)
    }

  override def getObjectTagging(getObjectTaggingRequest: GetObjectTaggingRequest): Task[GetObjectTaggingResponse] =
    Task.deferFuture {
      underlying.getObjectTagging(getObjectTaggingRequest)
    }

  override def getPublicAccessBlock(
      getPublicAccessBlockRequest: GetPublicAccessBlockRequest
  ): Task[GetPublicAccessBlockResponse] =
    Task.deferFuture {
      underlying.getPublicAccessBlock(getPublicAccessBlockRequest)
    }

  override def headBucket(headBucketRequest: HeadBucketRequest): Task[HeadBucketResponse] =
    Task.deferFuture {
      underlying.headBucket(headBucketRequest)
    }

  override def headObject(headObjectRequest: HeadObjectRequest): Task[HeadObjectResponse] =
    Task.deferFuture {
      underlying.headObject(headObjectRequest)
    }

  override def listBucketAnalyticsConfigurations(
      listBucketAnalyticsConfigurationsRequest: ListBucketAnalyticsConfigurationsRequest
  ): Task[ListBucketAnalyticsConfigurationsResponse] =
    Task.deferFuture {
      underlying.listBucketAnalyticsConfigurations(listBucketAnalyticsConfigurationsRequest)
    }

  override def listBucketInventoryConfigurations(
      listBucketInventoryConfigurationsRequest: ListBucketInventoryConfigurationsRequest
  ): Task[ListBucketInventoryConfigurationsResponse] =
    Task.deferFuture {
      underlying.listBucketInventoryConfigurations(listBucketInventoryConfigurationsRequest)
    }

  override def listBucketMetricsConfigurations(
      listBucketMetricsConfigurationsRequest: ListBucketMetricsConfigurationsRequest
  ): Task[ListBucketMetricsConfigurationsResponse] =
    Task.deferFuture {
      underlying.listBucketMetricsConfigurations(listBucketMetricsConfigurationsRequest)
    }

  override def listBuckets(listBucketsRequest: ListBucketsRequest): Task[ListBucketsResponse] =
    Task.deferFuture {
      underlying.listBuckets(listBucketsRequest)
    }

  override def listBuckets(): Task[ListBucketsResponse] =
    Task.deferFuture {
      underlying.listBuckets()
    }

  override def listMultipartUploads(
      listMultipartUploadsRequest: ListMultipartUploadsRequest
  ): Task[ListMultipartUploadsResponse] =
    Task.deferFuture {
      underlying.listMultipartUploads(listMultipartUploadsRequest)
    }

  def listMultipartUploadsPaginator(
      listMultipartUploadsRequest: ListMultipartUploadsRequest
  ): Observable[ListMultipartUploadsResponse] =
    Observable.fromReactivePublisher(underlying.listMultipartUploadsPaginator(listMultipartUploadsRequest))

  override def listObjectVersions(
      listObjectVersionsRequest: ListObjectVersionsRequest
  ): Task[ListObjectVersionsResponse] =
    Task.deferFuture {
      underlying.listObjectVersions(listObjectVersionsRequest)
    }

  def listObjectVersionsPaginator(
      listObjectVersionsRequest: ListObjectVersionsRequest
  ): Observable[ListObjectVersionsResponse] =
    Observable.fromReactivePublisher(underlying.listObjectVersionsPaginator(listObjectVersionsRequest))

  override def listObjects(listObjectsRequest: ListObjectsRequest): Task[ListObjectsResponse] =
    Task.deferFuture {
      underlying.listObjects(listObjectsRequest)
    }

  override def listObjectsV2(listObjectsV2Request: ListObjectsV2Request): Task[ListObjectsV2Response] =
    Task.deferFuture {
      underlying.listObjectsV2(listObjectsV2Request)
    }

  def listObjectsV2Paginator(listObjectsV2Request: ListObjectsV2Request): Observable[ListObjectsV2Response] =
    Observable.fromReactivePublisher(underlying.listObjectsV2Paginator(listObjectsV2Request))

  override def listParts(listPartsRequest: ListPartsRequest): Task[ListPartsResponse] =
    Task.deferFuture {
      underlying.listParts(listPartsRequest)
    }

  def listPartsPaginator(listPartsRequest: ListPartsRequest): Observable[ListPartsResponse] =
    Observable.fromReactivePublisher(underlying.listPartsPaginator(listPartsRequest))

  override def putBucketAccelerateConfiguration(
      putBucketAccelerateConfigurationRequest: PutBucketAccelerateConfigurationRequest
  ): Task[PutBucketAccelerateConfigurationResponse] =
    Task.deferFuture {
      underlying.putBucketAccelerateConfiguration(putBucketAccelerateConfigurationRequest)
    }

  override def putBucketAcl(putBucketAclRequest: PutBucketAclRequest): Task[PutBucketAclResponse] =
    Task.deferFuture {
      underlying.putBucketAcl(putBucketAclRequest)
    }

  override def putBucketAnalyticsConfiguration(
      putBucketAnalyticsConfigurationRequest: PutBucketAnalyticsConfigurationRequest
  ): Task[PutBucketAnalyticsConfigurationResponse] =
    Task.deferFuture {
      underlying.putBucketAnalyticsConfiguration(putBucketAnalyticsConfigurationRequest)
    }

  override def putBucketCors(putBucketCorsRequest: PutBucketCorsRequest): Task[PutBucketCorsResponse] =
    Task.deferFuture {
      underlying.putBucketCors(putBucketCorsRequest)
    }

  override def putBucketEncryption(
      putBucketEncryptionRequest: PutBucketEncryptionRequest
  ): Task[PutBucketEncryptionResponse] =
    Task.deferFuture {
      underlying.putBucketEncryption(putBucketEncryptionRequest)
    }

  override def putBucketInventoryConfiguration(
      putBucketInventoryConfigurationRequest: PutBucketInventoryConfigurationRequest
  ): Task[PutBucketInventoryConfigurationResponse] =
    Task.deferFuture {
      underlying.putBucketInventoryConfiguration(putBucketInventoryConfigurationRequest)
    }

  override def putBucketLifecycleConfiguration(
      putBucketLifecycleConfigurationRequest: PutBucketLifecycleConfigurationRequest
  ): Task[PutBucketLifecycleConfigurationResponse] =
    Task.deferFuture {
      underlying.putBucketLifecycleConfiguration(putBucketLifecycleConfigurationRequest)
    }

  override def putBucketLogging(putBucketLoggingRequest: PutBucketLoggingRequest): Task[PutBucketLoggingResponse] =
    Task.deferFuture {
      underlying.putBucketLogging(putBucketLoggingRequest)
    }

  override def putBucketMetricsConfiguration(
      putBucketMetricsConfigurationRequest: PutBucketMetricsConfigurationRequest
  ): Task[PutBucketMetricsConfigurationResponse] =
    Task.deferFuture {
      underlying.putBucketMetricsConfiguration(putBucketMetricsConfigurationRequest)
    }

  override def putBucketNotificationConfiguration(
      putBucketNotificationConfigurationRequest: PutBucketNotificationConfigurationRequest
  ): Task[PutBucketNotificationConfigurationResponse] =
    Task.deferFuture {
      underlying.putBucketNotificationConfiguration(putBucketNotificationConfigurationRequest)
    }

  override def putBucketPolicy(putBucketPolicyRequest: PutBucketPolicyRequest): Task[PutBucketPolicyResponse] =
    Task.deferFuture {
      underlying.putBucketPolicy(putBucketPolicyRequest)
    }

  override def putBucketReplication(
      putBucketReplicationRequest: PutBucketReplicationRequest
  ): Task[PutBucketReplicationResponse] =
    Task.deferFuture {
      underlying.putBucketReplication(putBucketReplicationRequest)
    }

  override def putBucketRequestPayment(
      putBucketRequestPaymentRequest: PutBucketRequestPaymentRequest
  ): Task[PutBucketRequestPaymentResponse] =
    Task.deferFuture {
      underlying.putBucketRequestPayment(putBucketRequestPaymentRequest)
    }

  override def putBucketTagging(putBucketTaggingRequest: PutBucketTaggingRequest): Task[PutBucketTaggingResponse] =
    Task.deferFuture {
      underlying.putBucketTagging(putBucketTaggingRequest)
    }

  override def putBucketVersioning(
      putBucketVersioningRequest: PutBucketVersioningRequest
  ): Task[PutBucketVersioningResponse] =
    Task.deferFuture {
      underlying.putBucketVersioning(putBucketVersioningRequest)
    }

  override def putBucketWebsite(putBucketWebsiteRequest: PutBucketWebsiteRequest): Task[PutBucketWebsiteResponse] =
    Task.deferFuture {
      underlying.putBucketWebsite(putBucketWebsiteRequest)
    }

  override def putObjectAcl(putObjectAclRequest: PutObjectAclRequest): Task[PutObjectAclResponse] =
    Task.deferFuture {
      underlying.putObjectAcl(putObjectAclRequest)
    }

  override def putObjectLegalHold(
      putObjectLegalHoldRequest: PutObjectLegalHoldRequest
  ): Task[PutObjectLegalHoldResponse] =
    Task.deferFuture {
      underlying.putObjectLegalHold(putObjectLegalHoldRequest)
    }

  override def putObjectLockConfiguration(
      putObjectLockConfigurationRequest: PutObjectLockConfigurationRequest
  ): Task[PutObjectLockConfigurationResponse] =
    Task.deferFuture {
      underlying.putObjectLockConfiguration(putObjectLockConfigurationRequest)
    }

  override def putObjectRetention(
      putObjectRetentionRequest: PutObjectRetentionRequest
  ): Task[PutObjectRetentionResponse] =
    Task.deferFuture {
      underlying.putObjectRetention(putObjectRetentionRequest)
    }

  override def putObjectTagging(putObjectTaggingRequest: PutObjectTaggingRequest): Task[PutObjectTaggingResponse] =
    Task.deferFuture {
      underlying.putObjectTagging(putObjectTaggingRequest)
    }

  override def putPublicAccessBlock(
      putPublicAccessBlockRequest: PutPublicAccessBlockRequest
  ): Task[PutPublicAccessBlockResponse] =
    Task.deferFuture {
      underlying.putPublicAccessBlock(putPublicAccessBlockRequest)
    }

  override def restoreObject(restoreObjectRequest: RestoreObjectRequest): Task[RestoreObjectResponse] =
    Task.deferFuture {
      underlying.restoreObject(restoreObjectRequest)
    }

  override def uploadPartCopy(uploadPartCopyRequest: UploadPartCopyRequest): Task[UploadPartCopyResponse] =
    Task.deferFuture {
      underlying.uploadPartCopy(uploadPartCopyRequest)
    }

}
