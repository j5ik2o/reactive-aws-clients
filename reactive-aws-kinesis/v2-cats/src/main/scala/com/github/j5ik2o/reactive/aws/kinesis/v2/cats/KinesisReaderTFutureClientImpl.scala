package com.github.j5ik2o.reactive.aws.kinesis.v2.cats

import com.github.j5ik2o.reactive.aws.kinesis.v2.KinesisAsyncClient

private[kinesis] class KinesisReaderTFutureClientImpl(override val underlying: KinesisAsyncClient)
    extends KinesisReaderTFutureClient
