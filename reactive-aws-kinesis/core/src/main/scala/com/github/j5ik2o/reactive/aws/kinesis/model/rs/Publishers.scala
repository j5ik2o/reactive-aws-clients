package com.github.j5ik2o.reactive.aws.kinesis.model.rs

import com.github.j5ik2o.reactive.aws.kinesis.model.ListStreamConsumersResponse
import org.reactivestreams.Publisher

trait ListStreamConsumersPublisher extends Publisher[ListStreamConsumersResponse]
