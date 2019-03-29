package com.github.j5ik2o.reactive.aws.kinesis.monix

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListStreamConsumersRequest, ListStreamConsumersResponse }
import monix.reactive.Observable

trait KinesisMonixClientV2 extends KinesisMonixClient {

  def listStreamConsumersPaginator(request: ListStreamConsumersRequest): Observable[ListStreamConsumersResponse]

}
