// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.monix

import com.github.j5ik2o.reactive.aws.kinesis.model._
import com.github.j5ik2o.reactive.aws.kinesis.monix.{ KinesisMonixClient => BaseKinesisMonixClient }
import com.github.j5ik2o.reactive.aws.kinesis.v2.KinesisAsyncClient
import monix.reactive.Observable

object KinesisMonixClient {

  def apply(underlying: KinesisAsyncClient): KinesisMonixClient = new KinesisMonixClientImpl(underlying)

}

trait KinesisMonixClient extends BaseKinesisMonixClient {

  override val underlying: KinesisAsyncClient

  def listStreamConsumersPaginator(
      listStreamConsumersRequest: ListStreamConsumersRequest
  ): Observable[ListStreamConsumersResponse] =
    Observable.fromReactivePublisher(underlying.listStreamConsumersPaginator(listStreamConsumersRequest))

}
