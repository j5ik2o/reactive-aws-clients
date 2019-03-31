// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3

import java.util.concurrent.CompletableFuture

import com.github.j5ik2o.reactive.aws.s3.model._
import com.github.j5ik2o.reactive.aws.s3.model.rs._
import com.github.j5ik2o.reactive.aws.s3.model.ops._
import software.amazon.awssdk.services.s3.{ S3AsyncClient => JavaS3AsyncClient }

import scala.compat.java8.FutureConverters
import scala.concurrent.{ ExecutionContext, Future }

object S3AsyncClient {

  def apply(underlying: JavaS3AsyncClient)(implicit ec: ExecutionContext): S3AsyncClient =
    new S3AsyncClientImpl(underlying)

  implicit class CompletableFutureOps[A](val cf: CompletableFuture[A]) extends AnyVal {
    def toFuture: Future[A] = FutureConverters.toScala(cf)
  }

}

trait S3AsyncClient extends S3Client[Future] /*with S3AsyncClientSupport*/ {
  implicit val execution: ExecutionContext
  val underlying: JavaS3AsyncClient
  import S3AsyncClient._

  override def abortMultipartUpload(
      abortMultipartUploadRequest: AbortMultipartUploadRequest
  ): Future[AbortMultipartUploadResponse] = {
    import AbortMultipartUploadRequestOps._
    import AbortMultipartUploadResponseOps._
    underlying.abortMultipartUpload(abortMultipartUploadRequest.toJava).toFuture.map(_.toScala)
  }

  override def completeMultipartUpload(
      completeMultipartUploadRequest: CompleteMultipartUploadRequest
  ): Future[CompleteMultipartUploadResponse] = {
    import CompleteMultipartUploadRequestOps._
    import CompleteMultipartUploadResponseOps._
    underlying.completeMultipartUpload(completeMultipartUploadRequest.toJava).toFuture.map(_.toScala)
  }

  override def copyObject(copyObjectRequest: CopyObjectRequest): Future[CopyObjectResponse] = {
    import CopyObjectRequestOps._
    import CopyObjectResponseOps._
    underlying.copyObject(copyObjectRequest.toJava).toFuture.map(_.toScala)
  }

  override def createBucket(createBucketRequest: CreateBucketRequest): Future[CreateBucketResponse] = {
    import CreateBucketRequestOps._
    import CreateBucketResponseOps._
    underlying.createBucket(createBucketRequest.toJava).toFuture.map(_.toScala)
  }

  override def createMultipartUpload(
      createMultipartUploadRequest: CreateMultipartUploadRequest
  ): Future[CreateMultipartUploadResponse] = {
    import CreateMultipartUploadRequestOps._
    import CreateMultipartUploadResponseOps._
    underlying.createMultipartUpload(createMultipartUploadRequest.toJava).toFuture.map(_.toScala)
  }

  override def deleteBucket(deleteBucketRequest: DeleteBucketRequest): Future[DeleteBucketResponse] = {
    import DeleteBucketRequestOps._
    import DeleteBucketResponseOps._
    underlying.deleteBucket(deleteBucketRequest.toJava).toFuture.map(_.toScala)
  }

  override def deleteBucketAnalyticsConfiguration(
      deleteBucketAnalyticsConfigurationRequest: DeleteBucketAnalyticsConfigurationRequest
  ): Future[DeleteBucketAnalyticsConfigurationResponse] = {
    import DeleteBucketAnalyticsConfigurationRequestOps._
    import DeleteBucketAnalyticsConfigurationResponseOps._
    underlying
      .deleteBucketAnalyticsConfiguration(deleteBucketAnalyticsConfigurationRequest.toJava).toFuture.map(_.toScala)
  }

  override def deleteBucketCors(deleteBucketCorsRequest: DeleteBucketCorsRequest): Future[DeleteBucketCorsResponse] = {
    import DeleteBucketCorsRequestOps._
    import DeleteBucketCorsResponseOps._
    underlying.deleteBucketCors(deleteBucketCorsRequest.toJava).toFuture.map(_.toScala)
  }

  override def deleteBucketEncryption(
      deleteBucketEncryptionRequest: DeleteBucketEncryptionRequest
  ): Future[DeleteBucketEncryptionResponse] = {
    import DeleteBucketEncryptionRequestOps._
    import DeleteBucketEncryptionResponseOps._
    underlying.deleteBucketEncryption(deleteBucketEncryptionRequest.toJava).toFuture.map(_.toScala)
  }

  override def deleteBucketInventoryConfiguration(
      deleteBucketInventoryConfigurationRequest: DeleteBucketInventoryConfigurationRequest
  ): Future[DeleteBucketInventoryConfigurationResponse] = {
    import DeleteBucketInventoryConfigurationRequestOps._
    import DeleteBucketInventoryConfigurationResponseOps._
    underlying
      .deleteBucketInventoryConfiguration(deleteBucketInventoryConfigurationRequest.toJava).toFuture.map(_.toScala)
  }

  override def deleteBucketLifecycle(
      deleteBucketLifecycleRequest: DeleteBucketLifecycleRequest
  ): Future[DeleteBucketLifecycleResponse] = {
    import DeleteBucketLifecycleRequestOps._
    import DeleteBucketLifecycleResponseOps._
    underlying.deleteBucketLifecycle(deleteBucketLifecycleRequest.toJava).toFuture.map(_.toScala)
  }

  override def deleteBucketMetricsConfiguration(
      deleteBucketMetricsConfigurationRequest: DeleteBucketMetricsConfigurationRequest
  ): Future[DeleteBucketMetricsConfigurationResponse] = {
    import DeleteBucketMetricsConfigurationRequestOps._
    import DeleteBucketMetricsConfigurationResponseOps._
    underlying.deleteBucketMetricsConfiguration(deleteBucketMetricsConfigurationRequest.toJava).toFuture.map(_.toScala)
  }

  override def deleteBucketPolicy(
      deleteBucketPolicyRequest: DeleteBucketPolicyRequest
  ): Future[DeleteBucketPolicyResponse] = {
    import DeleteBucketPolicyRequestOps._
    import DeleteBucketPolicyResponseOps._
    underlying.deleteBucketPolicy(deleteBucketPolicyRequest.toJava).toFuture.map(_.toScala)
  }

  override def deleteBucketReplication(
      deleteBucketReplicationRequest: DeleteBucketReplicationRequest
  ): Future[DeleteBucketReplicationResponse] = {
    import DeleteBucketReplicationRequestOps._
    import DeleteBucketReplicationResponseOps._
    underlying.deleteBucketReplication(deleteBucketReplicationRequest.toJava).toFuture.map(_.toScala)
  }

  override def deleteBucketTagging(
      deleteBucketTaggingRequest: DeleteBucketTaggingRequest
  ): Future[DeleteBucketTaggingResponse] = {
    import DeleteBucketTaggingRequestOps._
    import DeleteBucketTaggingResponseOps._
    underlying.deleteBucketTagging(deleteBucketTaggingRequest.toJava).toFuture.map(_.toScala)
  }

  override def deleteBucketWebsite(
      deleteBucketWebsiteRequest: DeleteBucketWebsiteRequest
  ): Future[DeleteBucketWebsiteResponse] = {
    import DeleteBucketWebsiteRequestOps._
    import DeleteBucketWebsiteResponseOps._
    underlying.deleteBucketWebsite(deleteBucketWebsiteRequest.toJava).toFuture.map(_.toScala)
  }

  override def deleteObject(deleteObjectRequest: DeleteObjectRequest): Future[DeleteObjectResponse] = {
    import DeleteObjectRequestOps._
    import DeleteObjectResponseOps._
    underlying.deleteObject(deleteObjectRequest.toJava).toFuture.map(_.toScala)
  }

  override def deleteObjectTagging(
      deleteObjectTaggingRequest: DeleteObjectTaggingRequest
  ): Future[DeleteObjectTaggingResponse] = {
    import DeleteObjectTaggingRequestOps._
    import DeleteObjectTaggingResponseOps._
    underlying.deleteObjectTagging(deleteObjectTaggingRequest.toJava).toFuture.map(_.toScala)
  }

  override def deleteObjects(deleteObjectsRequest: DeleteObjectsRequest): Future[DeleteObjectsResponse] = {
    import DeleteObjectsRequestOps._
    import DeleteObjectsResponseOps._
    underlying.deleteObjects(deleteObjectsRequest.toJava).toFuture.map(_.toScala)
  }

  override def deletePublicAccessBlock(
      deletePublicAccessBlockRequest: DeletePublicAccessBlockRequest
  ): Future[DeletePublicAccessBlockResponse] = {
    import DeletePublicAccessBlockRequestOps._
    import DeletePublicAccessBlockResponseOps._
    underlying.deletePublicAccessBlock(deletePublicAccessBlockRequest.toJava).toFuture.map(_.toScala)
  }

  override def getBucketAccelerateConfiguration(
      getBucketAccelerateConfigurationRequest: GetBucketAccelerateConfigurationRequest
  ): Future[GetBucketAccelerateConfigurationResponse] = {
    import GetBucketAccelerateConfigurationRequestOps._
    import GetBucketAccelerateConfigurationResponseOps._
    underlying.getBucketAccelerateConfiguration(getBucketAccelerateConfigurationRequest.toJava).toFuture.map(_.toScala)
  }

  override def getBucketAcl(getBucketAclRequest: GetBucketAclRequest): Future[GetBucketAclResponse] = {
    import GetBucketAclRequestOps._
    import GetBucketAclResponseOps._
    underlying.getBucketAcl(getBucketAclRequest.toJava).toFuture.map(_.toScala)
  }

  override def getBucketAnalyticsConfiguration(
      getBucketAnalyticsConfigurationRequest: GetBucketAnalyticsConfigurationRequest
  ): Future[GetBucketAnalyticsConfigurationResponse] = {
    import GetBucketAnalyticsConfigurationRequestOps._
    import GetBucketAnalyticsConfigurationResponseOps._
    underlying.getBucketAnalyticsConfiguration(getBucketAnalyticsConfigurationRequest.toJava).toFuture.map(_.toScala)
  }

  override def getBucketCors(getBucketCorsRequest: GetBucketCorsRequest): Future[GetBucketCorsResponse] = {
    import GetBucketCorsRequestOps._
    import GetBucketCorsResponseOps._
    underlying.getBucketCors(getBucketCorsRequest.toJava).toFuture.map(_.toScala)
  }

  override def getBucketEncryption(
      getBucketEncryptionRequest: GetBucketEncryptionRequest
  ): Future[GetBucketEncryptionResponse] = {
    import GetBucketEncryptionRequestOps._
    import GetBucketEncryptionResponseOps._
    underlying.getBucketEncryption(getBucketEncryptionRequest.toJava).toFuture.map(_.toScala)
  }

  override def getBucketInventoryConfiguration(
      getBucketInventoryConfigurationRequest: GetBucketInventoryConfigurationRequest
  ): Future[GetBucketInventoryConfigurationResponse] = {
    import GetBucketInventoryConfigurationRequestOps._
    import GetBucketInventoryConfigurationResponseOps._
    underlying.getBucketInventoryConfiguration(getBucketInventoryConfigurationRequest.toJava).toFuture.map(_.toScala)
  }

  override def getBucketLifecycleConfiguration(
      getBucketLifecycleConfigurationRequest: GetBucketLifecycleConfigurationRequest
  ): Future[GetBucketLifecycleConfigurationResponse] = {
    import GetBucketLifecycleConfigurationRequestOps._
    import GetBucketLifecycleConfigurationResponseOps._
    underlying.getBucketLifecycleConfiguration(getBucketLifecycleConfigurationRequest.toJava).toFuture.map(_.toScala)
  }

  override def getBucketLocation(
      getBucketLocationRequest: GetBucketLocationRequest
  ): Future[GetBucketLocationResponse] = {
    import GetBucketLocationRequestOps._
    import GetBucketLocationResponseOps._
    underlying.getBucketLocation(getBucketLocationRequest.toJava).toFuture.map(_.toScala)
  }

  override def getBucketLogging(getBucketLoggingRequest: GetBucketLoggingRequest): Future[GetBucketLoggingResponse] = {
    import GetBucketLoggingRequestOps._
    import GetBucketLoggingResponseOps._
    underlying.getBucketLogging(getBucketLoggingRequest.toJava).toFuture.map(_.toScala)
  }

  override def getBucketMetricsConfiguration(
      getBucketMetricsConfigurationRequest: GetBucketMetricsConfigurationRequest
  ): Future[GetBucketMetricsConfigurationResponse] = {
    import GetBucketMetricsConfigurationRequestOps._
    import GetBucketMetricsConfigurationResponseOps._
    underlying.getBucketMetricsConfiguration(getBucketMetricsConfigurationRequest.toJava).toFuture.map(_.toScala)
  }

  override def getBucketNotificationConfiguration(
      getBucketNotificationConfigurationRequest: GetBucketNotificationConfigurationRequest
  ): Future[GetBucketNotificationConfigurationResponse] = {
    import GetBucketNotificationConfigurationRequestOps._
    import GetBucketNotificationConfigurationResponseOps._
    underlying
      .getBucketNotificationConfiguration(getBucketNotificationConfigurationRequest.toJava).toFuture.map(_.toScala)
  }

  override def getBucketPolicy(getBucketPolicyRequest: GetBucketPolicyRequest): Future[GetBucketPolicyResponse] = {
    import GetBucketPolicyRequestOps._
    import GetBucketPolicyResponseOps._
    underlying.getBucketPolicy(getBucketPolicyRequest.toJava).toFuture.map(_.toScala)
  }

  override def getBucketPolicyStatus(
      getBucketPolicyStatusRequest: GetBucketPolicyStatusRequest
  ): Future[GetBucketPolicyStatusResponse] = {
    import GetBucketPolicyStatusRequestOps._
    import GetBucketPolicyStatusResponseOps._
    underlying.getBucketPolicyStatus(getBucketPolicyStatusRequest.toJava).toFuture.map(_.toScala)
  }

  override def getBucketReplication(
      getBucketReplicationRequest: GetBucketReplicationRequest
  ): Future[GetBucketReplicationResponse] = {
    import GetBucketReplicationRequestOps._
    import GetBucketReplicationResponseOps._
    underlying.getBucketReplication(getBucketReplicationRequest.toJava).toFuture.map(_.toScala)
  }

  override def getBucketRequestPayment(
      getBucketRequestPaymentRequest: GetBucketRequestPaymentRequest
  ): Future[GetBucketRequestPaymentResponse] = {
    import GetBucketRequestPaymentRequestOps._
    import GetBucketRequestPaymentResponseOps._
    underlying.getBucketRequestPayment(getBucketRequestPaymentRequest.toJava).toFuture.map(_.toScala)
  }

  override def getBucketTagging(getBucketTaggingRequest: GetBucketTaggingRequest): Future[GetBucketTaggingResponse] = {
    import GetBucketTaggingRequestOps._
    import GetBucketTaggingResponseOps._
    underlying.getBucketTagging(getBucketTaggingRequest.toJava).toFuture.map(_.toScala)
  }

  override def getBucketVersioning(
      getBucketVersioningRequest: GetBucketVersioningRequest
  ): Future[GetBucketVersioningResponse] = {
    import GetBucketVersioningRequestOps._
    import GetBucketVersioningResponseOps._
    underlying.getBucketVersioning(getBucketVersioningRequest.toJava).toFuture.map(_.toScala)
  }

  override def getBucketWebsite(getBucketWebsiteRequest: GetBucketWebsiteRequest): Future[GetBucketWebsiteResponse] = {
    import GetBucketWebsiteRequestOps._
    import GetBucketWebsiteResponseOps._
    underlying.getBucketWebsite(getBucketWebsiteRequest.toJava).toFuture.map(_.toScala)
  }

  override def getPublicAccessBlock(
      getPublicAccessBlockRequest: GetPublicAccessBlockRequest
  ): Future[GetPublicAccessBlockResponse] = {
    import GetPublicAccessBlockRequestOps._
    import GetPublicAccessBlockResponseOps._
    underlying.getPublicAccessBlock(getPublicAccessBlockRequest.toJava).toFuture.map(_.toScala)
  }

  override def headBucket(headBucketRequest: HeadBucketRequest): Future[HeadBucketResponse] = {
    import HeadBucketRequestOps._
    import HeadBucketResponseOps._
    underlying.headBucket(headBucketRequest.toJava).toFuture.map(_.toScala)
  }

  override def headObject(headObjectRequest: HeadObjectRequest): Future[HeadObjectResponse] = {
    import HeadObjectRequestOps._
    import HeadObjectResponseOps._
    underlying.headObject(headObjectRequest.toJava).toFuture.map(_.toScala)
  }

  override def listBucketAnalyticsConfigurations(
      listBucketAnalyticsConfigurationsRequest: ListBucketAnalyticsConfigurationsRequest
  ): Future[ListBucketAnalyticsConfigurationsResponse] = {
    import ListBucketAnalyticsConfigurationsRequestOps._
    import ListBucketAnalyticsConfigurationsResponseOps._
    underlying
      .listBucketAnalyticsConfigurations(listBucketAnalyticsConfigurationsRequest.toJava).toFuture.map(_.toScala)
  }

  override def listBucketInventoryConfigurations(
      listBucketInventoryConfigurationsRequest: ListBucketInventoryConfigurationsRequest
  ): Future[ListBucketInventoryConfigurationsResponse] = {
    import ListBucketInventoryConfigurationsRequestOps._
    import ListBucketInventoryConfigurationsResponseOps._
    underlying
      .listBucketInventoryConfigurations(listBucketInventoryConfigurationsRequest.toJava).toFuture.map(_.toScala)
  }

  override def listBucketMetricsConfigurations(
      listBucketMetricsConfigurationsRequest: ListBucketMetricsConfigurationsRequest
  ): Future[ListBucketMetricsConfigurationsResponse] = {
    import ListBucketMetricsConfigurationsRequestOps._
    import ListBucketMetricsConfigurationsResponseOps._
    underlying.listBucketMetricsConfigurations(listBucketMetricsConfigurationsRequest.toJava).toFuture.map(_.toScala)
  }

  override def listBuckets(listBucketsRequest: ListBucketsRequest): Future[ListBucketsResponse] = {
    import ListBucketsRequestOps._
    import ListBucketsResponseOps._
    underlying.listBuckets(listBucketsRequest.toJava).toFuture.map(_.toScala)
  }

  override def listBuckets(): Future[ListBucketsResponse] = {

    import ListBucketsResponseOps._
    underlying.listBuckets().toFuture.map(_.toScala)
  }

  override def listMultipartUploads(
      listMultipartUploadsRequest: ListMultipartUploadsRequest
  ): Future[ListMultipartUploadsResponse] = {
    import ListMultipartUploadsRequestOps._
    import ListMultipartUploadsResponseOps._
    underlying.listMultipartUploads(listMultipartUploadsRequest.toJava).toFuture.map(_.toScala)
  }

  def listMultipartUploadsPaginator(
      listMultipartUploadsRequest: ListMultipartUploadsRequest
  ): ListMultipartUploadsPublisher = {
    import ListMultipartUploadsRequestOps._
    new ListMultipartUploadsPublisherImpl(underlying.listMultipartUploadsPaginator(listMultipartUploadsRequest.toJava))
  }

  override def listObjectVersions(
      listObjectVersionsRequest: ListObjectVersionsRequest
  ): Future[ListObjectVersionsResponse] = {
    import ListObjectVersionsRequestOps._
    import ListObjectVersionsResponseOps._
    underlying.listObjectVersions(listObjectVersionsRequest.toJava).toFuture.map(_.toScala)
  }

  def listObjectVersionsPaginator(listObjectVersionsRequest: ListObjectVersionsRequest): ListObjectVersionsPublisher = {
    import ListObjectVersionsRequestOps._
    new ListObjectVersionsPublisherImpl(underlying.listObjectVersionsPaginator(listObjectVersionsRequest.toJava))
  }

  override def listObjects(listObjectsRequest: ListObjectsRequest): Future[ListObjectsResponse] = {
    import ListObjectsRequestOps._
    import ListObjectsResponseOps._
    underlying.listObjects(listObjectsRequest.toJava).toFuture.map(_.toScala)
  }

  override def listObjectsV2(listObjectsV2Request: ListObjectsV2Request): Future[ListObjectsV2Response] = {
    import ListObjectsV2RequestOps._
    import ListObjectsV2ResponseOps._
    underlying.listObjectsV2(listObjectsV2Request.toJava).toFuture.map(_.toScala)
  }

  def listObjectsV2Paginator(listObjectsV2Request: ListObjectsV2Request): ListObjectsV2Publisher = {
    import ListObjectsV2RequestOps._
    new ListObjectsV2PublisherImpl(underlying.listObjectsV2Paginator(listObjectsV2Request.toJava))
  }

  override def listParts(listPartsRequest: ListPartsRequest): Future[ListPartsResponse] = {
    import ListPartsRequestOps._
    import ListPartsResponseOps._
    underlying.listParts(listPartsRequest.toJava).toFuture.map(_.toScala)
  }

  def listPartsPaginator(listPartsRequest: ListPartsRequest): ListPartsPublisher = {
    import ListPartsRequestOps._
    new ListPartsPublisherImpl(underlying.listPartsPaginator(listPartsRequest.toJava))
  }

  override def putBucketAccelerateConfiguration(
      putBucketAccelerateConfigurationRequest: PutBucketAccelerateConfigurationRequest
  ): Future[PutBucketAccelerateConfigurationResponse] = {
    import PutBucketAccelerateConfigurationRequestOps._
    import PutBucketAccelerateConfigurationResponseOps._
    underlying.putBucketAccelerateConfiguration(putBucketAccelerateConfigurationRequest.toJava).toFuture.map(_.toScala)
  }

  override def putBucketAcl(putBucketAclRequest: PutBucketAclRequest): Future[PutBucketAclResponse] = {
    import PutBucketAclRequestOps._
    import PutBucketAclResponseOps._
    underlying.putBucketAcl(putBucketAclRequest.toJava).toFuture.map(_.toScala)
  }

  override def putBucketAnalyticsConfiguration(
      putBucketAnalyticsConfigurationRequest: PutBucketAnalyticsConfigurationRequest
  ): Future[PutBucketAnalyticsConfigurationResponse] = {
    import PutBucketAnalyticsConfigurationRequestOps._
    import PutBucketAnalyticsConfigurationResponseOps._
    underlying.putBucketAnalyticsConfiguration(putBucketAnalyticsConfigurationRequest.toJava).toFuture.map(_.toScala)
  }

  override def putBucketCors(putBucketCorsRequest: PutBucketCorsRequest): Future[PutBucketCorsResponse] = {
    import PutBucketCorsRequestOps._
    import PutBucketCorsResponseOps._
    underlying.putBucketCors(putBucketCorsRequest.toJava).toFuture.map(_.toScala)
  }

  override def putBucketEncryption(
      putBucketEncryptionRequest: PutBucketEncryptionRequest
  ): Future[PutBucketEncryptionResponse] = {
    import PutBucketEncryptionRequestOps._
    import PutBucketEncryptionResponseOps._
    underlying.putBucketEncryption(putBucketEncryptionRequest.toJava).toFuture.map(_.toScala)
  }

  override def putBucketInventoryConfiguration(
      putBucketInventoryConfigurationRequest: PutBucketInventoryConfigurationRequest
  ): Future[PutBucketInventoryConfigurationResponse] = {
    import PutBucketInventoryConfigurationRequestOps._
    import PutBucketInventoryConfigurationResponseOps._
    underlying.putBucketInventoryConfiguration(putBucketInventoryConfigurationRequest.toJava).toFuture.map(_.toScala)
  }

  override def putBucketLifecycleConfiguration(
      putBucketLifecycleConfigurationRequest: PutBucketLifecycleConfigurationRequest
  ): Future[PutBucketLifecycleConfigurationResponse] = {
    import PutBucketLifecycleConfigurationRequestOps._
    import PutBucketLifecycleConfigurationResponseOps._
    underlying.putBucketLifecycleConfiguration(putBucketLifecycleConfigurationRequest.toJava).toFuture.map(_.toScala)
  }

  override def putBucketLogging(putBucketLoggingRequest: PutBucketLoggingRequest): Future[PutBucketLoggingResponse] = {
    import PutBucketLoggingRequestOps._
    import PutBucketLoggingResponseOps._
    underlying.putBucketLogging(putBucketLoggingRequest.toJava).toFuture.map(_.toScala)
  }

  override def putBucketMetricsConfiguration(
      putBucketMetricsConfigurationRequest: PutBucketMetricsConfigurationRequest
  ): Future[PutBucketMetricsConfigurationResponse] = {
    import PutBucketMetricsConfigurationRequestOps._
    import PutBucketMetricsConfigurationResponseOps._
    underlying.putBucketMetricsConfiguration(putBucketMetricsConfigurationRequest.toJava).toFuture.map(_.toScala)
  }

  override def putBucketNotificationConfiguration(
      putBucketNotificationConfigurationRequest: PutBucketNotificationConfigurationRequest
  ): Future[PutBucketNotificationConfigurationResponse] = {
    import PutBucketNotificationConfigurationRequestOps._
    import PutBucketNotificationConfigurationResponseOps._
    underlying
      .putBucketNotificationConfiguration(putBucketNotificationConfigurationRequest.toJava).toFuture.map(_.toScala)
  }

  override def putBucketPolicy(putBucketPolicyRequest: PutBucketPolicyRequest): Future[PutBucketPolicyResponse] = {
    import PutBucketPolicyRequestOps._
    import PutBucketPolicyResponseOps._
    underlying.putBucketPolicy(putBucketPolicyRequest.toJava).toFuture.map(_.toScala)
  }

  override def putBucketReplication(
      putBucketReplicationRequest: PutBucketReplicationRequest
  ): Future[PutBucketReplicationResponse] = {
    import PutBucketReplicationRequestOps._
    import PutBucketReplicationResponseOps._
    underlying.putBucketReplication(putBucketReplicationRequest.toJava).toFuture.map(_.toScala)
  }

  override def putBucketRequestPayment(
      putBucketRequestPaymentRequest: PutBucketRequestPaymentRequest
  ): Future[PutBucketRequestPaymentResponse] = {
    import PutBucketRequestPaymentRequestOps._
    import PutBucketRequestPaymentResponseOps._
    underlying.putBucketRequestPayment(putBucketRequestPaymentRequest.toJava).toFuture.map(_.toScala)
  }

  override def putBucketTagging(putBucketTaggingRequest: PutBucketTaggingRequest): Future[PutBucketTaggingResponse] = {
    import PutBucketTaggingRequestOps._
    import PutBucketTaggingResponseOps._
    underlying.putBucketTagging(putBucketTaggingRequest.toJava).toFuture.map(_.toScala)
  }

  override def putBucketVersioning(
      putBucketVersioningRequest: PutBucketVersioningRequest
  ): Future[PutBucketVersioningResponse] = {
    import PutBucketVersioningRequestOps._
    import PutBucketVersioningResponseOps._
    underlying.putBucketVersioning(putBucketVersioningRequest.toJava).toFuture.map(_.toScala)
  }

  override def putBucketWebsite(putBucketWebsiteRequest: PutBucketWebsiteRequest): Future[PutBucketWebsiteResponse] = {
    import PutBucketWebsiteRequestOps._
    import PutBucketWebsiteResponseOps._
    underlying.putBucketWebsite(putBucketWebsiteRequest.toJava).toFuture.map(_.toScala)
  }

  override def putObjectAcl(putObjectAclRequest: PutObjectAclRequest): Future[PutObjectAclResponse] = {
    import PutObjectAclRequestOps._
    import PutObjectAclResponseOps._
    underlying.putObjectAcl(putObjectAclRequest.toJava).toFuture.map(_.toScala)
  }

  override def putObjectLegalHold(
      putObjectLegalHoldRequest: PutObjectLegalHoldRequest
  ): Future[PutObjectLegalHoldResponse] = {
    import PutObjectLegalHoldRequestOps._
    import PutObjectLegalHoldResponseOps._
    underlying.putObjectLegalHold(putObjectLegalHoldRequest.toJava).toFuture.map(_.toScala)
  }

  override def putObjectLockConfiguration(
      putObjectLockConfigurationRequest: PutObjectLockConfigurationRequest
  ): Future[PutObjectLockConfigurationResponse] = {
    import PutObjectLockConfigurationRequestOps._
    import PutObjectLockConfigurationResponseOps._
    underlying.putObjectLockConfiguration(putObjectLockConfigurationRequest.toJava).toFuture.map(_.toScala)
  }

  override def putObjectRetention(
      putObjectRetentionRequest: PutObjectRetentionRequest
  ): Future[PutObjectRetentionResponse] = {
    import PutObjectRetentionRequestOps._
    import PutObjectRetentionResponseOps._
    underlying.putObjectRetention(putObjectRetentionRequest.toJava).toFuture.map(_.toScala)
  }

  override def putObjectTagging(putObjectTaggingRequest: PutObjectTaggingRequest): Future[PutObjectTaggingResponse] = {
    import PutObjectTaggingRequestOps._
    import PutObjectTaggingResponseOps._
    underlying.putObjectTagging(putObjectTaggingRequest.toJava).toFuture.map(_.toScala)
  }

  override def putPublicAccessBlock(
      putPublicAccessBlockRequest: PutPublicAccessBlockRequest
  ): Future[PutPublicAccessBlockResponse] = {
    import PutPublicAccessBlockRequestOps._
    import PutPublicAccessBlockResponseOps._
    underlying.putPublicAccessBlock(putPublicAccessBlockRequest.toJava).toFuture.map(_.toScala)
  }

  override def restoreObject(restoreObjectRequest: RestoreObjectRequest): Future[RestoreObjectResponse] = {
    import RestoreObjectRequestOps._
    import RestoreObjectResponseOps._
    underlying.restoreObject(restoreObjectRequest.toJava).toFuture.map(_.toScala)
  }

  override def uploadPartCopy(uploadPartCopyRequest: UploadPartCopyRequest): Future[UploadPartCopyResponse] = {
    import UploadPartCopyRequestOps._
    import UploadPartCopyResponseOps._
    underlying.uploadPartCopy(uploadPartCopyRequest.toJava).toFuture.map(_.toScala)
  }

}
