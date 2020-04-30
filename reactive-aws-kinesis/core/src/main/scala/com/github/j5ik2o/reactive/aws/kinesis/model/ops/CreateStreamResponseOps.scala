// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class CreateStreamResponseBuilderOps(val self: CreateStreamResponse.Builder) extends AnyVal {


}

final class CreateStreamResponseOps(val self: CreateStreamResponse) extends AnyVal {


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateStreamResponseOps {

implicit def toCreateStreamResponseBuilderOps(v: CreateStreamResponse.Builder): CreateStreamResponseBuilderOps = new CreateStreamResponseBuilderOps(v)

implicit def toCreateStreamResponseOps(v: CreateStreamResponse): CreateStreamResponseOps = new CreateStreamResponseOps(v)

}

