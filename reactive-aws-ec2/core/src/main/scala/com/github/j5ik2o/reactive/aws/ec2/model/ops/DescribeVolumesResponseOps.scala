// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVolumesResponseBuilderOps(val self: DescribeVolumesResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def volumesAsScala(value: Option[Seq[Volume]]): DescribeVolumesResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.volumes(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeVolumesResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeVolumesResponseOps(val self: DescribeVolumesResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def volumesAsScala: Option[Seq[Volume]] = Option(self.volumes).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVolumesResponseOps {

implicit def toDescribeVolumesResponseBuilderOps(v: DescribeVolumesResponse.Builder): DescribeVolumesResponseBuilderOps = new DescribeVolumesResponseBuilderOps(v)

implicit def toDescribeVolumesResponseOps(v: DescribeVolumesResponse): DescribeVolumesResponseOps = new DescribeVolumesResponseOps(v)

}

