// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2

import com.github.j5ik2o.reactive.aws.s3.S3Client
import com.github.j5ik2o.reactive.aws.s3.model._
import com.github.j5ik2o.reactive.aws.s3.model.rs._
import software.amazon.awssdk.services.s3.{ S3Client => JavaS3Client }

object S3SyncClient {

  def apply(underlying: JavaS3Client): S3SyncClient = new S3SyncClientImpl(underlying)

}

trait S3SyncClient extends S3Client[Either[Throwable, ?]] {
  val underlying: JavaS3Client

  def listMultipartUploadsPaginator(
      listMultipartUploadsRequest: ListMultipartUploadsRequest
  ): ListMultipartUploadsIterable

  def listObjectVersionsPaginator(listObjectVersionsRequest: ListObjectVersionsRequest): ListObjectVersionsIterable

  def listObjectsV2Paginator(listObjectsV2Request: ListObjectsV2Request): ListObjectsV2Iterable

  def listPartsPaginator(listPartsRequest: ListPartsRequest): ListPartsIterable

}
