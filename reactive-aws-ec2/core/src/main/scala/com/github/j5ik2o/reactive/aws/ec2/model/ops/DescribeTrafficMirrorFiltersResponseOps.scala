// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeTrafficMirrorFiltersResponseBuilderOps(val self: DescribeTrafficMirrorFiltersResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def trafficMirrorFiltersAsScala(value: Option[Seq[TrafficMirrorFilter]]): DescribeTrafficMirrorFiltersResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.trafficMirrorFilters(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeTrafficMirrorFiltersResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeTrafficMirrorFiltersResponseOps(val self: DescribeTrafficMirrorFiltersResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def trafficMirrorFiltersAsScala: Option[Seq[TrafficMirrorFilter]] = Option(self.trafficMirrorFilters).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTrafficMirrorFiltersResponseOps {

implicit def toDescribeTrafficMirrorFiltersResponseBuilderOps(v: DescribeTrafficMirrorFiltersResponse.Builder): DescribeTrafficMirrorFiltersResponseBuilderOps = new DescribeTrafficMirrorFiltersResponseBuilderOps(v)

implicit def toDescribeTrafficMirrorFiltersResponseOps(v: DescribeTrafficMirrorFiltersResponse): DescribeTrafficMirrorFiltersResponseOps = new DescribeTrafficMirrorFiltersResponseOps(v)

}

