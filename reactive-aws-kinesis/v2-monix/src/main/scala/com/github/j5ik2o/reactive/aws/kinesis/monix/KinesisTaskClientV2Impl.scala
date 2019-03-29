package com.github.j5ik2o.reactive.aws.kinesis.monix

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListStreamConsumersRequest, ListStreamConsumersResponse }
import com.github.j5ik2o.reactive.aws.kinesis.v2.KinesisAsyncClient
import monix.reactive.Observable

private[kinesis] class KinesisTaskClientV2Impl(override val underlying: KinesisAsyncClient)
    extends KinesisTaskClientV2 {

  override def listStreamConsumersPaginator(
      request: ListStreamConsumersRequest
  ): Observable[ListStreamConsumersResponse] =
    Observable.fromReactivePublisher(underlying.listStreamConsumersPaginator(request))

}
