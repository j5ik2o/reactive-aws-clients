package com.github.j5ik2o.reactive.kinesis.cats

import com.amazonaws.services.kinesis.AmazonKinesisAsync

object KinesisAsyncClientV1 {

  def apply(underlying: AmazonKinesisAsync): KinesisAsyncClientV1 = new KinesisAsyncClientV1Impl(underlying)

}

trait KinesisAsyncClientV1 extends KinesisAsyncClient {
  val underlying: AmazonKinesisAsync
}
