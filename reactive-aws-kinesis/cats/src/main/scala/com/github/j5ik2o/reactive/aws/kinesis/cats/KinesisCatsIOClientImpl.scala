package com.github.j5ik2o.reactive.aws.kinesis.cats

import com.github.j5ik2o.reactive.aws.kinesis.KinesisAsyncClient

private[kinesis] class KinesisCatsIOClientImpl(override val underlying: KinesisAsyncClient) extends KinesisCatsIOClient
