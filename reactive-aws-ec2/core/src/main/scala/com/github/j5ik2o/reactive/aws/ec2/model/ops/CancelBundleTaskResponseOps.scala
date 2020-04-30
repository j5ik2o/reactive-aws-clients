// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CancelBundleTaskResponseBuilderOps(val self: CancelBundleTaskResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bundleTaskAsScala(value: Option[BundleTask]): CancelBundleTaskResponse.Builder = {
            value.fold(self){ v => self.bundleTask(v) }
            } 


}

final class CancelBundleTaskResponseOps(val self: CancelBundleTaskResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bundleTaskAsScala: Option[BundleTask] = Option(self.bundleTask) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelBundleTaskResponseOps {

implicit def toCancelBundleTaskResponseBuilderOps(v: CancelBundleTaskResponse.Builder): CancelBundleTaskResponseBuilderOps = new CancelBundleTaskResponseBuilderOps(v)

implicit def toCancelBundleTaskResponseOps(v: CancelBundleTaskResponse): CancelBundleTaskResponseOps = new CancelBundleTaskResponseOps(v)

}

