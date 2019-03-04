package com.github.j5ik2o.reactive.aws.kinesis.akka

import com.github.j5ik2o.reactive.aws.kinesis.KinesisAsyncClientV2

object KinesisStreamClientV2 {

  def apply(underlying: KinesisAsyncClientV2): KinesisStreamClientV2 = new KinesisStreamClientV2Impl(underlying)

}

trait KinesisStreamClientV2 extends KinesisStreamClient {}
