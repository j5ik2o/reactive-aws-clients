// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyTrafficMirrorFilterNetworkServicesRequestBuilderOps(val self: ModifyTrafficMirrorFilterNetworkServicesRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficMirrorFilterIdAsScala(value: Option[String]): ModifyTrafficMirrorFilterNetworkServicesRequest.Builder = {
            value.fold(self){ v => self.trafficMirrorFilterId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def addNetworkServicesAsScala(value: Option[Seq[TrafficMirrorNetworkService]]): ModifyTrafficMirrorFilterNetworkServicesRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.addNetworkServices(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def removeNetworkServicesAsScala(value: Option[Seq[TrafficMirrorNetworkService]]): ModifyTrafficMirrorFilterNetworkServicesRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.removeNetworkServices(v.asJava) } 
            }


}

final class ModifyTrafficMirrorFilterNetworkServicesRequestOps(val self: ModifyTrafficMirrorFilterNetworkServicesRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficMirrorFilterIdAsScala: Option[String] = Option(self.trafficMirrorFilterId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def addNetworkServicesAsScala: Option[Seq[TrafficMirrorNetworkService]] = Option(self.addNetworkServices).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def removeNetworkServicesAsScala: Option[Seq[TrafficMirrorNetworkService]] = Option(self.removeNetworkServices).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyTrafficMirrorFilterNetworkServicesRequestOps {

implicit def toModifyTrafficMirrorFilterNetworkServicesRequestBuilderOps(v: ModifyTrafficMirrorFilterNetworkServicesRequest.Builder): ModifyTrafficMirrorFilterNetworkServicesRequestBuilderOps = new ModifyTrafficMirrorFilterNetworkServicesRequestBuilderOps(v)

implicit def toModifyTrafficMirrorFilterNetworkServicesRequestOps(v: ModifyTrafficMirrorFilterNetworkServicesRequest): ModifyTrafficMirrorFilterNetworkServicesRequestOps = new ModifyTrafficMirrorFilterNetworkServicesRequestOps(v)

}

