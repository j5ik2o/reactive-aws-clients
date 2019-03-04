package com.github.j5ik2o.reactive.kinesis.akka

import com.github.j5ik2o.reactive.kinesis.KinesisAsyncClientV2

private[kinesis] class KinesisStreamClientV2Impl(override val underlying: KinesisAsyncClientV2)
    extends KinesisStreamClientV2 {}
