// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2

import com.github.j5ik2o.reactive.aws.kinesis.model._
import com.github.j5ik2o.reactive.aws.kinesis.model.rs._
import com.github.j5ik2o.reactive.aws.kinesis.{ KinesisClient => BaseKinesisClient }
import software.amazon.awssdk.services.kinesis.KinesisClient

object KinesisSyncClient {

  def apply(underlying: KinesisClient): KinesisSyncClient = new KinesisSyncClientImpl(underlying)

}

trait KinesisSyncClient extends BaseKinesisClient[Either[Throwable, ?]] {
  val underlying: KinesisClient

  def listStreamConsumersPaginator(listStreamConsumersRequest: ListStreamConsumersRequest): ListStreamConsumersIterable

}
