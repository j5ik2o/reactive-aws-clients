// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class BundleInstanceResponseBuilderOps(val self: BundleInstanceResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bundleTaskAsScala(value: Option[BundleTask]): BundleInstanceResponse.Builder = {
            value.fold(self){ v => self.bundleTask(v) }
            } 


}

final class BundleInstanceResponseOps(val self: BundleInstanceResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bundleTaskAsScala: Option[BundleTask] = Option(self.bundleTask) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBundleInstanceResponseOps {

implicit def toBundleInstanceResponseBuilderOps(v: BundleInstanceResponse.Builder): BundleInstanceResponseBuilderOps = new BundleInstanceResponseBuilderOps(v)

implicit def toBundleInstanceResponseOps(v: BundleInstanceResponse): BundleInstanceResponseOps = new BundleInstanceResponseOps(v)

}

