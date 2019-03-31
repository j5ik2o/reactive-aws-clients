// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3

import com.github.j5ik2o.reactive.aws.s3.model._
import com.github.j5ik2o.reactive.aws.s3.model.ops._
import com.github.j5ik2o.reactive.aws.s3.model.rs._
import software.amazon.awssdk.services.s3.{ S3Client => JavaS3SyncClient }

object S3SyncClient {

  def apply(underlying: JavaS3SyncClient): S3SyncClient = new S3SyncClientImpl(underlying)

}

trait S3SyncClient extends S3Client[Either[Throwable, ?]] {
  val underlying: JavaS3SyncClient

  private def toEither[A](f: => A): Either[Throwable, A] = {
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
    import AbortMultipartUploadRequestOps._
    import AbortMultipartUploadResponseOps._
    toEither(underlying.abortMultipartUpload(abortMultipartUploadRequest.toJava)).right.map(_.toScala)
  }

  override def completeMultipartUpload(
      completeMultipartUploadRequest: CompleteMultipartUploadRequest
  ): Either[Throwable, CompleteMultipartUploadResponse] = {
    import CompleteMultipartUploadRequestOps._
    import CompleteMultipartUploadResponseOps._
    toEither(underlying.completeMultipartUpload(completeMultipartUploadRequest.toJava)).right.map(_.toScala)
  }

  override def copyObject(copyObjectRequest: CopyObjectRequest): Either[Throwable, CopyObjectResponse] = {
    import CopyObjectRequestOps._
    import CopyObjectResponseOps._
    toEither(underlying.copyObject(copyObjectRequest.toJava)).right.map(_.toScala)
  }

  override def createBucket(createBucketRequest: CreateBucketRequest): Either[Throwable, CreateBucketResponse] = {
    import CreateBucketRequestOps._
    import CreateBucketResponseOps._
    toEither(underlying.createBucket(createBucketRequest.toJava)).right.map(_.toScala)
  }

  override def createMultipartUpload(
      createMultipartUploadRequest: CreateMultipartUploadRequest
  ): Either[Throwable, CreateMultipartUploadResponse] = {
    import CreateMultipartUploadRequestOps._
    import CreateMultipartUploadResponseOps._
    toEither(underlying.createMultipartUpload(createMultipartUploadRequest.toJava)).right.map(_.toScala)
  }

  override def deleteBucket(deleteBucketRequest: DeleteBucketRequest): Either[Throwable, DeleteBucketResponse] = {
    import DeleteBucketRequestOps._
    import DeleteBucketResponseOps._
    toEither(underlying.deleteBucket(deleteBucketRequest.toJava)).right.map(_.toScala)
  }

  override def deleteBucketAnalyticsConfiguration(
      deleteBucketAnalyticsConfigurationRequest: DeleteBucketAnalyticsConfigurationRequest
  ): Either[Throwable, DeleteBucketAnalyticsConfigurationResponse] = {
    import DeleteBucketAnalyticsConfigurationRequestOps._
    import DeleteBucketAnalyticsConfigurationResponseOps._
    toEither(underlying.deleteBucketAnalyticsConfiguration(deleteBucketAnalyticsConfigurationRequest.toJava)).right
      .map(_.toScala)
  }

  override def deleteBucketCors(
      deleteBucketCorsRequest: DeleteBucketCorsRequest
  ): Either[Throwable, DeleteBucketCorsResponse] = {
    import DeleteBucketCorsRequestOps._
    import DeleteBucketCorsResponseOps._
    toEither(underlying.deleteBucketCors(deleteBucketCorsRequest.toJava)).right.map(_.toScala)
  }

  override def deleteBucketEncryption(
      deleteBucketEncryptionRequest: DeleteBucketEncryptionRequest
  ): Either[Throwable, DeleteBucketEncryptionResponse] = {
    import DeleteBucketEncryptionRequestOps._
    import DeleteBucketEncryptionResponseOps._
    toEither(underlying.deleteBucketEncryption(deleteBucketEncryptionRequest.toJava)).right.map(_.toScala)
  }

  override def deleteBucketInventoryConfiguration(
      deleteBucketInventoryConfigurationRequest: DeleteBucketInventoryConfigurationRequest
  ): Either[Throwable, DeleteBucketInventoryConfigurationResponse] = {
    import DeleteBucketInventoryConfigurationRequestOps._
    import DeleteBucketInventoryConfigurationResponseOps._
    toEither(underlying.deleteBucketInventoryConfiguration(deleteBucketInventoryConfigurationRequest.toJava)).right
      .map(_.toScala)
  }

  override def deleteBucketLifecycle(
      deleteBucketLifecycleRequest: DeleteBucketLifecycleRequest
  ): Either[Throwable, DeleteBucketLifecycleResponse] = {
    import DeleteBucketLifecycleRequestOps._
    import DeleteBucketLifecycleResponseOps._
    toEither(underlying.deleteBucketLifecycle(deleteBucketLifecycleRequest.toJava)).right.map(_.toScala)
  }

  override def deleteBucketMetricsConfiguration(
      deleteBucketMetricsConfigurationRequest: DeleteBucketMetricsConfigurationRequest
  ): Either[Throwable, DeleteBucketMetricsConfigurationResponse] = {
    import DeleteBucketMetricsConfigurationRequestOps._
    import DeleteBucketMetricsConfigurationResponseOps._
    toEither(underlying.deleteBucketMetricsConfiguration(deleteBucketMetricsConfigurationRequest.toJava)).right
      .map(_.toScala)
  }

  override def deleteBucketPolicy(
      deleteBucketPolicyRequest: DeleteBucketPolicyRequest
  ): Either[Throwable, DeleteBucketPolicyResponse] = {
    import DeleteBucketPolicyRequestOps._
    import DeleteBucketPolicyResponseOps._
    toEither(underlying.deleteBucketPolicy(deleteBucketPolicyRequest.toJava)).right.map(_.toScala)
  }

  override def deleteBucketReplication(
      deleteBucketReplicationRequest: DeleteBucketReplicationRequest
  ): Either[Throwable, DeleteBucketReplicationResponse] = {
    import DeleteBucketReplicationRequestOps._
    import DeleteBucketReplicationResponseOps._
    toEither(underlying.deleteBucketReplication(deleteBucketReplicationRequest.toJava)).right.map(_.toScala)
  }

  override def deleteBucketTagging(
      deleteBucketTaggingRequest: DeleteBucketTaggingRequest
  ): Either[Throwable, DeleteBucketTaggingResponse] = {
    import DeleteBucketTaggingRequestOps._
    import DeleteBucketTaggingResponseOps._
    toEither(underlying.deleteBucketTagging(deleteBucketTaggingRequest.toJava)).right.map(_.toScala)
  }

  override def deleteBucketWebsite(
      deleteBucketWebsiteRequest: DeleteBucketWebsiteRequest
  ): Either[Throwable, DeleteBucketWebsiteResponse] = {
    import DeleteBucketWebsiteRequestOps._
    import DeleteBucketWebsiteResponseOps._
    toEither(underlying.deleteBucketWebsite(deleteBucketWebsiteRequest.toJava)).right.map(_.toScala)
  }

  override def deleteObject(deleteObjectRequest: DeleteObjectRequest): Either[Throwable, DeleteObjectResponse] = {
    import DeleteObjectRequestOps._
    import DeleteObjectResponseOps._
    toEither(underlying.deleteObject(deleteObjectRequest.toJava)).right.map(_.toScala)
  }

  override def deleteObjectTagging(
      deleteObjectTaggingRequest: DeleteObjectTaggingRequest
  ): Either[Throwable, DeleteObjectTaggingResponse] = {
    import DeleteObjectTaggingRequestOps._
    import DeleteObjectTaggingResponseOps._
    toEither(underlying.deleteObjectTagging(deleteObjectTaggingRequest.toJava)).right.map(_.toScala)
  }

  override def deleteObjects(deleteObjectsRequest: DeleteObjectsRequest): Either[Throwable, DeleteObjectsResponse] = {
    import DeleteObjectsRequestOps._
    import DeleteObjectsResponseOps._
    toEither(underlying.deleteObjects(deleteObjectsRequest.toJava)).right.map(_.toScala)
  }

  override def deletePublicAccessBlock(
      deletePublicAccessBlockRequest: DeletePublicAccessBlockRequest
  ): Either[Throwable, DeletePublicAccessBlockResponse] = {
    import DeletePublicAccessBlockRequestOps._
    import DeletePublicAccessBlockResponseOps._
    toEither(underlying.deletePublicAccessBlock(deletePublicAccessBlockRequest.toJava)).right.map(_.toScala)
  }

  override def getBucketAccelerateConfiguration(
      getBucketAccelerateConfigurationRequest: GetBucketAccelerateConfigurationRequest
  ): Either[Throwable, GetBucketAccelerateConfigurationResponse] = {
    import GetBucketAccelerateConfigurationRequestOps._
    import GetBucketAccelerateConfigurationResponseOps._
    toEither(underlying.getBucketAccelerateConfiguration(getBucketAccelerateConfigurationRequest.toJava)).right
      .map(_.toScala)
  }

  override def getBucketAcl(getBucketAclRequest: GetBucketAclRequest): Either[Throwable, GetBucketAclResponse] = {
    import GetBucketAclRequestOps._
    import GetBucketAclResponseOps._
    toEither(underlying.getBucketAcl(getBucketAclRequest.toJava)).right.map(_.toScala)
  }

  override def getBucketAnalyticsConfiguration(
      getBucketAnalyticsConfigurationRequest: GetBucketAnalyticsConfigurationRequest
  ): Either[Throwable, GetBucketAnalyticsConfigurationResponse] = {
    import GetBucketAnalyticsConfigurationRequestOps._
    import GetBucketAnalyticsConfigurationResponseOps._
    toEither(underlying.getBucketAnalyticsConfiguration(getBucketAnalyticsConfigurationRequest.toJava)).right
      .map(_.toScala)
  }

  override def getBucketCors(getBucketCorsRequest: GetBucketCorsRequest): Either[Throwable, GetBucketCorsResponse] = {
    import GetBucketCorsRequestOps._
    import GetBucketCorsResponseOps._
    toEither(underlying.getBucketCors(getBucketCorsRequest.toJava)).right.map(_.toScala)
  }

  override def getBucketEncryption(
      getBucketEncryptionRequest: GetBucketEncryptionRequest
  ): Either[Throwable, GetBucketEncryptionResponse] = {
    import GetBucketEncryptionRequestOps._
    import GetBucketEncryptionResponseOps._
    toEither(underlying.getBucketEncryption(getBucketEncryptionRequest.toJava)).right.map(_.toScala)
  }

  override def getBucketInventoryConfiguration(
      getBucketInventoryConfigurationRequest: GetBucketInventoryConfigurationRequest
  ): Either[Throwable, GetBucketInventoryConfigurationResponse] = {
    import GetBucketInventoryConfigurationRequestOps._
    import GetBucketInventoryConfigurationResponseOps._
    toEither(underlying.getBucketInventoryConfiguration(getBucketInventoryConfigurationRequest.toJava)).right
      .map(_.toScala)
  }

  override def getBucketLifecycleConfiguration(
      getBucketLifecycleConfigurationRequest: GetBucketLifecycleConfigurationRequest
  ): Either[Throwable, GetBucketLifecycleConfigurationResponse] = {
    import GetBucketLifecycleConfigurationRequestOps._
    import GetBucketLifecycleConfigurationResponseOps._
    toEither(underlying.getBucketLifecycleConfiguration(getBucketLifecycleConfigurationRequest.toJava)).right
      .map(_.toScala)
  }

  override def getBucketLocation(
      getBucketLocationRequest: GetBucketLocationRequest
  ): Either[Throwable, GetBucketLocationResponse] = {
    import GetBucketLocationRequestOps._
    import GetBucketLocationResponseOps._
    toEither(underlying.getBucketLocation(getBucketLocationRequest.toJava)).right.map(_.toScala)
  }

  override def getBucketLogging(
      getBucketLoggingRequest: GetBucketLoggingRequest
  ): Either[Throwable, GetBucketLoggingResponse] = {
    import GetBucketLoggingRequestOps._
    import GetBucketLoggingResponseOps._
    toEither(underlying.getBucketLogging(getBucketLoggingRequest.toJava)).right.map(_.toScala)
  }

  override def getBucketMetricsConfiguration(
      getBucketMetricsConfigurationRequest: GetBucketMetricsConfigurationRequest
  ): Either[Throwable, GetBucketMetricsConfigurationResponse] = {
    import GetBucketMetricsConfigurationRequestOps._
    import GetBucketMetricsConfigurationResponseOps._
    toEither(underlying.getBucketMetricsConfiguration(getBucketMetricsConfigurationRequest.toJava)).right.map(_.toScala)
  }

  override def getBucketNotificationConfiguration(
      getBucketNotificationConfigurationRequest: GetBucketNotificationConfigurationRequest
  ): Either[Throwable, GetBucketNotificationConfigurationResponse] = {
    import GetBucketNotificationConfigurationRequestOps._
    import GetBucketNotificationConfigurationResponseOps._
    toEither(underlying.getBucketNotificationConfiguration(getBucketNotificationConfigurationRequest.toJava)).right
      .map(_.toScala)
  }

  override def getBucketPolicy(
      getBucketPolicyRequest: GetBucketPolicyRequest
  ): Either[Throwable, GetBucketPolicyResponse] = {
    import GetBucketPolicyRequestOps._
    import GetBucketPolicyResponseOps._
    toEither(underlying.getBucketPolicy(getBucketPolicyRequest.toJava)).right.map(_.toScala)
  }

  override def getBucketPolicyStatus(
      getBucketPolicyStatusRequest: GetBucketPolicyStatusRequest
  ): Either[Throwable, GetBucketPolicyStatusResponse] = {
    import GetBucketPolicyStatusRequestOps._
    import GetBucketPolicyStatusResponseOps._
    toEither(underlying.getBucketPolicyStatus(getBucketPolicyStatusRequest.toJava)).right.map(_.toScala)
  }

  override def getBucketReplication(
      getBucketReplicationRequest: GetBucketReplicationRequest
  ): Either[Throwable, GetBucketReplicationResponse] = {
    import GetBucketReplicationRequestOps._
    import GetBucketReplicationResponseOps._
    toEither(underlying.getBucketReplication(getBucketReplicationRequest.toJava)).right.map(_.toScala)
  }

  override def getBucketRequestPayment(
      getBucketRequestPaymentRequest: GetBucketRequestPaymentRequest
  ): Either[Throwable, GetBucketRequestPaymentResponse] = {
    import GetBucketRequestPaymentRequestOps._
    import GetBucketRequestPaymentResponseOps._
    toEither(underlying.getBucketRequestPayment(getBucketRequestPaymentRequest.toJava)).right.map(_.toScala)
  }

  override def getBucketTagging(
      getBucketTaggingRequest: GetBucketTaggingRequest
  ): Either[Throwable, GetBucketTaggingResponse] = {
    import GetBucketTaggingRequestOps._
    import GetBucketTaggingResponseOps._
    toEither(underlying.getBucketTagging(getBucketTaggingRequest.toJava)).right.map(_.toScala)
  }

  override def getBucketVersioning(
      getBucketVersioningRequest: GetBucketVersioningRequest
  ): Either[Throwable, GetBucketVersioningResponse] = {
    import GetBucketVersioningRequestOps._
    import GetBucketVersioningResponseOps._
    toEither(underlying.getBucketVersioning(getBucketVersioningRequest.toJava)).right.map(_.toScala)
  }

  override def getBucketWebsite(
      getBucketWebsiteRequest: GetBucketWebsiteRequest
  ): Either[Throwable, GetBucketWebsiteResponse] = {
    import GetBucketWebsiteRequestOps._
    import GetBucketWebsiteResponseOps._
    toEither(underlying.getBucketWebsite(getBucketWebsiteRequest.toJava)).right.map(_.toScala)
  }

  override def getPublicAccessBlock(
      getPublicAccessBlockRequest: GetPublicAccessBlockRequest
  ): Either[Throwable, GetPublicAccessBlockResponse] = {
    import GetPublicAccessBlockRequestOps._
    import GetPublicAccessBlockResponseOps._
    toEither(underlying.getPublicAccessBlock(getPublicAccessBlockRequest.toJava)).right.map(_.toScala)
  }

  override def headBucket(headBucketRequest: HeadBucketRequest): Either[Throwable, HeadBucketResponse] = {
    import HeadBucketRequestOps._
    import HeadBucketResponseOps._
    toEither(underlying.headBucket(headBucketRequest.toJava)).right.map(_.toScala)
  }

  override def headObject(headObjectRequest: HeadObjectRequest): Either[Throwable, HeadObjectResponse] = {
    import HeadObjectRequestOps._
    import HeadObjectResponseOps._
    toEither(underlying.headObject(headObjectRequest.toJava)).right.map(_.toScala)
  }

  override def listBucketAnalyticsConfigurations(
      listBucketAnalyticsConfigurationsRequest: ListBucketAnalyticsConfigurationsRequest
  ): Either[Throwable, ListBucketAnalyticsConfigurationsResponse] = {
    import ListBucketAnalyticsConfigurationsRequestOps._
    import ListBucketAnalyticsConfigurationsResponseOps._
    toEither(underlying.listBucketAnalyticsConfigurations(listBucketAnalyticsConfigurationsRequest.toJava)).right
      .map(_.toScala)
  }

  override def listBucketInventoryConfigurations(
      listBucketInventoryConfigurationsRequest: ListBucketInventoryConfigurationsRequest
  ): Either[Throwable, ListBucketInventoryConfigurationsResponse] = {
    import ListBucketInventoryConfigurationsRequestOps._
    import ListBucketInventoryConfigurationsResponseOps._
    toEither(underlying.listBucketInventoryConfigurations(listBucketInventoryConfigurationsRequest.toJava)).right
      .map(_.toScala)
  }

  override def listBucketMetricsConfigurations(
      listBucketMetricsConfigurationsRequest: ListBucketMetricsConfigurationsRequest
  ): Either[Throwable, ListBucketMetricsConfigurationsResponse] = {
    import ListBucketMetricsConfigurationsRequestOps._
    import ListBucketMetricsConfigurationsResponseOps._
    toEither(underlying.listBucketMetricsConfigurations(listBucketMetricsConfigurationsRequest.toJava)).right
      .map(_.toScala)
  }

  override def listBuckets(): Either[Throwable, ListBucketsResponse] = {

    import ListBucketsResponseOps._
    toEither(underlying.listBuckets()).right.map(_.toScala)
  }

  override def listBuckets(listBucketsRequest: ListBucketsRequest): Either[Throwable, ListBucketsResponse] = {
    import ListBucketsRequestOps._
    import ListBucketsResponseOps._
    toEither(underlying.listBuckets(listBucketsRequest.toJava)).right.map(_.toScala)
  }

  override def listMultipartUploads(
      listMultipartUploadsRequest: ListMultipartUploadsRequest
  ): Either[Throwable, ListMultipartUploadsResponse] = {
    import ListMultipartUploadsRequestOps._
    import ListMultipartUploadsResponseOps._
    toEither(underlying.listMultipartUploads(listMultipartUploadsRequest.toJava)).right.map(_.toScala)
  }

  def listMultipartUploadsPaginator(
      listMultipartUploadsRequest: ListMultipartUploadsRequest
  ): ListMultipartUploadsIterable = {
    import ListMultipartUploadsRequestOps._
    new ListMultipartUploadsIterableImpl(underlying.listMultipartUploadsPaginator(listMultipartUploadsRequest.toJava))
  }

  override def listObjectVersions(
      listObjectVersionsRequest: ListObjectVersionsRequest
  ): Either[Throwable, ListObjectVersionsResponse] = {
    import ListObjectVersionsRequestOps._
    import ListObjectVersionsResponseOps._
    toEither(underlying.listObjectVersions(listObjectVersionsRequest.toJava)).right.map(_.toScala)
  }

  def listObjectVersionsPaginator(listObjectVersionsRequest: ListObjectVersionsRequest): ListObjectVersionsIterable = {
    import ListObjectVersionsRequestOps._
    new ListObjectVersionsIterableImpl(underlying.listObjectVersionsPaginator(listObjectVersionsRequest.toJava))
  }

  override def listObjects(listObjectsRequest: ListObjectsRequest): Either[Throwable, ListObjectsResponse] = {
    import ListObjectsRequestOps._
    import ListObjectsResponseOps._
    toEither(underlying.listObjects(listObjectsRequest.toJava)).right.map(_.toScala)
  }

  override def listObjectsV2(listObjectsV2Request: ListObjectsV2Request): Either[Throwable, ListObjectsV2Response] = {
    import ListObjectsV2RequestOps._
    import ListObjectsV2ResponseOps._
    toEither(underlying.listObjectsV2(listObjectsV2Request.toJava)).right.map(_.toScala)
  }

  def listObjectsV2Paginator(listObjectsV2Request: ListObjectsV2Request): ListObjectsV2Iterable = {
    import ListObjectsV2RequestOps._
    new ListObjectsV2IterableImpl(underlying.listObjectsV2Paginator(listObjectsV2Request.toJava))
  }

  override def listParts(listPartsRequest: ListPartsRequest): Either[Throwable, ListPartsResponse] = {
    import ListPartsRequestOps._
    import ListPartsResponseOps._
    toEither(underlying.listParts(listPartsRequest.toJava)).right.map(_.toScala)
  }

  def listPartsPaginator(listPartsRequest: ListPartsRequest): ListPartsIterable = {
    import ListPartsRequestOps._
    new ListPartsIterableImpl(underlying.listPartsPaginator(listPartsRequest.toJava))
  }

  override def putBucketAccelerateConfiguration(
      putBucketAccelerateConfigurationRequest: PutBucketAccelerateConfigurationRequest
  ): Either[Throwable, PutBucketAccelerateConfigurationResponse] = {
    import PutBucketAccelerateConfigurationRequestOps._
    import PutBucketAccelerateConfigurationResponseOps._
    toEither(underlying.putBucketAccelerateConfiguration(putBucketAccelerateConfigurationRequest.toJava)).right
      .map(_.toScala)
  }

  override def putBucketAcl(putBucketAclRequest: PutBucketAclRequest): Either[Throwable, PutBucketAclResponse] = {
    import PutBucketAclRequestOps._
    import PutBucketAclResponseOps._
    toEither(underlying.putBucketAcl(putBucketAclRequest.toJava)).right.map(_.toScala)
  }

  override def putBucketAnalyticsConfiguration(
      putBucketAnalyticsConfigurationRequest: PutBucketAnalyticsConfigurationRequest
  ): Either[Throwable, PutBucketAnalyticsConfigurationResponse] = {
    import PutBucketAnalyticsConfigurationRequestOps._
    import PutBucketAnalyticsConfigurationResponseOps._
    toEither(underlying.putBucketAnalyticsConfiguration(putBucketAnalyticsConfigurationRequest.toJava)).right
      .map(_.toScala)
  }

  override def putBucketCors(putBucketCorsRequest: PutBucketCorsRequest): Either[Throwable, PutBucketCorsResponse] = {
    import PutBucketCorsRequestOps._
    import PutBucketCorsResponseOps._
    toEither(underlying.putBucketCors(putBucketCorsRequest.toJava)).right.map(_.toScala)
  }

  override def putBucketEncryption(
      putBucketEncryptionRequest: PutBucketEncryptionRequest
  ): Either[Throwable, PutBucketEncryptionResponse] = {
    import PutBucketEncryptionRequestOps._
    import PutBucketEncryptionResponseOps._
    toEither(underlying.putBucketEncryption(putBucketEncryptionRequest.toJava)).right.map(_.toScala)
  }

  override def putBucketInventoryConfiguration(
      putBucketInventoryConfigurationRequest: PutBucketInventoryConfigurationRequest
  ): Either[Throwable, PutBucketInventoryConfigurationResponse] = {
    import PutBucketInventoryConfigurationRequestOps._
    import PutBucketInventoryConfigurationResponseOps._
    toEither(underlying.putBucketInventoryConfiguration(putBucketInventoryConfigurationRequest.toJava)).right
      .map(_.toScala)
  }

  override def putBucketLifecycleConfiguration(
      putBucketLifecycleConfigurationRequest: PutBucketLifecycleConfigurationRequest
  ): Either[Throwable, PutBucketLifecycleConfigurationResponse] = {
    import PutBucketLifecycleConfigurationRequestOps._
    import PutBucketLifecycleConfigurationResponseOps._
    toEither(underlying.putBucketLifecycleConfiguration(putBucketLifecycleConfigurationRequest.toJava)).right
      .map(_.toScala)
  }

  override def putBucketLogging(
      putBucketLoggingRequest: PutBucketLoggingRequest
  ): Either[Throwable, PutBucketLoggingResponse] = {
    import PutBucketLoggingRequestOps._
    import PutBucketLoggingResponseOps._
    toEither(underlying.putBucketLogging(putBucketLoggingRequest.toJava)).right.map(_.toScala)
  }

  override def putBucketMetricsConfiguration(
      putBucketMetricsConfigurationRequest: PutBucketMetricsConfigurationRequest
  ): Either[Throwable, PutBucketMetricsConfigurationResponse] = {
    import PutBucketMetricsConfigurationRequestOps._
    import PutBucketMetricsConfigurationResponseOps._
    toEither(underlying.putBucketMetricsConfiguration(putBucketMetricsConfigurationRequest.toJava)).right.map(_.toScala)
  }

  override def putBucketNotificationConfiguration(
      putBucketNotificationConfigurationRequest: PutBucketNotificationConfigurationRequest
  ): Either[Throwable, PutBucketNotificationConfigurationResponse] = {
    import PutBucketNotificationConfigurationRequestOps._
    import PutBucketNotificationConfigurationResponseOps._
    toEither(underlying.putBucketNotificationConfiguration(putBucketNotificationConfigurationRequest.toJava)).right
      .map(_.toScala)
  }

  override def putBucketPolicy(
      putBucketPolicyRequest: PutBucketPolicyRequest
  ): Either[Throwable, PutBucketPolicyResponse] = {
    import PutBucketPolicyRequestOps._
    import PutBucketPolicyResponseOps._
    toEither(underlying.putBucketPolicy(putBucketPolicyRequest.toJava)).right.map(_.toScala)
  }

  override def putBucketReplication(
      putBucketReplicationRequest: PutBucketReplicationRequest
  ): Either[Throwable, PutBucketReplicationResponse] = {
    import PutBucketReplicationRequestOps._
    import PutBucketReplicationResponseOps._
    toEither(underlying.putBucketReplication(putBucketReplicationRequest.toJava)).right.map(_.toScala)
  }

  override def putBucketRequestPayment(
      putBucketRequestPaymentRequest: PutBucketRequestPaymentRequest
  ): Either[Throwable, PutBucketRequestPaymentResponse] = {
    import PutBucketRequestPaymentRequestOps._
    import PutBucketRequestPaymentResponseOps._
    toEither(underlying.putBucketRequestPayment(putBucketRequestPaymentRequest.toJava)).right.map(_.toScala)
  }

  override def putBucketTagging(
      putBucketTaggingRequest: PutBucketTaggingRequest
  ): Either[Throwable, PutBucketTaggingResponse] = {
    import PutBucketTaggingRequestOps._
    import PutBucketTaggingResponseOps._
    toEither(underlying.putBucketTagging(putBucketTaggingRequest.toJava)).right.map(_.toScala)
  }

  override def putBucketVersioning(
      putBucketVersioningRequest: PutBucketVersioningRequest
  ): Either[Throwable, PutBucketVersioningResponse] = {
    import PutBucketVersioningRequestOps._
    import PutBucketVersioningResponseOps._
    toEither(underlying.putBucketVersioning(putBucketVersioningRequest.toJava)).right.map(_.toScala)
  }

  override def putBucketWebsite(
      putBucketWebsiteRequest: PutBucketWebsiteRequest
  ): Either[Throwable, PutBucketWebsiteResponse] = {
    import PutBucketWebsiteRequestOps._
    import PutBucketWebsiteResponseOps._
    toEither(underlying.putBucketWebsite(putBucketWebsiteRequest.toJava)).right.map(_.toScala)
  }

  override def putObjectAcl(putObjectAclRequest: PutObjectAclRequest): Either[Throwable, PutObjectAclResponse] = {
    import PutObjectAclRequestOps._
    import PutObjectAclResponseOps._
    toEither(underlying.putObjectAcl(putObjectAclRequest.toJava)).right.map(_.toScala)
  }

  override def putObjectLegalHold(
      putObjectLegalHoldRequest: PutObjectLegalHoldRequest
  ): Either[Throwable, PutObjectLegalHoldResponse] = {
    import PutObjectLegalHoldRequestOps._
    import PutObjectLegalHoldResponseOps._
    toEither(underlying.putObjectLegalHold(putObjectLegalHoldRequest.toJava)).right.map(_.toScala)
  }

  override def putObjectLockConfiguration(
      putObjectLockConfigurationRequest: PutObjectLockConfigurationRequest
  ): Either[Throwable, PutObjectLockConfigurationResponse] = {
    import PutObjectLockConfigurationRequestOps._
    import PutObjectLockConfigurationResponseOps._
    toEither(underlying.putObjectLockConfiguration(putObjectLockConfigurationRequest.toJava)).right.map(_.toScala)
  }

  override def putObjectRetention(
      putObjectRetentionRequest: PutObjectRetentionRequest
  ): Either[Throwable, PutObjectRetentionResponse] = {
    import PutObjectRetentionRequestOps._
    import PutObjectRetentionResponseOps._
    toEither(underlying.putObjectRetention(putObjectRetentionRequest.toJava)).right.map(_.toScala)
  }

  override def putObjectTagging(
      putObjectTaggingRequest: PutObjectTaggingRequest
  ): Either[Throwable, PutObjectTaggingResponse] = {
    import PutObjectTaggingRequestOps._
    import PutObjectTaggingResponseOps._
    toEither(underlying.putObjectTagging(putObjectTaggingRequest.toJava)).right.map(_.toScala)
  }

  override def putPublicAccessBlock(
      putPublicAccessBlockRequest: PutPublicAccessBlockRequest
  ): Either[Throwable, PutPublicAccessBlockResponse] = {
    import PutPublicAccessBlockRequestOps._
    import PutPublicAccessBlockResponseOps._
    toEither(underlying.putPublicAccessBlock(putPublicAccessBlockRequest.toJava)).right.map(_.toScala)
  }

  override def restoreObject(restoreObjectRequest: RestoreObjectRequest): Either[Throwable, RestoreObjectResponse] = {
    import RestoreObjectRequestOps._
    import RestoreObjectResponseOps._
    toEither(underlying.restoreObject(restoreObjectRequest.toJava)).right.map(_.toScala)
  }

  override def uploadPartCopy(
      uploadPartCopyRequest: UploadPartCopyRequest
  ): Either[Throwable, UploadPartCopyResponse] = {
    import UploadPartCopyRequestOps._
    import UploadPartCopyResponseOps._
    toEither(underlying.uploadPartCopy(uploadPartCopyRequest.toJava)).right.map(_.toScala)
  }

}
