// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class StartInstancesResponseBuilderOps(val self: StartInstancesResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def startingInstancesAsScala(value: Option[Seq[InstanceStateChange]]): StartInstancesResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.startingInstances(v.asJava) } 
            }


}

final class StartInstancesResponseOps(val self: StartInstancesResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def startingInstancesAsScala: Option[Seq[InstanceStateChange]] = Option(self.startingInstances).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartInstancesResponseOps {

implicit def toStartInstancesResponseBuilderOps(v: StartInstancesResponse.Builder): StartInstancesResponseBuilderOps = new StartInstancesResponseBuilderOps(v)

implicit def toStartInstancesResponseOps(v: StartInstancesResponse): StartInstancesResponseOps = new StartInstancesResponseOps(v)

}

