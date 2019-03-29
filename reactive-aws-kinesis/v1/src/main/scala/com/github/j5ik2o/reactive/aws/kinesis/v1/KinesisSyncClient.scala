package com.github.j5ik2o.reactive.aws.kinesis.v1

import com.amazonaws.services.kinesis.AmazonKinesis
import com.github.j5ik2o.reactive.aws.kinesis.KinesisClient

object KinesisSyncClient {

  def apply(underlying: AmazonKinesis): KinesisSyncClient = new KinesisSyncClientImpl(underlying)

}

trait KinesisSyncClient extends KinesisClient[Either[Throwable, ?]] {
  val underlying: AmazonKinesis
}
