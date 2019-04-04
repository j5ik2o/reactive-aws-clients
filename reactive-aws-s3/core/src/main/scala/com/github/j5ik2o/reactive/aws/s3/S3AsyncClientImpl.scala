package com.github.j5ik2o.reactive.aws.s3

import software.amazon.awssdk.services.s3.{ S3AsyncClient => JavaS3AsyncClient }

import scala.concurrent.ExecutionContext

private[s3] class S3AsyncClientImpl(override val underlying: JavaS3AsyncClient) extends S3AsyncClient
