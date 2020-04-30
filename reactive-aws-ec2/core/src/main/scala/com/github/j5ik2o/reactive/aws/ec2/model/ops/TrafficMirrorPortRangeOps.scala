// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TrafficMirrorPortRangeBuilderOps(val self: TrafficMirrorPortRange.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def fromPortAsScala(value: Option[Int]): TrafficMirrorPortRange.Builder = {
            value.fold(self){ v => self.fromPort(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def toPortAsScala(value: Option[Int]): TrafficMirrorPortRange.Builder = {
            value.fold(self){ v => self.toPort(v) }
            } 


}

final class TrafficMirrorPortRangeOps(val self: TrafficMirrorPortRange) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def fromPortAsScala: Option[Int] = Option(self.fromPort) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def toPortAsScala: Option[Int] = Option(self.toPort) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTrafficMirrorPortRangeOps {

implicit def toTrafficMirrorPortRangeBuilderOps(v: TrafficMirrorPortRange.Builder): TrafficMirrorPortRangeBuilderOps = new TrafficMirrorPortRangeBuilderOps(v)

implicit def toTrafficMirrorPortRangeOps(v: TrafficMirrorPortRange): TrafficMirrorPortRangeOps = new TrafficMirrorPortRangeOps(v)

}

