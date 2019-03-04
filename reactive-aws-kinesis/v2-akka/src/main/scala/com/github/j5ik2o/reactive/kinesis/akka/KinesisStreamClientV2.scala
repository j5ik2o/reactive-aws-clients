package com.github.j5ik2o.reactive.kinesis.akka

import com.github.j5ik2o.reactive.kinesis.KinesisAsyncClientV2

object KinesisStreamClientV2 {

  def apply(underlying: KinesisAsyncClientV2): KinesisStreamClientV2 = new KinesisStreamClientV2Impl(underlying)

}

trait KinesisStreamClientV2 extends KinesisStreamClient {}
