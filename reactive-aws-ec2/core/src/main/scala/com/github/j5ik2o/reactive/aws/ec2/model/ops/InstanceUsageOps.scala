// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceUsageBuilderOps(val self: InstanceUsage.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def accountIdAsScala(value: Option[String]): InstanceUsage.Builder = {
            value.fold(self){ v => self.accountId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def usedInstanceCountAsScala(value: Option[Int]): InstanceUsage.Builder = {
            value.fold(self){ v => self.usedInstanceCount(v) }
            } 


}

final class InstanceUsageOps(val self: InstanceUsage) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def accountIdAsScala: Option[String] = Option(self.accountId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def usedInstanceCountAsScala: Option[Int] = Option(self.usedInstanceCount) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceUsageOps {

implicit def toInstanceUsageBuilderOps(v: InstanceUsage.Builder): InstanceUsageBuilderOps = new InstanceUsageBuilderOps(v)

implicit def toInstanceUsageOps(v: InstanceUsage): InstanceUsageOps = new InstanceUsageOps(v)

}

