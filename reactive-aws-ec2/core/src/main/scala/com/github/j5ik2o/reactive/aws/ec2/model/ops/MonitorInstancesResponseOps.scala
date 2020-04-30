// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class MonitorInstancesResponseBuilderOps(val self: MonitorInstancesResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceMonitoringsAsScala(value: Option[Seq[InstanceMonitoring]]): MonitorInstancesResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instanceMonitorings(v.asJava) } 
            }


}

final class MonitorInstancesResponseOps(val self: MonitorInstancesResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def instanceMonitoringsAsScala: Option[Seq[InstanceMonitoring]] = Option(self.instanceMonitorings).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMonitorInstancesResponseOps {

implicit def toMonitorInstancesResponseBuilderOps(v: MonitorInstancesResponse.Builder): MonitorInstancesResponseBuilderOps = new MonitorInstancesResponseBuilderOps(v)

implicit def toMonitorInstancesResponseOps(v: MonitorInstancesResponse): MonitorInstancesResponseOps = new MonitorInstancesResponseOps(v)

}

