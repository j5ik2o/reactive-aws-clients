// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PortRangeBuilderOps(val self: PortRange.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def fromAsScala(value: Option[Int]): PortRange.Builder = {
            value.fold(self){ v => self.from(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def toAsScala(value: Option[Int]): PortRange.Builder = {
            value.fold(self){ v => self.to(v) }
            } 


}

final class PortRangeOps(val self: PortRange) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def fromAsScala: Option[Int] = Option(self.from) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def toAsScala: Option[Int] = Option(self.to) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPortRangeOps {

implicit def toPortRangeBuilderOps(v: PortRange.Builder): PortRangeBuilderOps = new PortRangeBuilderOps(v)

implicit def toPortRangeOps(v: PortRange): PortRangeOps = new PortRangeOps(v)

}

