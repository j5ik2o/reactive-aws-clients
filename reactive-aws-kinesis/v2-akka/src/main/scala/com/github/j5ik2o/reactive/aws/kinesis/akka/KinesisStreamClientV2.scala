package com.github.j5ik2o.reactive.aws.kinesis.akka

import com.github.j5ik2o.reactive.aws.kinesis.v2.KinesisAsyncClient

object KinesisStreamClientV2 {

  def apply(underlying: KinesisAsyncClient): KinesisStreamClientV2 = new KinesisStreamClientV2Impl(underlying)

}

trait KinesisStreamClientV2 extends KinesisStreamClient {}
