// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyTrafficMirrorSessionRequestBuilderOps(val self: ModifyTrafficMirrorSessionRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficMirrorSessionIdAsScala(value: Option[String]): ModifyTrafficMirrorSessionRequest.Builder = {
            value.fold(self){ v => self.trafficMirrorSessionId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficMirrorTargetIdAsScala(value: Option[String]): ModifyTrafficMirrorSessionRequest.Builder = {
            value.fold(self){ v => self.trafficMirrorTargetId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficMirrorFilterIdAsScala(value: Option[String]): ModifyTrafficMirrorSessionRequest.Builder = {
            value.fold(self){ v => self.trafficMirrorFilterId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def packetLengthAsScala(value: Option[Int]): ModifyTrafficMirrorSessionRequest.Builder = {
            value.fold(self){ v => self.packetLength(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sessionNumberAsScala(value: Option[Int]): ModifyTrafficMirrorSessionRequest.Builder = {
            value.fold(self){ v => self.sessionNumber(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def virtualNetworkIdAsScala(value: Option[Int]): ModifyTrafficMirrorSessionRequest.Builder = {
            value.fold(self){ v => self.virtualNetworkId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala(value: Option[String]): ModifyTrafficMirrorSessionRequest.Builder = {
            value.fold(self){ v => self.description(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def removeFieldsAsScala(value: Option[Seq[TrafficMirrorSessionField]]): ModifyTrafficMirrorSessionRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.removeFields(v.asJava) } 
            }


}

final class ModifyTrafficMirrorSessionRequestOps(val self: ModifyTrafficMirrorSessionRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficMirrorSessionIdAsScala: Option[String] = Option(self.trafficMirrorSessionId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficMirrorTargetIdAsScala: Option[String] = Option(self.trafficMirrorTargetId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficMirrorFilterIdAsScala: Option[String] = Option(self.trafficMirrorFilterId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def packetLengthAsScala: Option[Int] = Option(self.packetLength) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sessionNumberAsScala: Option[Int] = Option(self.sessionNumber) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def virtualNetworkIdAsScala: Option[Int] = Option(self.virtualNetworkId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala: Option[String] = Option(self.description) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def removeFieldsAsScala: Option[Seq[TrafficMirrorSessionField]] = Option(self.removeFields).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyTrafficMirrorSessionRequestOps {

implicit def toModifyTrafficMirrorSessionRequestBuilderOps(v: ModifyTrafficMirrorSessionRequest.Builder): ModifyTrafficMirrorSessionRequestBuilderOps = new ModifyTrafficMirrorSessionRequestBuilderOps(v)

implicit def toModifyTrafficMirrorSessionRequestOps(v: ModifyTrafficMirrorSessionRequest): ModifyTrafficMirrorSessionRequestOps = new ModifyTrafficMirrorSessionRequestOps(v)

}

