package com.github.j5ik2o.reactive.kinesis.cats

import software.amazon.awssdk.services.kinesis

object KinesisAsyncClientV2 {

  def apply(underlying: kinesis.KinesisAsyncClient): KinesisAsyncClientV2 = new KinesisAsyncClientV2Impl(underlying)

}

trait KinesisAsyncClientV2 extends KinesisAsyncClient {
  val underlying: kinesis.KinesisAsyncClient
}
