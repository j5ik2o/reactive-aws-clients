package com.github.j5ik2o.reactive.aws.s3

import java.io.File
import java.nio.file.Path

import com.github.j5ik2o.reactive.aws.model.{
  AsyncRequestBody,
  AsyncResponseTransformer,
  ResponseBytes,
  ResponseWithIterable
}
import com.github.j5ik2o.reactive.aws.s3.model._
import software.amazon.awssdk.services.s3.{ S3Client => JavaS3SyncClient }

import scala.concurrent.Future

private[s3] class S3SyncClientImpl(override val underlying: JavaS3SyncClient) extends S3SyncClient
