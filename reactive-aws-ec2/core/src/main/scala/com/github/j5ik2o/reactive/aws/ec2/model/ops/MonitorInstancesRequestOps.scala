// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class MonitorInstancesRequestBuilderOps(val self: MonitorInstancesRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceIdsAsScala(value: Option[Seq[String]]): MonitorInstancesRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instanceIds(v.asJava) } 
            }


}

final class MonitorInstancesRequestOps(val self: MonitorInstancesRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def instanceIdsAsScala: Option[Seq[String]] = Option(self.instanceIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMonitorInstancesRequestOps {

implicit def toMonitorInstancesRequestBuilderOps(v: MonitorInstancesRequest.Builder): MonitorInstancesRequestBuilderOps = new MonitorInstancesRequestBuilderOps(v)

implicit def toMonitorInstancesRequestOps(v: MonitorInstancesRequest): MonitorInstancesRequestOps = new MonitorInstancesRequestOps(v)

}

