// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TerminateInstancesResponseBuilderOps(val self: TerminateInstancesResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def terminatingInstancesAsScala(value: Option[Seq[InstanceStateChange]]): TerminateInstancesResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.terminatingInstances(v.asJava) } 
            }


}

final class TerminateInstancesResponseOps(val self: TerminateInstancesResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def terminatingInstancesAsScala: Option[Seq[InstanceStateChange]] = Option(self.terminatingInstances).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTerminateInstancesResponseOps {

implicit def toTerminateInstancesResponseBuilderOps(v: TerminateInstancesResponse.Builder): TerminateInstancesResponseBuilderOps = new TerminateInstancesResponseBuilderOps(v)

implicit def toTerminateInstancesResponseOps(v: TerminateInstancesResponse): TerminateInstancesResponseOps = new TerminateInstancesResponseOps(v)

}

