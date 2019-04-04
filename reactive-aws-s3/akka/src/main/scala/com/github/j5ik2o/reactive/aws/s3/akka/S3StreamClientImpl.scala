package com.github.j5ik2o.reactive.aws.s3.akka

import com.github.j5ik2o.reactive.aws.s3.S3AsyncClient

private[s3] class S3StreamClientImpl(override val underlying: S3AsyncClient) extends S3StreamClient {}
