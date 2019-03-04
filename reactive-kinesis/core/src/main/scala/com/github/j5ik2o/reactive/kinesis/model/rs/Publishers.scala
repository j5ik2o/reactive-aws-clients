package com.github.j5ik2o.reactive.kinesis.model.rs

import com.github.j5ik2o.reactive.kinesis.model.ListStreamConsumersResponse
import org.reactivestreams.Publisher

trait ListStreamConsumersPublisher extends Publisher[ListStreamConsumersResponse]
