package com.github.j5ik2o.reactive.kinesis.monix

import com.github.j5ik2o.reactive.kinesis.model.{ ListStreamConsumersRequest, ListStreamConsumersResponse }
import monix.reactive.Observable

trait KinesisTaskClientV2 extends KinesisTaskClient {

  def listStreamConsumersPaginator(request: ListStreamConsumersRequest): Observable[ListStreamConsumersResponse]

}
