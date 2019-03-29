package com.github.j5ik2o.reactive.aws.kinesis.akka

import com.github.j5ik2o.reactive.aws.kinesis.v2.KinesisAsyncClient

private[kinesis] class KinesisStreamClientV2Impl(override val underlying: KinesisAsyncClient)
    extends KinesisStreamClientV2
