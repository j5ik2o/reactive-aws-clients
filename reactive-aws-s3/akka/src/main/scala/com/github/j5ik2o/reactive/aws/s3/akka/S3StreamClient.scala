// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.s3.S3AsyncClient
import software.amazon.awssdk.services.s3.model._

object S3StreamClient {

  def apply(underlying: S3AsyncClient): S3StreamClient = new S3StreamClientImpl(underlying)

  val DefaultParallelism: Int = 1

}

trait S3StreamClient extends S3StreamClientSupport {

  import S3StreamClient._

  val underlying: S3AsyncClient

  def abortMultipartUploadSource(abortMultipartUploadRequest: AbortMultipartUploadRequest,
                                 parallelism: Int = DefaultParallelism): Source[AbortMultipartUploadResponse, NotUsed] =
    Source.single(abortMultipartUploadRequest).via(abortMultipartUploadFlow(parallelism))

  def abortMultipartUploadFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[AbortMultipartUploadRequest, AbortMultipartUploadResponse, NotUsed] =
    Flow[AbortMultipartUploadRequest].mapAsync(parallelism)(underlying.abortMultipartUpload)

  def completeMultipartUploadSource(
      completeMultipartUploadRequest: CompleteMultipartUploadRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CompleteMultipartUploadResponse, NotUsed] =
    Source.single(completeMultipartUploadRequest).via(completeMultipartUploadFlow(parallelism))

  def completeMultipartUploadFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CompleteMultipartUploadRequest, CompleteMultipartUploadResponse, NotUsed] =
    Flow[CompleteMultipartUploadRequest].mapAsync(parallelism)(underlying.completeMultipartUpload)

  def copyObjectSource(copyObjectRequest: CopyObjectRequest,
                       parallelism: Int = DefaultParallelism): Source[CopyObjectResponse, NotUsed] =
    Source.single(copyObjectRequest).via(copyObjectFlow(parallelism))

  def copyObjectFlow(parallelism: Int = DefaultParallelism): Flow[CopyObjectRequest, CopyObjectResponse, NotUsed] =
    Flow[CopyObjectRequest].mapAsync(parallelism)(underlying.copyObject)

  def createBucketSource(createBucketRequest: CreateBucketRequest,
                         parallelism: Int = DefaultParallelism): Source[CreateBucketResponse, NotUsed] =
    Source.single(createBucketRequest).via(createBucketFlow(parallelism))

  def createBucketFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateBucketRequest, CreateBucketResponse, NotUsed] =
    Flow[CreateBucketRequest].mapAsync(parallelism)(underlying.createBucket)

  def createMultipartUploadSource(
      createMultipartUploadRequest: CreateMultipartUploadRequest,
      parallelism: Int = DefaultParallelism
  ): Source[CreateMultipartUploadResponse, NotUsed] =
    Source.single(createMultipartUploadRequest).via(createMultipartUploadFlow(parallelism))

  def createMultipartUploadFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateMultipartUploadRequest, CreateMultipartUploadResponse, NotUsed] =
    Flow[CreateMultipartUploadRequest].mapAsync(parallelism)(underlying.createMultipartUpload)

  def deleteBucketSource(deleteBucketRequest: DeleteBucketRequest,
                         parallelism: Int = DefaultParallelism): Source[DeleteBucketResponse, NotUsed] =
    Source.single(deleteBucketRequest).via(deleteBucketFlow(parallelism))

  def deleteBucketFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteBucketRequest, DeleteBucketResponse, NotUsed] =
    Flow[DeleteBucketRequest].mapAsync(parallelism)(underlying.deleteBucket)

  def deleteBucketAnalyticsConfigurationSource(
      deleteBucketAnalyticsConfigurationRequest: DeleteBucketAnalyticsConfigurationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteBucketAnalyticsConfigurationResponse, NotUsed] =
    Source.single(deleteBucketAnalyticsConfigurationRequest).via(deleteBucketAnalyticsConfigurationFlow(parallelism))

  def deleteBucketAnalyticsConfigurationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteBucketAnalyticsConfigurationRequest, DeleteBucketAnalyticsConfigurationResponse, NotUsed] =
    Flow[DeleteBucketAnalyticsConfigurationRequest].mapAsync(parallelism)(underlying.deleteBucketAnalyticsConfiguration)

  def deleteBucketCorsSource(deleteBucketCorsRequest: DeleteBucketCorsRequest,
                             parallelism: Int = DefaultParallelism): Source[DeleteBucketCorsResponse, NotUsed] =
    Source.single(deleteBucketCorsRequest).via(deleteBucketCorsFlow(parallelism))

  def deleteBucketCorsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteBucketCorsRequest, DeleteBucketCorsResponse, NotUsed] =
    Flow[DeleteBucketCorsRequest].mapAsync(parallelism)(underlying.deleteBucketCors)

  def deleteBucketEncryptionSource(
      deleteBucketEncryptionRequest: DeleteBucketEncryptionRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteBucketEncryptionResponse, NotUsed] =
    Source.single(deleteBucketEncryptionRequest).via(deleteBucketEncryptionFlow(parallelism))

  def deleteBucketEncryptionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteBucketEncryptionRequest, DeleteBucketEncryptionResponse, NotUsed] =
    Flow[DeleteBucketEncryptionRequest].mapAsync(parallelism)(underlying.deleteBucketEncryption)

  def deleteBucketInventoryConfigurationSource(
      deleteBucketInventoryConfigurationRequest: DeleteBucketInventoryConfigurationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteBucketInventoryConfigurationResponse, NotUsed] =
    Source.single(deleteBucketInventoryConfigurationRequest).via(deleteBucketInventoryConfigurationFlow(parallelism))

  def deleteBucketInventoryConfigurationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteBucketInventoryConfigurationRequest, DeleteBucketInventoryConfigurationResponse, NotUsed] =
    Flow[DeleteBucketInventoryConfigurationRequest].mapAsync(parallelism)(underlying.deleteBucketInventoryConfiguration)

  def deleteBucketLifecycleSource(
      deleteBucketLifecycleRequest: DeleteBucketLifecycleRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteBucketLifecycleResponse, NotUsed] =
    Source.single(deleteBucketLifecycleRequest).via(deleteBucketLifecycleFlow(parallelism))

  def deleteBucketLifecycleFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteBucketLifecycleRequest, DeleteBucketLifecycleResponse, NotUsed] =
    Flow[DeleteBucketLifecycleRequest].mapAsync(parallelism)(underlying.deleteBucketLifecycle)

  def deleteBucketMetricsConfigurationSource(
      deleteBucketMetricsConfigurationRequest: DeleteBucketMetricsConfigurationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteBucketMetricsConfigurationResponse, NotUsed] =
    Source.single(deleteBucketMetricsConfigurationRequest).via(deleteBucketMetricsConfigurationFlow(parallelism))

  def deleteBucketMetricsConfigurationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteBucketMetricsConfigurationRequest, DeleteBucketMetricsConfigurationResponse, NotUsed] =
    Flow[DeleteBucketMetricsConfigurationRequest].mapAsync(parallelism)(underlying.deleteBucketMetricsConfiguration)

  def deleteBucketPolicySource(deleteBucketPolicyRequest: DeleteBucketPolicyRequest,
                               parallelism: Int = DefaultParallelism): Source[DeleteBucketPolicyResponse, NotUsed] =
    Source.single(deleteBucketPolicyRequest).via(deleteBucketPolicyFlow(parallelism))

  def deleteBucketPolicyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteBucketPolicyRequest, DeleteBucketPolicyResponse, NotUsed] =
    Flow[DeleteBucketPolicyRequest].mapAsync(parallelism)(underlying.deleteBucketPolicy)

  def deleteBucketReplicationSource(
      deleteBucketReplicationRequest: DeleteBucketReplicationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteBucketReplicationResponse, NotUsed] =
    Source.single(deleteBucketReplicationRequest).via(deleteBucketReplicationFlow(parallelism))

  def deleteBucketReplicationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteBucketReplicationRequest, DeleteBucketReplicationResponse, NotUsed] =
    Flow[DeleteBucketReplicationRequest].mapAsync(parallelism)(underlying.deleteBucketReplication)

  def deleteBucketTaggingSource(deleteBucketTaggingRequest: DeleteBucketTaggingRequest,
                                parallelism: Int = DefaultParallelism): Source[DeleteBucketTaggingResponse, NotUsed] =
    Source.single(deleteBucketTaggingRequest).via(deleteBucketTaggingFlow(parallelism))

  def deleteBucketTaggingFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteBucketTaggingRequest, DeleteBucketTaggingResponse, NotUsed] =
    Flow[DeleteBucketTaggingRequest].mapAsync(parallelism)(underlying.deleteBucketTagging)

  def deleteBucketWebsiteSource(deleteBucketWebsiteRequest: DeleteBucketWebsiteRequest,
                                parallelism: Int = DefaultParallelism): Source[DeleteBucketWebsiteResponse, NotUsed] =
    Source.single(deleteBucketWebsiteRequest).via(deleteBucketWebsiteFlow(parallelism))

  def deleteBucketWebsiteFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteBucketWebsiteRequest, DeleteBucketWebsiteResponse, NotUsed] =
    Flow[DeleteBucketWebsiteRequest].mapAsync(parallelism)(underlying.deleteBucketWebsite)

  def deleteObjectSource(deleteObjectRequest: DeleteObjectRequest,
                         parallelism: Int = DefaultParallelism): Source[DeleteObjectResponse, NotUsed] =
    Source.single(deleteObjectRequest).via(deleteObjectFlow(parallelism))

  def deleteObjectFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteObjectRequest, DeleteObjectResponse, NotUsed] =
    Flow[DeleteObjectRequest].mapAsync(parallelism)(underlying.deleteObject)

  def deleteObjectTaggingSource(deleteObjectTaggingRequest: DeleteObjectTaggingRequest,
                                parallelism: Int = DefaultParallelism): Source[DeleteObjectTaggingResponse, NotUsed] =
    Source.single(deleteObjectTaggingRequest).via(deleteObjectTaggingFlow(parallelism))

  def deleteObjectTaggingFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteObjectTaggingRequest, DeleteObjectTaggingResponse, NotUsed] =
    Flow[DeleteObjectTaggingRequest].mapAsync(parallelism)(underlying.deleteObjectTagging)

  def deleteObjectsSource(deleteObjectsRequest: DeleteObjectsRequest,
                          parallelism: Int = DefaultParallelism): Source[DeleteObjectsResponse, NotUsed] =
    Source.single(deleteObjectsRequest).via(deleteObjectsFlow(parallelism))

  def deleteObjectsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteObjectsRequest, DeleteObjectsResponse, NotUsed] =
    Flow[DeleteObjectsRequest].mapAsync(parallelism)(underlying.deleteObjects)

  def deletePublicAccessBlockSource(
      deletePublicAccessBlockRequest: DeletePublicAccessBlockRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeletePublicAccessBlockResponse, NotUsed] =
    Source.single(deletePublicAccessBlockRequest).via(deletePublicAccessBlockFlow(parallelism))

  def deletePublicAccessBlockFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeletePublicAccessBlockRequest, DeletePublicAccessBlockResponse, NotUsed] =
    Flow[DeletePublicAccessBlockRequest].mapAsync(parallelism)(underlying.deletePublicAccessBlock)

  def getBucketAccelerateConfigurationSource(
      getBucketAccelerateConfigurationRequest: GetBucketAccelerateConfigurationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetBucketAccelerateConfigurationResponse, NotUsed] =
    Source.single(getBucketAccelerateConfigurationRequest).via(getBucketAccelerateConfigurationFlow(parallelism))

  def getBucketAccelerateConfigurationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetBucketAccelerateConfigurationRequest, GetBucketAccelerateConfigurationResponse, NotUsed] =
    Flow[GetBucketAccelerateConfigurationRequest].mapAsync(parallelism)(underlying.getBucketAccelerateConfiguration)

  def getBucketAclSource(getBucketAclRequest: GetBucketAclRequest,
                         parallelism: Int = DefaultParallelism): Source[GetBucketAclResponse, NotUsed] =
    Source.single(getBucketAclRequest).via(getBucketAclFlow(parallelism))

  def getBucketAclFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetBucketAclRequest, GetBucketAclResponse, NotUsed] =
    Flow[GetBucketAclRequest].mapAsync(parallelism)(underlying.getBucketAcl)

  def getBucketAnalyticsConfigurationSource(
      getBucketAnalyticsConfigurationRequest: GetBucketAnalyticsConfigurationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetBucketAnalyticsConfigurationResponse, NotUsed] =
    Source.single(getBucketAnalyticsConfigurationRequest).via(getBucketAnalyticsConfigurationFlow(parallelism))

  def getBucketAnalyticsConfigurationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetBucketAnalyticsConfigurationRequest, GetBucketAnalyticsConfigurationResponse, NotUsed] =
    Flow[GetBucketAnalyticsConfigurationRequest].mapAsync(parallelism)(underlying.getBucketAnalyticsConfiguration)

  def getBucketCorsSource(getBucketCorsRequest: GetBucketCorsRequest,
                          parallelism: Int = DefaultParallelism): Source[GetBucketCorsResponse, NotUsed] =
    Source.single(getBucketCorsRequest).via(getBucketCorsFlow(parallelism))

  def getBucketCorsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetBucketCorsRequest, GetBucketCorsResponse, NotUsed] =
    Flow[GetBucketCorsRequest].mapAsync(parallelism)(underlying.getBucketCors)

  def getBucketEncryptionSource(getBucketEncryptionRequest: GetBucketEncryptionRequest,
                                parallelism: Int = DefaultParallelism): Source[GetBucketEncryptionResponse, NotUsed] =
    Source.single(getBucketEncryptionRequest).via(getBucketEncryptionFlow(parallelism))

  def getBucketEncryptionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetBucketEncryptionRequest, GetBucketEncryptionResponse, NotUsed] =
    Flow[GetBucketEncryptionRequest].mapAsync(parallelism)(underlying.getBucketEncryption)

  def getBucketInventoryConfigurationSource(
      getBucketInventoryConfigurationRequest: GetBucketInventoryConfigurationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetBucketInventoryConfigurationResponse, NotUsed] =
    Source.single(getBucketInventoryConfigurationRequest).via(getBucketInventoryConfigurationFlow(parallelism))

  def getBucketInventoryConfigurationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetBucketInventoryConfigurationRequest, GetBucketInventoryConfigurationResponse, NotUsed] =
    Flow[GetBucketInventoryConfigurationRequest].mapAsync(parallelism)(underlying.getBucketInventoryConfiguration)

  def getBucketLifecycleConfigurationSource(
      getBucketLifecycleConfigurationRequest: GetBucketLifecycleConfigurationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetBucketLifecycleConfigurationResponse, NotUsed] =
    Source.single(getBucketLifecycleConfigurationRequest).via(getBucketLifecycleConfigurationFlow(parallelism))

  def getBucketLifecycleConfigurationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetBucketLifecycleConfigurationRequest, GetBucketLifecycleConfigurationResponse, NotUsed] =
    Flow[GetBucketLifecycleConfigurationRequest].mapAsync(parallelism)(underlying.getBucketLifecycleConfiguration)

  def getBucketLocationSource(getBucketLocationRequest: GetBucketLocationRequest,
                              parallelism: Int = DefaultParallelism): Source[GetBucketLocationResponse, NotUsed] =
    Source.single(getBucketLocationRequest).via(getBucketLocationFlow(parallelism))

  def getBucketLocationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetBucketLocationRequest, GetBucketLocationResponse, NotUsed] =
    Flow[GetBucketLocationRequest].mapAsync(parallelism)(underlying.getBucketLocation)

  def getBucketLoggingSource(getBucketLoggingRequest: GetBucketLoggingRequest,
                             parallelism: Int = DefaultParallelism): Source[GetBucketLoggingResponse, NotUsed] =
    Source.single(getBucketLoggingRequest).via(getBucketLoggingFlow(parallelism))

  def getBucketLoggingFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetBucketLoggingRequest, GetBucketLoggingResponse, NotUsed] =
    Flow[GetBucketLoggingRequest].mapAsync(parallelism)(underlying.getBucketLogging)

  def getBucketMetricsConfigurationSource(
      getBucketMetricsConfigurationRequest: GetBucketMetricsConfigurationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetBucketMetricsConfigurationResponse, NotUsed] =
    Source.single(getBucketMetricsConfigurationRequest).via(getBucketMetricsConfigurationFlow(parallelism))

  def getBucketMetricsConfigurationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetBucketMetricsConfigurationRequest, GetBucketMetricsConfigurationResponse, NotUsed] =
    Flow[GetBucketMetricsConfigurationRequest].mapAsync(parallelism)(underlying.getBucketMetricsConfiguration)

  def getBucketNotificationConfigurationSource(
      getBucketNotificationConfigurationRequest: GetBucketNotificationConfigurationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetBucketNotificationConfigurationResponse, NotUsed] =
    Source.single(getBucketNotificationConfigurationRequest).via(getBucketNotificationConfigurationFlow(parallelism))

  def getBucketNotificationConfigurationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetBucketNotificationConfigurationRequest, GetBucketNotificationConfigurationResponse, NotUsed] =
    Flow[GetBucketNotificationConfigurationRequest].mapAsync(parallelism)(underlying.getBucketNotificationConfiguration)

  def getBucketPolicySource(getBucketPolicyRequest: GetBucketPolicyRequest,
                            parallelism: Int = DefaultParallelism): Source[GetBucketPolicyResponse, NotUsed] =
    Source.single(getBucketPolicyRequest).via(getBucketPolicyFlow(parallelism))

  def getBucketPolicyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetBucketPolicyRequest, GetBucketPolicyResponse, NotUsed] =
    Flow[GetBucketPolicyRequest].mapAsync(parallelism)(underlying.getBucketPolicy)

  def getBucketPolicyStatusSource(
      getBucketPolicyStatusRequest: GetBucketPolicyStatusRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetBucketPolicyStatusResponse, NotUsed] =
    Source.single(getBucketPolicyStatusRequest).via(getBucketPolicyStatusFlow(parallelism))

  def getBucketPolicyStatusFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetBucketPolicyStatusRequest, GetBucketPolicyStatusResponse, NotUsed] =
    Flow[GetBucketPolicyStatusRequest].mapAsync(parallelism)(underlying.getBucketPolicyStatus)

  def getBucketReplicationSource(getBucketReplicationRequest: GetBucketReplicationRequest,
                                 parallelism: Int = DefaultParallelism): Source[GetBucketReplicationResponse, NotUsed] =
    Source.single(getBucketReplicationRequest).via(getBucketReplicationFlow(parallelism))

  def getBucketReplicationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetBucketReplicationRequest, GetBucketReplicationResponse, NotUsed] =
    Flow[GetBucketReplicationRequest].mapAsync(parallelism)(underlying.getBucketReplication)

  def getBucketRequestPaymentSource(
      getBucketRequestPaymentRequest: GetBucketRequestPaymentRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetBucketRequestPaymentResponse, NotUsed] =
    Source.single(getBucketRequestPaymentRequest).via(getBucketRequestPaymentFlow(parallelism))

  def getBucketRequestPaymentFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetBucketRequestPaymentRequest, GetBucketRequestPaymentResponse, NotUsed] =
    Flow[GetBucketRequestPaymentRequest].mapAsync(parallelism)(underlying.getBucketRequestPayment)

  def getBucketTaggingSource(getBucketTaggingRequest: GetBucketTaggingRequest,
                             parallelism: Int = DefaultParallelism): Source[GetBucketTaggingResponse, NotUsed] =
    Source.single(getBucketTaggingRequest).via(getBucketTaggingFlow(parallelism))

  def getBucketTaggingFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetBucketTaggingRequest, GetBucketTaggingResponse, NotUsed] =
    Flow[GetBucketTaggingRequest].mapAsync(parallelism)(underlying.getBucketTagging)

  def getBucketVersioningSource(getBucketVersioningRequest: GetBucketVersioningRequest,
                                parallelism: Int = DefaultParallelism): Source[GetBucketVersioningResponse, NotUsed] =
    Source.single(getBucketVersioningRequest).via(getBucketVersioningFlow(parallelism))

  def getBucketVersioningFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetBucketVersioningRequest, GetBucketVersioningResponse, NotUsed] =
    Flow[GetBucketVersioningRequest].mapAsync(parallelism)(underlying.getBucketVersioning)

  def getBucketWebsiteSource(getBucketWebsiteRequest: GetBucketWebsiteRequest,
                             parallelism: Int = DefaultParallelism): Source[GetBucketWebsiteResponse, NotUsed] =
    Source.single(getBucketWebsiteRequest).via(getBucketWebsiteFlow(parallelism))

  def getBucketWebsiteFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetBucketWebsiteRequest, GetBucketWebsiteResponse, NotUsed] =
    Flow[GetBucketWebsiteRequest].mapAsync(parallelism)(underlying.getBucketWebsite)

  def getObjectAclSource(getObjectAclRequest: GetObjectAclRequest,
                         parallelism: Int = DefaultParallelism): Source[GetObjectAclResponse, NotUsed] =
    Source.single(getObjectAclRequest).via(getObjectAclFlow(parallelism))

  def getObjectAclFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetObjectAclRequest, GetObjectAclResponse, NotUsed] =
    Flow[GetObjectAclRequest].mapAsync(parallelism)(underlying.getObjectAcl)

  def getObjectLegalHoldSource(getObjectLegalHoldRequest: GetObjectLegalHoldRequest,
                               parallelism: Int = DefaultParallelism): Source[GetObjectLegalHoldResponse, NotUsed] =
    Source.single(getObjectLegalHoldRequest).via(getObjectLegalHoldFlow(parallelism))

  def getObjectLegalHoldFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetObjectLegalHoldRequest, GetObjectLegalHoldResponse, NotUsed] =
    Flow[GetObjectLegalHoldRequest].mapAsync(parallelism)(underlying.getObjectLegalHold)

  def getObjectLockConfigurationSource(
      getObjectLockConfigurationRequest: GetObjectLockConfigurationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetObjectLockConfigurationResponse, NotUsed] =
    Source.single(getObjectLockConfigurationRequest).via(getObjectLockConfigurationFlow(parallelism))

  def getObjectLockConfigurationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetObjectLockConfigurationRequest, GetObjectLockConfigurationResponse, NotUsed] =
    Flow[GetObjectLockConfigurationRequest].mapAsync(parallelism)(underlying.getObjectLockConfiguration)

  def getObjectRetentionSource(getObjectRetentionRequest: GetObjectRetentionRequest,
                               parallelism: Int = DefaultParallelism): Source[GetObjectRetentionResponse, NotUsed] =
    Source.single(getObjectRetentionRequest).via(getObjectRetentionFlow(parallelism))

  def getObjectRetentionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetObjectRetentionRequest, GetObjectRetentionResponse, NotUsed] =
    Flow[GetObjectRetentionRequest].mapAsync(parallelism)(underlying.getObjectRetention)

  def getObjectTaggingSource(getObjectTaggingRequest: GetObjectTaggingRequest,
                             parallelism: Int = DefaultParallelism): Source[GetObjectTaggingResponse, NotUsed] =
    Source.single(getObjectTaggingRequest).via(getObjectTaggingFlow(parallelism))

  def getObjectTaggingFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetObjectTaggingRequest, GetObjectTaggingResponse, NotUsed] =
    Flow[GetObjectTaggingRequest].mapAsync(parallelism)(underlying.getObjectTagging)

  def getPublicAccessBlockSource(getPublicAccessBlockRequest: GetPublicAccessBlockRequest,
                                 parallelism: Int = DefaultParallelism): Source[GetPublicAccessBlockResponse, NotUsed] =
    Source.single(getPublicAccessBlockRequest).via(getPublicAccessBlockFlow(parallelism))

  def getPublicAccessBlockFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetPublicAccessBlockRequest, GetPublicAccessBlockResponse, NotUsed] =
    Flow[GetPublicAccessBlockRequest].mapAsync(parallelism)(underlying.getPublicAccessBlock)

  def headBucketSource(headBucketRequest: HeadBucketRequest,
                       parallelism: Int = DefaultParallelism): Source[HeadBucketResponse, NotUsed] =
    Source.single(headBucketRequest).via(headBucketFlow(parallelism))

  def headBucketFlow(parallelism: Int = DefaultParallelism): Flow[HeadBucketRequest, HeadBucketResponse, NotUsed] =
    Flow[HeadBucketRequest].mapAsync(parallelism)(underlying.headBucket)

  def headObjectSource(headObjectRequest: HeadObjectRequest,
                       parallelism: Int = DefaultParallelism): Source[HeadObjectResponse, NotUsed] =
    Source.single(headObjectRequest).via(headObjectFlow(parallelism))

  def headObjectFlow(parallelism: Int = DefaultParallelism): Flow[HeadObjectRequest, HeadObjectResponse, NotUsed] =
    Flow[HeadObjectRequest].mapAsync(parallelism)(underlying.headObject)

  def listBucketAnalyticsConfigurationsSource(
      listBucketAnalyticsConfigurationsRequest: ListBucketAnalyticsConfigurationsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListBucketAnalyticsConfigurationsResponse, NotUsed] =
    Source.single(listBucketAnalyticsConfigurationsRequest).via(listBucketAnalyticsConfigurationsFlow(parallelism))

  def listBucketAnalyticsConfigurationsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListBucketAnalyticsConfigurationsRequest, ListBucketAnalyticsConfigurationsResponse, NotUsed] =
    Flow[ListBucketAnalyticsConfigurationsRequest].mapAsync(parallelism)(underlying.listBucketAnalyticsConfigurations)

  def listBucketInventoryConfigurationsSource(
      listBucketInventoryConfigurationsRequest: ListBucketInventoryConfigurationsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListBucketInventoryConfigurationsResponse, NotUsed] =
    Source.single(listBucketInventoryConfigurationsRequest).via(listBucketInventoryConfigurationsFlow(parallelism))

  def listBucketInventoryConfigurationsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListBucketInventoryConfigurationsRequest, ListBucketInventoryConfigurationsResponse, NotUsed] =
    Flow[ListBucketInventoryConfigurationsRequest].mapAsync(parallelism)(underlying.listBucketInventoryConfigurations)

  def listBucketMetricsConfigurationsSource(
      listBucketMetricsConfigurationsRequest: ListBucketMetricsConfigurationsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListBucketMetricsConfigurationsResponse, NotUsed] =
    Source.single(listBucketMetricsConfigurationsRequest).via(listBucketMetricsConfigurationsFlow(parallelism))

  def listBucketMetricsConfigurationsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListBucketMetricsConfigurationsRequest, ListBucketMetricsConfigurationsResponse, NotUsed] =
    Flow[ListBucketMetricsConfigurationsRequest].mapAsync(parallelism)(underlying.listBucketMetricsConfigurations)

  def listBucketsSource(listBucketsRequest: ListBucketsRequest,
                        parallelism: Int = DefaultParallelism): Source[ListBucketsResponse, NotUsed] =
    Source.single(listBucketsRequest).via(listBucketsFlow(parallelism))

  def listBucketsFlow(parallelism: Int = DefaultParallelism): Flow[ListBucketsRequest, ListBucketsResponse, NotUsed] =
    Flow[ListBucketsRequest].mapAsync(parallelism)(underlying.listBuckets)

  def listMultipartUploadsSource(listMultipartUploadsRequest: ListMultipartUploadsRequest,
                                 parallelism: Int = DefaultParallelism): Source[ListMultipartUploadsResponse, NotUsed] =
    Source.single(listMultipartUploadsRequest).via(listMultipartUploadsFlow(parallelism))

  def listMultipartUploadsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListMultipartUploadsRequest, ListMultipartUploadsResponse, NotUsed] =
    Flow[ListMultipartUploadsRequest].mapAsync(parallelism)(underlying.listMultipartUploads)

  def listMultipartUploadsFlow: Flow[ListMultipartUploadsRequest, ListMultipartUploadsResponse, NotUsed] =
    Flow[ListMultipartUploadsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listMultipartUploadsPaginator(request))
    }

  def listObjectVersionsSource(listObjectVersionsRequest: ListObjectVersionsRequest,
                               parallelism: Int = DefaultParallelism): Source[ListObjectVersionsResponse, NotUsed] =
    Source.single(listObjectVersionsRequest).via(listObjectVersionsFlow(parallelism))

  def listObjectVersionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListObjectVersionsRequest, ListObjectVersionsResponse, NotUsed] =
    Flow[ListObjectVersionsRequest].mapAsync(parallelism)(underlying.listObjectVersions)

  def listObjectVersionsFlow: Flow[ListObjectVersionsRequest, ListObjectVersionsResponse, NotUsed] =
    Flow[ListObjectVersionsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listObjectVersionsPaginator(request))
    }

  def listObjectsSource(listObjectsRequest: ListObjectsRequest,
                        parallelism: Int = DefaultParallelism): Source[ListObjectsResponse, NotUsed] =
    Source.single(listObjectsRequest).via(listObjectsFlow(parallelism))

  def listObjectsFlow(parallelism: Int = DefaultParallelism): Flow[ListObjectsRequest, ListObjectsResponse, NotUsed] =
    Flow[ListObjectsRequest].mapAsync(parallelism)(underlying.listObjects)

  def listObjectsV2Source(listObjectsV2Request: ListObjectsV2Request,
                          parallelism: Int = DefaultParallelism): Source[ListObjectsV2Response, NotUsed] =
    Source.single(listObjectsV2Request).via(listObjectsV2Flow(parallelism))

  def listObjectsV2Flow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListObjectsV2Request, ListObjectsV2Response, NotUsed] =
    Flow[ListObjectsV2Request].mapAsync(parallelism)(underlying.listObjectsV2)

  def listObjectsV2Flow: Flow[ListObjectsV2Request, ListObjectsV2Response, NotUsed] =
    Flow[ListObjectsV2Request].flatMapConcat { request =>
      Source.fromPublisher(underlying.listObjectsV2Paginator(request))
    }

  def listPartsSource(listPartsRequest: ListPartsRequest,
                      parallelism: Int = DefaultParallelism): Source[ListPartsResponse, NotUsed] =
    Source.single(listPartsRequest).via(listPartsFlow(parallelism))

  def listPartsFlow(parallelism: Int = DefaultParallelism): Flow[ListPartsRequest, ListPartsResponse, NotUsed] =
    Flow[ListPartsRequest].mapAsync(parallelism)(underlying.listParts)

  def listPartsFlow: Flow[ListPartsRequest, ListPartsResponse, NotUsed] = Flow[ListPartsRequest].flatMapConcat {
    request =>
      Source.fromPublisher(underlying.listPartsPaginator(request))
  }

  def putBucketAccelerateConfigurationSource(
      putBucketAccelerateConfigurationRequest: PutBucketAccelerateConfigurationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PutBucketAccelerateConfigurationResponse, NotUsed] =
    Source.single(putBucketAccelerateConfigurationRequest).via(putBucketAccelerateConfigurationFlow(parallelism))

  def putBucketAccelerateConfigurationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutBucketAccelerateConfigurationRequest, PutBucketAccelerateConfigurationResponse, NotUsed] =
    Flow[PutBucketAccelerateConfigurationRequest].mapAsync(parallelism)(underlying.putBucketAccelerateConfiguration)

  def putBucketAclSource(putBucketAclRequest: PutBucketAclRequest,
                         parallelism: Int = DefaultParallelism): Source[PutBucketAclResponse, NotUsed] =
    Source.single(putBucketAclRequest).via(putBucketAclFlow(parallelism))

  def putBucketAclFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutBucketAclRequest, PutBucketAclResponse, NotUsed] =
    Flow[PutBucketAclRequest].mapAsync(parallelism)(underlying.putBucketAcl)

  def putBucketAnalyticsConfigurationSource(
      putBucketAnalyticsConfigurationRequest: PutBucketAnalyticsConfigurationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PutBucketAnalyticsConfigurationResponse, NotUsed] =
    Source.single(putBucketAnalyticsConfigurationRequest).via(putBucketAnalyticsConfigurationFlow(parallelism))

  def putBucketAnalyticsConfigurationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutBucketAnalyticsConfigurationRequest, PutBucketAnalyticsConfigurationResponse, NotUsed] =
    Flow[PutBucketAnalyticsConfigurationRequest].mapAsync(parallelism)(underlying.putBucketAnalyticsConfiguration)

  def putBucketCorsSource(putBucketCorsRequest: PutBucketCorsRequest,
                          parallelism: Int = DefaultParallelism): Source[PutBucketCorsResponse, NotUsed] =
    Source.single(putBucketCorsRequest).via(putBucketCorsFlow(parallelism))

  def putBucketCorsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutBucketCorsRequest, PutBucketCorsResponse, NotUsed] =
    Flow[PutBucketCorsRequest].mapAsync(parallelism)(underlying.putBucketCors)

  def putBucketEncryptionSource(putBucketEncryptionRequest: PutBucketEncryptionRequest,
                                parallelism: Int = DefaultParallelism): Source[PutBucketEncryptionResponse, NotUsed] =
    Source.single(putBucketEncryptionRequest).via(putBucketEncryptionFlow(parallelism))

  def putBucketEncryptionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutBucketEncryptionRequest, PutBucketEncryptionResponse, NotUsed] =
    Flow[PutBucketEncryptionRequest].mapAsync(parallelism)(underlying.putBucketEncryption)

  def putBucketInventoryConfigurationSource(
      putBucketInventoryConfigurationRequest: PutBucketInventoryConfigurationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PutBucketInventoryConfigurationResponse, NotUsed] =
    Source.single(putBucketInventoryConfigurationRequest).via(putBucketInventoryConfigurationFlow(parallelism))

  def putBucketInventoryConfigurationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutBucketInventoryConfigurationRequest, PutBucketInventoryConfigurationResponse, NotUsed] =
    Flow[PutBucketInventoryConfigurationRequest].mapAsync(parallelism)(underlying.putBucketInventoryConfiguration)

  def putBucketLifecycleConfigurationSource(
      putBucketLifecycleConfigurationRequest: PutBucketLifecycleConfigurationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PutBucketLifecycleConfigurationResponse, NotUsed] =
    Source.single(putBucketLifecycleConfigurationRequest).via(putBucketLifecycleConfigurationFlow(parallelism))

  def putBucketLifecycleConfigurationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutBucketLifecycleConfigurationRequest, PutBucketLifecycleConfigurationResponse, NotUsed] =
    Flow[PutBucketLifecycleConfigurationRequest].mapAsync(parallelism)(underlying.putBucketLifecycleConfiguration)

  def putBucketLoggingSource(putBucketLoggingRequest: PutBucketLoggingRequest,
                             parallelism: Int = DefaultParallelism): Source[PutBucketLoggingResponse, NotUsed] =
    Source.single(putBucketLoggingRequest).via(putBucketLoggingFlow(parallelism))

  def putBucketLoggingFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutBucketLoggingRequest, PutBucketLoggingResponse, NotUsed] =
    Flow[PutBucketLoggingRequest].mapAsync(parallelism)(underlying.putBucketLogging)

  def putBucketMetricsConfigurationSource(
      putBucketMetricsConfigurationRequest: PutBucketMetricsConfigurationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PutBucketMetricsConfigurationResponse, NotUsed] =
    Source.single(putBucketMetricsConfigurationRequest).via(putBucketMetricsConfigurationFlow(parallelism))

  def putBucketMetricsConfigurationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutBucketMetricsConfigurationRequest, PutBucketMetricsConfigurationResponse, NotUsed] =
    Flow[PutBucketMetricsConfigurationRequest].mapAsync(parallelism)(underlying.putBucketMetricsConfiguration)

  def putBucketNotificationConfigurationSource(
      putBucketNotificationConfigurationRequest: PutBucketNotificationConfigurationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PutBucketNotificationConfigurationResponse, NotUsed] =
    Source.single(putBucketNotificationConfigurationRequest).via(putBucketNotificationConfigurationFlow(parallelism))

  def putBucketNotificationConfigurationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutBucketNotificationConfigurationRequest, PutBucketNotificationConfigurationResponse, NotUsed] =
    Flow[PutBucketNotificationConfigurationRequest].mapAsync(parallelism)(underlying.putBucketNotificationConfiguration)

  def putBucketPolicySource(putBucketPolicyRequest: PutBucketPolicyRequest,
                            parallelism: Int = DefaultParallelism): Source[PutBucketPolicyResponse, NotUsed] =
    Source.single(putBucketPolicyRequest).via(putBucketPolicyFlow(parallelism))

  def putBucketPolicyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutBucketPolicyRequest, PutBucketPolicyResponse, NotUsed] =
    Flow[PutBucketPolicyRequest].mapAsync(parallelism)(underlying.putBucketPolicy)

  def putBucketReplicationSource(putBucketReplicationRequest: PutBucketReplicationRequest,
                                 parallelism: Int = DefaultParallelism): Source[PutBucketReplicationResponse, NotUsed] =
    Source.single(putBucketReplicationRequest).via(putBucketReplicationFlow(parallelism))

  def putBucketReplicationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutBucketReplicationRequest, PutBucketReplicationResponse, NotUsed] =
    Flow[PutBucketReplicationRequest].mapAsync(parallelism)(underlying.putBucketReplication)

  def putBucketRequestPaymentSource(
      putBucketRequestPaymentRequest: PutBucketRequestPaymentRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PutBucketRequestPaymentResponse, NotUsed] =
    Source.single(putBucketRequestPaymentRequest).via(putBucketRequestPaymentFlow(parallelism))

  def putBucketRequestPaymentFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutBucketRequestPaymentRequest, PutBucketRequestPaymentResponse, NotUsed] =
    Flow[PutBucketRequestPaymentRequest].mapAsync(parallelism)(underlying.putBucketRequestPayment)

  def putBucketTaggingSource(putBucketTaggingRequest: PutBucketTaggingRequest,
                             parallelism: Int = DefaultParallelism): Source[PutBucketTaggingResponse, NotUsed] =
    Source.single(putBucketTaggingRequest).via(putBucketTaggingFlow(parallelism))

  def putBucketTaggingFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutBucketTaggingRequest, PutBucketTaggingResponse, NotUsed] =
    Flow[PutBucketTaggingRequest].mapAsync(parallelism)(underlying.putBucketTagging)

  def putBucketVersioningSource(putBucketVersioningRequest: PutBucketVersioningRequest,
                                parallelism: Int = DefaultParallelism): Source[PutBucketVersioningResponse, NotUsed] =
    Source.single(putBucketVersioningRequest).via(putBucketVersioningFlow(parallelism))

  def putBucketVersioningFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutBucketVersioningRequest, PutBucketVersioningResponse, NotUsed] =
    Flow[PutBucketVersioningRequest].mapAsync(parallelism)(underlying.putBucketVersioning)

  def putBucketWebsiteSource(putBucketWebsiteRequest: PutBucketWebsiteRequest,
                             parallelism: Int = DefaultParallelism): Source[PutBucketWebsiteResponse, NotUsed] =
    Source.single(putBucketWebsiteRequest).via(putBucketWebsiteFlow(parallelism))

  def putBucketWebsiteFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutBucketWebsiteRequest, PutBucketWebsiteResponse, NotUsed] =
    Flow[PutBucketWebsiteRequest].mapAsync(parallelism)(underlying.putBucketWebsite)

  def putObjectAclSource(putObjectAclRequest: PutObjectAclRequest,
                         parallelism: Int = DefaultParallelism): Source[PutObjectAclResponse, NotUsed] =
    Source.single(putObjectAclRequest).via(putObjectAclFlow(parallelism))

  def putObjectAclFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutObjectAclRequest, PutObjectAclResponse, NotUsed] =
    Flow[PutObjectAclRequest].mapAsync(parallelism)(underlying.putObjectAcl)

  def putObjectLegalHoldSource(putObjectLegalHoldRequest: PutObjectLegalHoldRequest,
                               parallelism: Int = DefaultParallelism): Source[PutObjectLegalHoldResponse, NotUsed] =
    Source.single(putObjectLegalHoldRequest).via(putObjectLegalHoldFlow(parallelism))

  def putObjectLegalHoldFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutObjectLegalHoldRequest, PutObjectLegalHoldResponse, NotUsed] =
    Flow[PutObjectLegalHoldRequest].mapAsync(parallelism)(underlying.putObjectLegalHold)

  def putObjectLockConfigurationSource(
      putObjectLockConfigurationRequest: PutObjectLockConfigurationRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PutObjectLockConfigurationResponse, NotUsed] =
    Source.single(putObjectLockConfigurationRequest).via(putObjectLockConfigurationFlow(parallelism))

  def putObjectLockConfigurationFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutObjectLockConfigurationRequest, PutObjectLockConfigurationResponse, NotUsed] =
    Flow[PutObjectLockConfigurationRequest].mapAsync(parallelism)(underlying.putObjectLockConfiguration)

  def putObjectRetentionSource(putObjectRetentionRequest: PutObjectRetentionRequest,
                               parallelism: Int = DefaultParallelism): Source[PutObjectRetentionResponse, NotUsed] =
    Source.single(putObjectRetentionRequest).via(putObjectRetentionFlow(parallelism))

  def putObjectRetentionFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutObjectRetentionRequest, PutObjectRetentionResponse, NotUsed] =
    Flow[PutObjectRetentionRequest].mapAsync(parallelism)(underlying.putObjectRetention)

  def putObjectTaggingSource(putObjectTaggingRequest: PutObjectTaggingRequest,
                             parallelism: Int = DefaultParallelism): Source[PutObjectTaggingResponse, NotUsed] =
    Source.single(putObjectTaggingRequest).via(putObjectTaggingFlow(parallelism))

  def putObjectTaggingFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutObjectTaggingRequest, PutObjectTaggingResponse, NotUsed] =
    Flow[PutObjectTaggingRequest].mapAsync(parallelism)(underlying.putObjectTagging)

  def putPublicAccessBlockSource(putPublicAccessBlockRequest: PutPublicAccessBlockRequest,
                                 parallelism: Int = DefaultParallelism): Source[PutPublicAccessBlockResponse, NotUsed] =
    Source.single(putPublicAccessBlockRequest).via(putPublicAccessBlockFlow(parallelism))

  def putPublicAccessBlockFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutPublicAccessBlockRequest, PutPublicAccessBlockResponse, NotUsed] =
    Flow[PutPublicAccessBlockRequest].mapAsync(parallelism)(underlying.putPublicAccessBlock)

  def restoreObjectSource(restoreObjectRequest: RestoreObjectRequest,
                          parallelism: Int = DefaultParallelism): Source[RestoreObjectResponse, NotUsed] =
    Source.single(restoreObjectRequest).via(restoreObjectFlow(parallelism))

  def restoreObjectFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RestoreObjectRequest, RestoreObjectResponse, NotUsed] =
    Flow[RestoreObjectRequest].mapAsync(parallelism)(underlying.restoreObject)

  def uploadPartCopySource(uploadPartCopyRequest: UploadPartCopyRequest,
                           parallelism: Int = DefaultParallelism): Source[UploadPartCopyResponse, NotUsed] =
    Source.single(uploadPartCopyRequest).via(uploadPartCopyFlow(parallelism))

  def uploadPartCopyFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UploadPartCopyRequest, UploadPartCopyResponse, NotUsed] =
    Flow[UploadPartCopyRequest].mapAsync(parallelism)(underlying.uploadPartCopy)

}
