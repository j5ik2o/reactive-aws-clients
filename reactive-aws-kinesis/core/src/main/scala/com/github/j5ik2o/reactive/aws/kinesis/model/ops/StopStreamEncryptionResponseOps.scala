// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class StopStreamEncryptionResponseBuilderOps(val self: StopStreamEncryptionResponse.Builder) extends AnyVal {}

final class StopStreamEncryptionResponseOps(val self: StopStreamEncryptionResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStopStreamEncryptionResponseOps {

  implicit def toStopStreamEncryptionResponseBuilderOps(
      v: StopStreamEncryptionResponse.Builder
  ): StopStreamEncryptionResponseBuilderOps = new StopStreamEncryptionResponseBuilderOps(v)

  implicit def toStopStreamEncryptionResponseOps(v: StopStreamEncryptionResponse): StopStreamEncryptionResponseOps =
    new StopStreamEncryptionResponseOps(v)

}
