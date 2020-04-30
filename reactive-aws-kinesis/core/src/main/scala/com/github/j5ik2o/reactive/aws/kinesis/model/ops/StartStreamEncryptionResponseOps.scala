// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class StartStreamEncryptionResponseBuilderOps(val self: StartStreamEncryptionResponse.Builder) extends AnyVal {


}

final class StartStreamEncryptionResponseOps(val self: StartStreamEncryptionResponse) extends AnyVal {


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartStreamEncryptionResponseOps {

implicit def toStartStreamEncryptionResponseBuilderOps(v: StartStreamEncryptionResponse.Builder): StartStreamEncryptionResponseBuilderOps = new StartStreamEncryptionResponseBuilderOps(v)

implicit def toStartStreamEncryptionResponseOps(v: StartStreamEncryptionResponse): StartStreamEncryptionResponseOps = new StartStreamEncryptionResponseOps(v)

}

