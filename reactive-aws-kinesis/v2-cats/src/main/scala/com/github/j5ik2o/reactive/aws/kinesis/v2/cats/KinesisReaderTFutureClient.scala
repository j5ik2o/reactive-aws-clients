// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.cats

import com.github.j5ik2o.reactive.aws.kinesis.cats.{ KinesisReaderTFutureClient => BaseKinesisReaderTFutureClient }
import com.github.j5ik2o.reactive.aws.kinesis.model._
import com.github.j5ik2o.reactive.aws.kinesis.model.rs.ListStreamConsumersPublisher
import com.github.j5ik2o.reactive.aws.kinesis.v2.KinesisAsyncClient

object KinesisReaderTFutureClient {

  def apply(underlying: KinesisAsyncClient): KinesisReaderTFutureClient =
    new KinesisReaderTFutureClientImpl(underlying)

}

trait KinesisReaderTFutureClient extends BaseKinesisReaderTFutureClient {

  override val underlying: KinesisAsyncClient

  def listStreamConsumersPaginator(
      listStreamConsumersRequest: ListStreamConsumersRequest
  ): ListStreamConsumersPublisher =
    underlying.listStreamConsumersPaginator(listStreamConsumersRequest)

}
