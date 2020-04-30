// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CancelBundleTaskRequestBuilderOps(val self: CancelBundleTaskRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bundleIdAsScala(value: Option[String]): CancelBundleTaskRequest.Builder = {
            value.fold(self){ v => self.bundleId(v) }
            } 


}

final class CancelBundleTaskRequestOps(val self: CancelBundleTaskRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bundleIdAsScala: Option[String] = Option(self.bundleId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelBundleTaskRequestOps {

implicit def toCancelBundleTaskRequestBuilderOps(v: CancelBundleTaskRequest.Builder): CancelBundleTaskRequestBuilderOps = new CancelBundleTaskRequestBuilderOps(v)

implicit def toCancelBundleTaskRequestOps(v: CancelBundleTaskRequest): CancelBundleTaskRequestOps = new CancelBundleTaskRequestOps(v)

}

