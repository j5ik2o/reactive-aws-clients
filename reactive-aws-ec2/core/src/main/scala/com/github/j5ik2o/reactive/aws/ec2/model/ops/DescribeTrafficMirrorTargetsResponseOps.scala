// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeTrafficMirrorTargetsResponseBuilderOps(val self: DescribeTrafficMirrorTargetsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficMirrorTargetsAsScala(value: Option[Seq[TrafficMirrorTarget]]): DescribeTrafficMirrorTargetsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.trafficMirrorTargets(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeTrafficMirrorTargetsResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeTrafficMirrorTargetsResponseOps(val self: DescribeTrafficMirrorTargetsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def trafficMirrorTargetsAsScala: Option[Seq[TrafficMirrorTarget]] = Option(self.trafficMirrorTargets).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTrafficMirrorTargetsResponseOps {

implicit def toDescribeTrafficMirrorTargetsResponseBuilderOps(v: DescribeTrafficMirrorTargetsResponse.Builder): DescribeTrafficMirrorTargetsResponseBuilderOps = new DescribeTrafficMirrorTargetsResponseBuilderOps(v)

implicit def toDescribeTrafficMirrorTargetsResponseOps(v: DescribeTrafficMirrorTargetsResponse): DescribeTrafficMirrorTargetsResponseOps = new DescribeTrafficMirrorTargetsResponseOps(v)

}

