// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.kinesis.v2.KinesisAsyncClient
import com.github.j5ik2o.reactive.aws.kinesis.akka.{ KinesisStreamClient => BaseKinesisStreamClient }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListStreamConsumersRequest, ListStreamConsumersResponse }

object KinesisStreamClient {

  def apply(underlying: KinesisAsyncClient): KinesisStreamClient = new KinesisStreamClientImpl(underlying)

}

trait KinesisStreamClient extends BaseKinesisStreamClient {

  override val underlying: KinesisAsyncClient

  def listStreamConsumersFlow: Flow[ListStreamConsumersRequest, ListStreamConsumersResponse, NotUsed] =
    Flow[ListStreamConsumersRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listStreamConsumersPaginator(request))
    }

}
